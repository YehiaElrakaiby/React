package lts.operational;
import java.io.FileOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.io.BufferedWriter;
import java.io.File;
import java.util.regex.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.mutable.MutableInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.CA;
import org.emftext.language.AdaptiveCyberDefense.CM;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DEA;
import org.emftext.language.AdaptiveCyberDefense.DEM;
import org.emftext.language.AdaptiveCyberDefense.DFA;
import org.emftext.language.AdaptiveCyberDefense.DFM;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.Label;
import org.emftext.language.AdaptiveCyberDefense.PCTLStateFormula;
import org.emftext.language.AdaptiveCyberDefense.PDEM;
import org.emftext.language.AdaptiveCyberDefense.PDFM;
import org.emftext.language.AdaptiveCyberDefense.PM;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.RPDEM;
import org.emftext.language.AdaptiveCyberDefense.RPDFM;
import org.emftext.language.AdaptiveCyberDefense.RPM;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.UA;
import org.emftext.language.AdaptiveCyberDefense.UM;

import main.REact;
import resources.RequirementDescription;
import resources.StateVariableDescription;
import resources.Transition;

/**
 * 
 * @author yehia
 *
 */
public class LTSG {

	public static final String FULL = "full";
	public static final String INITIAL = "initial";

	private Integer nb_of_states=1; 
	private Integer nb_of_control_events=0;
	private Integer nb_of_exogenous_events=0;
	private Integer nb_of_transitions=0;
	private String generation_option;
	/**
	 * Fluent Description:
	 *  Mapping variable_name --> Domain(variable) 
	 */
	protected HashMap<String, HashSet<String>> variables_domain = new LinkedHashMap<String, HashSet<String>> ();
	
	/*
	 * event_description:
	 * Map between an event (the toString() of the action described in an action description) and the action description itself
	 */
	protected HashMap<String,ActionDescription> action_descriptions = new HashMap<String,ActionDescription>();
	protected HashMap<String,EventDescription> event_descriptions = new HashMap<String,EventDescription>();

	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements_description = new HashMap<String,RequirementDescription>();

	/**
	 * Initial State
	 */
	protected HashMap<String,String> initial_state = new HashMap<String,String>();

	/** LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<Integer,HashMap<String,String>> states = new HashMap<Integer,HashMap<String,String>> ();

	/**
	 * LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<HashMap<String,String>,Integer> states_id = new HashMap<HashMap<String,String>,Integer>();

	/**
	 *  LTS Transitions
	 *  Mapping transition_id --> Transition(name,src,dest,prob)
	 */
	protected HashSet<Transition> transitions = new HashSet<Transition>();

	/**
	 * Control and Exogenous Events 
	 */
	protected HashSet<String> actions = new HashSet<String>();
	protected HashMap<String, Integer> actions_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_control_events = new HashMap<Integer, String>();
	protected HashMap<Integer, HashSet<Transition>> actions_transitions_map = new HashMap<Integer, HashSet<Transition>>();
	protected HashMap<String, Formula> labels = new HashMap<String, Formula>();
	protected HashMap<Integer, HashSet<String>> state_labels = new HashMap<Integer, HashSet<String>>();
	protected HashMap<Integer, String> properties = new HashMap<Integer, String>();
	
	protected HashSet<String> event_names = new HashSet<String>();
	protected HashSet<String> exogenous_events = new HashSet<String>();
	protected HashMap<String, Integer> exogenous_events_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_exogenous_events = new HashMap<Integer, String>();
	protected HashMap<Integer, HashSet<Transition>> exo_events_transitions_map = new HashMap<Integer, HashSet<Transition>>();
	protected HashMap<Integer, HashMap<Integer,Double>> occurrence_vectors = new HashMap<Integer, HashMap<Integer,Double>> ();

	/**
	 *  Rewards
	 */
	//protected HashSet<Reward> rewards = new HashSet<Reward>();

	private final static Logger LOGGER = LogManager.getRootLogger();
	
	private static ArrayList<StateVariableDescription> fluents_array = new ArrayList<StateVariableDescription>();
	
	/*
	 * 				MAIN PART
	 */
	public LTSG(DomainDescription description, String option, int output, String files_location) throws IOException {
		/*
		 *  Initialize
		 */
		this.generation_option = option;
		initialize(description);
		LOGGER.info("The LTS is initialized");


		/*
		 * (1) Read state variables 
		 * (2) Read requirements 
		 * (3) Read event descriptions
		 * (4) Generate the state space
		 * (5) Generate Transitions
		 */
		if(option.equals(FULL)) {

			generateStatesFromVariables(states,states_id);
			System.out.println(states);
			LOGGER.info("The states are computed");
			
			generateStatesFile(output, files_location);
			
			setInitialState(description);
			
			HashMap<Integer,HashMap<String,String>> cpy = new HashMap<Integer,HashMap<String,String>>(states);

			generateTransitions(this.requirements_description);
			LOGGER.info("The transitions are computed");

			if(!cpy.equals(states)) {
				LOGGER.error("states have been modified while computing transitions");
			}
		}

		if(option.equals(INITIAL)) {
			setInitialState(description);
			LOGGER.info("The initial state is set");

			generateLTSFromInitialState();
			LOGGER.info("The LTS is generated");

		}
	}

