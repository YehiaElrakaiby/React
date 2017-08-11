package resources;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import main.AdaptiveDefenseMDP;


public class MDP_Computer {

	private final static Logger LOGGER = LogManager.getRootLogger();

	static public double[][][] getTransitionMatrix(
			HashMap<Integer, HashMap<String, String>> states, 
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id) {

		double[][][] t = new double[states.size()][states.size()][events_id.size()];
		for(Transition descr: transitions){
			//if(descr.getApplicability()) {
			Integer src = descr.getSrc();
			Integer dest = descr.getDest();
			String action_name = descr.getName();
			BigDecimal prob = descr.getProbability();
			if(events_id.containsKey(action_name)) {
				t[src][dest][events_id.get(action_name)] = prob.doubleValue();
				//	}
			} /*else if(!descr.getApplicability()){
				Integer src = descr.getSrc();
				String action_name = descr.getName();
				if(events_id.containsKey(action_name)) {
					t[src][src][events_id.get(action_name)] = 1;
				}
			}*/
		}
		return t;
	}

	static public double[][][] getRewardMatrix(
			HashMap<Integer, HashMap<String, String>> states, 
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id) {

		double[][][] t = new double[states.size()][states.size()][events_id.size()];
		for(Transition descr: transitions){
			//if(descr.getApplicability()) {
			Integer src = descr.getSrc();
			Integer dest = descr.getDest();
			String action_name = descr.getName();
			Integer reward = descr.getOrReward() + descr.getActionCost();
			if(events_id.containsKey(action_name)) {
				t[src][dest][events_id.get(action_name)] = reward;
				//	}
			} /*else if(!descr.getApplicability()){
				Integer src = descr.getSrc();
				String action_name = descr.getName();
				if(events_id.containsKey(action_name)) {
					t[src][src][events_id.get(action_name)] = -999999999;
				}
			}*/
		}
		return t;
	}

	public final static Boolean SHOW_ALL_STATES=true;
	public final static Boolean SHOW_STATE_TRANSITIONS_ONLY=false;

	static public HashMap<Integer, HashMap<String, String>> updateStatesUsingValue(
			HashMap<Integer, HashMap<String, String>> states, 
			double[] value) {
		HashMap<Integer, HashMap<String, String>> temp_states = new HashMap<Integer, HashMap<String, String>>();
		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			double val = value[state_id];
			temp_states.put(state_id, states.get(state_id));
			temp_states.get(state_id).put("util", String.valueOf(val));
		}
		return temp_states;
	}


	static public HashSet<Integer> getSourceAndDestinationStates(
			HashSet<Transition> filtered_transitions) {
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
		Integer id_noop=0;

		if(events.containsKey(AdaptiveDefenseMDP.noop_event_identifier_1)) {
			id_noop = events.get(AdaptiveDefenseMDP.noop_event_identifier_1+"=tt");
			
		} else if(events.containsKey(AdaptiveDefenseMDP.noop_event_identifier_2)){
			id_noop = events.get(AdaptiveDefenseMDP.noop_event_identifier_2+"=tt");			
		} else {
			LOGGER.error("Problem: could not find the noop identifier");
		}
		HashSet<Transition> temp_trans = new HashSet<Transition>();
		for(Transition trans_descr : transitions){
			if(trans_descr.getApplicability()){
				String trans_name = trans_descr.getName();
				Integer trans_src = trans_descr.getSrc();
				Integer policy_action_id = (int) (policy[trans_src]);			
				if(events.containsKey(trans_name)) {
					if(events.get(trans_name).equals(policy_action_id-1)){
						if(option.equals(SHOW_NOOP)) {
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
			if(successorStates==null) {
				LOGGER.error("STOP: state+label have no successors");
			}
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

	public static double[][][] getTradeOffRewardMatrix(
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions, 
			HashMap<String, Integer> events_id,
			double[] value_attacker, 
			double[] value_defender) {
		//if(defender_actions.isEmpty())identifyDefenderActions();

		double[][][] r = new double[states.size()][states.size()][events_id.size()];
		/*
		 * iterate over transitions and fill the transition matrix accordingly
		 * the transition matrix is of the form (src,dest,action)
		 * a -1 is used since indexing in matrices starts at 0 whereas identifiers of states and actions start at 1
		 */
		for( Transition descr : transitions) {
			String action_name = descr.getName();
			/*
			 * if the transition's action is a defender action
			 */
			if(events_id.containsKey(action_name)) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				double attacker_value_src = value_attacker[src];
				double defender_value_src = value_defender[src];

				double attacker_value_dest = value_attacker[dest];
				double defender_value_dest = value_defender[dest];

				//double src_vuln = attacker_value[src-1];
				//double dest_vuln = attacker_value[dest-1];
				//double vuln_reduction = src_vuln - dest_vuln;
				//BigDecimal action_cost = new BigDecimal(descr.getActionCost());

				BigDecimal reward = new BigDecimal(0);
				//reward = reward.subtract(action_cost);
				double attack_reduction = attacker_value_src - attacker_value_dest;
				double commitments_reduction =  defender_value_src - defender_value_dest;

				double eq = attack_reduction + commitments_reduction;
				reward = reward.add(BigDecimal.valueOf(eq));

				r[src][dest][events_id.get(action_name)]= reward.doubleValue();
			}
		}
		return r;
	}
	/*
	public static double[][][] getCostMatrix(
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions, 
			HashMap<String, Integer> exploit_events_id) {
		double[][][] t = new double[states.size()][states.size()][exploit_events_id.size()];
		for(Transition descr: transitions){
			Integer src = descr.getSrc();
			Integer dest = descr.getDest();
			String action_name = descr.getName();
			Integer reward = descr.getSrCost() + descr.getActionCost();
			if(exploit_events_id.containsKey(action_name)) {
				t[src][dest][exploit_events_id.get(action_name)] = reward;
			}
		}
		return t;
	}*/

	public static HashMap<Integer, HashMap<String, String>> filterStatesUsingTransitions(
			HashMap<Integer, HashMap<String, String>> states_value, HashSet<Transition> plan_transitions) {
		HashMap<Integer, HashMap<String, String>> states = new HashMap<Integer, HashMap<String, String>>() ;
		for(Transition transition : plan_transitions) {
			Integer src = transition.getSrc();
			Integer dest = transition.getDest();
			states.put(src, states_value.get(src));
			states.put(dest, states_value.get(dest));

		}
		return states;
	}



}
