package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import lts.operational.LTSG;
import mdp.MDPSolver;
import resources.MDP_Computer;
import resources.Transition;
import visualizer.DOT_Writer;


public class AdaptiveDefenseMDP {
	/** This AdaptiveDefenseMDP class is the main class:
	 * 			Input: a domain description in the form of the emfText DSL specification file
	 * 			Output: a MDP solution, that is the optimal action to take in every possible state
	 * 			Procedure:
	 * 				1) the input is transformed into a LTS so that it can be visualized
	 * 				2) the transition matrix and the reward matrix are calculated
	 * 				3) MDPToolBox is used to solve the MDP problem 
	 */




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

	static Path domain_description_location = Paths.get( "Users","yehia","Documents",
			"runtime-EclipseApplication","AdaptiveCyberDefenseSpecifications",
			"domain_description.AdaptiveCyberDefense");

	static String files_location = "/Users/yehia/Documents/GraphivFilesReact/";
	static String controlStrategyFileName = "controlStrategy.dot";
	static String controlPlanFileName = "controlPlan.dot";
	static String ltsFileName = "lts.dot";
	static public String noop_event_identifier = "noop";

	static DomainDescription description;

	static LTSG lts;

	static MDPSolver solver=new MDPSolver();

	private final static Logger LOGGER = LogManager.getLogger();
	;

