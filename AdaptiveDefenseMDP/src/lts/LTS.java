package lts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

//import org.apache.commons.collections4.bidimap.HashMap;
import org.apache.commons.lang.mutable.MutableInt;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.Value;
import org.emftext.language.AdaptiveCyberDefense.support.FluentLiteral;

import lts.norms.NormsLTS;
import lts.norms.RequirementDescription;
import visualizer.DOT_Writer;

public class LTS {
	/**
	 * Fluent Description:
	 *  Mapping fluent_name --> Domain(fluent) 
	 */
	protected HashMap<String, HashSet<String>> fluent_descriptions;
	/**
	 * Actions:
	 *  Mapping action_name --> action type 
	 */
	protected HashMap<String, String> action_type;
	/**
	 *  Actions:
	 *  Mapping action_name --> action identifier and action_name
	 */
	//protected HashMap<String,Integer> actions;
	/**
	 * Attack Actions:
	 *  Mapping action_name --> action identifier and action_name is an attack action 
	 */
	protected HashMap<String,Integer> attack_actions;
	/**
	 * Defender Actions:
	 *  Mapping action_name --> action identifier and action_name is a defender action 
	 */
	protected HashMap<String,Integer> defender_actions;
	/**
	 * Action Description
	 * Mapping action_name --> precondition, {effect1,...,effectn}
	 */
	protected HashMap<String, ActionDescr> action_descriptions;
	//Set<ActionLiteral> actionLiterals;
	//Set<FluentLiteral> fluentLiterals;
	/**
	 * LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<Integer,HashMap<String,String>> states;

	/**
	 * Applicable actions:
	 *  Mapping state_id --> set of action_names
	 */
	protected HashMap<Integer,HashSet<String>> applicable;
	/**
	 * NotApplicable actions:
	 *  Mapping state_id --> action_name
	 */
	protected HashMap<Integer,HashSet<String>> not_applicable;

	/**
	 * LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<HashMap<String,String>,Integer> states_id;
	/**
	 *  LTS Transitions
	 *  Mapping transition_id --> Transition(name,src,dest,prob)
	 */
	protected HashMap<String,Transition> transitions;

	/**
	 * Initial State
	 */
	protected HashMap<String,String> initial_state;

	//protected Set<Event> events;


	//	public LTS(HashMap<String, HashSet<String>> fluents, HashMap<String, ActionDescr> actions, Set<ActionLiteral> actionConstants,
	//			Set<FluentLiteral> fluentConstants, HashMap<Integer, HashMap<String,String>> states, HashMap<String, Transition> transitions, 
	//			Set<Event> events, HashMap<String,String> initial) {
	//		super();
	//		this.fluent_descriptions = fluents;
	//		this.action_descriptions = actions;
	//		//this.actionLiterals = actionConstants;
	//		//this.fluentLiterals = fluentConstants;
	//		this.states = states;
	//		this.transitions = transitions;
	//		this.events = events;
	//		this.action_type = null;
	//		this.initial_state = initial;
	//	}


	public LTS() {
		this.states = new HashMap<Integer,HashMap<String,String>>();
		this.states_id = new HashMap<HashMap<String,String>,Integer>();
		this.transitions = new HashMap<String,Transition>();
		//this.actionLiterals = new HashSet<ActionLiteral>();
		//this.fluentLiterals = new HashSet<FluentLiteral>();
		this.fluent_descriptions = new HashMap<String,HashSet<String>>();
		this.action_descriptions = new HashMap<String,ActionDescr>();
		this.initial_state = new HashMap<String,String>();
		this.applicable = new HashMap<Integer,HashSet<String>>();
		this.not_applicable = new HashMap<Integer,HashSet<String>>();
		this.action_type = new HashMap<String,String>();
		this.attack_actions = new HashMap<String,Integer>();
		this.defender_actions = new HashMap<String,Integer>();
		//this.actions = new HashMap<String,Integer>();

	}

	private void addActionDescription(String name, ActionDescr desc){
		action_descriptions.put(name,desc);
	}


	private void addFluentDescription(FluentDescription desc){
		fluent_descriptions.put(desc.name, (HashSet<String>) desc.domain);
	}
	/*
	public void addState(String name, HashMap<String,String> desc){
		states.put(name, desc);
	}

	public void addTransition(String name, Transition desc){
		transitions.put(name, desc);
	}*/


