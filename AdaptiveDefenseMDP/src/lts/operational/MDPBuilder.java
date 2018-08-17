package lts.operational;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextPrinter;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

import main.REact;
import resources.ComputeRwd;
import resources.DomainRewriter;
import resources.RequirementDescription;
import resources.Utils;

/**
 * 
 * @author yehia
 *
 */
public class MDPBuilder {

	private DomainDescription description;

	private Integer nb_of_states=1;
	private Integer nbStateVariables;
	private int[] initial_state;
	public DomainRewriter rewriter;
	private MatlabEngine ml;
	private Future<MatlabEngine> eng;
	private float[] value;
	private double[] policy;
	private double[][][] r = null;
	private double[][][] p = null;

	private String files_path="/Users/yehia/git/AdaptiveDefenseMDP/files/";

	/**
	 * File Writers
	 */
	private PrintWriter states_writer=null;
	private ArrayList<PrintWriter> action_writers = new ArrayList<PrintWriter>(); 
	//private ArrayList<PrintWriter> reward_writers = new ArrayList<PrintWriter>(); 
	private ArrayList<PrintWriter> event_writers = new ArrayList<PrintWriter>(); 
	private ArrayList<PrintWriter> event_occurrence_writers = new ArrayList<PrintWriter>(); 
	//private PrintWriter reward_writer=null;

	/**
	 * Descriptions
	 */
	private ArrayList<RequirementDescription> requirements_description = new ArrayList<RequirementDescription>();
	protected ArrayList<String> actions = new ArrayList<String>();
	protected ArrayList<String> events = new ArrayList<String>();


	/**
	 * Initial State
	 */
	//protected ArrayList<Integer> initial_state = new ArrayList<Integer>();

	private final static Logger LOGGER = LogManager.getRootLogger();
	IAdaptiveCyberDefenseTextPrinter printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(System.out, null);