	private void generateStatesFile(int output, String files_location) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println(states.toString());
		/*
		 * Create the state file
		 */
		if(output == 2) {
			
		File ff=new File(files_location+"/prism.sta");
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		int nb_fluents = variables_domain.size();
		//Write in the state file the number of variable
		ffw.write("(");
		for(int d=0;d<nb_fluents;d++) {
			ffw.write("v"+d+",");
		}
		ffw.write(")\n");
		
		// For each state, found the number of the state and the number of the value for each variable 
		for(int x=0;x<states.size();x++) {
			ffw.write(x+":(");
			Pattern table1 = Pattern.compile("=\\w+\\d*");
			Matcher matcher_table1 = table1.matcher(states.get(x).toString());
			for(int var_number=0;var_number<variables_domain.size();var_number++) {
				if(matcher_table1.find()) {
					String dom = fluents_array.get(var_number).getDomain().toString().substring(1,fluents_array.get(var_number).getDomain().toString().length()-1);
					String domain[] = dom.split(",");

					for(int j=0; j<fluents_array.get(var_number).getDomain().size(); j++) {
						if(matcher_table1.group().substring(1).trim().equalsIgnoreCase(domain[j].trim())) {
							ffw.write(j+",");
						}
					}
				}
			}ffw.write(")\n");
		}
		ffw.close();
		
		}
		
	}

	/*
	 * 				INITIALIZATION PART
	 */
	private void initialize(DomainDescription description) throws IOException {
		readStateVariables(description.getState_variables());
		addNoOpAction();
		readActionDescriptions(description.getAction_descriptions());
		readEventDescriptions(description.getEvent_descriptions());
		readRequirements(description.getRequirements());	
		readLabels(description.getLabels());
		readProperties(description.getProperties());
	}
	
	private void readProperties(EList<PCTLStateFormula> description_properties) {
		int index = 0;
		for(PCTLStateFormula property : description_properties) {
			String formula = property.toString();
			this.properties.put(index, formula);
			index++;	
		}
		
	}

	private void readLabels(EList<Label> description_labels) {

		for(Label label : description_labels) {
			String name = label.getValue();
			Formula formula = label.getProperty();
			this.labels.put(name, formula);
		}
	}

	private void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		HashSet<String> action_domain=new HashSet<String>();

		for(ActionDescription action : action_descriptions) {
			String name = action.getName() + "=" + action.getValue();

			this.actions.add(name);
			this.actions_id.put(name,nb_of_control_events);
			this.id_control_events.put(nb_of_control_events,name);
			this.actions_transitions_map.put(nb_of_control_events, new HashSet<Transition>());

			action_domain.add(action.getName());

			this.action_descriptions.put(name, action);
			this.nb_of_control_events++;
			//System.out.println(event);

		}
		action_domain.add("noop");
		/*
		 * Add the following line to add actions into the states
		 */
		//this.variables_domain.put("action", action_domain);
		//nb_of_states = nb_of_states * action_domain.size();


	}
	private void readEventDescriptions(EList<EventDescription> event_descriptions) {
		for(EventDescription action : event_descriptions) {

			String event = action.getName() + "=" + action.getValue();
			
			this.event_names.add(action.getName());
			this.exogenous_events.add(event);
			this.exogenous_events_id.put(event,nb_of_exogenous_events);
			this.id_exogenous_events.put(nb_of_exogenous_events,event);
			this.exo_events_transitions_map.put(nb_of_exogenous_events, new HashSet<Transition>());
			this.occurrence_vectors.put(nb_of_exogenous_events, new HashMap<Integer,Double>());

			HashSet<String> event_domain=new HashSet<String>();
			event_domain.add("tt");
			event_domain.add("ff");
			/*
			 * Add the following line to add events into the states
			 */
			//this.variables_domain.put(action.getName(), event_domain);

			//nb_of_states = nb_of_states * event_domain.size();

			this.event_descriptions.put(event, action);
			this.nb_of_exogenous_events++;
		}
	}
	private void readStateVariables(EList<StateVariable> state_variables) {
		for(StateVariable state_variable : state_variables) {
			String name = state_variable.getName();
			HashSet<String> domain = new HashSet<String>();
			EList<String> values = state_variable.getValues();
			Iterator<String> it = values.iterator();
			while(it.hasNext()){
				String value = it.next();
				domain.add(value);			
			}
			variables_domain.put(name,domain);

			nb_of_states = nb_of_states * domain.size();
		}		

	}
	private void addNoOpAction() {

		/*
		 * Create a noop action description
		 */
		ActionDescription descr = AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
		EList<ContextualEffect> effects = descr.getContextual_effects();


		descr.setName(REact.noop_event_identifier);
		/*
		 * set preconditions
		 */
		ContextualEffect contextual_effect = AdaptiveCyberDefenseFactory.eINSTANCE.createContextualEffect();
		contextual_effect.setContext(AdaptiveCyberDefenseFactory.eINSTANCE.createTrue());

		effects.add(contextual_effect);

		/*
		 * set cost
		 */
		descr.setCost(new BigDecimal(0));

		String ev = REact.noop_event_identifier + "=" + descr.getValue();

		this.actions.add(ev);
		this.actions_id.put(ev,nb_of_control_events);
		this.id_control_events.put(nb_of_control_events,ev);
		this.actions_transitions_map.put(nb_of_control_events, new HashSet<Transition>());


		this.action_descriptions.put(ev, descr);
		this.nb_of_control_events++;	

		//HashSet<String> action_domain=new HashSet<String>();
		//action_domain.add("tt");
		//action_domain.add("ff");
		//this.variables_domain.put("noop", action_domain);

	}
	private void readRequirements(EList<Requirement> eList) throws IOException {
		int index = 0;
		String[] tab_reward = new String[eList.size()];
		String[] tab_value = new String[eList.size()];
		for(Requirement requirement : eList) {
			HashSet<String> domain = new HashSet<String>();
			String name = requirement.getName();
			RequirementDescription descr = new RequirementDescription();
			
			if(requirement.getClass().getName().endsWith(".UAImpl")){
				UA req = (UA) requirement;
				ReqDescrFill.fillUARequirementDescription(req,descr,domain);
			} else if(requirement.getClass().getName().endsWith(".CAImpl")){
				CA req = (CA) requirement;
				ReqDescrFill.fillCARequirementDescription(req,descr,domain);
			} else if(requirement.getClass().getName().endsWith(".DEAImpl")){
				DEA req = (DEA) requirement;
				ReqDescrFill.fillDEARequirementDescription(req,descr,domain);
			} else if(requirement.getClass().getName().endsWith(".DFAImpl")){
				DFA req = (DFA) requirement;
				ReqDescrFill.fillDFARequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".UMImpl")){
				UM req = (UM) requirement;
				ReqDescrFill.fillUMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".CMImpl")){
				CM req = (CM) requirement;
				ReqDescrFill.fillCMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".DEMImpl")){
				DEM req = (DEM) requirement;
				ReqDescrFill.fillDEMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".DFMImpl")){
				DFM req = (DFM) requirement;
				ReqDescrFill.fillDFMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".PMImpl")){
				PM req = (PM) requirement;
				ReqDescrFill.fillPMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".RPMImpl")){
				RPM req = (RPM) requirement;
				ReqDescrFill.fillRPMRequirementDescription(req,descr,domain);
			} else if(requirement.getClass().getName().endsWith(".PDEMImpl")){
				PDEM req = (PDEM) requirement;
				ReqDescrFill.fillPDEMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".RPDEMImpl")){
				RPDEM req = (RPDEM) requirement;
				ReqDescrFill.fillRPDEMRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".PDFMImpl")){
				PDFM req = (PDFM) requirement;
				ReqDescrFill.fillPDFMRequirementDescription(req,descr,domain);
			} else if(requirement.getClass().getName().endsWith(".RPDFMImpl")){
				RPDFM req = (RPDFM) requirement;
				ReqDescrFill.fillRPDFMRequirementDescription(req,descr,domain);
			} 

			/**
			 * add the requirement to the HashMap requirements_description
			 */
			String value_req[] = null;
			this.requirements_description.put(name, descr);
			//System.out.println(this.requirements_description.toString());
			Pattern value = Pattern.compile("value:.*");
			Matcher matcher_val = value.matcher(this.requirements_description.toString());
			if(matcher_val.find()) {
				String splitter[] = matcher_val.group().split(": ");
				value_req = splitter[1].split("\\)");
				tab_value[index] = value_req[0];
			}
			
			Pattern reward = Pattern.compile("\\d+");
			Matcher matcher_rew = reward.matcher(value_req[1]);
			if(matcher_rew.find()) {
				tab_reward[index] = matcher_rew.group();
			}
			
			/**
			 * add requirements and their domains to domain variables
			 */
			if(!domain.isEmpty()) {
				variables_domain.put(name,domain);
				nb_of_states = nb_of_states * domain.size();
			}
			index++;
		}
	}

	private HashMap<Integer, HashMap<String, String>> generateStatesFromVariables(
			HashMap<Integer, HashMap<String, String>> temp_states,
			HashMap<HashMap<String, String>, Integer> temp_states_id) throws IOException {
		
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
		//ArrayList<StateVariableDescription> fluents_array = new ArrayList<StateVariableDescription>();
		while(it.hasNext()){
			String name = it.next();
			HashSet<String> domain = variables_domain.get(name);
			StateVariableDescription fluent_description = new StateVariableDescription(name,domain);
			fluents_array.add(fluent_description);
		}

		/*
		 * 2. Create a HashMap<String(fluent),String(value)> to hold the constructed state
		 */
		//Map<String,String> state = new HashMap<String,String>();
		Map<String,String> state = new LinkedHashMap<String,String>();

		/*
		 * 3. Call a recursive function to construct the states, 
		 * the basic idea of the function is to construct one initial state 
		 * and then change the value of one state variable to compute a new state
		 * and repeat this until all possibilities are exhausted and all states are computed
		 * This function fills both the states and states_id hashmaps
		 */
		add(state, fluents_array.get(index.intValue()), fluents_array, index, nb_fluents, state_nb, temp_states, temp_states_id);
		System.out.println("\nnumber of states="+temp_states.size()+"\n");
		return temp_states;
		
	}

	private void add(Map<String, String> state, 
			StateVariableDescription fluentDescription, 
			ArrayList<StateVariableDescription> fluents_array, 
			MutableInt index,
			int total, 
			MutableInt state_nb, 
			HashMap<Integer, HashMap<String, String>> temp_states, 
			HashMap<HashMap<String, String>, Integer> temp_states_id) {

		String name = fluentDescription.getName();
		Set<String> domain = fluentDescription.getDomain();
		Iterator<String> it = domain.iterator();
		if(index.intValue()==total-1){
			while(it.hasNext()){
				String value = it.next();
				state.put(name, value);
				HashMap<String,String> temp_st = new LinkedHashMap<String,String>(state);
				temp_states.put(state_nb.toInteger(), temp_st);
				temp_states_id.put(temp_st,state_nb.toInteger());
				state_nb.add(1);
				//System.out.println(state_nb.toInteger() + " " +temp_st.toString()+"\n");
			} 
			index.subtract(1);
		} else {
			while(it.hasNext()){
				String value = it.next();
				state.put(name,value);
				index.add(1);
				add(state,fluents_array.get(index.intValue()), fluents_array, index, total, state_nb, temp_states, temp_states_id);
			} 
			index.subtract(1);
		}
	}


	private void generateTransitions(HashMap<String, RequirementDescription> requirements_description) {

		/* (1) Iterate Over All States
		 * (2) Iterate over all control, exogenous and exploit events and update the transition and reward matrix accordingly
		 * (*) Notice that when the event is a control event then only the dreward and dtransition are updated
		 * (2.1) If there is an effect law of an event that is applicable, then apply it
		 * (2.2) If there is an effect law that is not applicable, then it is a self transition in the transition matrix*/


		Iterator<Integer> it = states.keySet().iterator();
		/*
		 * the following variable is created just to allow calling the update functions, it is not actually being used
		 * the is done just to reuse the update functions and not redefine new ones
		 */
		LinkedList<Integer> to_explore=new LinkedList<Integer>();

		while(it.hasNext()){
			Integer state_id = it.next();
			HashMap<String, String> state = states.get(state_id);
			MutableInt state_nb=new MutableInt(state_id);

			findActionTransitionsFromState(state,state_nb,to_explore);
			findEventTransitionsFromState(state,state_nb,to_explore);

		}
	}


	/*
	 * 				SET INITIAL STATE PART
	 */
	private void setInitialState(DomainDescription description) {
		for( InitialAtom atom : description.getInitial_atoms()) {
			/*if(atom.getClass().toString().endsWith("StateAtomImpl")) {
				StateAtom satom = (StateAtom) atom;
				this.initial_state.put(satom.getStatevariable().getName(), satom.getValue());
			} else if(atom.getClass().toString().endsWith("RequirementAtomImpl")) {
				RequirementAtom ratom = (RequirementAtom) atom;
				this.initial_state.put(ratom.getRequirement().getName(), ratom.getStatus());
			}*/
			InitialVariable var = atom.getInitialvariable();
			if(var.getClass().toString().endsWith(".StateVariableImpl")) {
				StateVariable satom = (StateVariable) var;
				this.initial_state.put(satom.getName(), atom.getValue());
			} else {
				Requirement req = (Requirement) var;
				this.initial_state.put(req.getName(), atom.getValue());
			}
		}
		Iterator<String> it = requirements_description.keySet().iterator();
		while(it.hasNext()){
			String reqID = it.next();
			RequirementDescription descr = requirements_description.get(reqID);
			if(!initial_state.containsKey(reqID) && descr.getType()!="um"  && descr.getType()!="ua"){
				initial_state.put(reqID, "I");
			}
		}
		//initial_state.put("action", "noop");
		//for(String event : event_names) {
			//for(String event :this.exogenous_events) {
		//	initial_state.put(event, "ff");
		//}
	}

	/*
	 * 				LTS States and Transitions Identification From Initial State PART
	 */
	private void generateLTSFromInitialState() {
		/*
		 * an integer to identify states
		 */
		MutableInt state_nb = new MutableInt(0);
		//MutableInt transition_nb = new MutableInt(0);

		/*
		 * add the initial state to the Maps:
		 * 1) states: state id -> set of literals
		 * 2) states_id: set of literals -> state id
		 */
		states.put(state_nb.toInteger(), initial_state);
		states_id.put(initial_state, state_nb.toInteger());

		/*
		 * a linked list to add the states whose outgoing transitions should be explored
		 */
		LinkedList<Integer> to_explore = new LinkedList<Integer>();
		to_explore.add(state_nb.toInteger());

		/*
		 * while there are states to explore, do the following
		 */
		while(!to_explore.isEmpty()){
			/*
			 * get one of the states in to_explore
			 */
			HashMap<String, String> state = states.get(to_explore.remove());
			findActionTransitionsFromState(state,state_nb,to_explore);
			findEventTransitionsFromState(state,state_nb,to_explore);
		}
	}

	private void findEventTransitionsFromState(
			HashMap<String, String> state, 
			MutableInt state_nb,
			LinkedList<Integer> to_explore) {
		Integer src_id = states_id.get(state);
		/*
		 * iterate over actions, for every action a, 
		 * 
		 * 1) explore every possible destination state (application of every effect)
		 * 1.1) check if a context applies
		 * 1.1.1) yes, explore every application of effects, if an effect exists
		 * 1.1.2) no, create a self-transition
		 * 2) update the transition matrix of a
		 * 3) update the to_explore, states and states_id structures
		 */
		for( String event_name:this.exogenous_events) {
			/*
			 * initialization
			 */
			EventDescription descr = this.event_descriptions.get(event_name);
			Integer event_id = exogenous_events_id.get(event_name);
			EList<ProbabilisticContextualEffect> contextual_effects = descr.getProbabilistic_contextual_effects();
			HashSet<Transition> event_transitions = this.exo_events_transitions_map.get(event_id);
			HashMap<Integer, Double> occurrence_vector = occurrence_vectors.get(event_id);
			BigDecimal one = new BigDecimal(1);
			Boolean holds= false;
			EList<ProbabilisticEffect> effects=null;

			/*
			 * check if a context applies:
			 * if yes, 
			 * 1) let "effects" be the effects associated with the context
			 * 2) set "holds" to true
			 * 3) update the occurrence vector
			 */
			for(ProbabilisticContextualEffect contextual_effect : contextual_effects) {
				Formula context = contextual_effect.getContext();
				if(holds(context,state)) {
					occurrence_vector.put(src_id, contextual_effect.getOccurrence_probability().doubleValue());
					holds = true;
					effects = contextual_effect.getEffects();

					BigDecimal total_prob = new BigDecimal(0);

					/*
					 * apply the effects of the actions one at a time
					 */
					for(ProbabilisticEffect effect : effects){
						BigDecimal prob = effect.getProbability();
						HashMap<String, String> dst_state = new HashMap<String, String>(state);
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						} 

						/*
						 * The following lines add the event that lead to this state into the state 
						 */
						//for(String event :this.event_names) {
							//if(event.equals(descr.getName())) {
								//dst_state.put(event, "tt");
							//} else {
								//dst_state.put(event, "ff");
							//}
						//}
						
						updateReqVariablesE(dst_state, requirements_description);

						Integer dest_id = updateStates(to_explore,dst_state,state_nb);


						Transition trans = new Transition(event_name,src_id,dest_id,prob);
						event_transitions.add(trans);

						total_prob = total_prob.add(effect.getProbability());

					}
					if(total_prob.compareTo(one)==-1) {
						HashMap<String, String> dst_state = new HashMap<String, String>(state);

						//dst_state.put(descr.getName(), descr.getValue());
						updateReqVariablesE(dst_state, requirements_description);
						//dst_state.remove(descr.getName());

						Integer dest_id = updateStates(to_explore,dst_state,state_nb);

						Transition trans = new Transition(event_name,src_id,dest_id,one.subtract(total_prob));
						event_transitions.add(trans);

					}
					break;
				} 
			}
			if(!holds) {
				occurrence_vector.put(src_id, new Double(0));

				HashMap<String, String> dst_state = new HashMap<String, String>(state);

				/*
				 * The following lines add the event that lead to this state into the state 
				 */
				//for(String event :this.event_names) {
					//if(event.equals(descr.getName())) {
						//dst_state.put(event, "tt");
					//} else {
						//dst_state.put(event, "ff");
					//}
				//}

				updateReqVariables(dst_state, requirements_description);


				Integer dest_id = updateStates(to_explore,dst_state,state_nb);

				Transition trans = new Transition(event_name,src_id,dest_id,one);
				event_transitions.add(trans);


			}
		}
	}

	private void findActionTransitionsFromState(HashMap<String, String> state, MutableInt state_nb, LinkedList<Integer> to_explore) {
		Integer src_id = states_id.get(state);
		/*
		 * iterate over actions, for every action a, 
		 * 
		 * 1) explore every possible destination state (application of every effect)
		 * 1.1) check if a context applies
		 * 1.1.1) yes, explore every application of effects, if an effect exists
		 * 1.1.2) no, create a self-transition
		 * 2) update the transition matrix of a
		 * 3) update the to_explore, states and states_id structures
		 */
		for( String action_name:this.actions) {
			//System.out.println(this.actions);
			ActionDescription descr = this.action_descriptions.get(action_name);
			//
			Integer action_id = actions_id.get(action_name);
			EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
			//
			
			HashSet<Transition> action_transitions = this.actions_transitions_map.get(action_id);
			BigDecimal one = new BigDecimal(1);
			Boolean holds= false;
			//
			EList<ProbabilisticEffect> effects=null;
			//
			
			/*
			 * check if a context applies:
			 * if yes, 
			 * 1) effects = the effects associated with the context
			 * 2) set holds to true
			 */
			//
			for(ContextualEffect contextual_effect : contextual_effects) {
				Formula context = contextual_effect.getContext();
				if(holds(context,state)) {
					holds = true;
					effects = contextual_effect.getEffects();
					BigDecimal total_prob = new BigDecimal(0);

					/*
					 * apply the effects of the actions one at a time
					 */
					for(ProbabilisticEffect effect : effects){
						BigDecimal prob = effect.getProbability();
						HashMap<String, String> dst_state = new HashMap<String, String>(state);
						//System.out.println(state);
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						} 
						//System.out.println("dest"+dst_state);
						/*
						 * The following lines add the action that lead to the event to the state 
						 */
						//for(String event :this.event_names) {
							//dst_state.put(event, "ff");
						//}					
						//dst_state.put("action", descr.getName());

						updateReqVariables(dst_state, requirements_description);
						//
						//System.out.println(state);
						Integer dest_id = updateStates(to_explore,dst_state,state_nb);
						//System.out.println("dest"+dest_id);

						Transition trans = new Transition(action_name,src_id,dest_id,prob);
						action_transitions.add(trans);



						total_prob = total_prob.add(effect.getProbability());

					}
					if(total_prob.compareTo(one)==-1) {
						HashMap<String, String> dst_state = new HashMap<String, String>(state);
						/*
						 * The following lines add the action that lead to the event to the state 
						 */
						//for(String event :this.event_names) {
							//dst_state.put(event, "ff");
						//}					
						//dst_state.put("action", descr.getName());
						
						updateReqVariables(dst_state, requirements_description);
						
						Integer dest_id = updateStates(to_explore,dst_state,state_nb);
						Transition trans = new Transition(action_name,src_id,dest_id,one.subtract(total_prob));
						action_transitions.add(trans);
					}
					break;
				} 
			}
			if(!holds) {
				HashMap<String, String> dst_state = new HashMap<String, String>(state);

				/*
				 * The following lines add the action that lead to the event to the state 
				 */
				//for(String event :this.event_names) {
					//dst_state.put(event, "ff");
				//}					
				//dst_state.put("action", descr.getName());
				
				updateReqVariables(dst_state, requirements_description);
				
				Integer dest_id = updateStates(to_explore,dst_state,state_nb);

				Transition trans = new Transition(action_name,src_id,dest_id,one);
				action_transitions.add(trans);


			}
		}
	}		

	/*
	 * 				Auxiliary Functions for LTS States and Transitions Identification PART
	 */
	private boolean holds(Formula context, HashMap<String, String> state) {
		if(context.verify(state)) {
			return true;
		}
		return false;
	}

	private Integer updateStates(
			LinkedList<Integer> to_explore, 
			HashMap<String, String> dest_state, 
			MutableInt state_nb) {
		Integer dest=-1;
		if(!states_id.containsKey(dest_state) && this.generation_option==this.INITIAL) {
			state_nb.add(1);
			dest = state_nb.toInteger();
			states.put(state_nb.toInteger(), dest_state);
			states_id.put(dest_state, state_nb.toInteger());
			to_explore.add(state_nb.toInteger());

		} else if (states_id.containsKey(dest_state)){
			dest = states_id.get(dest_state);
		}	else {
			LOGGER.error("Transition Generation Problem: An Unknown Destination State Encountered! "+dest_state.toString());
		}
		/*
		 * For each state, we check for each specified property/label 
		 * whether the property/formula is satisfied and if it is satisfied then
		 * we add the label to the set of labels associated with the state 
		 */
		HashSet<String> state_labels = new HashSet<String>();
		for(String label : this.labels.keySet()) {
			Formula formule = labels.get(label);
			if(formule.verify(dest_state)) {
				state_labels.add(label);
			}
		}
		this.state_labels.put(state_nb.toInteger(), state_labels);
		return dest;
	}

	private void updateStateVariables(HashMap<String, String> temp, ProbabilisticEffect effect) {
		EList<StateAtom> atoms = effect.getState_atoms();

		for(StateAtom atom : atoms) {
			String var = atom.getState_variable().getName();
			temp.put(var, atom.getValue());
		}		
	}

	private void updateReqVariables(HashMap<String, String> state,  
			HashMap<String, RequirementDescription> requirements_description) {
		Iterator<String> it = requirements_description.keySet().iterator();
		RequirementDescription req;
		while(it.hasNext()) {
			String reqID = it.next();
			req = requirements_description.get(reqID);
			if(req.getType().equals("ua")){
				ReqStateUpd.updateUAReqAtomInState(state,req);
			} else if(req.getType().equals("ca")){
				ReqStateUpd.updateCAReqAtomInState(state,req);
			} else if(req.getType().equals("dfa")){
				ReqStateUpd.updateDFAReqAtomInState(state,req);
			} else if(req.getType().equals("dea")){
				ReqStateUpd.updateDEAReqAtomInState(state,req);
			}  else if(req.getType().equals("um")){
				ReqStateUpd.updateUMReqAtomInState(state,req);
			} else if(req.getType().equals("cm")){
				ReqStateUpd.updateCMReqAtomInState(state,req);
			} else if(req.getType().equals("dfm")){
				ReqStateUpd.updateDFMReqAtomInState(state,req);
			} else if(req.getType().equals("dem")){
				ReqStateUpd.updateDEMReqAtomInState(state,req);
			} else if(req.getType().equals("pm")){
				ReqStateUpd.updatePMReqAtomInState(state,req);
			} else if(req.getType().equals("rpm")){
				ReqStateUpd.updateRPMReqAtomInState(state,req);
			} else if(req.getType().equals("pdem")){
				ReqStateUpd.updatePDEMReqAtomInState(state,req);
			} else if(req.getType().equals("rpdem")){
				ReqStateUpd.updateRPDEMReqAtomInState(state,req);
			} else if(req.getType().equals("pdfm")) {
				ReqStateUpd.updatePDFMReqAtomInState(state,req);
			} else if(req.getType().equals("rpdfm")){
				ReqStateUpd.updateRPDFMReqAtomInState(state,req);
			} 
		}
	}


	private void updateReqVariablesE(HashMap<String, String> state,  
			HashMap<String, RequirementDescription> requirements_description) {
		Iterator<String> it = requirements_description.keySet().iterator();
		RequirementDescription req;
		while(it.hasNext()) {
			String reqID = it.next();
			req = requirements_description.get(reqID);
			if(req.getType().equals("ua")){
				EReqStateUpd.updateUAReqAtomInState(state,req);
			} else if(req.getType().equals("ca")){
				EReqStateUpd.updateCAReqAtomInState(state,req);
			} else if(req.getType().equals("dfa")){
				EReqStateUpd.updateDFAReqAtomInState(state,req);
			} else if(req.getType().equals("dea")){
				EReqStateUpd.updateDEAReqAtomInState(state,req);
			}  else if(req.getType().equals("um")){
				EReqStateUpd.updateUMReqAtomInState(state,req);
			} else if(req.getType().equals("cm")){
				EReqStateUpd.updateCMReqAtomInState(state,req);
			} else if(req.getType().equals("dfm")){
				EReqStateUpd.updateDFMReqAtomInState(state,req);
			} else if(req.getType().equals("dem")){
				EReqStateUpd.updateDEMReqAtomInState(state,req);
			} else if(req.getType().equals("pm")){
				EReqStateUpd.updatePMReqAtomInState(state,req);
			} else if(req.getType().equals("rpm")){
				EReqStateUpd.updateRPMReqAtomInState(state,req);
			} else if(req.getType().equals("pdem")){
				EReqStateUpd.updatePDEMReqAtomInState(state,req);
			} else if(req.getType().equals("rpdem")){
				EReqStateUpd.updateRPDEMReqAtomInState(state,req);
			} else if(req.getType().equals("pdfm")) {
				EReqStateUpd.updatePDFMReqAtomInState(state,req);
			} else if(req.getType().equals("rpdfm")){
				EReqStateUpd.updateRPDFMReqAtomInState(state,req);
			} 
		}
	}



	/*
	 * 				Getters and Setters PART
	 */
	public HashMap<Integer, HashMap<String, String>> getStates() {
		return states;
	}
	
	public HashMap<String, Integer> getActionsId() {
		return actions_id;
	}
		
	public HashMap<String, Formula> getLabels() {
		return labels;
	}
	
	public HashMap<Integer, String> getProperties() {
		return properties;
	}
	
	public HashMap<Integer, HashSet<String>> getStatesLabels() {
		return state_labels;
	}

	public HashSet<Transition> getTransitions() {
		return transitions;
	}

	public HashMap<String, RequirementDescription> getRequirements_description() {
		return requirements_description;
	}

	public HashMap<String, Integer> getControl_events_id() {
		return actions_id;
	}

	public Integer getNumberOfStates() {
		return states.size();
	}

	public HashMap<Integer, String> getId_control_events() {
		return id_control_events;
	}

	public HashMap<String, Integer> getExogenous_events_id() {
		return exogenous_events_id;
	}

	public HashMap<Integer, String> getId_exogenous_events() {
		return id_exogenous_events;
	}

	public HashSet<String> getControl_events() {
		return actions;
	}

	public void setControl_events(HashSet<String> control_events) {
		this.actions = control_events;
	}

	public HashMap<Integer, HashSet<Transition>> getCtrl_actions_transitions_map() {
		return actions_transitions_map;
	}

	public HashSet<String> getExogenous_events() {
		return exogenous_events;
	}

	public HashMap<Integer, HashSet<Transition>> getExo_events_transitions_map() {
		return exo_events_transitions_map;
	}

	public HashMap<Integer, HashMap<Integer, Double>> getOccurrence_vectors() {
		return occurrence_vectors;
	}

	public void setControl_events_id(HashMap<String, Integer> control_events_id) {
		this.actions_id = control_events_id;
	}

	public void setExogenous_events_id(HashMap<String, Integer> exogenous_events_id) {
		this.exogenous_events_id = exogenous_events_id;
	}

	public Integer getNbActions() {
		return this.actions.size();
	}

	public HashMap<String, ActionDescription> getActionDescriptions() {
		return this.action_descriptions;
	}
	
	public HashSet<String> getActions() {
		return this.actions;
	}
	
	public Integer getNbTransitions() {
		return nb_of_transitions;
	}
	public int getInitialState(DomainDescription description) {
		setInitialState(description);
		int init  = 0;
		for(int i = 0;i<states.size();i++) {
			if(initial_state.toString().equalsIgnoreCase(states.get(i).toString())) {
				init = i;
			}
		}
		return init;		
	}


	public void print() throws IOException {
		LOGGER.info("Nb of Variable Descriptions: "+this.variables_domain.size()+"\n");
		LOGGER.trace("Variable Descriptions:\n "+this.variables_domain.toString()+"\n");

		LOGGER.info("Total Number of States Based on Variables and Domain Size: "+this.nb_of_states+"\n");
		LOGGER.info("Total Number of Computed States: "+this.states.size()+"\n");

		StringBuilder str = print(states);
		LOGGER.trace(str.toString());

		if(this.states.size()>this.nb_of_states){
			HashMap<Integer,HashMap<String,String>> temp_states = new HashMap<Integer,HashMap<String,String>>();
			HashMap<HashMap<String,String>,Integer> temp_states_id = new HashMap<HashMap<String,String>,Integer>();

			this.generateStatesFromVariables(temp_states, temp_states_id);

			str = print(temp_states);

			LOGGER.trace(str.toString());

			LOGGER.error("Number of computed states exceeds the maximum number of states");
		}


		LOGGER.info("Nb of Action Descriptions: "+this.action_descriptions.size()+"\n");
		//LOGGER.trace("Action Descriptions:\n "+this.action_descriptions.toString()+"\n");		

		LOGGER.info("Nb of Actions: "+this.actions.size()+"\n");

		str = new StringBuilder();
		str.append("Actions:\n");
		for(String action_name:actions) {
			str.append(actions_id.get(action_name)+" "+action_name+"\n");
		}
		LOGGER.trace(str.toString());

		LOGGER.info("Nb of Exogenous Events: "+this.exogenous_events.size()+"\n");

		str = new StringBuilder();
		str.append("Exogenous Events:\n");
		for(String event_name:exogenous_events) {
			str.append(exogenous_events_id.get(event_name)+" "+event_name+"\n");
		}
		LOGGER.trace(str.toString());

		//LOGGER.info("bruno"+this.actions_transitions_map.toString());
		//LOGGER.info("bruno Transitions:\n "+this.transitions.toString()+"\n");
		Iterator<Integer> it = this.actions_transitions_map.keySet().iterator();

		while(it.hasNext()) {
			Integer key = it.next();
			HashSet<Transition> set = actions_transitions_map.get(key);
			
			TreeSet<Transition> treeSet = new TreeSet<Transition>(set);
			int nb_trans = set.size();
			this.nb_of_transitions += nb_trans;

			str = new StringBuilder();
			str.append("Transitions of "+this.id_control_events.get(key)+"\n");
			Transition trans = treeSet.pollFirst();
			while(trans!=null) {
				if(!trans.getDest().equals(trans.getSrc())) {
					str.append("### ");
				}
				str.append(trans.toString()+"\n");
				trans = treeSet.pollFirst();
			}
			LOGGER.trace(str.toString()+"\n");
		}

		it = this.exo_events_transitions_map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			HashSet<Transition> set = exo_events_transitions_map.get(key);
			this.nb_of_transitions += set.size();
			TreeSet<Transition> treeSet = new TreeSet<Transition>(set);

			str = new StringBuilder();
			str.append("Transitions of "+this.id_exogenous_events.get(key)+"\n");
			Transition trans = treeSet.pollFirst();
			while(trans!=null) {
				if(!trans.getDest().equals(trans.getSrc())) {
					str.append("### ");
				}
				str.append(trans.toString()+"\n");
				trans = treeSet.pollFirst();
			}
			LOGGER.trace(str.toString()+"\n");

		}