	private void generateStatesFromFluentDescriptions() {
		/*
		 * number of states
		 */
		int nb_fluents = fluent_descriptions.size();
		/*
		 * array index
		 */
		MutableInt index = new MutableInt(0);
		/*
		 * number used as state identifier
		 */
		MutableInt state_nb = new MutableInt(1);

		/*
		 * Fill the fluents array
		 */
		Set<String> keys = fluent_descriptions.keySet();
		Iterator<String> it = keys.iterator();
		//Iterator<FluentDescription> it = fluents.iterator();
		ArrayList<FluentDescription> fluents_array = new ArrayList<FluentDescription>();
		while(it.hasNext()){
			String name = it.next();
			HashSet<String> domain = fluent_descriptions.get(name);
			FluentDescription fluent_description = new FluentDescription(name,domain);
			fluents_array.add(fluent_description);
		}

		/*
		 * Create an array to hold the constructed state using the fluents array
		 */
		//ArrayList<FluentLiteral> st = new ArrayList<FluentLiteral>();
		/*
		 * Create a HashMap<String(fluent),String(value)> to hold the constructed state
		 */
		HashMap<String,String> state = new HashMap<String,String>();

		add(state, fluents_array.get(index.intValue()), fluents_array, index, nb_fluents, state_nb);
		System.out.println("\nnumber of states="+states.size()+"\n");
	}

	private void add(HashMap<String, String> state, FluentDescription fluentDescription, ArrayList<FluentDescription> fluents_array, 
			MutableInt index,
			int total, MutableInt state_nb) {
		//int total_values = fluentDescription.domain.size();
		String name = fluentDescription.getName();
		Set<String> domain = fluentDescription.getDomain();
		Iterator<String> it = domain.iterator();
		if(index.intValue()==total-1){
			while(it.hasNext()){
				String value = it.next();
				//FluentLiteral lit = new FluentLiteral(name,value);			
				//if(st.size()>index.intValue()) st.set(index.intValue(),lit);
				//else st.add(index.intValue(), lit);
				state.put(name, value);
				//System.out.println(st.toString()+"\n\n");
				//State temp_st = new State();
				//temp_st.name = state_nb.toInteger();
				//temp_st.fluents.addAll(st);
				HashMap<String,String> temp_st = new HashMap<String,String>();
				temp_st = (HashMap<String, String>) state.clone();
				//temp_st.addAll(st);
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
				//FluentLiteral lit = new FluentLiteral(name,value);	
				//if(st.size()>index.intValue()) st.set(index.intValue(),lit);
				//else st.add(index.intValue(), lit);
				state.put(name,value);
				index.add(1);
				add(state,fluents_array.get(index.intValue()), fluents_array, index, total, state_nb);
			} 
			index.subtract(1);
		}

	}


	public void readStateVariables(EList<StateVariable> state_variables) {
		for(StateVariable state_variable : state_variables) {

			FluentDescription fluent_description = new FluentDescription();
			String name = state_variable.getName();
			fluent_description.setName(name);
			//System.out.println(name);

			EList<Value> values = state_variable.getValues();
			Iterator<Value> it = values.iterator();
			while(it.hasNext()){
				Value value = it.next();
				fluent_description.addToDomain(value.getValue());
				//System.out.println(value.getValue());
			}

			addFluentDescription(fluent_description);
		}		
	}

	protected Set<HashMap<String,String>> getConditions(EList<ConditionExpression> preconditions) {

		Set<HashMap<String,String>> preconds = new HashSet<HashMap<String,String>>();
		for(ConditionExpression precondition : preconditions) {
			HashMap<String,String> precond = new HashMap<String,String>();
			precondition.getConditions(precond);
			preconds.add(precond);
		}
		return preconds;
	}

