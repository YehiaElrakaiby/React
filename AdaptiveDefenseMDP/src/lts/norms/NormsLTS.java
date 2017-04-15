package lts.norms;


import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.Action;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.Requirement;


//import org.apache.commons.collections4.bidimap.HashMap;

import lts.LTS;
import lts.Transition;
import lts.norms.readers.DomainDescriptionReader;
import visualizer.DOT_Writer;

public class NormsLTS extends LTS{


	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements;

	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	DomainDescriptionReader reader;

	/**
	 * Security Requirements:
	 * Mapping requirement id to requirement description
	 */
	private HashMap<String, RequirementDescription> security_requirements;

	/**
	 * Operational Requirements:
	 * Mapping requirement id to requirement description
	 */
	private HashMap<String, RequirementDescription> operational_requirements;


	public NormsLTS() {
		super();
		this.requirements = new HashMap<String,RequirementDescription>();
		this.security_requirements = new HashMap<String,RequirementDescription>();
		this.operational_requirements = new HashMap<String,RequirementDescription>();

	}


	public void addRequirements(EList<Requirement> requirements2) {
		for(Requirement req : requirements2){
			EList<ConditionExpression> activations = req.getActivations();
			EList<ConditionExpression> deadlines = req.getDeadlines();
			EList<ConditionExpression> requirments = req.getRequirements();

			Integer cost = req.getCost();
			String name = req.getName();
			String type = req.getReqType();

			Set<HashMap<String,String>> acts = getConditions(activations);
			Set<HashMap<String,String>> deads = getConditions(deadlines);
			Set<HashMap<String,String>> reqs = getConditions(requirments);

			RequirementDescription new_desr = new RequirementDescription(name,type,reqs,acts,deads,cost);

			requirements.put(name, new_desr);

			if(type.equals("prevent") || type.equals("avoid")) {
				security_requirements.put(name,new_desr);
			} else if(type.equals("maintain") || type.equals("achieve")){
				operational_requirements.put(name, new_desr);
			}
		}
		System.out.println("requirements:\n"+requirements.toString()+"\n");

		System.out.println("requirements size:\n"+requirements.size()+"\n");

	}


	protected HashMap<String, String> calculateDestinationState(String action_name, HashMap<String, String> state,
			HashMap<String, String> eff) {
		/*
		 * clone the current state to make changes to a copy 
		 */
		HashMap<String,String> temp = (HashMap<String, String>) state.clone();
		/*
		 * update the state according to the action effects
		 */
		Iterator<String> it = eff.keySet().iterator();
		while(it.hasNext()){
			String fluent_name = it.next();
			String value = eff.get(fluent_name);
			temp.put(fluent_name, value);
		}
		/*
		 * add the action to the state to enable evaluation of requirements conditions on the transition + the current state
		 */
		temp.put(action_name, "tt");
		/*
		 * iterate over requirements and update their state according to their current status and the transition
		 */
		it = requirements.keySet().iterator();
		while(it.hasNext()){
			String req_id = it.next();
			RequirementDescription req_descr = requirements.get(req_id);
			String status = state.get(req_id);
			/*if(status.equals("act")){
				if(satisfied(temp,req_descr.getCancellation()) || 
						satisfied(temp,req_descr.getCondition())) {
					temp.put(req_id, "inact");
				}
			} else if(status.equals("inact")) {
				if(satisfied(temp,req_descr.getActivation())) {
					temp.put(req_id, "act");
				}
			}*/

			if(req_descr.getType().equals("achieve")||req_descr.getType().equals("prevent")) {
				if(status.equals("act")){
					if(satisfied(req_descr.getCancellation(),temp)) {
						temp.put(req_id, "inact");
					} else if(satisfied(req_descr.getCondition(),temp)) {
						temp.put(req_id, "sat");
					}
				} else if(status.equals("inact")) {
					if(satisfied(req_descr.getActivation(),temp)) {
						temp.put(req_id, "act");
					}
				} 
			}

			else if(req_descr.getType().equals("maintain")||req_descr.getType().equals("avoid")) {
				if(status.equals("viol")||status.equals("sat")){
					if(satisfied(req_descr.getCancellation(),temp)) {
						temp.put(req_id, "inact");
					} else if(satisfied(req_descr.getCondition(),temp)){
						temp.put(req_id, "sat");
					} else {
						temp.put(req_id, "viol");
					}
				}
				else if(status.equals("inact")) {
					if(satisfied(req_descr.getActivation(),temp)) {
						if(satisfied(req_descr.getCondition(),temp)){
							temp.put(req_id, "sat");
						} else {
							temp.put(req_id, "viol");
						}
					}
				}
			}
		}
		/*
		 * remove the action literal from the state
		 */
		temp.remove(action_name);		
		/*
		 * return the new state
		 */
		return temp;
	}

