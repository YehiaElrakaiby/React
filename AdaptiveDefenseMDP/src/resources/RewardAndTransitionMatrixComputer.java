package resources;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RewardAndTransitionMatrixComputer {

	static public double[][][] getTransitionMatrix(
			HashMap<Integer, HashMap<String, String>> states, 
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id) {

		double[][][] t = new double[states.size()][states.size()][events_id.size()];
		for(Transition descr: transitions){
			if(descr.getApplicable()) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				String action_name = descr.getName();
				BigDecimal prob = descr.getProbability();
				if(events_id.containsKey(action_name)) {
					t[src][dest][events_id.get(action_name)] = prob.doubleValue();
				}
			} else if(!descr.getApplicable()){
				Integer src = descr.getSrc();
				String action_name = descr.getName();
				if(events_id.containsKey(action_name)) {
					t[src][src][events_id.get(action_name)] = 1;
				}
			}
		}
		return t;
	}

	static public double[][][] getRewardMatrix(
			HashMap<Integer, HashMap<String, String>> states, 
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id) {

		double[][][] t = new double[states.size()][states.size()][events_id.size()];
		for(Transition descr: transitions){
			if(descr.getApplicable()) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				String action_name = descr.getName();
				Integer reward = descr.getReward();
				if(events_id.containsKey(action_name)) {
					t[src][dest][events_id.get(action_name)] = reward;
				}
			} else if(!descr.getApplicable()){
				Integer src = descr.getSrc();
				String action_name = descr.getName();
				if(events_id.containsKey(action_name)) {
					t[src][src][events_id.get(action_name)] = -999999999;
				}
			}
		}
		return t;
	}

	static public HashMap<Integer, HashMap<String, String>> updateStatesUsingValue(HashMap<Integer, HashMap<String, String>> states, 
			double[] value) {
		HashMap<Integer, HashMap<String, String>> temp_states = (HashMap<Integer, HashMap<String, String>>) states.clone();
		Iterator<Integer> it = temp_states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			double val = value[state_id-1];
			temp_states.get(state_id).put("utility", String.valueOf(val));
		}
		return temp_states;
	}

	static public HashSet<Transition>  updateTransitionsUsingPolicy(HashSet<Transition>  transitions, 
			HashMap<String, Integer> events, 
			double[] policy) {
		HashSet<Transition> temp_trans = new HashSet<Transition>();
		for(Transition trans_descr : transitions){
			String trans_name = trans_descr.getName();
			Integer trans_src = trans_descr.getSrc();
			Integer action_id = (int) (policy[trans_src]);			
			if(events.get(trans_name).equals(action_id)){
				temp_trans.add(trans_descr);
			}
		}
		return temp_trans;
	}

}
