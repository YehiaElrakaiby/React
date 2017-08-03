package resources;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MDP_Computer {

	static public double[][][] getTransitionMatrix(
			HashMap<Integer, HashMap<String, String>> states, 
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id) {

		double[][][] t = new double[states.size()][states.size()][events_id.size()];
		for(Transition descr: transitions){
			if(descr.getApplicability()) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				String action_name = descr.getName();
				BigDecimal prob = descr.getProbability();
				if(events_id.containsKey(action_name)) {
					t[src][dest][events_id.get(action_name)] = prob.doubleValue();
				}
			} else if(!descr.getApplicability()){
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
			if(descr.getApplicability()) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				String action_name = descr.getName();
				Integer reward = descr.getReward();
				if(events_id.containsKey(action_name)) {
					t[src][dest][events_id.get(action_name)] = reward;
				}
			} else if(!descr.getApplicability()){
				Integer src = descr.getSrc();
				String action_name = descr.getName();
				if(events_id.containsKey(action_name)) {
					t[src][src][events_id.get(action_name)] = -999999999;
				}
			}
		}
		return t;
	}

	public final static Boolean SHOW_ALL_STATES=true;
	public final static Boolean SHOW_STATE_TRANSITIONS_ONLY=false;

	static public HashMap<Integer, HashMap<String, String>> updateStatesUsingValue(HashMap<Integer, HashMap<String, String>> states, 
			double[] value, 
			HashSet<Transition> filtered_transitions, 
			Boolean option) {
		HashMap<Integer, HashMap<String, String>> temp_states = new HashMap<Integer, HashMap<String, String>>();
		HashSet<Integer> states_transitions = getSourceAndDestinationStates(filtered_transitions);

		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			double val = value[state_id];
			if(option.equals(SHOW_ALL_STATES)) {
				temp_states.put(state_id, states.get(state_id));
				temp_states.get(state_id).put("util", String.valueOf(val));
			} else if (states_transitions.contains(state_id)) {
				temp_states.put(state_id, states.get(state_id));
				temp_states.get(state_id).put("util", String.valueOf(val));			}
		}
		return temp_states;
	}

	private static HashSet<Integer> getSourceAndDestinationStates(HashSet<Transition> filtered_transitions) {
		HashSet<Integer> states = new HashSet<Integer>();
		for(Transition trans : filtered_transitions) {
			states.add(trans.getSrc());
			states.add(trans.getDest());

		}
		return states;
	}

	public final static Boolean SHOW_NOOP = true;
	public final static Boolean NO_SHOW_NOOP = false;

	static public HashSet<Transition>  updateTransitionsUsingPolicy(
			HashSet<Transition>  transitions, 
			HashMap<String, Integer> events, 
			double[] policy,
			Boolean option) {
		Integer id_noop = events.get("dnoop=tt");
		HashSet<Transition> temp_trans = new HashSet<Transition>();
		for(Transition trans_descr : transitions){
			if(trans_descr.getApplicability()){
				String trans_name = trans_descr.getName();
				Integer trans_src = trans_descr.getSrc();
				Integer policy_action_id = (int) (policy[trans_src]);			
				if(events.containsKey(trans_name)) {
					if(events.get(trans_name).equals(policy_action_id-1)){
						if(option) {
							temp_trans.add(trans_descr);
						}
						else if(!id_noop.equals(policy_action_id-1)){
							temp_trans.add(trans_descr);
						}
					}
				}
			}
		}
		return temp_trans;
	}

	public static HashSet<Transition> findPlanTransitionsUsingPolicy(
			HashMap<Integer, Transition> transitions2,
			HashMap<Integer, HashSet<Integer>> transitions3, 
			HashMap<Integer, String> events,
			double[] policy) {
		HashSet<Transition> transitions = new HashSet<Transition>();
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Integer> to_explore = new LinkedList<Integer>();
		Integer initial_state_id=0;
		to_explore.add(initial_state_id);
		while(!to_explore.isEmpty()) {
			Integer src = to_explore.remove();
			visited.add(src);
			Double policy_action = policy[src];
			String label = events.get(policy_action.intValue()-1);
			HashSet<Integer> successorStates = transitions3.get(Transition.hashCode(src, label));
			for(Integer dest : successorStates) {
				Transition trans = transitions2.get(Transition.hashCode(src, label, dest));
				if(trans.getApplicability()){
					transitions.add(trans);
				}
				if(!visited.contains(dest)) {
					to_explore.add(dest);
				}
			}

		}

		return transitions;
	}



}