	//	protected boolean satisfied(Set<HashMap<String, String>> preconditions, HashMap<String, String> state,
	//			String action_name) {
	//		Iterator<HashMap<String, String>> it2 = preconditions.iterator();
	//		state.put(action_name, "tt");
	//		Boolean res = false;
	//		while(it2.hasNext() && res == false){
	//			res = true;
	//			HashMap<String, String> precondition = it2.next();
	//			Iterator<String> it = precondition.keySet().iterator();
	//			while(it.hasNext()){
	//				String fluent_name = it.next();
	//				String fluent_value = precondition.get(fluent_name);
	//				if(state.containsKey(fluent_name)) {
	//					if(state.get(fluent_name).equals(fluent_value)) {
	//					} else {
	//						res = false;
	//						break;
	//					}
	//				} else {
	//					res = false;
	//					break;
	//				}
	//			} 
	//		} 
	//		state.remove(action_name, "tt");
	//		return res;
	//	}


	public void showInGraphiv(String string, NormsLTS lts) {
		DOT_Writer visualizer = new DOT_Writer(string, lts);
		visualizer.openFromDesktop();
	}


	public void readDomainDescription(Path domain_description_location) {
		DomainDescriptionReader reader = new DomainDescriptionReader(domain_description_location);
		readStateVariables(reader.getState_variables());

		readActions(reader.getActions());

		readActionDescriptions(reader.getAction_descriptions());

		addRequirements(reader.getRequirements());

		setInitialState(reader.getInitial());

		//print();
	}


	private void readActions(EList<Action> actions) {
		for(Action action : actions) {
			this.addAction_type(action.getName(),action.getType());
		}

	}




	public double[][][] getRewardMatrixAttacker() {
		if(attack_actions.isEmpty())identifyAttackActions();

		double[][][] r = new double[states.size()][states.size()][attack_actions.size()];
		/*
		 * iterate over transitions and fill the transition matrix accordingly
		 * the transition matrix is of the form (src,dest,action)
		 * a -1 is used since indexing in matrices starts at 0 whereas identifiers of states and actions start at 1
		 */
		Iterator<String> it = this.getTransitions().keySet().iterator();
		while(it.hasNext()) {
			String trans_id = it.next();
			Transition descr = this.transitions.get(trans_id);
			String action_name = descr.getName();
			if(attack_actions.containsKey(action_name)){
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				//BigDecimal prob = descr.getProbability();
				/*
				 * get the source and destination states
				 */
				HashMap<String, String> dest_state = states.get(dest);
				HashMap<String, String> src_state = states.get(src);

				/* 
				 * iterate over the security requirements, if the requirement is satisfied in the destination state but not in the source state, then reward the transition
				 */
				Iterator<String> it2 = security_requirements.keySet().iterator();
				while(it2.hasNext()){
					String req_id = it2.next();
					RequirementDescription sec_descr = security_requirements.get(req_id);
					//Set<HashMap<String, String>> sec_condition = sec_descr.getCondition();
					if(satisfied(req_id,"sat",dest_state) && !satisfied(req_id,"sat",src_state)){
						r[src-1][dest-1][this.attack_actions.get(action_name)]= sec_descr.getCost_reward();
					}
				}
			}
		}
		return r;
	}


