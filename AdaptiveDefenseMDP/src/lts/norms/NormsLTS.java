package lts.norms;


import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

//import org.apache.commons.collections4.bidimap.HashMap;

import lts.LTS;
import lts.norms.readers.DomainDescriptionReader;
import resources.EffectLaw;
import resources.ActionVariableDescription;
import resources.StateVariableDescription;
import resources.Transition;

public class NormsLTS extends LTS{


	public static final String SHOW_UTIL = "utility";
	public static final String SHOW_AP = "ap";
	public static final String SHOW_REQ = "req";

	public static final String SHOW_UTIL_AP = "utility ap";
	public static final String SHOW_UTIL_REQ = "utility req";
	public static final String SHOW_AP_REQ = "ap req";
	public static final String SHOW_ALL = "utility ap req";

	

	/**
	 * This enables the LTS class to access elements of the metamodel of a domain description
	 */
	DomainDescriptionReader reader;

	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements;

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


	/*private void addRequirements(EList<OperationalRequirement> requirements2) {
		for(OperationalRequirement req : requirements2){
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
				//Generate Requirement variable and Domain
				FluentDescription fluent_description = new FluentDescription();
				fluent_description.setName(name);

				fluent_description.addToDomain("inact");
				fluent_description.addToDomain("act");
				fluent_description.addToDomain("sat");
				addFluentDescription(fluent_description);

			} else if(type.equals("maintain") || type.equals("achieve")){
				operational_requirements.put(name, new_desr);
				
				//Generate Requirement variable and Domain
				FluentDescription fluent_description = new FluentDescription();
				fluent_description.setName(name);

				fluent_description.addToDomain("inact");
				fluent_description.addToDomain("viol");
				fluent_description.addToDomain("sat");
				addFluentDescription(fluent_description);
			}
		}
		System.out.println("requirements:\n"+requirements.toString()+"\n");

		System.out.println("requirements size:\n"+requirements.size()+"\n");

	}

*/
	
	/*protected HashMap<String, String> calculateDestinationState(String action_name, HashMap<String, String> state,
			HashMap<String, String> eff) {
		
		 * clone the current state to make changes to a copy 
		 
		HashMap<String,String> temp = (HashMap<String, String>) state.clone();
		
		 * update the state according to the action effects
		 
		Iterator<String> it = eff.keySet().iterator();
		while(it.hasNext()){
			String fluent_name = it.next();
			String value = eff.get(fluent_name);
			temp.put(fluent_name, value);
		}
		
		 * add the action to the state to enable evaluation of requirements conditions on the transition + the current state
		 
		temp.put(action_name, "tt");
		
		 * iterate over requirements and update their state according to their current status and the transition
		 
		it = requirements.keySet().iterator();
		while(it.hasNext()){
			String req_id = it.next();
			RequirementDescription req_descr = requirements.get(req_id);
			String status = state.get(req_id);
			if(status.equals("act")){
				if(satisfied(temp,req_descr.getCancellation()) || 
						satisfied(temp,req_descr.getCondition())) {
					temp.put(req_id, "inact");
				}
			} else if(status.equals("inact")) {
				if(satisfied(temp,req_descr.getActivation())) {
					temp.put(req_id, "act");
				}
			}

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
		
		 * remove the action literal from the state
		 
		temp.remove(action_name);		
		
		 * return the new state
		 
		return temp;
	//}
*/
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


	//	public void showInGraphiv(String string, NormsLTS lts) {
	//		DOT_Writer visualizer = new DOT_Writer(string, lts);
	//		visualizer.openFromDesktop();
	//	}