	public static void main(String[] args) {

		//Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		/*
		 * 1. Read the Domain Description 
		 */		
		try {
			description = loadTextual(domain_description_location);
			LOGGER.info("domain description loaded");
		} catch (IOException e1) {
			LOGGER.error("domain description load failed"+e1.getMessage());
			e1.printStackTrace();
		}


		/*
		 * 2. Build the LTS using State and Action Variables, Action Descriptions and Requirements
		 */
		lts = new LTSG(description,LTSG.INITIAL);
		LOGGER.info("The labeled transition system LTSG created");

		lts.print();

		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);
		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_REQ);
		showInGraphiv(files_location+ltsFileName, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);

		LOGGER.info("The labeled transition system .dot file is created");

		double[] valueO = computeOperationalStrategyAndPlan();

		LOGGER.info("The value vector based on operational goals is computed");

		//double[] valueA = computeAttackStrategyAndPlan();

		//LOGGER.info("The value vector based on security goals is computed");

		//computeTradeOffStrategyAndPlan(valueA,valueO);
	}



	private static double[] computeOperationalStrategyAndPlan() {
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

		showInGraphiv(files_location+controlStrategyFileName,states_value,filtered_transitions,DOT_Writer.SHOW_AP);
		LOGGER.info("A graph is created using the computed policy transitions and the states updated with their values");

		HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_control_events(), policy);
		LOGGER.info("Transitions are reduced to those which are reachable from the initial state to create a plan rather than a strategy");

		HashMap<Integer, HashMap<String, String>> plan_states = MDP_Computer.filterStatesUsingTransitions(states_value, plan_transitions);
		LOGGER.info("States are filtered based on plan transitions");

		showInGraphiv(files_location+controlPlanFileName,plan_states,plan_transitions,DOT_Writer.SHOW_AP);
		LOGGER.info("A Graph is created showing the computed operatio plan");

		return value;
	}

	/*
	private static double[] computeAttackStrategyAndPlan() {
		double[][][] TM = MDP_Computer.getTransitionMatrix(lts.getStates(),lts.getTransitions(),lts.getExploit_events_id());
		LOGGER.info("The attack transition matrix is computed");

		double[][][] RM = MDP_Computer.getCostMatrix(lts.getStates(),lts.getTransitions(),lts.getExploit_events_id());
		LOGGER.info("The attack reward matrix is computed");

		//lts.readDomainDescription(domain_description_location);
		//lts.generateLTSFromInitialState();
		//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
		//lts.print();

		solveMDP(TM, RM, 0.96);
		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();
		LOGGER.info("The policy and value vectors based on attack and reward matrices are computed");

		//solver.printRewardMatrix();
		//solver.printTransitionMatrix();

		HashSet<Transition> policy_transitions = MDP_Computer.updateTransitionsUsingPolicy(lts.getTransitions(), lts.getExploit_events_id(), policy,MDP_Computer.SHOW_NOOP);
		LOGGER.info("Transitions are filtered based on the computed attack policy");

		HashMap<Integer, HashMap<String, String>> states_value = MDP_Computer.updateStatesUsingValue(lts.getStates(), value);
		LOGGER.info("The computed attack value of states are included in a copy of the states of the LTS");

		showInGraphiv(files_location+attackStrategyFileName,states_value,policy_transitions,DOT_Writer.SHOW_ALL);
		LOGGER.info("The graph .dot file showing the attack strategy is created");

		HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_exploit_events(), policy);
		LOGGER.info("Transitions are filtered based on the initial state to create an attack plan");

		HashMap<Integer, HashMap<String, String>> plan_states = MDP_Computer.filterStatesUsingTransitions(states_value, plan_transitions);
		LOGGER.info("States are filtered based on plan transitions");

		showInGraphiv(files_location+attackPlanFileName,plan_states,plan_transitions,DOT_Writer.SHOW_ALL);
		LOGGER.info("The graph .dot file showing the attack plan is created");

		return value;
	}


	private static void computeTradeOffStrategyAndPlan(double[] valueA, double[] valueO) {
		LOGGER.trace("Nb of Transitions: "+lts.getTransitions().size()+"\n");
		LOGGER.trace("Transitions:\n "+lts.getTransitions().toString()+"\n");
		double[][][] TM = MDP_Computer.getTransitionMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
		LOGGER.info("The transition matrix based on operational goals and control events is computed");

		double[][][] RM = MDP_Computer.getTradeOffRewardMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id(),valueA,valueO);
		LOGGER.info("The reward trade off matrix is computed based on the operational and vulnerability value of states");


		//lts.readDomainDescription(domain_description_location);
		//lts.generateLTSFromInitialState();
		//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
		//lts.print();

		solveMDP(TM, RM, 0.96);
		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();
		LOGGER.info("The value and policy are computed based on the trade off MDP");

		//solver.printRewardMatrix();
		//solver.printTransitionMatrix();

		HashSet<Transition> filtered_transitions = MDP_Computer.updateTransitionsUsingPolicy(lts.getTransitions(), lts.getControl_events_id(), policy,MDP_Computer.SHOW_NOOP);
		LOGGER.info("Transitions are filtered basd on the computed policy");

		HashMap<Integer, HashMap<String, String>> states_value = MDP_Computer.updateStatesUsingValue(lts.getStates(), value);
		LOGGER.info("A copy of the states is created using the value verctor: every value is included in the state");

		showInGraphiv(files_location+tradeOffStrategyFileName,states_value,filtered_transitions,DOT_Writer.SHOW_ALL);
		LOGGER.info("The trade off graph of the trade off strategy is created");

		HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_control_events(), policy);
		LOGGER.trace("Nb of TradeOff Plan Transitions: "+plan_transitions.size()+"\n");
		LOGGER.trace("Transitions:\n "+plan_transitions.toString()+"\n");
		LOGGER.info("The plan transitions of the trade off strategy are identified");

		HashMap<Integer, HashMap<String, String>> plan_states = MDP_Computer.filterStatesUsingTransitions(states_value, plan_transitions);
		LOGGER.info("States are filtered based on plan transitions");

		showInGraphiv(files_location+tradeOffPlanFileName,plan_states,plan_transitions,DOT_Writer.SHOW_ALL);
		LOGGER.info("The graph of the tradeoff plan is created");

	}
*/


	private static void showInGraphiv(String file_path, HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions, String option) {
		DOT_Writer visualizer = new DOT_Writer(file_path,states,transitions,option);
		visualizer.openFromDesktop();			
	}

	/*
	private static void showInGraphiv(String graphiz_file, 
			HashMap<Integer, 
			HashMap<String, String>> states,
			HashSet<Transition> transitions) {
		DOT_Writer visualizer = new DOT_Writer(graphiz_file,states,transitions);
		visualizer.openFromDesktop();			
	}*/
	/*
	private static void showInGraphiv(String path, LTSG lts) {
		DOT_Writer visualizer = new DOT_Writer(path, lts.getStates(),lts.getTransitions());
		visualizer.openFromDesktop();		
	}*/


	private static void solveMDP(double[][][] p, double[][][] r, double discount) {

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

	public static DomainDescription loadTextual(Path configPath) throws IOException{
		new AdaptiveCyberDefenseMetaInformation().registerResourceFactory();
		ResourceSet resourceSet = new ResourceSetImpl();
		String temp = "/"+configPath.toString();
		LOGGER.info("Domain Description File Name : "+temp);
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);

		//AdaptiveCyberDefenseResourceFactory factory = new AdaptiveCyberDefenseResourceFactory();
		//Resource res = factory.createResource(org.eclipse.emf.common.util.URI.createURI("http://www.emftext.org/language/AdaptiveCyberDefense/True"));

		return description;
	}
}
