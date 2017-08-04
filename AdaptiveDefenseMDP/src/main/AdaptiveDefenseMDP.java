package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseResourceFactory;

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

	static String graphiz_file_location = "/Users/yehia/Documents/GraphivFilesReact/";

	static DomainDescription description;

	static LTSG lts;

	static MDPSolver solver=new MDPSolver();

	public static void main(String[] args) {

		/*
		 * 1. Read the Domain Description 
		 */		
		try {
			description = loadTextual(domain_description_location);
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		/*
		 * 2. Build the LTS using State and Action Variables, Action Descriptions and Requirements
		 */
		lts = new LTSG(description,LTSG.INITIAL);

		lts.print();

		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);
		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_REQ);
		showInGraphiv(graphiz_file_location+"lts.dot", lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);

		double[][][] TM = MDP_Computer.getTransitionMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
		double[][][] RM = MDP_Computer.getRewardMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
		//lts.readDomainDescription(domain_description_location);
		//lts.generateLTSFromInitialState();
		//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
		//lts.print();

		solveMDP(TM, RM, 0.96);
		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();

		//solver.printRewardMatrix();
		//solver.printTransitionMatrix();
		
		HashSet<Transition> filtered_transitions = MDP_Computer.updateTransitionsUsingPolicy(lts.getTransitions(), lts.getControl_events_id(), policy,MDP_Computer.SHOW_NOOP);
		HashMap<Integer, HashMap<String, String>> states_value = MDP_Computer.updateStatesUsingValue(lts.getStates(), value, filtered_transitions, MDP_Computer.SHOW_ALL_STATES);

		showInGraphiv(graphiz_file_location+"controlstrategy.dot",states_value,filtered_transitions,DOT_Writer.SHOW_ALL);

		HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_control_events(), policy);
		HashMap<Integer, HashMap<String, String>> states_val = MDP_Computer.updateStatesUsingValue(lts.getStates(), value, plan_transitions, MDP_Computer.SHOW_STATE_TRANSITIONS_ONLY);

		showInGraphiv(graphiz_file_location+"controlplan.dot",states_val,plan_transitions,DOT_Writer.SHOW_ALL);

		//solveMDP(lts.getTransitionMatrixDefender(), lts.getRewardMatrixDefender(),0.96);
		//double[] policy_defender = solver.getPolicy();
		//double[] value_defender = solver.getValue();

		//LTS lts2 = lts.generateLTSFromPolicy(policy_defender,value_defender,"defense");
		//lts2.showInGraphiv("/Users/yehia/Documents/lts_service_policy.dot",NormsLTS.SHOW_ALL);

		//solveMDP(lts.getTransitionMatrixDefender(), lts.getTradeOffRewardMatrixDefender(value_attacker,value_defender),0.96);
		//double[] policy = solver.getPolicy();
		//double[] value= solver.getValue();

		//LTS lts3 = lts.generateLTSFromPolicy(policy,value,"defense");
		//lts3.showInGraphiv("/Users/yehia/Documents/lts_tradeoff_policy.dot",NormsLTS.SHOW_ALL);


	}

	

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

		//System.out.println(lts.getAttack_actions().toString());
		solver.checkAllInput();
		solver.solveMDP();
	}

	public static DomainDescription loadTextual(Path configPath) throws IOException{
		new AdaptiveCyberDefenseMetaInformation().registerResourceFactory();
		ResourceSet resourceSet = new ResourceSetImpl();
		String temp = "/"+configPath.toString();
		System.out.println(temp);
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);
		
		//AdaptiveCyberDefenseResourceFactory factory = new AdaptiveCyberDefenseResourceFactory();
		//Resource res = factory.createResource(org.eclipse.emf.common.util.URI.createURI("http://www.emftext.org/language/AdaptiveCyberDefense/True"));
		
		return description;
	}
}