/*	    //Add at the beginning of the file the init value
		RandomAccessFile f = new RandomAccessFile(new File("/Users/forensics/Desktop/resultat.txt"), "rw");
		f.seek(0); // to the beginning
		String result = states.size()+" "+states.size()+ " "+nb_of_transitions+"\n";
		f.write(result.getBytes());
		f.close();
*/
		LOGGER.info("Nb of Action Transitions + Nb of Event Transitions: "+this.nb_of_transitions+"\n");
		LOGGER.info("Nb of Transitions: "+this.nb_of_transitions +"\n");

		LOGGER.info("Nb of Requirements: "+this.requirements_description.size()+"\n");
		LOGGER.trace("Requirements:\n "+this.requirements_description.toString()+"\n");

	}

	private StringBuilder print(HashMap<Integer, HashMap<String, String>> temp_states) {
		StringBuilder str = new StringBuilder();
		str.append("States:\n ");

		for(int i =0; i<states.size();i++) {
			str.append("state "+i+" " + states.get(i).toString()+"\n");
		}
		LOGGER.trace(str.toString());
		return str;
	}

}

/*
private void updateTransitions(HashMap<String, Integer> id_events, 
		LinkedList<Integer> to_explore, 
		HashMap<String, String> state, 
		MutableInt state_nb) {

	Iterator<String> it = id_events.keySet().iterator();

	BigDecimal one = new BigDecimal(1);
	while(it.hasNext()) {
		String event = it.next();
		//String event = id_control_events2.get(event_id);
		ActionDescription descr = this.action_description.get(event);
		EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
		EList<ProbabilisticEffect> effects=null;
		for(ContextualEffect contextual_effect : contextual_effects) {
			Formula context = contextual_effect.getContext();
			if(holds(context,state)) {
				effects = contextual_effect.getEffects();
				break;
			}
		}
		if(effects!=null) {
			//updateApplicableMap(event,state_nb.toInteger());

			BigDecimal total_prob = new BigDecimal(0);

			for(ProbabilisticEffect effect : effects) {
				Transition trans = new Transition();
				//trans.updateOrReward(-descr.getCost().intValue());
				trans.setName(event);
				Integer src = states_id.get(state);
				trans.setSrc(src);
				trans.setProbability(effect.getProbability());
				HashMap<String, String> dest_state = getDestinationState(event,state,effect,descr,requirements_description,trans);
				Integer dest_id = updateStates(to_explore,dest_state,state_nb);
				trans.setDest(dest_id);
				trans.setApplicability(Transition.APPLICABLE);
				trans.setId(id_events.get(event));
				transitions.add(trans);
				src_label_dest_transitions_map.put(trans.hashCode(), trans);
				updateTransitions3(Transition.hashCode(src, event),dest_id);
				//addTransition(state,dest_state,event,effect.getProbability(),Transition.APPLICABLE);
				total_prob = total_prob.add(effect.getProbability());
				//System.out.println(total_prob.toString());
			}

 * if the total probability is less than one, then add a self transition with 1 - total_prob

			if(total_prob.compareTo(one)==-1) {
				Transition trans = new Transition();
				//trans.updateOrReward(-descr.getCost().intValue());
				trans.setName(event);
				Integer src = states_id.get(state);
				trans.setSrc(src);

				HashMap<String, String> dest_state = getDestinationState(event,state,null,descr,requirements_description,trans);
				Integer dest_id = updateStates(to_explore,dest_state,state_nb);
				trans.setDest(dest_id);
				trans.setApplicability(Transition.APPLICABLE);
				trans.setProbability(one.subtract(total_prob));
				trans.setId(id_events.get(event));
				transitions.add(trans);
				src_label_dest_transitions_map.put(trans.hashCode(), trans);
				updateTransitions3(Transition.hashCode(src, event),dest_id);

				//addTransition(state,state,event,one.subtract(total_prob),Transition.APPLICABLE);
			}
		} else {
			//updateNotApplicableMap(event,state_nb.toInteger());
			Transition trans = new Transition();
			trans.setName(event);
			Integer src = states_id.get(state);
			trans.setSrc(src);
			trans.setApplicability(Transition.NOTAPPLICABLE);
			HashMap<String, String> dest_state = getDestinationState(event,state,null,descr,requirements_description,trans);
			Integer dest_id = updateStates(to_explore,dest_state,state_nb);
			trans.setDest(dest_id);
			trans.setId(id_events.get(event));
			trans.setProbability(one);
			//trans.setOrReward(-999999999);
			transitions.add(trans);
			src_label_dest_transitions_map.put(trans.hashCode(), trans);
			updateTransitions3(Transition.hashCode(src, event),dest_id);


		}
	}		
}
 */
