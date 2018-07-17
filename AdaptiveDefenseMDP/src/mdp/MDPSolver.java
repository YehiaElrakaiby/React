package mdp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;

import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

import main.REact;
import resources.ComputeRwd;
import resources.RequirementDescription;
import resources.Transition;

public class MDPSolver {

	private double[][][] p;
	private double[][][] r;
	private double discount;
	private MatlabEngine ml;
	private Future<MatlabEngine> eng;
	private double[] value;
	private double[] policy;
	private double[][] exogenous_events_TM;
	private Integer nbOfStates=0;
	private Integer nbOfActions=0;

	private final static Logger LOGGER = LogManager.getLogger();


	public MDPSolver(Integer nb_of_states,Integer nb_of_actions){
		try {
			//Start MATLAB asynchronously
			eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			ml = eng.get();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}

		nbOfStates=nb_of_states;
		nbOfActions=nb_of_actions;

		p = new double[nbOfStates][nbOfStates][nbOfActions];
		r = new double[nbOfStates][nbOfStates][nbOfActions];
		discount = REact.discount_factor;

		exogenous_events_TM = new double[nbOfStates][nbOfStates];
		try {
			ml.putVariableAsync("P", p);
			ml.putVariableAsync("R", r);
			ml.putVariableAsync("discount", discount);

			ml.putVariableAsync("EXTM", exogenous_events_TM);

		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public double[][][] getP() {
		return p;
	}

	public void setP(double[][][] p) {
		this.p = p;
		try {
			ml.putVariableAsync("P", p);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	public double[][][] getR() {
		return r;
	}

	public void setR(double[][][] r) {
		this.r = r;
		try {
			ml.putVariableAsync("R", r);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
		try {
			ml.putVariableAsync("discount", d);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printTransitionMatrix() {
		try {
			ml.eval("P");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void printRewardMatrix() {
		try {
			ml.eval("R");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void checkAllInput() {
		try {
			check(this.p);
			//check(this.r);
			//ml.eval("P");
			//ml.eval("R");
			//ml.eval("discount");
		} catch (CancellationException e){// | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	static void check(double[][][] p2) {
		int nb_of_states = p2.length;
		System.out.println("Number of states is: "+nb_of_states);
		int nb_of_actions = p2[0][0].length;
		System.out.println("Number of actions is: "+nb_of_actions);

		for(int k=0;k<nb_of_actions;k++) {
			for(int i=0;i<nb_of_states;i++) {
				double sum_of_row=0;
				String row = "";
				for(int j=0;j<nb_of_states;j++) {
					sum_of_row+=p2[i][j][k];
					row=row+" "+p2[i][j][k];
				}
				if(sum_of_row != 1.0) {
					System.out.println("Problem with row action is "+k+" state is "+i);
					System.out.println(row);

				}
				//System.out.println();
			}
			//System.out.println();
		}
		//System.out.println();
	}

	public void solveMDP() {
		try {
			//ml.eval("P");
			//ml.eval("R");

			ml.eval("[V,policy,iter,cpu_time]=mdp_policy_iteration(P,R,discount);");

			Future<double[]> future_v = ml.getVariableAsync("V");
			value = future_v.get();

			Future<double[]> future_policy = ml.getVariableAsync("policy");
			policy = future_policy.get();

			//			Future<double[]> future_iter = ml.getVariableAsync("iter");
			//			double[] iter = future_iter.get();
			//			System.out.println("Nb of Iterations is: "+iter[0]);
			//			
			//			Future<double[]> future_cpu_time = ml.getVariableAsync("cpu_time");
			//			double[] cpu_time = future_cpu_time.get();
			//			System.out.println("CPU Time is: "+cpu_time[0]);

		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void printMDPSolution() {
		for(double e:value) {
			System.out.println(e);
		}			
		for(double e:policy) {
			System.out.println(e);
		}
	}

	public double[][] buildExogeousEventsMatrix(
			HashMap<String, Integer> exogenousEvents_IdMap, 
			HashMap<Integer, HashMap<Integer, Double>> occurrence_vectors,
			HashMap<Integer, HashSet<Transition>> exo_events_transitions_map) {
		/*
		 * Create in Matlab EXTM, the final exogenous event transition matrix
		 */
		try {
			ml.eval("EXTM = eye(" + nbOfStates + ");");
		} catch (CancellationException | InterruptedException | ExecutionException e1) {
			LOGGER.error("Problem initializing EXTM in MatLab to store the final exogenous events transition matrix\n"+e1.getMessage());
			e1.printStackTrace();
		}

		/*
		 * Iterate over all exogenous events
		 */
		Iterator<String> it = exogenousEvents_IdMap.keySet().iterator();
		while(it.hasNext()) {
			/*
			 *	Get Event Name and Event Id 
			 */
			String event_name = it.next();
			Integer event_id = exogenousEvents_IdMap.get(event_name);
			/*
			 * Create a (occurrence) vector and a (transition) matrix
			 */
			double[] vector = new double[nbOfStates];
			double[][] tempTM = new double[nbOfStates][nbOfStates];
			/*
			 * Get Event Occurrences and Build Occurrence Vector
			 */
			HashMap<Integer, Double> occurrence_vector = occurrence_vectors.get(event_id);
			Iterator<Integer> it2 = occurrence_vector.keySet().iterator();
			while(it2.hasNext()) {
				Integer state_id = it2.next();
				Double occur_prob = occurrence_vector.get(state_id);
				vector[state_id] = occur_prob;
			}
			/*
			 * Get Event Transitions and Build Transition Matrix
			 */
			HashSet<Transition> transitions = exo_events_transitions_map.get(event_id);
			for(Transition trans : transitions) {
				Integer src = trans.getSrc();
				Integer dst = trans.getDest();
				BigDecimal prob = trans.getProbability();
				tempTM[src][dst] = prob.doubleValue();
			}
			/*
			 * 1) Compute the Event's transition matrix
			 * 2) Multiply the computed matrix with EXTM
			 */
			try {
				ml.putVariableAsync("V", vector);
				ml.putVariableAsync("TTM", tempTM);
				ml.eval("TM = (diag(V) * TTM) + diag((1 - V));");
				ml.eval("EXTM = EXTM*TM;");
			} catch (IllegalStateException | InterruptedException | ExecutionException e) {
				LOGGER.error("Problem multiplying EXTM and the event's computed TM \n"+e.getMessage());
				e.printStackTrace();
			}	
		}
		Future<double[][]> future_v;
		try {
			future_v = ml.getVariableAsync("EXTM");
			this.exogenous_events_TM = future_v.get();
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem retrieving EXTM from MatLab \n"+e.getMessage());
			e.printStackTrace();
		}
		return exogenous_events_TM;
	}

	public double[] getValue() {
		return value;
	}

	public double[] getPolicy() {
		return policy;
	}

	public void disconnet() {
		try {
			//Disconnect from the MATLAB session
			ml.disconnect();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void checkInput() {
		try {
			ml.eval("mdp_check(P,R)");
		} catch (ExecutionException | CancellationException | InterruptedException e) {
			e.printStackTrace();
		}	
	}

	public double[][][] buildTransitionMatrix(
			HashMap<Integer, HashSet<Transition>> ctrl_actions_transitions_map,
			double[][] ex_tm) {
		Iterator<Integer> it = ctrl_actions_transitions_map.keySet().iterator();
		while(it.hasNext()){
			Integer action_id = it.next();
			String matrix_id = "TM_"+action_id;
			HashSet<Transition> transitions = ctrl_actions_transitions_map.get(action_id);
			double[][] tempTM = new double[nbOfStates][nbOfStates];

			for(Transition trans:transitions) {
				Integer src = trans.getSrc();
				Integer dst = trans.getDest();
				BigDecimal prob = trans.getProbability();
				tempTM[src][dst] = prob.doubleValue();
			}

			/*
			 * 1) Compute the Event's transition matrix
			 * 2) Multiply the computed matrix with EXTM
			 */
			try {
				ml.putVariableAsync(matrix_id, tempTM);
				//(original)ml.eval("P(:,:,"+(action_id+1)+")" +"=EXTM*"+matrix_id+ ";");
				ml.eval("P(:,:,"+(action_id+1)+")" +"="+matrix_id+ "*EXTM;");

			} catch (IllegalStateException | InterruptedException | ExecutionException e) {
				LOGGER.error("Problem multiplying EXTM and the action's computed TM \n"+e.getMessage());
				e.printStackTrace();
			}	
		}

		Future<double[][][]> future_p;
		try {
			future_p = ml.getVariableAsync("P");
			this.p = future_p.get();
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem retrieving EXTM from MatLab \n"+e.getMessage());
			e.printStackTrace();
		}
		return p;


	}

	/*public double[][][] buildRewardMatrix(
			HashSet<Reward> rewards, 
			HashMap<String, ActionDescription> actionDescriptions,
			HashMap<String, Integer> control_events_id) {

	 * Build the generic reward matrix

		double[][] tempTM = new double[nbOfStates][nbOfStates];
		String matrix_id = "TRM";
		for(Reward reward : rewards) {
			Integer src = reward.getSrc();
			Integer dst = reward.getDest();
			Integer rew = reward.getReward();
			tempTM[src][dst] = rew;
		}


	 * (1) iterate over all actions
	 * (1.1) get action id
	 * (1.2) get action cost
	 * (1.3) insert TM in matlab
	 * (1.4) construct the reward matrix R(:,:,a)= TM - cost of a

		Iterator<String> it = control_events_id.keySet().iterator();
		while(it.hasNext()) {
			String action_name = it.next();
			Integer action_id = control_events_id.get(action_name);
			BigDecimal action_cost = actionDescriptions.get(action_name).getCost();

	 * 1) Compute the reward matrix
	 * 2) Perform element wise substraction of the computed matrix with the action cost

			try {
				ml.putVariableAsync(matrix_id, tempTM);
				ml.eval("R(:,:,"+(action_id+1)+")" +"="+matrix_id+ " - "+action_cost.doubleValue()+";");
			} catch (IllegalStateException | InterruptedException | ExecutionException e) {
				LOGGER.error("Problem creating reward matrix in matlab \n"+e.getMessage());
				e.printStackTrace();
			}	
		}

	 * retrieve the reward matrix R from matlab

		Future<double[][][]> future_r;
		try {
			future_r = ml.getVariableAsync("R");
			this.r = future_r.get();
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem retrieving EXTM from MatLab \n"+e.getMessage());
			e.printStackTrace();
		}
		return r;

	}
	 */
	public double[][][] buildRewardMatrix(double[][][] tm,
			HashMap<String, RequirementDescription> requirements_description,
			HashMap<String, ActionDescription> actionDescriptions, 
			HashMap<Integer, String> id_controlEvents,
			HashMap<Integer,HashMap<String,String>> states) {

		Integer nbOfStates = tm.length;
		Integer nbOfActions = tm[0][0].length;

		double[][][] rm = new double[nbOfStates][nbOfStates][nbOfActions];

		//String matrix_id = "TRM";

		for(int k=0; k<nbOfActions; k++) {
			String action_name=id_controlEvents.get(k);
			BigDecimal action_cost = actionDescriptions.get(action_name).getCost();
			for(int i = 0; i<nbOfStates; i++) {
				for(int j = 0; j<nbOfStates;j++) {
					if(tm[i][j][k]!=0){

						BigDecimal rew = new BigDecimal(0);
						rew=rew.subtract(action_cost);

						HashMap<String, String> src = states.get(i);
						HashMap<String, String> dst = states.get(j);
						dst.put(action_name.substring(0,action_name.indexOf("=tt")), "tt");

						Iterator<String> it = requirements_description.keySet().iterator();
						RequirementDescription req;
						while(it.hasNext()) {
							String reqID = it.next();
							req = requirements_description.get(reqID);
							if(req.getType().equals("ua")){
								rew=rew.add(ComputeRwd.reward_ua(req,src,dst));
							} else if(req.getType().equals("ca")){
								rew=rew.add(ComputeRwd.reward_ca(req,src,dst));
							} else if(req.getType().equals("dfa")){
								rew=rew.add(ComputeRwd.reward_dfa(req,src,dst));
							} else if(req.getType().equals("dea")){
								rew=rew.add(ComputeRwd.reward_dea(req,src,dst));
							} else if(req.getType().equals("um")){
								rew=rew.add(ComputeRwd.reward_um(req,src,dst));
							} else if(req.getType().equals("cm")){
								rew=rew.add(ComputeRwd.reward_cm(req,src,dst));
							} else if(req.getType().equals("dfm")){
								rew=rew.add(ComputeRwd.reward_dfm(req,src,dst));
							} else if(req.getType().equals("dem")){
								rew=rew.add(ComputeRwd.reward_dem(req,src,dst));
							} else if(req.getType().equals("pdem")){
								rew=rew.add(ComputeRwd.reward_pdem(req,src,dst));
							} else if(req.getType().equals("pm")){
								rew=rew.add(ComputeRwd.reward_pm(req,src,dst));
							} else if(req.getType().equals("rpm")){
								rew=rew.add(ComputeRwd.reward_rpm(req,src,dst));
							} else if(req.getType().equals("rpdem")){
								rew=rew.add(ComputeRwd.reward_rpdem(req,src,dst));
							} else if(req.getType().equals("pdfm")) {
								rew=rew.add(ComputeRwd.reward_pdfm(req,src,dst));
							} else if(req.getType().equals("rpdfm")){
								rew=rew.add(ComputeRwd.reward_rpdfm(req,src,dst));
							} 
						}
						dst.remove(action_name.substring(0,action_name.indexOf("=tt")));
						rm[i][j][k]=rew.doubleValue();
					}
				}
			}
		}
		try {
			ml.putVariableAsync("R", rm);
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem creating reward matrix in matlab \n"+e.getMessage());
			e.printStackTrace();
		}	

		//retrieve the reward matrix R from matlab

		Future<double[][][]> future_r;
		try {
			future_r = ml.getVariableAsync("R");
			this.r = future_r.get();
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			LOGGER.error("Problem retrieving EXTM from MatLab \n"+e.getMessage());
			e.printStackTrace();
		}
		return r;
		//return rm;
	}

	
}

