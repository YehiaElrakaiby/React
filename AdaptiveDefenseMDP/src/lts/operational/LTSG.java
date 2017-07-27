package lts.operational;


import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.lang.mutable.MutableInt;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.True;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.Maintain;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl;
import org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl;

//import org.apache.commons.collections4.bidimap.HashMap;

import lts.LTS;
import lts.Transition;
import lts.norms.readers.DomainDescriptionReader;
import resources.EffectLaw;
import resources.ActionVariableDescription;
import resources.StateVariableDescription;
import resources.RequirementDescription;

/**
 * 
 * @author yehia
 *
 */
public class LTSG {

	/**
	 * Values of requirements' status
	 */
	Set<String> requirement_statuses = new HashSet<>(Arrays.asList("inact", "act", "viol", "sat"));

	/**
	 * Fluent Description:
	 *  Mapping variable_name --> Domain(variable) 
	 */
	protected HashMap<String, HashSet<String>> variables_domain = new HashMap<String, HashSet<String>> ();

	/**
	 * req_type:
	 *  Mapping requirement_name --> Type(requirement) 
	 */
	protected HashMap<String,String> req_type = new HashMap<String, String>() ;

	/**
	 * actions_declarations:
	 *  Mapping action_name --> Domain(action)
	 */
	protected HashMap<String, ActionVariableDescription> actions_declarations = new  HashMap<String, ActionVariableDescription>();

	/**
	 * Action Description
	 * Mapping action_name --> precondition, {effect1,...,effectn}
	 */
	protected HashMap<String, EffectLaw> action_effect_laws = new  HashMap<String, EffectLaw>();

	/** LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<Integer,HashMap<String,String>> states = new HashMap<Integer,HashMap<String,String>> ();

	/**
	 * Applicable actions:
	 *  Mapping state_id --> set of action_names
	 */
	protected HashMap<Integer,HashSet<String>> applicable = new HashMap<Integer,HashSet<String>>();
	/**
	 * NotApplicable actions:
	 *  Mapping state_id --> action_name
	 */
	protected HashMap<Integer,HashSet<String>> not_applicable = new HashMap<Integer,HashSet<String>>();

	/**
	 * LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<HashMap<String,String>,Integer> states_id = new HashMap<HashMap<String,String>,Integer>();

	/**
	 *  LTS Transitions
	 *  Mapping transition_id --> Transition(name,src,dest,prob)
	 */
	protected HashMap<String,Transition> transitions = new HashMap<String,Transition>();

	/**
	 * Initial State
	 */
	protected HashMap<String,String> initial_state = new HashMap<String,String>();

	//protected HashMap<String,String> action_type = new HashMap<String,String>();

	protected HashMap<Integer,String> id_control_events = new HashMap<Integer,String>();

	protected HashMap<Integer,String> id_exploit_events = new HashMap<Integer,String>();

	protected HashMap<Integer,String> id_exogenous_events = new HashMap<Integer,String>();
	
	/*
	 * event_description:
	 * Map between an event (the toString() of the action described in an action description) and the action description itself
	 */
	protected HashMap<String,ActionDescription> event_description = new HashMap<String,ActionDescription>();

	private Integer nb_of_states=1;
	private Integer nb_of_control_events=0;
	private Integer nb_of_exploit_events=0;
	private Integer nb_of_exogenous_events=0;


	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements_description = new HashMap<String,RequirementDescription>();



	public LTSG(DomainDescription description) {
		/*
		 *  Initialize/create the class's data structures
		 */
		//initialize();
		/*
		 * (1) Read state variables and their domain
		 * (2) Read requirements and associate them to the domain of requirement statutes
		 * (3) Generate the state space
		 */
		generateStatesFromDescription(description);
		/*
		 * (4) Read Actions
		 * (5) Read Action Descriptions
		 * ()
		 */
		generateTransitionsFromDescription(description);
	}



	private void generateTransitionsFromDescription(DomainDescription description) {
		//readActions(description.getActions());
		readActionDescriptions(description.getAction_descriptions());
		createDRewardAndTransitionMatrices(this.nb_of_states,this.nb_of_control_events,this.nb_of_exploit_events);
		
		generateTransitions();
	}


	double[][][] dreward_matrix,areward_matrix;
	double[][][] dtransition_matrix,atransition_matrix;