	/*public void readDomainDescription(Path domain_description_location) {
		DomainDescriptionReader reader = new DomainDescriptionReader(domain_description_location);

		readStateVariables(reader.getState_variables());

		readActions(reader.getAttacker_actions(),reader.getDefender_actions());

		readActionDescriptions(reader.getAction_descriptions());

		addRequirements(reader.getRequirements());

		setInitialState(reader.getInitial());

		//print();
	}


	private void readActions(EList<AttackerAction> attack_actions, EList<DefenderAction> defence_actions) {
		// Create Domain of noop action
		HashSet<String> domain = new HashSet<String>();
		domain.add("tt");
		domain.add("ff");
		
		int id=0;
		for(AttackerAction action : attack_actions) {
			this.attacker_actions.put(action.getName(),new DescriptionAction(action.getName(),action.getValues(),"attacker",id++));
		}
		// add noop action to attacker actions
		this.attacker_actions.put("noop",new DescriptionAction("noop",domain,"attacker",id++));

		id=0;
		for(DefenderAction action : defence_actions) {
			this.defender_actions.put(action.getName(),new DescriptionAction(action.getName(),action.getValues(),"defender",id++));
		}
		// add noop action to defender actions
		this.defender_actions.put("noop",new DescriptionAction("noop",domain,"defender",id++));



	}




	public double[][][] getRewardMatrixAttacker() {
		//if(attack_actions.isEmpty())identifyAttackActions();

		double[][][] r = new double[states.size()][states.size()][attacker_actions.size()];
		
		 * iterate over transitions and fill the transition matrix accordingly
		 * the transition matrix is of the form (src,dest,action)
		 * a -1 is used since indexing in matrices starts at 0 whereas identifiers of states and actions start at 1
		 
		Iterator<String> it = this.getTransitions().keySet().iterator();
		while(it.hasNext()) {
			BigDecimal reward = new BigDecimal(0);
			String trans_id = it.next();
			Transition descr = this.transitions.get(trans_id);
			String action_name = descr.getName();
			if(attacker_actions.containsKey(action_name)){
				ActionDescr act_descr = action_descriptions.get(action_name);
				reward = reward.subtract(act_descr.getCost());
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				//BigDecimal prob = descr.getProbability();
				
				 * get the source and destination states
				 
				HashMap<String, String> dest_state = states.get(dest);
				HashMap<String, String> src_state = states.get(src);

				 
				 * iterate over the security requirements, if the requirement is satisfied in the destination state but not in the source state, then reward the transition
				 
				Iterator<String> it2 = security_requirements.keySet().iterator();
				while(it2.hasNext()){
					String req_id = it2.next();
					RequirementDescription sec_descr = security_requirements.get(req_id);
					String req_type = sec_descr.getType();

					//Set<HashMap<String, String>> sec_condition = sec_descr.getCondition();

					if(req_type.equals("prevent")) {
						
						 * for prevent requirements, only the transition is rewarded
						 
						if(satisfied(req_id,"sat",dest_state) && !satisfied(req_id,"sat",src_state)){
							reward = reward.add(BigDecimal.valueOf(sec_descr.getCost_reward()));
						}
					} else if(req_type.equals("avoid")) {
						
						 * for avoid requirements, every state where the requirement is satisfied is rewarded
						 
						if(satisfied(req_id,"sat",dest_state) && !satisfied(req_id,"sat",src_state)){
							reward = reward.add(BigDecimal.valueOf(sec_descr.getCost_reward()));
						} 
					}
				}
				r[src-1][dest-1][this.attacker_actions.get(action_name).getId()] = reward.doubleValue();
			}
		}
		Iterator<Integer> itx = this.not_applicable.keySet().iterator();
		while(itx.hasNext()) {
			Integer src = itx.next();
			HashSet<String> actions = not_applicable.get(src);
			Iterator<String> ity = actions.iterator();
			while(ity.hasNext()){
				String action_name = ity.next();
				if(attacker_actions.containsKey(action_name)){
					r[src-1][src-1][this.attacker_actions.get(action_name).getId()] = -100000;
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


	public double[][][] getRewardMatrixDefender() {
		//if(defender_actions.isEmpty())identifyDefenderActions();

		double[][][] r = new double[states.size()][states.size()][defender_actions.size()];
		
		 * iterate over transitions and fill the transition matrix accordingly
		 * the transition matrix is of the form (src,dest,action)
		 * a -1 is used since indexing in matrices starts at 0 whereas identifiers of states and actions start at 1
		 
		Iterator<String> it = this.getTransitions().keySet().iterator();
		while(it.hasNext()) {
			String trans_id = it.next();
			Transition descr = this.transitions.get(trans_id);
			String action_name = descr.getName();
			if(defender_actions.containsKey(descr.getName())) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				//double src_vuln = attacker_value[src-1];
				//double dest_vuln = attacker_value[dest-1];
				//double vuln_reduction = src_vuln - dest_vuln;
				BigDecimal action_cost = this.action_descriptions.get(action_name).getCost();

				BigDecimal reward = new BigDecimal(0);
				reward = reward.subtract(action_cost);
				//reward = (reward + (int) vuln_reduction);

				//BigDecimal prob = descr.getProbability();
				
				 * get the source and destination states
				 
				HashMap<String, String> dest_state = states.get(dest);
				HashMap<String, String> src_state = states.get(src);

				 
				 * iterate over the security requirements, if the requirement is satisfied in the destination state but not in the source state, then reward the transition
				 
				Iterator<String> it2 = operational_requirements.keySet().iterator();
				while(it2.hasNext()){

					String req_id = it2.next();
					RequirementDescription op_descr = operational_requirements.get(req_id);
					//Set<HashMap<String, String>> sec_condition = sec_descr.getCondition();
					//					if(op_descr.getType().equals("maintain")){
					//						if(!satisfied(req_id,"viol",dest_state) && satisfied(req_id,"viol",src_state)){
					//							reward += op_descr.getCost_reward();
					//						} else if(satisfied(req_id,"viol",dest_state) && !satisfied(req_id,"viol",src_state)){
					//							reward -= op_descr.getCost_reward();
					//						} 
					//						if(op_descr.getType().equals("achieve")){
					//							if(satisfied(req_id,"inact",dest_state) && satisfied(req_id,"act",src_state)){
					//								reward -= op_descr.getCost_reward();
					//							} else if(satisfied(req_id,"sat",dest_state) && satisfied(req_id,"act",src_state)){
					//								reward += op_descr.getCost_reward();
					//							} 
					//
					//						}
					//					}
					if(op_descr.getType().equals("maintain")){
						// violation after inactive or satisfaction
						if(satisfied(req_id,"viol",dest_state) && (satisfied(req_id,"inact",src_state)||satisfied(req_id,"sat",src_state))){
							reward = reward.subtract(BigDecimal.valueOf(op_descr.getCost_reward()));
						} 
						// satisfaction deactivation after violation
						else if((satisfied(req_id,"inact",dest_state)||satisfied(req_id,"sat",dest_state)) && satisfied(req_id,"viol",src_state)){
							reward = reward.add(BigDecimal.valueOf(op_descr.getCost_reward()));
						} 
					}
					else if(op_descr.getType().equals("achieve")){
						//violation
						if(satisfied(req_id,"inact",dest_state) && satisfied(req_id,"act",src_state)){
							reward = reward.subtract(BigDecimal.valueOf(op_descr.getCost_reward()));
						} 
						// activation
						else if(satisfied(req_id,"act",dest_state) && satisfied(req_id,"inact",src_state)){
							reward = reward.subtract(BigDecimal.valueOf(op_descr.getCost_reward()));
						} 
						// satisfaction
						else if(satisfied(req_id,"sat",dest_state) && satisfied(req_id,"act",src_state)){
							reward = reward.add(BigDecimal.valueOf(op_descr.getCost_reward()));
						} 
					}
				}

				r[src-1][dest-1][this.defender_actions.get(action_name).getId()]= reward.doubleValue();
			}
		}

		Iterator<Integer> itx = this.not_applicable.keySet().iterator();
		while(itx.hasNext()) {
			Integer src = itx.next();
			HashSet<String> actions = not_applicable.get(src);
			Iterator<String> ity = actions.iterator();
			while(ity.hasNext()){
				String action_name = ity.next();
				if(defender_actions.containsKey(action_name)){
					r[src-1][src-1][this.defender_actions.get(action_name).getId()] = -100000;
				}
			}
		}
		return r;
	}
*/
	public double[][][] getTradeOffRewardMatrixDefender(double[] value_attacker, double[] value_defender) {
		//if(defender_actions.isEmpty())identifyDefenderActions();

		double[][][] r = new double[states.size()][states.size()][defender_actions.size()];
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
			/*
			 * if the transition's action is a defender action
			 */
			if(defender_actions.containsKey(action_name)) {
				Integer src = descr.getSrc();
				Integer dest = descr.getDest();
				double attacker_value_src = value_attacker[src-1];
				double defender_value_src = value_defender[src-1];

				double attacker_value_dest = value_attacker[dest-1];
				double defender_value_dest = value_defender[dest-1];

				//double src_vuln = attacker_value[src-1];
				//double dest_vuln = attacker_value[dest-1];
				//double vuln_reduction = src_vuln - dest_vuln;
				BigDecimal action_cost = this.action_descriptions.get(action_name).getCost();

				BigDecimal reward = new BigDecimal(0);
				reward = reward.subtract(action_cost);
				double eq = (defender_value_src - attacker_value_dest) - (defender_value_dest - attacker_value_src);
				reward = reward.add(BigDecimal.valueOf(eq));
				//reward = (reward + (int) vuln_reduction);

				//BigDecimal prob = descr.getProbability();
				/*
				 * get the source and destination states
				 */
				//HashMap<String, String> dest_state = states.get(dest);
				//HashMap<String, String> src_state = states.get(src);

				/* 
				 * iterate over the security requirements, if the requirement is satisfied in the destination state but not in the source state, then reward the transition
				 */
				//				Iterator<String> it2 = operational_requirements.keySet().iterator();
				//				while(it2.hasNext()){
				//
				//					String req_id = it2.next();
				//					RequirementDescription op_descr = operational_requirements.get(req_id);
				//					//Set<HashMap<String, String>> sec_condition = sec_descr.getCondition();
				//					if(op_descr.getType().equals("maintain")){
				//						if(!satisfied(req_id,"viol",dest_state) && satisfied(req_id,"viol",src_state)){
				//							reward += op_descr.getCost_reward();
				//						} else if(satisfied(req_id,"viol",dest_state) && !satisfied(req_id,"viol",src_state)){
				//							reward -= op_descr.getCost_reward();
				//						} 
				//						if(op_descr.getType().equals("achieve")){
				//							if(satisfied(req_id,"inact",dest_state) && satisfied(req_id,"act",src_state)){
				//								reward -= op_descr.getCost_reward();
				//							} else if(satisfied(req_id,"sat",dest_state) && satisfied(req_id,"act",src_state)){
				//								reward += op_descr.getCost_reward();
				//							} 
				//
				//						}
				//					}
				//				}
				r[src-1][dest-1][this.defender_actions.get(action_name).getId()]= reward.doubleValue();
			}
		}

		Iterator<Integer> itx = this.not_applicable.keySet().iterator();
		while(itx.hasNext()) {
			Integer src = itx.next();
			HashSet<String> actions = not_applicable.get(src);
			Iterator<String> ity = actions.iterator();
			while(ity.hasNext()){
				String action_name = ity.next();
				if(defender_actions.containsKey(action_name)){
					r[src-1][src-1][this.defender_actions.get(action_name).getId()] = -100000;
				}
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
