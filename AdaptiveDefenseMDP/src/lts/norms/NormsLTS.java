package lts.norms;


import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
			ConditionExpression activation = req.getActivation();
			ConditionExpression deadline = req.getDeadline();
			ConditionExpression requirement = req.getRequirement();

			Integer cost = req.getCost();
			String name = req.getName();
			String type = req.getReqType();

			HashMap<String,String> act = new HashMap<String,String>();
			HashMap<String,String> ddln = new HashMap<String,String>();
			HashMap<String,String> rqmt = new HashMap<String,String>();

			activation.getConditions(act);
			deadline.getConditions(ddln);
			requirement.getConditions(rqmt);

			RequirementDescription new_desr = new RequirementDescription(name,type,rqmt,act,ddln,cost);
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
					if(satisfied(req_descr.getCancellation(),temp) || 
							satisfied(req_descr.getCondition(),temp) ) {
						temp.put(req_id, "inact");
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
			Integer src = descr.getSrc();
			Integer dest = descr.getDest();
			String action_name = descr.getName();
			//BigDecimal prob = descr.getProbability();
			/*
			 * get the source and destination states
			 */
			HashMap<String, String> dest_state = states.get(dest);
			HashMap<String, String> src_state = states.get(src);

			/* 
			 * iterate over the security requirements, if the condition is satisfied in the destination state but not in the source state, then reward the transition
			 */
			Iterator<String> it2 = security_requirements.keySet().iterator();
			while(it2.hasNext()){
				String req_id = it2.next();
				RequirementDescription sec_descr = security_requirements.get(req_id);
				HashMap<String, String> sec_condition = sec_descr.getCondition();
				if(satisfied(sec_condition,dest_state)&&!satisfied(sec_condition,src_state)){
					r[src-1][dest-1][this.attack_actions.get(action_name)]= sec_descr.getCost_reward();
				}
				
			}
		}
		return r;
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
			Integer src = descr.getSrc();
			Integer dest = descr.getDest();
			String action_name = descr.getName();
			//BigDecimal prob = descr.getProbability();
			/*
			 * get the source and destination states
			 */
			HashMap<String, String> dest_state = states.get(dest);
			HashMap<String, String> src_state = states.get(src);

			/* 
			 * TODO: iterate over the security requirements, if the condition is satisfied in the destination state but not in the source state, then reward the transition
			 */
//			Iterator<String> it2 = operational_requirements.keySet().iterator();
//			while(it2.hasNext()){
//				String req_id = it2.next();
//				RequirementDescription sec_descr = operational_requirements.get(req_id);
//				HashMap<String, String> sec_condition = sec_descr.getCondition();
//				if(satisfied(sec_condition,dest_state)&&!satisfied(sec_condition,src_state)){
//					r[src-1][dest-1][this.defender_actions.get(action_name)]= sec_descr.getCost_reward();
//				}
//				
//			}
			
		}
		return r;
	}

}