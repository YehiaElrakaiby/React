package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import lts.LTS;
import lts.norms.NormsLTS;
import lts.norms.readers.DomainDescriptionReader;
import lts.operational.LTSG;
import mdp.MDPSolver;
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
	
	static String graphiz_file = "/Users/yehia/Documents/lts.dot";
	
	static DomainDescription description;
	
	static LTSG lts;
	
	static MDPSolver solver;
	
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
		lts = new LTSG(description);
		
		lts.print();
		
		showInGraphiv(graphiz_file, lts);
		//solver = new MDPSolver();
		//lts.readDomainDescription(domain_description_location);
		//lts.generateLTSFromInitialState();
		//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
		//lts.print();
		
		//solveMDP(lts.getTransitionMatrixAttacker(), lts.getRewardMatrixAttacker(),0.96);
		//double[] policy_attacker = solver.getPolicy();
		//double[] value_attacker = solver.getValue();

		//LTS lts1 = lts.generateLTSFromPolicy(policy_attacker,value_attacker,"attack");
		//lts1.showInGraphiv("/Users/yehia/Documents/lts_attack_policy.dot",NormsLTS.SHOW_ALL);
		
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
	
	private static void showInGraphiv(String path, LTSG lts) {
		DOT_Writer visualizer = new DOT_Writer(path, lts.getStates(),lts.getTransitions());
		visualizer.openFromDesktop();		
	}
	
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
		return description;
	}
}
