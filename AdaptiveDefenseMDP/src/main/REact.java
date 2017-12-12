package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import lts.operational.LTSG;
import mdp.MDPSolver;
import visualizer.Graphviz_Writer;


public class REact {
	/** This AdaptiveDefenseMDP class is the main class:
	 * 			Input: a domain description in the form of the emfText DSL specification file
	 * 			Output: a MDP solution, that is the optimal action to take in every possible state
	 * 			Procedure:
	 * 				1) the input is transformed into a LTS so that it can be visualized
	 * 				2) the transition matrix and the reward matrix are computed
	 * 				3) MDPToolBox is used to solve the MDP problem 
	 */

	/*
	 * 			MAIN CONFIGURATION OPTIONS
	 */
	static String descriptionFileName = "toy_example2.AdaptiveCyberDefense";

	static public String dotOption = Graphviz_Writer.SHOW_ALL;

	static String generationOption = LTSG.FULL;
	/*
	 * 			OTHER CONFIGURATION OPTIONS
	 */
	static String files_location = "/Users/yehia/Documents/GraphivFilesReact/";

	static Path domain_description_location = Paths.get( "Users","yehia","Documents",
			"runtime-EclipseApplication","ReactV4-PaperExamples",
			descriptionFileName);

	static public String noop_event_identifier = "noop";
	static public Double discount_factor = 0.98;

	/**
	 * Based on the contents of a description:
	 * (1) State Variables,
	 * (2) Attack and Adaptation Action Variables,
	 * (3) Action Descriptions,
	 * (4) Requirements,
	 * (5) Achieve and Maintain Reward Structures
	 * 
	 * Step 1: Construct a LTS based on State, Action Variables, Requirements and Action Descriptions. A LTS is a tuple <States, Transitions>
	 * Step 2: Construct Transition and Reward Matrices based on Transitions and Requirements
	 * Step 3: Construct a MDP = <Transition Matrix, Reward Matrix> and solve the MDP
	 * @param args
	 */

	static String controlStrategyFileName = "";
	static String controlPlanFileName = "";
	static String ltsFileName = "";
	static DomainDescription description;
	static LTSG lts;
	static MDPSolver solver;
	private static Logger LOGGER;

	public static void main(String[] args) {

		/*
		 * 1. Read the Domain Description 
		 */		
		try {
			description = loadTextual(domain_description_location);
			initializeFileNames(description.getName());
			LOGGER.info("domain description loaded");
		} catch (IOException e1) {
			LOGGER.error("domain description load failed"+e1.getMessage());
			e1.printStackTrace();
		}


		/*
		 * 2. Build the LTS using State and Action Variables, Action Descriptions and Requirements
		 */
		lts = new LTSG(description,generationOption);
		LOGGER.info("The labeled transition system LTSG created");

		lts.print();
		/*
		 * Initialize the MDPSolver class
		 */
		solver = new MDPSolver(lts.getNumberOfStates(),lts.getNbActions());
		LOGGER.info("The MDP Solver is initialized");

		/*
		 * Build the exogenous events matrix PrE based on the transition matrix of exogenous events PrE1,...,PrEn 
		 */
		double[][] ex_tm = solver.buildExogeousEventsMatrix(lts.getExogenous_events_id(), lts.getOccurrence_vectors(),lts.getExo_events_transitions_map());
		LOGGER.info("The exogenous event matrix PrE = PrE1 x...x PrEn is computed");
		LOGGER.trace("The exogenous event matrix \n"+print(ex_tm));

		/*
		 * Build the implicit transition matrix
		 */
		double[][][] tm = solver.buildTransitionMatrix(lts.getCtrl_actions_transitions_map(),ex_tm);
		LOGGER.info("The Transition Matrix of the MDP is created");
		//LOGGER.trace("The transition matrix \n"+print(tm));

		/*
		 * Construct the reward matrix
		 */
		double[][][] rm = solver.buildRewardMatrix(tm, lts.getRequirements_description(),lts.getActionDescriptions(),lts.getId_control_events(),lts.getStates());
		LOGGER.info("The Reward Matrix of the MDP is created");
		//LOGGER.trace("The reward matrix \n"+print(rm));

		solver.checkInput();

		LOGGER.info("The MDP input is checked");

		Graphviz_Writer.create(files_location+ltsFileName, lts.getStates(), lts.getId_control_events(), tm, rm, dotOption);
		LOGGER.info("The LTS Graphviz file is created");

		/*
		 * Solve the MDP and compute the policy and value functions
		 */
		solver.solveMDP();
		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();
		LOGGER.info("The MDP is solved: The policy and value vectors based on the MDP are computed");

		Graphviz_Writer.create(files_location+controlStrategyFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Strategy Graphviz file is created");

		Graphviz_Writer.createPlan(files_location+controlPlanFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Plan Graphviz file is created");

		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);
		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_REQ);
		//showInGraphiv(files_location+ltsFileName, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);

		//LOGGER.info("The labeled transition system .dot file is created");

		//double[] valueO = computeOperationalStrategyAndPlan();

		//LOGGER.info("The value vector based on operational goals is computed");

		//double[] valueA = computeAttackStrategyAndPlan();

		//LOGGER.info("The value vector based on security goals is computed");

		//computeTradeOffStrategyAndPlan(valueA,valueO);
	}