	/*
	 * 				MAIN PART
	 */
	public MDPBuilder(DomainDescription dDescription) {
		this.description = dDescription;
		/*
		 *  Initialize
		 * (1) Read state variables 
		 * (2) Read requirements 
		 * (3) Read event descriptions
		 * (4) Initialize Matlab
		 * (5) Create the p and r matrices
		 */
		LOGGER.info("Start initialisation");
		try {


			/*
			 * add requirement variables to state variables
			 * fills ArrayList RequirementDescription
			 */
			addRequirementsVariables(description);	
			LOGGER.info("Added Requirements Variables to Description");

			this.nbStateVariables=description.getState_variables().size();

			for(StateVariable variable : description.getState_variables()) {
				this.nb_of_states *= variable.getValues().size();
			}

			addNoOpAction(description);
			LOGGER.info("Added Noop Action to Description");

			//int p = 0;

			for(ActionDescription action_descr : description.getAction_descriptions()) {
				//System.out.println(action_descr.getName() +" : "+p);
				//System.out.println(description.getAction_descriptions().get(p).getName() +" : "+p);

				this.actions.add(action_descr.getName());
				//p++;
			}

			//for(int l=0;l<actions.size();l++) {
			//System.out.println(l +" : "+actions.get(l));
			//}

			for(EventDescription event_descr : description.getEvent_descriptions()) {
				this.events.add(event_descr.getName());
			}

			rewriter = new DomainRewriter(description,this.requirements_description);
			LOGGER.info("Description Rewritten");

			setInitialState(description);
			LOGGER.info("The initial state is set");

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("End initialisation");
	}

	public void constructMDP() {
		createFileWriters();
		LOGGER.info("File Writers Created");

		LOGGER.info("Start Transition Generation");
		generateTransitions(this.requirements_description);
		LOGGER.info("End Transition Generation");

		//		for(int i = this.nb_of_states-1; 0<=i; i--) {
		//			int[] temp_state = this.findStateFromIdentifier(i);
		//			StringBuilder str = new StringBuilder();
		//			for(int k = temp_state.length-1; 0<=k; k--) {
		//				str.append(temp_state[k]);
		//			}
		//			System.out.println(str.toString()+":"+i);
		//		}

		LOGGER.info("Start Initialize Matlab");

		initializeMatlab();
		LOGGER.info("End Initialize Matlab");

		LOGGER.info("Start Computation Exogenouos Event Matrix Matlab");

		this.computeExogenousEventMatrix(ml);
		LOGGER.info("End Computation Exogenouos Event Matrix Matlab");

		LOGGER.info("Start Computation Transition and Reward Matrix Matlab");

		this.buildTransitionMatrix(ml);
		LOGGER.info("End Computation Transition and Reward Matrix Matlab");

		LOGGER.info("Start Computation Reward Matrix Matlab");
		//buildRewardMatrixFromReqDescriptions(this.requirements_description, rewriter);
		buildRewardMatrix(ml);

		closeFileWriters();
		LOGGER.info("File writers closed");



		//p = computeTransitionMatrix();

		//try {
		//ml.putVariableAsync("R", r);
		//ml.eval("R");

		//} catch (IllegalStateException | InterruptedException | ExecutionException e) {
		//LOGGER.error("Problem creating reward matrix in matlab \n"+e.getMessage());
		//e.printStackTrace();
		//}

		//buildRewardMatrix(p);
		//retrieve the reward matrix R from matlab

		//			Future<float[][][]> future_r;
		//			try {
		//				future_r = ml.getVariableAsync("R");
		//				this.r = future_r.get();
		//			} catch (IllegalStateException | InterruptedException | ExecutionException e) {
		//				LOGGER.error("Problem retrieving EXTM from MatLab \n"+e.getMessage());
		//				e.printStackTrace();
		//			}

	}

	//	private void buildRewardMatrixFromReqDescriptions(ArrayList<RequirementDescription> requirements_description,
	//			DomainRewriter rewriter) {
	//		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>(); 
	//		for(int i =0; i<this.rewriter.state_variable_names.size();i++) {
	//			temp.add(i, new ArrayList<Integer>());
	//			for(int k=0; k<rewriter.state_variables_domain_size.get(i);k++) {
	//				temp.get(i).add(k);
	//			}
	//		}
	//		ArrayList<ArrayList<ArrayList<Integer>>> dest_cond = new ArrayList<ArrayList<ArrayList<Integer>>>();
	//		dest_cond.add(temp);
	//		
	//		ArrayList<ArrayList<ArrayList<Integer>>> src_cond = dest_cond;
	//		
	//		for(RequirementDescription req : requirements_description) {
	//			if(req.getType().equals("ua")) {
	//				Formula cond = req.getCondition();
	//				cond.adjust(dest_cond);
	//			}
	//		}
	//	}

	public void solveMDP() {
		LOGGER.info("Start Solving of MDP Matlab");
		try {
			//ml.eval("P");
			//ml.eval("R");
			//ml.eval("discount");
			ml.eval("mdp_check(P,R)");
			LOGGER.info("MDP is checked");

			ml.eval("[V,policy,iter,cpu_time]=mdp_policy_iteration_modified(P,R,discount);");

			Future<float[]> future_v = ml.getVariableAsync("V");
			value = future_v.get();

			Future<double[]> future_policy = ml.getVariableAsync("policy");
			policy = future_policy.get();

			//			Future<float[]> future_iter = ml.getVariableAsync("iter");
			//			float[] iter = future_iter.get();
			//			System.out.println("Nb of Iterations is: "+iter[0]);
			//			
			//			Future<float[]> future_cpu_time = ml.getVariableAsync("cpu_time");
			//			float[] cpu_time = future_cpu_time.get();
			//			System.out.println("CPU Time is: "+cpu_time[0]);

		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		LOGGER.info("End Solving of MDP Matlab");
	}

	//		if(option.equals(INITIAL)) {
	//			setInitialState(description);
	//			LOGGER.info("The initial state is set");
	//
	//			generateLTSFromInitialState();
	//			LOGGER.info("The LTS is generated");
	//
	//		}

	/*
	 * variable_domain_map[1][1] = atKitchen means that value 1 of variable 1 is atKitchen 
	 */



	private void buildRewardMatrix(MatlabEngine ml) {

		double[] rew=null;
		Future<double[]> future_rew;
		try {
			future_rew = ml.getVariableAsync("REW");
			rew = future_rew.get();
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem retrieving REW from MatLab \n"+e.getMessage());
			e.printStackTrace();
		}

		buildRewardMatrix(rew);

		LOGGER.info("End Computation Reward Matrix Matlab");

	}

	private void closeFileWriters() {
		for( PrintWriter writer : this.event_occurrence_writers) {
			writer.flush();
			writer.close();
		}
		for( PrintWriter writer : this.event_writers) {
			writer.flush();
			writer.close();
		}
		for( PrintWriter writer : this.action_writers) {
			writer.flush();
			writer.close();
		}

		//		for( PrintWriter writer : this.reward_writers) {
		//			writer.flush();
		//			writer.close();
		//		}

		states_writer.flush();
		states_writer.close();

		//reward_writer.flush();
		//reward_writer.close();
	}


	private void createFileWriters() {
		try {
			states_writer = new PrintWriter(new FileOutputStream(files_path+"states.txt"),true);

			for(ActionDescription action_description: description.getAction_descriptions()) {

				PrintWriter writer=null;
				writer = new PrintWriter(new FileOutputStream(files_path+action_description.getName()+".txt"),true);

				action_writers.add(writer);

				//writer = new PrintWriter(new FileOutputStream(files_path+"rew_"+action_description.getName()+".txt"),true);
				//reward_writers.add(writer);
			}

			for(EventDescription event : description.getEvent_descriptions()) {
				PrintWriter writer=null;
				writer = new PrintWriter(new FileOutputStream(files_path+event.getName()+".txt"),true);

				event_writers.add(writer);

				writer = new PrintWriter(new FileOutputStream(files_path+"occ_"+event.getName()+".txt"),true);

				event_occurrence_writers.add(writer);
			}

			//reward_writer = new PrintWriter(new FileOutputStream(files_path+"computed_rewards.txt"),true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 

	}



	private void findActionEventTransitions(Integer index, int[] state) {
		if(index==0) {
			for(int i = 0; i < rewriter.state_variables_domain_size.get(index); i++) {
				state[index] = i;
				states_writer.print(Utils.getStateIdentifier(state, rewriter.variables_weight)+1+": ");
				for(int k =state.length-1; k>=0; k--) {
					states_writer.print(state[k]);
				}
				states_writer.println();
				this.findActionTransitions(state);
				this.findEventTransitions(state);
			}
		} else {
			for(int i = 0; i < rewriter.state_variables_domain_size.get(index); i++) {
				state[index] = i;
				findActionEventTransitions(index-1, state);
			}
		}
	}

	private void addRequirementsVariables(DomainDescription description) {
		EList<Requirement> requirements = description.getRequirements();
		EList<StateVariable> stateVariables = description.getState_variables();

		for(Requirement requirement : requirements) {
			HashSet<String> domain = new HashSet<String>();
			String name = requirement.getName();
			RequirementDescription descr = new RequirementDescription();
			ReqDescrFill.fillRequirementDescription(requirement,descr,domain);

			/**
			 * add the requirement to requirements_description
			 */
			this.requirements_description.add(descr);

			/**
			 * add requirements and their domains to domain variables
			 */
			//if(!domain.isEmpty()) {
			StateVariable var = AdaptiveCyberDefenseFactory.eINSTANCE.createStateVariable();
			var.setName(name);
			var.getValues().addAll(domain);
			stateVariables.add(var);
			//}
		}
	}



	private void addNoOpAction(DomainDescription description) {
		/*
		 * Create a noop action description
		 */
		ActionDescription descr = AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
		EList<ContextualEffect> effects = descr.getContextual_effects();

		descr.setName(REact.noop_event_identifier);
		/*
		 * set preconditions
		 */
		ContextualEffect contextual_effect = AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
		contextual_effect.setContext(AdaptiveCyberDefenseFactory.eINSTANCE.createTrue());

		effects.add(contextual_effect);

		/*
		 * set cost
		 */
		descr.setCost(new BigDecimal(0));
		/*
		 * add the noop action to action descriptions
		 */
		//description.getAction_descriptions().add(descr);
		description.getAction_descriptions().add(0, descr);
	}






	/*
	 * 				SET INITIAL STATE PART
	 */
	private void setInitialState(DomainDescription description) {
		initial_state = new int[this.nbStateVariables];
		for( InitialAtom atom : description.getInitial_atoms()) {
			InitialVariable var = atom.getInitialvariable();
			if(var.getClass().toString().endsWith(".StateVariableImpl")) {
				StateVariable satom = (StateVariable) var;
				int ind = Integer.valueOf(satom.getName());
				int val = rewriter.state_variables_domain_values.get(ind).indexOf(atom.getValue());
				initial_state[ind] = val;
			} else {
				Requirement req = (Requirement) var;
				int ind = rewriter.state_variable_names.indexOf(req.getName());
				int val = rewriter.state_variables_domain_values.get(ind).indexOf(atom.getValue());
				initial_state[ind] = val;
			}
		}
	}


	private void initializeMatlab(){
		LOGGER.info("Starting Matlab");
		try {
			//Start MATLAB asynchronously
			eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			ml = eng.get();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		LOGGER.info("Matlab Session Staretd");

		//nbOfStates=nb_of_states;
		//nbOfActions=nb_of_actions;

		//p = new float[this.nb_of_states][this.nb_of_states][this.nb_of_actions];
		//r = new float[this.nb_of_states][this.nb_of_states][this.nb_of_actions];
		float discount = REact.discount_factor;


		//exogenous_events_TM = new float[this.nb_of_states][this.nb_of_states];
		try {
			//			ml.putVariableAsync("P", p);
			//			ml.putVariableAsync("R", r);
			ml.putVariableAsync("discount", discount);
			//
			//			ml.putVariableAsync("EXTM", exogenous_events_TM);
			//			ml.eval("EXTM = eye(" + this.nb_of_states + ");");
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}




	private void computeExogenousEventMatrix(MatlabEngine ml) {
		//1) create exogenous events matrix
		LOGGER.info("Computation of Exogenous Event Matrix Started");
		try {
			ml.eval("EXTM = eye(" + this.nb_of_states + ");");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		for(String event : this.events) {
			LOGGER.info("Computation of: "+event);

			String event_file_path=files_path+event+".txt";
			String occ_vector_name = "occ_"+event;
			String occ_event_file_path=files_path+occ_vector_name+".txt";

			try {
				ml.eval("load "+event_file_path+";");

				ml.eval("TTM = spconvert("+event+")"+";");

				ml.eval("clear "+event+";");

				ml.eval("load "+occ_event_file_path+";");

				//ml.eval("TM = (diag(V) * TTM) + diag((1 - V));");
				//ml.eval("EXTM = EXTM*TM;");


				ml.eval("TM = (diag( "+occ_vector_name+" ) * TTM) + diag((1 - "+occ_vector_name+" ))"+";");

				ml.eval("clear "+occ_vector_name+";");

				ml.eval("EXTM = EXTM*TM"+";");
			} catch (CancellationException | InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		LOGGER.info("Computation of Exogenous Event Finished");

		//2) for every event matrix TTM and its occurrence vectorV
		//ml.eval("TM = (diag(V) * TTM) + diag((1 - V));");
		//ml.eval("EXTM = EXTM*TM;");
		//TM = (diag(V) * TTM) + diag ((1-V));
		//EXTM = EXTM * TM;

	}
	public void buildTransitionMatrix(MatlabEngine ml) {
		LOGGER.info("Computation of Transition Matrix Started");

		String reward_file_path=files_path+"compute_rewards.txt";
		//		try {
		//			ml.eval("load "+reward_file_path+";");
		//		} catch (CancellationException | InterruptedException | ExecutionException e1) {
		//			e1.printStackTrace();
		//		}

		try {
			ml.eval("REW=[]"+";");
		} catch (CancellationException | InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}

		for(int i=0; i<this.actions.size();i++) {

			String action_name = actions.get(i);
			LOGGER.info("Computation of: "+action_name);

			//String matrix_id = "TM_"+action_name;
			String action_file_path=files_path+action_name+".txt";
			String imp_action_file_path=files_path+"imp_"+action_name+".txt";

			try {

				ml.eval("load "+action_file_path+";");
				ml.eval("TTM = spconvert("+action_name+")"+";");
				ml.eval(action_name + "= TTM * EXTM;");
				LOGGER.info("Start Printing Implicit Event Transition Matrix of "+ action_name + " into File");
				ml.eval("print_matrix('" + imp_action_file_path +"',"+action_name +")"+";");
				LOGGER.info("End Printing Transition Matrix into File");
				//LOGGER.info("Start Union Operation of "+ action_name + " to determine rewards to compute");
				ml.eval("REW=union(REW,find(" +action_name+"))"+";");
				//LOGGER.info("End Union Operation of "+ action_name + " to determine rewards to compute");
			} catch (IllegalStateException | InterruptedException | ExecutionException e) {
				LOGGER.error("Problem multiplying EXTM and the action's computed TM \n"+e.getMessage());
				e.printStackTrace();
			}	
		}

		try {
			ml.eval("print_matrix('" + reward_file_path +"',REW)"+";");
		} catch (CancellationException | InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}

		for(int i=0; i<this.actions.size();i++) {
			try {
				LOGGER.info("Start Copying Transition Matrix of "+actions.get(i)+ " into P");
				ml.eval("P(:,:," + (i+1) + ")" + "="+ actions.get(i) + ";");
				ml.eval("clear " + actions.get(i) + ";");
				LOGGER.info("End Copying Transition Matrix into P");
			} catch (CancellationException | InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		LOGGER.info("Computation of Transition Matrix Finished");

		//		Future<double[][][]> future_p;
		//		try {
		//			future_p = ml.getVariableAsync("P");
		//			p = future_p.get();
		//		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
		//			LOGGER.error("Problem retrieving P from MatLab \n"+e.getMessage());
		//			e.printStackTrace();
		//		}


	}

	private void generateTransitions(ArrayList<RequirementDescription> requirements_description2) {

		/* (1) Iterate Over All actions and events
		 * (2) Iterate over all states and update the transition and reward matrix accordingly
		 * (2.1) If there is an effect of an action/event that is applicable, then apply it
		 * (2.2) If there is no effect that is not applicable, then it is a self transition in the transition matrix*/
		//Print States
		Integer index=rewriter.state_variable_names.size()-1;
		int[] state = new int[rewriter.state_variable_names.size()];
		findActionEventTransitions(index,state);
	}




	HashSet<Integer> done = new HashSet<Integer>();

	//	private void fillReward(Integer src_id, Integer dest_id, PrintWriter writer) {
	//
	//		Integer cell_id = dest_id*this.nb_of_states + src_id;
	//
	//		if(!done.contains(cell_id)) {
	//			int[] src_state = Utils.findStateFromIdentifier(src_id,rewriter.variables_weight);
	//			int[] dest_state = Utils.findStateFromIdentifier(dest_id,rewriter.variables_weight);
	//			BigDecimal rew = new BigDecimal(0);
	//			for( RequirementDescription req : this.requirements_description){
	//				Integer req_index = Integer.valueOf(req.getName());
	//				rew=ComputeRwd.reward(req,src_state,dest_state,req_index,rew);
	//			}
	//			//fillRwdsMatrix(src_id,dest_id,rew);
	//			done.add(cell_id);
	//			//this.reward_writer.println(cell_id);
	//		} 
	//	}

	/*private void fillRwdsMatrix(Integer src_id, Integer dest_id, BigDecimal rew) {
		for(String action_name : this.actions) {
			BigDecimal action_cost = action_descriptions.get(action_name).getCost();
			//BigDecimal rew1 = rew.subtract(action_cost);
			r[src_id][dest_id][this.actions_id.get(action_name)]=rew.subtract(action_cost).floatValue();
		}
	}*/

	//	public void buildRewardMatrix(double[] rw) {
	//
	//
	//		LOGGER.info("Start Computation of Generic Reward Matrix Java");
	//
	//		double[][] rm = new double[this.nb_of_states][nb_of_states];
	//
	//
	//		for(int k=0; k<rw.length; k++) {
	//			Integer x = ((int) (rw[k]-1)) % nb_of_states;
	//			Integer y = ((int) (rw[k]-1)) / nb_of_states;
	//
	//			BigDecimal rew = new BigDecimal(0);
	//
	//
	//			int[] src_state = Utils.findStateFromIdentifier(x,rewriter.variables_weight);
	//			int[] dest_state = Utils.findStateFromIdentifier(y,rewriter.variables_weight);
	//			for( RequirementDescription req : this.requirements_description){
	//				Integer req_index = Integer.valueOf(req.getName());
	//				rew=ComputeRwd.reward(req,src_state,dest_state,req_index,rew);
	//			}
	////			for(int l=0; l<actions.size(); l++) {
	////				BigDecimal action_cost = description.getAction_descriptions().get(l).getCost();
	////				rm[x][y][l] = rew.subtract(action_cost).doubleValue();
	////			}
	//		}
	//
	////		String matrix_id = "RG";
	////		try {
	////			ml.putVariableAsync(matrix_id, rm);
	////
	////		} catch (InterruptedException | ExecutionException e) {
	////			LOGGER.error("Problem putting the generic reward matrix R into matlab "+ "\n" +e.getMessage());
	////			e.printStackTrace();
	////		}	
	//
	//
	//		LOGGER.info("End Computation of Generic Reward Matrix Java");
	//
	//		LOGGER.info("Start Insert of Generic Reward Matrix Matlab");
	//
	//				String matrix_id = "TR";
	//				try {
	//					ml.putVariableAsync(matrix_id, rm);
	//					ml.eval("print_matrix('" + files_path +"tr.txt',TR)"+";");
	//
	//				} catch (CancellationException | InterruptedException | ExecutionException e) {
	//					LOGGER.error("Problem putting the reward matrix into matlab "+ "\n" +e.getMessage());
	//					e.printStackTrace();
	//				}	
	//		
	//				LOGGER.info("End Insert of Generic Reward Matrix Matlab");
	//		//
	//				LOGGER.info("Start Computation of Action-based Reward Matrix Matlab");
	//		
	//				for(int l=0; l<actions.size(); l++) {
	//					String action_id=actions.get(l);
	//					BigDecimal action_cost = description.getAction_descriptions().get(l).getCost();
	//						try {
	//							ml.eval("Temp" +"="+matrix_id +"-"+ action_cost.doubleValue() + ";");
	//							ml.eval("R(:,:,"+(l+1)+")" +"= Temp;");
	//
	//						} catch (CancellationException | InterruptedException | ExecutionException e) {
	//							LOGGER.error("Problem with creating reward matri in matlab");
	//							e.printStackTrace();
	//						}
	//					
	//				}
	//				LOGGER.info("End Computation of Action-based Reward Matrix Matlab");
	//
	//		//			//fillRwdsMatrix(src_id,dest_id,rew);
	//		//			done.add(cell_id);
	//		//			//this.reward_writer.println(cell_id);
	//		//		} 
	//		//
	//		//retrieve the reward matrix R from matlab
	////		Future<double[][][]> future_r;
	////		try {
	////			future_r = ml.getVariableAsync("R");
	////			this.r = future_r.get();
	////		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
	////			LOGGER.error("Problem retrieving R from MatLab \n"+e.getMessage());
	////			e.printStackTrace();
	////		}
	//	}


	public void buildRewardMatrix(double[] rw) {


		LOGGER.info("Start Computation of Generic Reward Matrix Java");

		double[][][] rm = new double[this.nb_of_states][nb_of_states][actions.size()];


		for(int k=0; k<rw.length; k++) {
			Integer x = ((int) (rw[k]-1)) % nb_of_states;
			Integer y = ((int) (rw[k]-1)) / nb_of_states;

			BigDecimal rew = new BigDecimal(0);


			int[] src_state = Utils.findStateFromIdentifier(x,rewriter.variables_weight);
			int[] dest_state = Utils.findStateFromIdentifier(y,rewriter.variables_weight);
			for( RequirementDescription req : this.requirements_description){
				Integer req_index = Integer.valueOf(req.getName());
				rew=ComputeRwd.reward(req,src_state,dest_state,req_index,rew);
			}
			for(int l=0; l<actions.size(); l++) {
				BigDecimal action_cost = description.getAction_descriptions().get(l).getCost();
				rm[x][y][l] = rew.subtract(action_cost).doubleValue();
			}
		}

		//String matrix_id = "R";
		try {
			ml.putVariableAsync("R", rm);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			LOGGER.error("Problem putting the reward matrix R into matlab "+ "\n" +e.getMessage());
			e.printStackTrace();			
		}

		try {
			ml.eval("R");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}	


	//LOGGER.info("End Computation of Generic Reward Matrix Java");

	//LOGGER.info("Start Insert of Generic Reward Matrix Matlab");

	//		String matrix_id = "TR";
	//		try {
	//			ml.putVariableAsync(matrix_id, rm);
	//
	//		} catch (InterruptedException | ExecutionException e) {
	//			LOGGER.error("Problem putting the reward matrix into matlab "+ "\n" +e.getMessage());
	//			e.printStackTrace();
	//		}	
	//
	//		LOGGER.info("End Insert of Generic Reward Matrix Matlab");
	//
	//		LOGGER.info("Start Computation of Action-based Reward Matrix Matlab");
	//
	//		for(int l=0; l<actions.size(); l++) {
	//			String action_id=actions.get(l);
	//			BigDecimal action_cost = description.getAction_descriptions().get(l).getCost();
	//			try {
	//				ml.eval("Temp" +"="+matrix_id +"-"+ action_cost + ";");
	//				ml.eval("R(:,:,"+(l+1)+")" +"= Temp"+ ";");
	//			} catch (InterruptedException | ExecutionException e) {
	//				LOGGER.error("Problem computing the transition matrix of action " + action_id + "\n" +e.getMessage());
	//				e.printStackTrace();
	//			}	
	//		}
	//		LOGGER.info("End Computation of Action-based Reward Matrix Matlab");

	//			//fillRwdsMatrix(src_id,dest_id,rew);
	//			done.add(cell_id);
	//			//this.reward_writer.println(cell_id);
	//		} 
	//
	//retrieve the reward matrix R from matlab
	//		Future<double[][][]> future_r;
	//		try {
	//			future_r = ml.getVariableAsync("R");
	//			this.r = future_r.get();
	//		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
	//			LOGGER.error("Problem retrieving R from MatLab \n"+e.getMessage());
	//			e.printStackTrace();
	//		}



	private void findEventTransitions(int[] state) {
		Boolean selfTransitionLastState=false;
		Boolean lastState=false;
		Integer src_id = Utils.getStateIdentifier(state,rewriter.variables_weight);
		//if(src_id==8670) {
		//System.out.println();
		//}
		if(src_id==this.nb_of_states-1) {
			lastState=true;
		}

		for( int index=0; index < this.events.size(); index++) {
			EventDescription descr = this.description.getEvent_descriptions().get(index);
			EList<ProbabilisticContextualEffect> prob_effects = descr.getProbabilistic_contextual_effects();

			//	 * 1) explore every possible destination state (application of every effect)
			//	 * 1.1) check if a context applies
			//	 * 1.1.1) yes, explore every application of effects, if an effect exists
			//	 * 1.1.2) no, create a self-transition
			//	 * 2) update the transition matrix of a

			BigDecimal one = new BigDecimal(1);
			Boolean holds= false;
			EList<ProbabilisticEffect> effects=null;

			//	 * check if a context applies:
			//	 * if yes, 
			//	 * 1) effects = the effects associated with the context
			//	 * 2) set holds to true

			for( ProbabilisticContextualEffect contextual_effect : prob_effects) {
				Formula context = contextual_effect.getContext();
				BigDecimal occ_prob = contextual_effect.getOccurrence_probability();
				if(holds(context,state)) {
					//occurrence_vector.put(src_id, contextual_effect.getOccurrence_probability().floatValue());
					this.event_occurrence_writers.get(index).println(occ_prob);
					holds = true;
					effects = contextual_effect.getEffects();

					BigDecimal total_prob = new BigDecimal(0);


					//* apply the effects of the actions one at a time

					for(ProbabilisticEffect effect : effects){
						BigDecimal prob = effect.getProbability();
						int[] dst_state = state.clone();
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						} 

						this.updateReqVariablesEvent(dst_state, requirements_description);

						Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);
						if(dest_id>this.nb_of_states) {
							System.out.println("Problem");
						}
						if(lastState) {
							if(dest_id==this.nb_of_states-1) {
								selfTransitionLastState=true;
							}
						}

						//Transition trans = new Transition(action_name,src_id,dest_id,prob);
						//action_transitions.add(trans);
						//tempTM[src_id][dest_id]=prob.floatValue();

						//this.fillReward(src_id, dest_id);

						event_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" +prob.floatValue());

						total_prob = total_prob.add(effect.getProbability());

					}
					if(total_prob.compareTo(one)==-1) {
						int[] dst_state = state.clone();

						updateReqVariablesEvent(dst_state, requirements_description);


						Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);

						//this.fillReward(src_id, dest_id);

						if(lastState) {
							if(dest_id==this.nb_of_states-1) {
								selfTransitionLastState=true;
							}
						}

						//Transition trans = new Transition(action_name,src_id,dest_id,one.subtract(total_prob));
						//action_transitions.add(trans);

						//tempTM[src_id][dest_id]=one.subtract(total_prob).floatValue();
						event_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" + one.subtract(total_prob).floatValue());


					}
					break;
				} 
			}
			if(!holds) {
				//occurrence_vector.put(src_id, new float(0));
				this.event_occurrence_writers.get(index).println(0);

				int[] dst_state = state.clone();

				updateReqVariables(dst_state, requirements_description);

				Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);
				if(lastState) {
					if(dest_id==this.nb_of_states-1) {
						selfTransitionLastState=true;
					}
				}

				//Transition trans = new Transition(action_name,src_id,dest_id,one);
				//action_transitions.add(trans);

				//tempTM[src_id][dest_id]=one.floatValue();
				event_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" + one.floatValue());

				//this.fillReward(src_id, dest_id);


			}
			//			String matrix_id = "TM_"+action_id;
			//			try {
			//				ml.putVariableAsync(matrix_id, tempTM);
			//				//(original)ml.eval("P(:,:,"+(action_id+1)+")" +"=EXTM*"+matrix_id+ ";");
			//				//ml.eval("P(:,:,"+(action_id+1)+")" +"="+matrix_id+ "*EXTM;");
			//
			//			} catch (InterruptedException | ExecutionException e) {
			//				LOGGER.error("Problem computing the transition matrix of action " + action_id + "\n" +e.getMessage());
			//				e.printStackTrace();
			//			}	
			if(lastState && !selfTransitionLastState) {
				event_writers.get(index).println((src_id+1) + "\t"+ (src_id+1) + "\t" + new Float(0));
			}
		}
	}


	private void findActionTransitions(int[] state) {
		Boolean lastState=false;
		Integer src_id = Utils.getStateIdentifier(state,rewriter.variables_weight);
		if(src_id==this.nb_of_states-1) {
			lastState=true;
		}
		for( int index=0; index < this.actions.size(); index++) {
			Boolean selfTransitionLastState=false;
			//PrintWriter writer = reward_writers.get(index);
			ActionDescription descr = this.description.getAction_descriptions().get(index);
			EList<ContextualEffect> contextual_effects = descr.getContextual_effects();

			//	 * 1) explore every possible destination state (application of every effect)
			//	 * 1.1) check if a context applies
			//	 * 1.1.1) yes, explore every application of effects, if an effect exists
			//	 * 1.1.2) no, create a self-transition
			//	 * 2) update the transition matrix of a

			BigDecimal one = new BigDecimal(1);
			Boolean holds= false;
			EList<ProbabilisticEffect> effects=null;

			//	 * check if a context applies:
			//	 * if yes, 
			//	 * 1) effects = the effects associated with the context
			//	 * 2) set holds to true

			for(ContextualEffect contextual_effect : contextual_effects) {
				Formula context = contextual_effect.getContext();
				if(holds(context,state)) {
					holds = true;
					effects = contextual_effect.getEffects();

					BigDecimal total_prob = new BigDecimal(0);


					//* apply the effects of the actions one at a time

					for(ProbabilisticEffect effect : effects){
						BigDecimal prob = effect.getProbability();
						int[] dst_state = state.clone();
						//if(dst_state[1]==1 && dst_state[2]==0) {
						//System.out.println();
						//}
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						} 

						updateReqVariables(dst_state, requirements_description);

						Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);

						if(lastState) {
							if(dest_id==this.nb_of_states-1) {
								selfTransitionLastState=true;
							}
						}

						//this.fillReward(src_id, dest_id, writer);

						//Transition trans = new Transition(action_name,src_id,dest_id,prob);
						//action_transitions.add(trans);
						//tempTM[src_id][dest_id]=prob.floatValue();

						action_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" +prob.floatValue());

						total_prob = total_prob.add(effect.getProbability());

					}
					if(total_prob.compareTo(one)==-1) {
						int[] dst_state = state.clone();

						updateReqVariables(dst_state, requirements_description);


						Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);

						//this.fillReward(src_id, dest_id);

						if(lastState) {
							if(dest_id==this.nb_of_states-1) {
								selfTransitionLastState=true;
							}
						}

						action_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" + one.subtract(total_prob).floatValue());
					}
					break;
				} 
			}
			if(!holds) {
				int[] dst_state = state.clone();

				updateReqVariables(dst_state, requirements_description);

				Integer dest_id =Utils.getStateIdentifier(dst_state,rewriter.variables_weight);

				//this.fillReward(src_id, dest_id);

				if(lastState) {
					if(dest_id==this.nb_of_states-1) {
						selfTransitionLastState=true;
					}
				}
				//Transition trans = new Transition(action_name,src_id,dest_id,one);
				//action_transitions.add(trans);

				//tempTM[src_id][dest_id]=one.floatValue();
				action_writers.get(index).println((src_id+1) + "\t"+ (dest_id+1) + "\t" + one.floatValue());
				//fillReward(src_id,dest_id,state,dst_state);
			}

			if(lastState && !selfTransitionLastState) {
				action_writers.get(index).println((src_id+1) + "\t"+ (src_id+1) + "\t" + new Float(0));
			}
		}
	}

	/*
	 * 				Auxiliary Functions for LTS States and Transitions Identification PART
	 */
	public static boolean holds(Formula context, int[] state) {
		if(context.verify(state)) {
			return true;
		}
		return false;
	}


	public static void updateStateVariables(int[] dst_state, ProbabilisticEffect effect) {
		EList<StateAtom> atoms = effect.getState_atoms();
		for(StateAtom atom : atoms) {
			dst_state[Integer.valueOf(atom.getState_variable().getName())]=Integer.valueOf(atom.getValue());
		}		
	}

	public static void updateReqVariables(int[] state,  
			ArrayList<RequirementDescription> requirements_descriptions) {
		Integer index = state.length - requirements_descriptions.size();//this.nbStateVariables;
		for(RequirementDescription req : requirements_descriptions) {
			ReqStateUpd.updateReqAtomInState(state,req,index);
			index++;
		}
	}

	private void updateReqVariablesEvent(int[] state,  
			ArrayList<RequirementDescription> requirements_descriptions) {
		Integer index = this.nbStateVariables-requirements_description.size();
		for(RequirementDescription req : requirements_descriptions) {
			EventReqStateUpd.updateReqAtomInState(state,req,index);
			index++;
		}
	}

	public void checkInput() {
		try {
			ml.eval("mdp_check(P,R)");
		} catch (ExecutionException | CancellationException | InterruptedException e) {
			e.printStackTrace();
		}	
	}

	/*
	 * 				Getters and Setters PART
	 */

	public float[] getValue() {
		return value;
	}

	public double[] getPolicy() {
		return policy;
	}

	public ArrayList<String> getActions() {
		return actions;
	}

	public double[][][] getR() {
		return r;
	}

	public double[][][] getP() {
		return p;
	}

	public DomainRewriter getRewriter() {
		return rewriter;
	}

	public int[] getInitial_state() {
		return initial_state;
	}

	public ArrayList<RequirementDescription> getRequirements_description() {
		return requirements_description;
	}




}