	private void createDRewardAndTransitionMatrices(Integer nb_of_states, Integer nb_of_control_events, Integer nb_of_exploit_events) {
		dreward_matrix = new double[states.size()][states.size()][nb_of_control_events];
		areward_matrix = new double[states.size()][states.size()][nb_of_exploit_events];

		dtransition_matrix = new double[states.size()][states.size()][nb_of_control_events];
		atransition_matrix = new double[states.size()][states.size()][nb_of_exploit_events];

	}



	private void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		
		for(ActionDescription action : action_descriptions) {
			//action.getCost();
			String event = action.getActionatom().getActionvariable().getName() + "-" + action.getActionatom().getValue();

			if(action.getActionatom().getActionvariable().getType().getLiteral().equals("exploit")){
				this.id_exploit_events.put(nb_of_exploit_events, event);
				this.event_description.put(event, action);
				this.nb_of_exploit_events++;

				System.out.println(event);
				
			} else if(action.getActionatom().getActionvariable().getType().getLiteral().equals("exogenous")) {
				this.id_exogenous_events.put(nb_of_exogenous_events, event);
				this.event_description.put(event, action);
				this.nb_of_exogenous_events++;
				System.out.println(event);
			
			} else {
				this.id_exploit_events.put(nb_of_control_events, action.getActionatom().toString());
				this.event_description.put(event, action);
				this.nb_of_control_events++;
				System.out.println(event);
			
			};
			//Formula preconditions = action.getFormula();
			//action.getProbabilisticeffect();
		}

	}



	/*private void readActions(EList<ActionVariable> eList) {
		for(ActionVariable action : eList) {
			String name = action.getName();
			if(action.getType().equals("exploit")) {
				this.action_type.put(name, "exploit");
			} else if (action.getType().equals("control")){
				this.action_type.put(name, "control");

			} else {
				this.action_type.put(name, "exogenous");
			};
		}
	}*/



	private void generateTransitions() {
		/*
		 * (1) Iterate Over All States
		 * (2) Iterate over all control, exogenous and exploit events 
		 * (2.1) If the effect law of an event is applicable, then apply it and add the transition to the set of transitions
		 */
		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			HashMap<String, String> state = states.get(state_id);
			Iterator<String> it2 = action_effect_laws.keySet().iterator();
			while(it2.hasNext()){
				String action_name = it2.next();
				EffectLaw action_description = action_effect_laws.get(action_name);
				Set<HashMap<String, String>> preconditions = action_description.getPrecondition();

				if(satisfied(preconditions,state)){
					if(this.applicable.containsKey(state_id)){
						HashSet<String> set_of_actions = applicable.get(state_id);
						set_of_actions.add(action_name);
					} else {
						HashSet<String> set_of_actions = new HashSet<String>();
						set_of_actions.add(action_name);
						this.applicable.put(state_id, set_of_actions);
					}
					//addTransitions(action_name, state,action_description.getEffects());
				} else {
					if(this.not_applicable.containsKey(state_id)){
						HashSet<String> set_of_actions = not_applicable.get(state_id);
						set_of_actions.add(action_name);
					} else {
						HashSet<String> set_of_actions = new HashSet<String>();
						set_of_actions.add(action_name);
						this.not_applicable.put(state_id, set_of_actions);
					}
				}
			}
		}
		System.out.println("\nnumber of transitions="+transitions.size());
		System.out.println(transitions.toString());

	}



	//	private void addTransitions(String action_name, HashMap<String, String> state, HashSet<Effect> effects) {
	//		for(Effect effect : effects){
	//			HashMap<String, String> eff = effect.getEffect();
	//			BigDecimal prob = effect.getProb();
	//			Integer src = states_id.get(state);
	//			Integer dest = getDestinationState(action_name,state,eff);
	//			Transition trans = new Transition(action_name,src,dest,prob);
	//			transitions.put(src+"_"+action_name+"_"+dest, trans);
	//		}

	//	}


	private Integer getDestinationState(String action_name,HashMap<String, String> state, HashMap<String, String> eff) {
		HashMap<String,String> temp = (HashMap<String, String>) state.clone();
		Iterator<String> it = eff.keySet().iterator();
		while(it.hasNext()){
			String fluent_name = it.next();
			String value = eff.get(fluent_name);
			temp.put(fluent_name, value);
		}

		return states_id.get(temp);
	}


	protected boolean satisfied(Set<HashMap<String, String>> preconditions, HashMap<String, String> state) {
		Iterator<HashMap<String, String>> it2 = preconditions.iterator();
		Boolean res = false;
		while(it2.hasNext() && res == false){
			res = true;
			HashMap<String, String> precondition = it2.next();
			Iterator<String> it = precondition.keySet().iterator();
			while(it.hasNext()){
				String fluent_name = it.next();
				String fluent_value = precondition.get(fluent_name);
				if(state.containsKey(fluent_name)) {
					if(state.get(fluent_name).equals(fluent_value)) {
					} else {
						res = false;
						break;
					}
				} else {
					res = false;
					break;
				}
			} 
		} 
		return res;
	}
	//private void initialize() {
	//this.states = new HashMap<Integer,HashMap<String,String>>();
	//this.states_id = new HashMap<HashMap<String,String>,Integer>();
	//this.transitions = new HashMap<String,Transition>();
	//this.actionLiterals = new HashSet<ActionLiteral>();
	//this.fluentLiterals = new HashSet<FluentLiteral>();
	//this.variables_domain = new HashMap<String,HashSet<String>>();
	//this.action_descriptions = new HashMap<String,ActionDescr>();
	//this.initial_state = new HashMap<String,String>();
	//this.applicable = new HashMap<Integer,HashSet<String>>();
	//this.not_applicable = new HashMap<Integer,HashSet<String>>();
	//this.action_type = new HashMap<String,String>();
	//this.aactions_domain = new HashMap<String,DescriptionAction>();
	//this.eactions_domain = new HashMap<String,DescriptionAction>();
	//this.dactions_domain = new HashMap<String,DescriptionAction>();
	//this.req_type = new HashMap<String,String>();
	//this.actions = new HashMap<String,Integer>();		
	//}



	private void generateStatesFromDescription(DomainDescription description) {
		readStateVariables(description.getState_variables());
		readRequirements(description.getRequirements());
		generateStatesFromFluentDescriptions();

	}

	private void readRequirements(EList<OperationalRequirement> requirements) {
		for(OperationalRequirement requirement : requirements) {
			String name = requirement.getName();
			HashSet<String> domain = new HashSet<String>();

			System.out.println(name);
			RequirementDescription descr = new RequirementDescription();
			descr.setName(name);
			descr.setCondition(requirement.getCondition());
			descr.setCost_reward(requirement.getCost());
			descr.setDeadline(requirement.getDeadline());
			/*
			 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
			 */
			for(int i=0; i< requirement.getDeadline(); i++) {
				domain.add("act-"+i);
			}

			if( requirement.getActivation() != null) {
				descr.setActivation(requirement.getActivation());
				domain.add("inact");
			} else {
				/*
				 * if no activation then the requirement is unconditional and should be always active hence true is used as activation condition
				 */
				descr.setActivation(new TrueImpl());
			}

			if(requirement.getCancellation() != null) {
				descr.setCancellation(requirement.getCancellation());
			} else {
				/*
				 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
				 */
				descr.setCancellation(new FalseImpl());
			}


			if(requirement.getClass().getName().equals("org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl")){
				this.req_type.put(name, "maintain");
				//System.out.println(requirement.getClass().getName());
				Maintain req = (Maintain) requirement;
				descr.setDuration(req.getDuration());
				descr.setType("maintain");
				/*
				 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
				 */
				for(int i=0; i< req.getDuration(); i++) {
					domain.add("req-"+i);
				}

			} else {
				req_type.put(name, "achieve");
			} 

			/*
			 * add the requirement to the HashMap requirements_description
			 */
			this.requirements_description.put(name, descr);

			/*
			 * add requirements and their domains to domain variables
			 */
			variables_domain.put(name,domain);

			nb_of_states = nb_of_states * domain.size();
		}		

	}



	private void generateStatesFromFluentDescriptions() {
		/*
		 * number of fluents
		 */
		int nb_fluents = variables_domain.size();
		/*
		 * array index
		 */
		MutableInt index = new MutableInt(0);
		/*
		 * number used as state identifier
		 */
		MutableInt state_nb = new MutableInt(0);

		/* 
		 * 1. Create and fill an array of fluent descriptions from fluent_descriptions
		 */
		Set<String> keys = variables_domain.keySet();
		Iterator<String> it = keys.iterator();
		ArrayList<StateVariableDescription> fluents_array = new ArrayList<StateVariableDescription>();
		while(it.hasNext()){
			String name = it.next();
			HashSet<String> domain = variables_domain.get(name);
			StateVariableDescription fluent_description = new StateVariableDescription(name,domain);
			fluents_array.add(fluent_description);
		}

		/*
		 * 2. Create a HashMap<String(fluent),String(value)> to hold the constructed state
		 */
		HashMap<String,String> state = new HashMap<String,String>();


		/*
		 * 3. Call a recursive function to construct the states, 
		 * the basic idea of the function is to construct one initial state 
		 * and then change the value of one state variable to compute a new state
		 * and repeat this until all possibilities are exhausted and all states are computed
		 * This function fills both the states and states_id hashmaps
		 */
		add(state, fluents_array.get(index.intValue()), fluents_array, index, nb_fluents, state_nb);
		System.out.println("\nnumber of states="+states.size()+"\n");
	}

	private void add(HashMap<String, String> state, 
			StateVariableDescription fluentDescription, 
			ArrayList<StateVariableDescription> fluents_array, 
			MutableInt index,
			int total, MutableInt state_nb) {

		String name = fluentDescription.getName();
		Set<String> domain = fluentDescription.getDomain();
		Iterator<String> it = domain.iterator();
		if(index.intValue()==total-1){
			while(it.hasNext()){
				String value = it.next();
				state.put(name, value);
				HashMap<String,String> temp_st = new HashMap<String,String>();
				temp_st = (HashMap<String, String>) state.clone();
				//System.out.println(state.toString()+"\n\n");
				states.put(state_nb.toInteger(), temp_st);
				states_id.put(temp_st,state_nb.toInteger());
				state_nb.add(1);
				//System.out.println(states.toString()+"\n\n");
			} 
			index.subtract(1);
		} else {
			while(it.hasNext()){
				String value = it.next();
				state.put(name,value);
				index.add(1);
				add(state,fluents_array.get(index.intValue()), fluents_array, index, total, state_nb);
			} 
			index.subtract(1);
		}
	}



	private void readStateVariables(EList<StateVariable> state_variables) {
		for(StateVariable state_variable : state_variables) {
			String name = state_variable.getName();
			//System.out.println(name);

			HashSet<String> domain = new HashSet<String>();
			EList<String> values = state_variable.getValues();
			Iterator<String> it = values.iterator();
			while(it.hasNext()){
				String value = it.next();
				domain.add(value);				
				//System.out.println(value);
			}
			variables_domain.put(name,domain);

			nb_of_states = nb_of_states * domain.size();
		}		

	}


	public int getTotalNbOfActions() {
		return nb_of_control_events + nb_of_exploit_events + nb_of_exogenous_events;
	}

	public void print() {
		System.out.println("\n\n\n\t\t*********  Printing LTS  ***************\n\n");
		System.out.println("Nb of fluent Descriptions: "+this.variables_domain.size()+"\n");
		System.out.println("Fluent Descriptions:\n "+this.variables_domain.toString()+"\n");
		System.out.println("Requirement Descriptions:\n "+this.requirements_description.toString()+"\n");

		System.out.println("Total Number of States:\n "+this.nb_of_states+"\n");

		System.out.println("Nb of Action Descriptions: "+this.action_effect_laws.size()+"\n");
		System.out.println("Action Descriptions:\n "+this.action_effect_laws.toString()+"\n");

		System.out.println("Nb of States: "+this.states.size()+"\n");
		System.out.println("States:\n "+this.states.toString()+"\n");

		System.out.println("Nb of Transitions: "+this.transitions.size()+"\n");
		System.out.println("Transitions:\n "+this.transitions.toString()+"\n");

		//System.out.println("Nb of Requirements: "+this.requirements.size()+"\n");
		//System.out.println("Requirements:\n "+this.requirements.toString()+"\n");


		System.out.println("\n\n\t\t*********  End Printing LTS  ***************\n\n\n");

	}




}