/*private void updateNotApplicableMap(String event, Integer integer) {
	if(this.not_applicable.containsKey(integer)){
		HashSet<String> set_of_actions = not_applicable.get(integer);
		set_of_actions.add(event);
	} else {
		HashSet<String> set_of_actions = new HashSet<String>();
		set_of_actions.add(event);
		this.not_applicable.put(integer, set_of_actions);
	}		
}*/





/*
private void updateTransitions3(int hashCode, Integer dest_id) {
	if(src_label_nextStates_map.containsKey(hashCode)) {
		HashSet<Integer> t = src_label_nextStates_map.get(hashCode);
		t.add(dest_id);
	} else {
		HashSet<Integer> t = new HashSet<Integer>();
		t.add(dest_id);
		src_label_nextStates_map.put(hashCode, t);
	}
}*/

/*private void updateApplicableMap(String event, Integer stateID) {
	if(this.applicable.containsKey(stateID)){
		HashSet<String> set_of_actions = applicable.get(stateID);
		set_of_actions.add(event);
	} else {
		HashSet<String> set_of_actions = new HashSet<String>();
		set_of_actions.add(event);
		this.applicable.put(stateID, set_of_actions);
	}		
}*/




/*private HashMap<String, String> getDestinationState(String event, 
		HashMap<String, String> state, 
		ProbabilisticEffect effect, 
		ActionDescription descr, 
		HashMap<String, RequirementDescription> requirements_description, 
		Transition trans) {

	HashMap<String, String> dest_state = (HashMap<String, String>) state.clone();
	if(effect!=null) {
		updateStateVariables(dest_state,effect);
		updateReqVariables(dest_state, descr, requirements_description,trans);
	} else {
		updateReqVariables(dest_state, descr, requirements_description,trans);
	}
	return dest_state;

}*/
/*
private void addTransition(HashMap<String, String> state, HashMap<String, String> dest_state,
		String event, BigDecimal prob, boolean b) {
	Transition trans = new Transition(event,states_id.get(state),states_id.get(dest_state),prob,b);
	transitions.add(trans);
	nb_of_transitions.add(1);	
}*/