	private boolean satisfied(String req_id, String status, HashMap<String, String> state) {
		if(state.containsKey(req_id)) {
			if(state.get(req_id).equals(status)) return true;
		}
		return false;
	}


	public double[][][] getRewardMatrixDefender(double[] attacker_value) {
		if(defender_actions.isEmpty())identifyDefenderActions();

		double[][][] r = new double[states.size()][states.size()][attack_actions.size()];
		/*
		 * iterate over transitions and fill the transition matrix accordingly
		 * the transition matrix is of the form (src,dest,action)
		 * a -1 is used since indexing in matrices starts at 0 whereas identifiers of states and actions start at 1
		 */
		Iterator<String> it = this.getTransitions().keySet().iterator();
		while(it.hasNext()) {
			String trans_id = it.next();
			Transition descr = this.transitions.get(trans_id);
			String action_name = descr.getName();
			if(defender_actions.containsKey(descr.getName())) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				double src_vuln = attacker_value[src-1];
				double dest_vuln = attacker_value[dest-1];
				double vuln_reduction = src_vuln - dest_vuln;
				Integer action_cost = this.action_descriptions.get(action_name).getCost();

				Integer reward = 0;
				reward = reward - action_cost;
				reward = (reward + (int) vuln_reduction);

				//BigDecimal prob = descr.getProbability();
				/*
				 * get the source and destination states
				 */
				HashMap<String, String> dest_state = states.get(dest);
				HashMap<String, String> src_state = states.get(src);

				/* 
				 * iterate over the security requirements, if the requirement is satisfied in the destination state but not in the source state, then reward the transition
				 */
				Iterator<String> it2 = operational_requirements.keySet().iterator();
				while(it2.hasNext()){

					String req_id = it2.next();
					RequirementDescription op_descr = operational_requirements.get(req_id);
					//Set<HashMap<String, String>> sec_condition = sec_descr.getCondition();
					if(op_descr.getType().equals("maintain")){
						if(!satisfied(req_id,"viol",dest_state) && satisfied(req_id,"viol",src_state)){
							reward += op_descr.getCost_reward();
						} else if(satisfied(req_id,"viol",dest_state) && !satisfied(req_id,"viol",src_state)){
							reward -= op_descr.getCost_reward();
						} 
						if(op_descr.getType().equals("achieve")){
							if(satisfied(req_id,"inact",dest_state) && satisfied(req_id,"act",src_state)){
								reward -= op_descr.getCost_reward();
							} else if(satisfied(req_id,"sat",dest_state) && satisfied(req_id,"act",src_state)){
								reward += op_descr.getCost_reward();
							} 

						}
					}
				}
				r[src-1][dest-1][this.defender_actions.get(action_name)]= reward;
			}
		}
		return r;
	}


	public void print() {
		System.out.println("\n\n\n\t\t*********  Printing LTS  ***************\n\n");
		System.out.println("Nb of fluent Descriptions: "+this.fluent_descriptions.size()+"\n");
		System.out.println("Fluent Descriptions:\n "+this.fluent_descriptions.toString()+"\n");

		System.out.println("Nb of Action Descriptions: "+this.action_descriptions.size()+"\n");
		System.out.println("Action Descriptions:\n "+this.action_descriptions.toString()+"\n");

		System.out.println("Nb of States: "+this.states.size()+"\n");
		System.out.println("States:\n "+this.states.toString()+"\n");

		System.out.println("Nb of Transitions: "+this.transitions.size()+"\n");
		System.out.println("Transitions:\n "+this.transitions.toString()+"\n");

		System.out.println("Nb of Requirements: "+this.requirements.size()+"\n");
		System.out.println("Requirements:\n "+this.requirements.toString()+"\n");


		System.out.println("\n\n\t\t*********  End Printing LTS  ***************\n\n\n");

	}

}