	private static String print(double[][][] tm) {
		StringBuilder str = new StringBuilder();
		int nb_of_states = tm.length;
		int nb_of_actions = tm[0][0].length;
		for(int k =0; k<nb_of_actions;k++){
			str.append("\nAction "+k+"\n");
			for(int i=0; i<nb_of_states;i++) {
				for(int j =0; j< nb_of_states;j++) {
					str.append(tm[i][j][k]);
					str.append(" ");
				}
				str.append("\n");
			}
		}
		return str.toString();
	}

	private static String print(double[][] ex_tm) {
		StringBuilder str = new StringBuilder();
		int nb_of_states = ex_tm.length;
		for(int i=0; i<nb_of_states;i++) {
			for(int j =0; j< nb_of_states;j++) {
				str.append(ex_tm[i][j]);
				str.append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}

	private static void initializeFileNames(String name) {
		controlStrategyFileName = name+"_strategy.dot";
		controlPlanFileName = name+"_plan.dot";
		ltsFileName = name+"_lts.dot";
		updateLog4jConfiguration(name);
	}

	static private void updateLog4jConfiguration(String name) { 
		System.setProperty("descriptionName", name);
		LOGGER = LogManager.getLogger();
	}

	/*
	private static void showInGraphiv(
			String file_path, 
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions, String option) {
		DOT_Writer visualizer = new DOT_Writer(file_path,states,transitions,option);
		visualizer.openFromDesktop();			
	}
	 */

	public static DomainDescription loadTextual(Path configPath) throws IOException{
		new AdaptiveCyberDefenseMetaInformation().registerResourceFactory();
		ResourceSet resourceSet = new ResourceSetImpl();
		String temp = "/"+configPath.toString();
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);
		//AdaptiveCyberDefenseResourceFactory factory = new AdaptiveCyberDefenseResourceFactory();
		//Resource res = factory.createResource(org.eclipse.emf.common.util.URI.createURI("http://www.emftext.org/language/AdaptiveCyberDefense/True"));
		return description;
	}
}

/*private static double[] computeOperationalStrategyAndPlan() {
//LOGGER.info("Nb of Transitions: "+lts.getTransitions().size()+"\n");
//LOGGER.info("Transitions:\n "+lts.getTransitions().toString()+"\n");

double[][][] TM = MDP_Computer.getTransitionMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
LOGGER.info("The transition matrix based on operational goals and control events is computed");

double[][][] RM = MDP_Computer.getRewardMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
LOGGER.info("The reward matrix based on operational goals and control events is computed");

//lts.readDomainDescription(domain_description_location);
//lts.generateLTSFromInitialState();
//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
//lts.print();

solveMDP(TM, RM, 0.96);
double[] policy = solver.getPolicy();
double[] value = solver.getValue();
LOGGER.info("The policy and value vectors based on the MDP that includes reward and transition matrices based on operational are computed");

//solver.printRewardMatrix();
//solver.printTransitionMatrix();

HashSet<Transition> filtered_transitions = MDP_Computer.updateTransitionsUsingPolicy(lts.getTransitions(), lts.getControl_events_id(), policy,MDP_Computer.SHOW_NOOP);
LOGGER.info("The transitions are filtered based on the computed policy");

HashMap<Integer, HashMap<String, String>> states_value = MDP_Computer.updateStatesUsingValue(lts.getStates(), value);
LOGGER.info("A copie of the LTS states are created using the computed state values");

showInGraphiv(files_location+controlStrategyFileName,states_value,filtered_transitions,DOT_Writer.SHOW_NONE);
LOGGER.info("A graph is created using the computed policy transitions and the states updated with their values");

///////////// NEW PART
HashSet<Transition> exogenous_transitions = MDP_Computer.getTransitionsUsingEventsId(lts.getTransitions(), lts.getExogenous_events_id());
LOGGER.info("The transitions caused by exogenous actions are identified");

Graphviz_Writer.write_dot_file(files_location+controlStrategyFileName,states_value,filtered_transitions,exogenous_transitions,DOT_Writer.SHOW_ALL);
LOGGER.info("A graph is created using the computed policy transitions, exogenous transitions and the states updated with their values");

//////// END NEW PART
HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_control_events(), policy);
LOGGER.info("Transitions are reduced to those which are reachable from the initial state to create a plan rather than a strategy");

HashMap<Integer, HashMap<String, String>> plan_states = MDP_Computer.filterStatesUsingTransitions(states_value, plan_transitions);
LOGGER.info("States are filtered based on plan transitions");

showInGraphiv(files_location+controlPlanFileName,plan_states,plan_transitions,DOT_Writer.SHOW_NONE);
LOGGER.info("A Graph is created showing the computed operatio plan");

return value;
}*/

/*private static void solveMDP(double[][][] p, double[][][] r, double discount) {

solver.setP(p);
//solver.printTransitionMatrix();;
solver.setR(r);
//solver.printRewardMatrix();
solver.setDiscount(0.96);
solver.checkInput();

//LOGGER.info(lts.getAttack_actions().toString());
solver.checkAllInput();
solver.solveMDP();
}
 */