	public void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		for(ActionDescription action_description:action_descriptions){
			String action_name = action_description.getAction().getName();
			EList<ConditionExpression> preconditions = action_description.getPreconditions();
			Integer cost = action_description.getCost();

			Set<HashMap<String,String>> preconds = getConditions(preconditions);

			ActionDescr desc = new ActionDescr();

			desc.setPrecondition(preconds);
			desc.setCost(cost);

			EList<ProbabilisticEffect> effects = action_description.getProbabilisticeffect();
			for(ProbabilisticEffect effect:effects){
				ConditionExpression eff = effect.getEffect();
				BigDecimal prb = effect.getProbability();
				Effect effec = new Effect();
				eff.getConditions(effec.getEffect());
				effec.setProb(prb);
				desc.addEffect(effec);
			}

			this.addActionDescription(action_name, desc);
		}
		//System.out.println(this.action_descriptions.toString());
		System.out.println("number of action descriptions="+action_descriptions.size()+"\n");

	}


	private void generateAllTransitionsFromActionDescriptions() {
		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			HashMap<String, String> state = states.get(state_id);
			Iterator<String> it2 = action_descriptions.keySet().iterator();
			while(it2.hasNext()){
				String action_name = it2.next();
				ActionDescr action_description = action_descriptions.get(action_name);
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
					addTransitions(action_name, state,action_description.getEffects());
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



	private void addTransitions(String action_name, HashMap<String, String> state, HashSet<Effect> effects) {
		for(Effect effect : effects){
			HashMap<String, String> eff = effect.getEffect();
			BigDecimal prob = effect.getProb();
			Integer src = states_id.get(state);
			Integer dest = getDestinationState(action_name,state,eff);
			Transition trans = new Transition(action_name,src,dest,prob);
			transitions.put(src+"_"+action_name+"_"+dest, trans);
		}

	}


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

	public void generateLTS() {
		generateStatesFromFluentDescriptions();
		generateAllTransitionsFromActionDescriptions();

	}


	public void generateLTSFromInitialState() {
		/*
		 * an integer to identify states
		 */
		MutableInt state_nb = new MutableInt(1);

		/*
		 * add the initial state to the Maps:
		 * 1) states: state id -> set of literals
		 * 2) states_id: set of literals -> state id
		 */
		states.put(state_nb.toInteger(), initial_state);
		states_id.put(initial_state, state_nb.toInteger());

		/*
		 * a link list to add the states whose outgoing transitions should be explored
		 */
		LinkedList<Integer> to_explore = new LinkedList<Integer>();
		to_explore.add(state_nb.toInteger());

		/*
		 * while there are states to explore, do the following
		 */
		while(!to_explore.isEmpty()){
			/*
			 * get one of the states in explore
			 */
			HashMap<String, String> state = states.get(to_explore.remove());
			/*
			 * iterate over actions, for every action, test if the action is executable, i.e.,
			 * its precondition holds. If true, then calculate the resulting state and add it to the toExplore list
			 * Also add this state to the maps states and id_states
			 */
			Iterator<String> it = action_descriptions.keySet().iterator();
			while(it.hasNext()){
				String action_name = it.next();
				ActionDescr action_description = action_descriptions.get(action_name);
				Set<HashMap<String, String>> precondition = action_description.getPrecondition();
				Integer src = states_id.get(state);
				/* 
				 * check if the action is applicable
				 */
				if(satisfied(precondition,state)){
					/*
					 * 1) Add (state,action) to applicable HashMap
					 */
					if(this.applicable.containsKey(src)){
						HashSet<String> set_of_actions = applicable.get(src);
						set_of_actions.add(action_name);
					} else {
						HashSet<String> set_of_actions = new HashSet<String>();
						set_of_actions.add(action_name);
						this.applicable.put(src, set_of_actions);
					}
					/*
					 * 2) Explore outgoing transitions from src state by iterating over and applying the probabilistic effects of applicable actions
					 */
					HashSet<Effect> effects = action_description.getEffects();
					for(Effect effect : effects){
						HashMap<String, String> eff = effect.getEffect();
						BigDecimal prob = effect.getProb();
						/*
						 * 2a) calculate the destination state, add it to the the states
						 */
						HashMap<String, String> dest_state = calculateDestinationState(action_name,state,eff);
						Integer dest;
						if(!states_id.containsKey(dest_state)) {
							state_nb.add(1);
							dest = state_nb.toInteger();
							states.put(state_nb.toInteger(), dest_state);
							states_id.put(dest_state, state_nb.toInteger());
							to_explore.add(state_nb.toInteger());
						} else {
							dest = states_id.get(dest_state);
						}
						/*
						 * 2b) add the transition to transitions
						 */
						Transition trans = new Transition(action_name,src,dest,prob);
						transitions.put(src+"_"+action_name+"_"+dest, trans);
					}
				} else {
					if(this.not_applicable.containsKey(src)){
						HashSet<String> set_of_actions = not_applicable.get(src);
						set_of_actions.add(action_name);
					} else {
						HashSet<String> set_of_actions = new HashSet<String>();
						set_of_actions.add(action_name);
						this.not_applicable.put(src, set_of_actions);
					}
				}
			}
		}

	}

	public LTS generateLTSFromPolicy(double[] policy, String string) {
		LTS temp = new LTS();
		temp.setStates(states);
		HashMap<String, Transition> trans = filterTransitions(policy,string);
		temp.setTransitions(trans);

		return temp;
	}

	public void showInGraphiv(String string) {
		DOT_Writer visualizer = new DOT_Writer(string, this);
		visualizer.openFromDesktop();
	}


	private HashMap<String, Transition> filterTransitions(double[] policy, String string) {
		Iterator<String> it = this.transitions.keySet().iterator();
		HashMap<String, Transition> temp_trans = new HashMap<String, Transition>();
		while(it.hasNext()) {
			String transition_id = it.next();
			Transition trans_descr = transitions.get(transition_id);
			String trans_name = trans_descr.getName();
			Integer trans_src = trans_descr.getSrc();
			Integer action_id = (int) (policy[trans_src-1]-1);
			if(string.equals("attack")) {
				if(attack_actions.containsKey(trans_name)) {
					if(attack_actions.get(trans_name).equals(action_id)){
						temp_trans.put(transition_id, trans_descr);
					}
				}
			} else if(string.equals("defense")) {
				if(this.defender_actions.containsKey(trans_name)) {
					if(defender_actions.get(trans_name).equals(action_id)){
						temp_trans.put(transition_id, trans_descr);
					}
				}
			}
		}
		return temp_trans;
	}

	protected HashMap<String, String> calculateDestinationState(String action_name,HashMap<String, String> state,
			HashMap<String, String> eff) {
		HashMap<String,String> temp = (HashMap<String, String>) state.clone();
		Iterator<String> it = eff.keySet().iterator();
		while(it.hasNext()){
			String fluent_name = it.next();
			String value = eff.get(fluent_name);
			temp.put(fluent_name, value);
		}
		return temp;
	}

	/**
	 * This function calculates a transition matrix based on the LTS transitions when only attack actions are considered
	 * a transition matrix is a three dimensional matrix (s,s',a) where s is the src state, s' is the destination state and a is the attack action 
	 * @return the transition matrix when attack actions are considered
	 */
	public double[][][] getTransitionMatrixAttacker() {

		if(attack_actions.isEmpty())identifyAttackActions();

		double[][][] p = new double[states.size()][states.size()][attack_actions.size()];
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
			BigDecimal prob = descr.getProbability();
			if(attack_actions.containsKey(action_name)) {
				p[src-1][dest-1][attack_actions.get(action_name)] = prob.doubleValue();
			}

		}
		Iterator<String> actions = this.attack_actions.keySet().iterator();


		while(actions.hasNext()) {
			String action_name = actions.next();
			Iterator<Integer> it2 = states.keySet().iterator();
			while(it2.hasNext()) {
				Integer state_id = it2.next();
				HashSet<String> actions_applicable_in_state_id = applicable.get(state_id);
				if(!actions_applicable_in_state_id.contains(action_name)) {
					p[state_id-1][state_id-1][attack_actions.get(action_name)] = 1;
				}
			}

		}


		return p;
	}

	/**
	 * This function calculates a transition matrix based on the LTS transitions when only attack actions are considered
	 * a transition matrix is a three dimensional matrix (s,s',a) where s is the src state, s' is the destination state and a is the attack action 
	 * @return the transition matrix when attack actions are considered
	 */
	public double[][][] getTransitionMatrixDefender() {

		if(defender_actions.isEmpty())identifyDefenderActions();

		double[][][] p = new double[states.size()][states.size()][defender_actions.size()];
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
			BigDecimal prob = descr.getProbability();
			if(defender_actions.containsKey(action_name)) {
				p[src-1][dest-1][defender_actions.get(action_name)] = prob.doubleValue();
			}

		}
		Iterator<String> actions = this.defender_actions.keySet().iterator();


		while(actions.hasNext()) {
			String action_name = actions.next();
			Iterator<Integer> it2 = states.keySet().iterator();
			while(it2.hasNext()) {
				Integer state_id = it2.next();
				HashSet<String> actions_applicable_in_state_id = applicable.get(state_id);
				if(!actions_applicable_in_state_id.contains(action_name)) {
					p[state_id-1][state_id-1][defender_actions.get(action_name)] = 1;
				}
			}

		}


		return p;
	}

	protected void identifyDefenderActions() {
		/*
		 * find the attack actions and store them in a HashMap <action_name, id>
		 */
		defender_actions = new HashMap<String,Integer>();
		Iterator<String> it = action_type.keySet().iterator();
		Integer id = 0;
		while(it.hasNext()){
			String act_name = it.next();
			String act_type = action_type.get(act_name);
			if(act_type.equals("defender")) {
				defender_actions.put(act_name,id++);
			}
		}		
	}

	public void identifyAttackActions() {
		/*
		 * find the attack actions and store them in a HashMap <action_name, id>
		 */
		attack_actions = new HashMap<String,Integer>();
		Iterator<String> it = action_type.keySet().iterator();
		Integer id = 0;
		while(it.hasNext()){
			String act_name = it.next();
			String act_type = action_type.get(act_name);
			if(act_type.equals("attacker")) {
				attack_actions.put(act_name,id++);
			}
		}
	}
	//
	//	public void identifyActions() {
	//		/*
	//		 * find the attack actions and store them in a HashMap <action_name, id>
	//		 */
	//		actions = new HashMap<String,Integer>();
	//		Iterator<String> it = action_type.keySet().iterator();
	//		Integer id = 0;
	//		while(it.hasNext()){
	//			String act_name = it.next();
	//			String act_type = action_type.get(act_name);
	//			if(act_type.equals("attacker")) {
	//				attack_actions.put(act_name,id++);
	//			}
	//		}
	//	}

	public void setInitialState(ConditionExpression initial) {
		initial_state = new HashMap<String,String>();
		initial.getConditions(initial_state);
	}




	public HashMap<String, HashSet<String>> getFluent_descriptions() {
		return fluent_descriptions;
	}


	public void setFluent_descriptions(HashMap<String, HashSet<String>> fluent_descriptions) {
		this.fluent_descriptions = fluent_descriptions;
	}


	public HashMap<String, ActionDescr> getAction_descriptions() {
		return action_descriptions;
	}


	public void setAction_descriptions(HashMap<String, ActionDescr> action_descriptions) {
		this.action_descriptions = action_descriptions;
	}


	public HashMap<Integer, HashMap<String, String>> getStates() {
		return states;
	}


	public void setStates(HashMap<Integer, HashMap<String, String>> states) {
		this.states = states;
	}


	public HashMap<Integer, HashSet<String>> getApplicable() {
		return applicable;
	}


	public void setApplicable(HashMap<Integer, HashSet<String>> applicable) {
		this.applicable = applicable;
	}


	public HashMap<HashMap<String, String>, Integer> getStates_id() {
		return states_id;
	}


	public void setStates_id(HashMap<HashMap<String, String>, Integer> states_id) {
		this.states_id = states_id;
	}


	public HashMap<String, Transition> getTransitions() {
		return transitions;
	}


	public void setTransitions(HashMap<String, Transition> transitions) {
		this.transitions = transitions;
	}


	public HashMap<String, String> getInitial_state() {
		return initial_state;
	}


	public void setInitial_state(HashMap<String, String> initial_state) {
		this.initial_state = initial_state;
	}



	public HashMap<String, String> getAction_type() {
		return action_type;
	}


	public void setAction_type(HashMap<String, String> action_type) {
		this.action_type = action_type;
	}

	public void addAction_type(String action_name, String action_type) {
		this.action_type.put(action_name, action_type);
	}

	public HashMap<String, Integer> getAttack_actions() {
		return attack_actions;
	}


	public HashMap<String, Integer> getDefender_actions() {
		return defender_actions;
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
		System.out.println("\n\n\t\t*********  End Printing LTS  ***************\n\n\n");

	}

}
