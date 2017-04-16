package main;

import java.nio.file.Path;
import java.nio.file.Paths;

import lts.LTS;
import lts.norms.NormsLTS;
import mdp.MDPSolver;


public class AdaptiveDefenseMDP {
	/** This AdaptiveDefenseMDP class is the main class:
	 * 			Input: a domain description in the form of the emfText DSL specification file
	 * 			Output: a MDP solution, that is the optimal action to take in every possible state
	 * 			Procedure:
	 * 				1) the input is transformed into a LTS so that it can be visualized
	 * 				2) the transition matrix and the reward matrix are calculated
	 * 				3) MDPToolBox is used to solve the MDP problem 
	 */
	
	static NormsLTS lts;
	static MDPSolver solver;
	static Path domain_description_location = Paths.get( "Users","yehia","Documents",
			"runtime-EclipseApplication","AdaptiveCyberDefenseSpecifications",
			"domain_description.AdaptiveCyberDefense");
	//static Path domain_description_location = Paths.get( 
		//	"Users","yehia","Documents",
			//"Desktop","domain_description.AdaptiveCyberDefense");
	
	
	public static void main(String[] args) {
		
		lts = new NormsLTS();
		solver = new MDPSolver();
		lts.readDomainDescription(domain_description_location);
		lts.generateLTSFromInitialState();
		lts.showInGraphiv("/Users/yehia/Documents/lts.dot");
		//lts.print();
		solveMDP(lts.getTransitionMatrixAttacker(), lts.getRewardMatrixAttacker(),0.96);
		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();

		LTS lts1 = lts.generateLTSFromPolicy(policy,"attack");
		lts1.showInGraphiv("/Users/yehia/Documents/lts_attack_policy.dot");
		
		solveMDP(lts.getTransitionMatrixDefender(), lts.getRewardMatrixDefender(value),0.96);
		policy = solver.getPolicy();
		value = solver.getValue();

		LTS lts2 = lts.generateLTSFromPolicy(policy,"defense");
		lts2.showInGraphiv("/Users/yehia/Documents/lts_defense_policy.dot");
		
	}
	
	private static void solveMDP(double[][][] p, double[][][] r, double discount) {

		solver.setP(p);
		//solver.printTransitionMatrix();;
		solver.setR(r);
		solver.printRewardMatrix();
		solver.setDiscount(0.96);
		solver.checkInput();

		//System.out.println(lts.getAttack_actions().toString());
		//solver.printAllInput();
		solver.solveMDP();
	}

}