/*
private boolean applicable(ActionDescription descr, HashMap<String, String> state) {
	Formula precondition = descr.getFormula();
	if(precondition.verify(state)) {
		return true;
	}
	return false;
}*/




/*private void generateStatesFromFluentDescriptions() {

 * number of fluents

	int nb_fluents = variables_domain.size();

 * array index

	MutableInt index = new MutableInt(0);

 * number used as state identifier

	MutableInt state_nb = new MutableInt(0);


 * 1. Create and fill an array of fluent descriptions from fluent_descriptions

	Set<String> keys = variables_domain.keySet();
	Iterator<String> it = keys.iterator();
	ArrayList<StateVariableDescription> fluents_array = new ArrayList<StateVariableDescription>();
	while(it.hasNext()){
		String name = it.next();
		HashSet<String> domain = variables_domain.get(name);
		StateVariableDescription fluent_description = new StateVariableDescription(name,domain);
		fluents_array.add(fluent_description);
	}


 * 2. Create a HashMap<String(fluent),String(value)> to hold the constructed state

	HashMap<String,String> state = new HashMap<String,String>();



 * 3. Call a recursive function to construct the states, 
 * the basic idea of the function is to construct one initial state 
 * and then change the value of one state variable to compute a new state
 * and repeat this until all possibilities are exhausted and all states are computed
 * This function fills both the states and states_id hashmaps

	add(state, fluents_array.get(index.intValue()), fluents_array, index, nb_fluents, state_nb);
	System.out.println("\nnumber of states="+states.size()+"\n");
}

 */


