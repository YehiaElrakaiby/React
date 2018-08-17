package simulation;

import java.util.ArrayList;

import resources.Utils;

public class REactController {
	
	private double[] policy;
	ArrayList<Integer> variables_weight;
	
	public REactController(double[] policy, ArrayList<Integer> variables_weight) {
		this.policy = policy;
		this.variables_weight = variables_weight;
	}

	// find the id of the action that corresponds to the current state
	public Integer getAction(int[] currentState) {
		Integer stateId = Utils.getStateIdentifier(currentState, this.variables_weight);
		Integer optimal_action = new Double(policy[stateId]).intValue()-1;
		return optimal_action;
	}

}
