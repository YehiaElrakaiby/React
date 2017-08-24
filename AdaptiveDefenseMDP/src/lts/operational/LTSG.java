package lts.operational;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.commons.lang.mutable.MutableInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.Achieve;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.Maintain;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.UnconditionalMaintain;

import main.AdaptiveDefenseMDP;
import resources.RequirementDescription;
import resources.Reward;
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
	
	/**
	 * Fluent Description:
	 *  Mapping variable_name --> Domain(variable) 
	 */
	protected HashMap<String, HashSet<String>> variables_domain = new HashMap<String, HashSet<String>> ();

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
	//protected HashMap<Integer,Transition> src_label_dest_transitions_map = new HashMap<Integer,Transition>();
	//protected HashMap<Integer,HashSet<Integer>> src_label_nextStates_map = new HashMap<Integer,HashSet<Integer>>();

	

	
	/**
	 * Control and Exogenous Events 
	 */
	protected HashSet<String> control_events = new HashSet<String>();
	protected HashMap<String, Integer> control_events_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_control_events = new HashMap<Integer, String>();
	protected HashMap<Integer, HashSet<Transition>> ctrl_actions_transitions_map = new HashMap<Integer, HashSet<Transition>>();

	protected HashSet<String> exogenous_events = new HashSet<String>();
	protected HashMap<String, Integer> exogenous_events_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_exogenous_events = new HashMap<Integer, String>();
	protected HashMap<Integer, HashSet<Transition>> exo_events_transitions_map = new HashMap<Integer, HashSet<Transition>>();
	protected HashMap<Integer, HashMap<Integer,Double>> occurrence_vectors = new HashMap<Integer, HashMap<Integer,Double>> ();
	
	
	/**
	 *  Rewards
	 */
	protected HashSet<Reward> rewards = new HashSet<Reward>();

	private final static Logger LOGGER = LogManager.getRootLogger();

	public LTSG(DomainDescription description, String option) {
		/*
		 *  Initialize
		 */
		initialize(description);
		LOGGER.info("The LTS is initialized");


		/*
		 * (1) Read state variables 
		 * (2) Read requirements 
		 * (3) Read event descriptions
		 * (4) Generate the state space
		 * (5) Generate Transitions
		 */
		//if(option.equals(FULL)) {

		//generateStatesFromFluentDescriptions();

		//generateTransitions(this.requirements_description);
		//}

		if(option.equals(INITIAL)) {
			setInitialState(description);
			LOGGER.info("The initial state is set");

			generateLTSFromInitialState();
			LOGGER.info("The LTS is generated");

		}
	}

	/*
	 * 				INITIALIZATION PART
	 */
	private void initialize(DomainDescription description) {
		readStateVariables(description.getState_variables());
		addNoOpAction();
		readActionDescriptions(description.getAction_descriptions());
		readEventDescriptions(description.getEvent_descriptions());
		readRequirements(description.getRequirements());	
	}
	private void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		for(ActionDescription action : action_descriptions) {
			String name = action.getName() + "=" + action.getValue();

			this.control_events.add(name);
			this.control_events_id.put(name,nb_of_control_events);
			this.id_control_events.put(nb_of_control_events,name);
			this.ctrl_actions_transitions_map.put(nb_of_control_events, new HashSet<Transition>());

			this.action_descriptions.put(name, action);
			this.nb_of_control_events++;
			//System.out.println(event);

		}

	}
	private void readEventDescriptions(EList<EventDescription> event_descriptions) {
		for(EventDescription action : event_descriptions) {

			String event = action.getName() + "=" + action.getValue();

			this.exogenous_events.add(event);
			this.exogenous_events_id.put(event,nb_of_exogenous_events);
			this.id_exogenous_events.put(nb_of_exogenous_events,event);
			this.exo_events_transitions_map.put(nb_of_exogenous_events, new HashSet<Transition>());
			this.occurrence_vectors.put(nb_of_exogenous_events, new HashMap<Integer,Double>());
			
			this.event_descriptions.put(event, action);
			this.nb_of_exogenous_events++;
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
	private void addNoOpAction() {

		/*
		 * Create a noop action description
		 */
		ActionDescription descr = AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
		EList<ContextualEffect> effects = descr.getContextual_effects();
		

		descr.setName(AdaptiveDefenseMDP.noop_event_identifier);
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

		String ev = AdaptiveDefenseMDP.noop_event_identifier + "=" + descr.getValue();

		this.control_events.add(ev);
		this.control_events_id.put(ev,nb_of_control_events);
		this.id_control_events.put(nb_of_control_events,ev);
		this.ctrl_actions_transitions_map.put(nb_of_control_events, new HashSet<Transition>());

		this.action_descriptions.put(ev, descr);
		this.nb_of_control_events++;	
	}
	private void readRequirements(EList<Requirement> eList) {
		for(Requirement requirement : eList) {
			HashSet<String> domain = new HashSet<String>();
			String name = requirement.getName();
			//System.out.println(name);
			RequirementDescription descr = new RequirementDescription();

			if(requirement.getClass().getName().endsWith(".MaintainImpl")){
				Maintain req = (Maintain) requirement;
				fillMaintainRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".AchieveImpl")){
				Achieve req = (Achieve) requirement;
				fillAchieveRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith(".UnconditionalMaintainImpl")){
				UnconditionalMaintain req = (UnconditionalMaintain) requirement;
				fillUnconditionalMaintainRequirementDescription(req,descr,domain);
			}
			/**
			 * add the requirement to the HashMap requirements_description
			 */
			this.requirements_description.put(name, descr);

			/**
			 * add requirements and their domains to domain variables
			 */
			variables_domain.put(name,domain);

			nb_of_states = nb_of_states * domain.size();
		}
	}
	private void fillUnconditionalMaintainRequirementDescription(
			UnconditionalMaintain req,
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("unconditional");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setCost_reward(req.getCost());

		domain.add("act");
	}
	private void fillAchieveRequirementDescription(
			Achieve req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("achieve");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getCost());

		domain.add("inact");
		if(req.getDeadline()==-1) {
			domain.add("act-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("act-"+i);
			}
		}

	}
	private void fillMaintainRequirementDescription(
			Maintain req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("maintain");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getCost());
		descr.setPerUnitCost(req.getPerUnitCost());


		domain.add("inact");
		if(req.getDeadline()==-1) {
			domain.add("act-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("act-"+i);
			}
		}
		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("req-"+i);
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
			if(var.getClass().toString().endsWith("StateVariableImpl")) {
				StateVariable satom = (StateVariable) var;
				this.initial_state.put(satom.getName(), atom.getValue());
			} else if(var.getClass().toString().endsWith("MaintainImpl") ||var.getClass().toString().endsWith("AchieveImpl")) {
				Maintain ratom = (Maintain) var;
				this.initial_state.put(ratom.getName(), atom.getValue());
			}
		}
		Iterator<String> it = requirements_description.keySet().iterator();
		while(it.hasNext()){
			String reqID = it.next();
			RequirementDescription descr = requirements_description.get(reqID);
			if(!initial_state.containsKey(reqID) && descr.getType()!="unconditional"){
				initial_state.put(reqID, "inact");
			}
		}
	}

	/*
	 * 				LTS States and Transitions Identification PART
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
			updateControlTransitionsFromState(state,state_nb,to_explore);
			updateEventTransitionsFromState(state,state_nb,to_explore);

		}
			
		
	}

	private void updateEventTransitionsFromState(
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
		 * 3) update the reward structure (s,s') if necessary
		 * 4) update the to_explore, states and states_id structures
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
						Reward rew = new Reward();
						
						dst_state.put(descr.getName(), descr.getValue());
						updateReqVariables(dst_state, requirements_description,rew);
						dst_state.remove(descr.getName());						
						
						this.rewards.add(rew);

						Integer dest_id = updateStates(to_explore,dst_state,state_nb);
						
						
						Transition trans = new Transition(event_name,src_id,dest_id,prob);
						event_transitions.add(trans);
						
						total_prob = total_prob.add(effect.getProbability());
						
						//transitions.add(trans);
						//src_label_dest_transitions_map.put(trans.hashCode(), trans);
						//updateTransitions3(Transition.hashCode(src_id, action_name),dest_id);

					}
					if(total_prob.compareTo(one)==-1) {
						HashMap<String, String> dst_state = new HashMap<String, String>(state);
						Reward rew = new Reward();
						
						dst_state.put(descr.getName(), descr.getValue());
						updateReqVariables(dst_state, requirements_description,rew);
						dst_state.remove(descr.getName());
						
						this.rewards.add(rew);

						Integer dest_id = updateStates(to_explore,dst_state,state_nb);

						Transition trans = new Transition(event_name,src_id,dest_id,one.subtract(total_prob));
						event_transitions.add(trans);
						
						//transitions.add(trans);
						//src_label_dest_transitions_map.put(trans.hashCode(), trans);
						//updateTransitions3(Transition.hashCode(src_id, action_name),dest_id);

					}
					break;
				} 
			}
			if(!holds) {
				occurrence_vector.put(src_id, new Double(0));

				HashMap<String, String> dst_state = new HashMap<String, String>(state);
				Reward rew = new Reward();

				dst_state.put(descr.getName(), descr.getValue());
				updateReqVariables(dst_state, requirements_description,rew);
				dst_state.remove(descr.getName());						

				this.rewards.add(rew);

				Integer dest_id = updateStates(to_explore,dst_state,state_nb);

				Transition trans = new Transition(event_name,src_id,dest_id,one);
				event_transitions.add(trans);
			}
		}
	}

	private void updateControlTransitionsFromState(HashMap<String, String> state, MutableInt state_nb, LinkedList<Integer> to_explore) {
		Integer src_id = states_id.get(state);
		/*
		 * iterate over actions, for every action a, 
		 * 
		 * 1) explore every possible destination state (application of every effect)
		 * 1.1) check if a context applies
		 * 1.1.1) yes, explore every application of effects, if an effect exists
		 * 1.1.2) no, create a self-transition
		 * 2) update the transition matrix of a
		 * 3) update the reward structure (s,s') if necessary
		 * 4) update the to_explore, states and states_id structures
		 */
		for( String action_name:this.control_events) {
			ActionDescription descr = this.action_descriptions.get(action_name);
			Integer action_id = control_events_id.get(action_name);
			EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
			HashSet<Transition> action_transitions = this.ctrl_actions_transitions_map.get(action_id);
			BigDecimal one = new BigDecimal(1);
			Boolean holds= false;
			EList<ProbabilisticEffect> effects=null;
			/*
			 * check if a context applies:
			 * if yes, 
			 * 1) effects = the effects associated with the context
			 * 2) set holds to true
			 */
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
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						} 
						
						Reward rew = new Reward();

						dst_state.put(descr.getName(), descr.getValue());
						updateReqVariables(dst_state, requirements_description,rew);
						dst_state.remove(descr.getName());						


						Integer dest_id = updateStates(to_explore,dst_state,state_nb);
						
						
						Transition trans = new Transition(action_name,src_id,dest_id,prob);
						action_transitions.add(trans);
						
						rew.setSrc(src_id);
						rew.setDest(dest_id);
						rewards.add(rew);

						total_prob = total_prob.add(effect.getProbability());
						
						//transitions.add(trans);
						//src_label_dest_transitions_map.put(trans.hashCode(), trans);
						//updateTransitions3(Transition.hashCode(src_id, action_name),dest_id);

					}
					if(total_prob.compareTo(one)==-1) {
						HashMap<String, String> dst_state = new HashMap<String, String>(state);
						Reward rew = new Reward();

						dst_state.put(descr.getName(), descr.getValue());
						updateReqVariables(dst_state, requirements_description,rew);
						dst_state.remove(descr.getName());						


						Integer dest_id = updateStates(to_explore,dst_state,state_nb);

						Transition trans = new Transition(action_name,src_id,dest_id,one.subtract(total_prob));
						action_transitions.add(trans);
						rew.setSrc(src_id);
						rew.setDest(dest_id);
						rewards.add(rew);

						//transitions.add(trans);
						//src_label_dest_transitions_map.put(trans.hashCode(), trans);
						//updateTransitions3(Transition.hashCode(src_id, action_name),dest_id);

					}
					break;
				} 
			}
			if(!holds) {
				HashMap<String, String> dst_state = new HashMap<String, String>(state);
				Reward rew = new Reward();

				dst_state.put(descr.getName(), descr.getValue());
				updateReqVariables(dst_state, requirements_description,rew);
				dst_state.remove(descr.getName());						

				Integer dest_id = updateStates(to_explore,dst_state,state_nb);

				Transition trans = new Transition(action_name,src_id,dest_id,one);
				action_transitions.add(trans);
				rew.setSrc(src_id);
				rew.setDest(dest_id);
				rewards.add(rew);

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
		return dest;
	}

	private void updateReqVariables(HashMap<String, String> temp,  
			HashMap<String, RequirementDescription> requirements_description, 
			Reward rew) {
		Iterator<String> it = requirements_description.keySet().iterator();
		RequirementDescription req;
		while(it.hasNext()) {
			String reqID = it.next();
			req = requirements_description.get(reqID);
			if(req.getType().equals("maintain")) {
				updateMaintainReqAtomInState(temp,req,rew);
			} else if(req.getType().equals("achieve")){
				updateAchieveReqAtomInState(temp,req,rew);
			} else if(req.getType().equals("unconditional")){
				updateUnconditionalReqAtomInState(temp,req,rew);
			}
		}
	}

	private void updateUnconditionalReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req,
			Reward rew) {
		if(req.getCondition().verify(state)) {
			/*
			 * Satisfaction and reward update
			 */
			rew.updateReward(req.getCost_reward());
		} 
	}

	private void updateAchieveReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req, 
			Reward rew) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For an achieve requirement, its status is updated according to activation, cancellation, condition and control actions (time) as follows:
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * (2.3) if control action 
		 * (2.3.1) act-0 then inact (and update reward of transition)
		 * (2.3.2) else control action, then act-(X-1)
		 * 
		 */
		if(status.equals("inact")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "act-"+deadline);
			}
		}

		if(status.startsWith("act-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "inact");
			} else if(req.getCondition().verify(state)) {
				state.put(req_id, "inact");
				/*
				 * Satisfaction and reward update
				 */
				rew.updateReward(req.getCost_reward());
			} else if (status.equals("act-0")){
				state.put(req_id, "inact");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "act-"+(remainingTime-1));
			}

		} 
	}

	private void updateMaintainReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req, 
			Reward rew) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("inact")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "act-"+(deadline-1));
			}
		}

		if(status.startsWith("act-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "inact");
			} else if (req.getCondition().verify(state)) {
				state.put(req_id, "req-"+(req.getDuration()-1));
			} else  if (status.equals("act-0")){
				state.put(req_id, "inact");
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "act-"+(remainingTime-1));
			}
		}

		if(status.startsWith("req-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "inact");
			} else if(!req.getCondition().verify(state)) {
				state.put(req_id, "inact");

			} else if (status.equals("req-0")){
				state.put(req_id, "inact");
				/*
				 * Satisfaction and reward update
				 */
				rew.updateReward(req.getCost_reward());
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "req-"+(remainingTime-1));
			}
		}
	} 


	private void updateStateVariables(HashMap<String, String> temp, ProbabilisticEffect effect) {
		EList<StateAtom> atoms = effect.getState_atoms();

		for(StateAtom atom : atoms) {
			String var = atom.getState_variable().getName();
			temp.put(var, atom.getValue());
		}		
	}
	
	
	/*
	 * 				Getters and Setters PART
	 */
	public HashMap<Integer, HashMap<String, String>> getStates() {
		return states;
	}

	public HashSet<Transition> getTransitions() {
		return transitions;
	}

	public HashMap<String, RequirementDescription> getRequirements_description() {
		return requirements_description;
	}

	/*public HashMap<Integer, Transition> getTransitions2() {
		return src_label_dest_transitions_map;
	}

	public HashMap<Integer, HashSet<Integer>> getTransitions3() {
		return src_label_nextStates_map;
	}*/

	public HashMap<String, Integer> getControl_events_id() {
		return control_events_id;
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
		return control_events;
	}

	public void setControl_events(HashSet<String> control_events) {
		this.control_events = control_events;
	}

	public HashSet<Reward> getRewards() {
		return rewards;
	}

	public HashMap<Integer, HashSet<Transition>> getCtrl_actions_transitions_map() {
		return ctrl_actions_transitions_map;
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
		this.control_events_id = control_events_id;
	}

	public void setExogenous_events_id(HashMap<String, Integer> exogenous_events_id) {
		this.exogenous_events_id = exogenous_events_id;
	}

	public Integer getNbActions() {
		return this.control_events.size();
	}

	public HashMap<String, ActionDescription> getActionDescriptions() {
		return this.action_descriptions;
	}



	public void print() {
		LOGGER.info("Nb of fluent Descriptions: "+this.variables_domain.size()+"\n");
		LOGGER.trace("Fluent Descriptions:\n "+this.variables_domain.toString()+"\n");

		LOGGER.info("Total Number of States:\n "+this.nb_of_states+"\n");

		LOGGER.info("Nb of Action Descriptions: "+this.action_descriptions.size()+"\n");
		LOGGER.trace("Action Descriptions:\n "+this.action_descriptions.toString()+"\n");

		LOGGER.info("Nb of States to Explore: "+this.states.size()+"\n");
		LOGGER.trace("States:\n "+this.states.toString()+"\n");

		LOGGER.info("Nb of Transitions: "+this.transitions.size()+"\n");
		LOGGER.trace("Transitions:\n "+this.transitions.toString()+"\n");

		LOGGER.info("Nb of Control Events: "+this.control_events_id.size()+"\n");
		LOGGER.trace("Controlled Events:\n "+this.control_events_id.toString()+"\n");

		LOGGER.info("Nb of Exogenous Events: "+this.exogenous_events_id.size()+"\n");
		LOGGER.trace("Exogenous Events:\n "+this.exogenous_events_id.toString()+"\n");


		LOGGER.info("Nb of Requirements: "+this.requirements_description.size()+"\n");
		LOGGER.trace("Requirements:\n "+this.requirements_description.toString()+"\n");

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


/*private void generateTransitions(HashMap<String, RequirementDescription> requirements_description) {

 * (1) Iterate Over All States
 * (2) Iterate over all control, exogenous and exploit events and update the transition and reward matrix accordingly
 * (*) Notice that when the event is a control event then only the dreward and dtransition are updated
 * (2.1) If there is an effect law of an event that is applicable, then apply it
 * (2.2) If there is an effect law that is not applicable, then it is a self transition in the transition matrix


	Iterator<Integer> it = states.keySet().iterator();
	while(it.hasNext()){
		Integer state_id = it.next();
		HashMap<String, String> state = states.get(state_id);

		addTransitions(control_events_id,state);
		addTransitions(exogenous_events_id,state);

	}
}*/

/*private void addTransitions(
		HashMap<String, Integer> id_events, 
		HashMap<String, String> state) {
	Iterator<String> it_control = id_events.keySet().iterator();
	while(it_control.hasNext()) {
		String event = it_control.next();
		//String event = id_control_events2.get(event_id);
		ActionDescription descr = this.event_description.get(event);

 * A transition is defined for every two states and event label has 
 * (1) a name (event label), 
 * (2) a boolean representing the applicability of the event, 
 * (3) a source state,
 * (4) a destination state,
 * (5) a transition probability,
 * (6) a reward


		if(applicable(descr,state)) {
			EList<ProbabilisticEffect> effects = descr.getProbabilisticeffect();
			BigDecimal total_prob = new BigDecimal(0);
			BigDecimal one = new BigDecimal(1);
			Integer src = states_id.get(state);
			for(ProbabilisticEffect effect : effects) {
				Transition trans = new Transition();
				trans.setName(event);
				trans.setSrc(src);
				trans.setProbability(effect.getProbability());
				trans.setApplicability(Transition.APPLICABLE);
				HashMap<String, String> dest_state = getDestinationState(event,state,effect,descr,requirements_description,trans);
				total_prob.add(effect.getProbability());
				Integer dest_id= states_id.get(dest_state);
				trans.setDest(dest_id);
				trans.setId(id_events.get(event));
				transitions.add(trans);
				src_label_dest_transitions_map.put(trans.hashCode(), trans);
				updateTransitions3(Transition.hashCode(src, event),dest_id);
				nb_of_transitions.add(1);	

				//addTransition(state,dest_state,event,effect.getProbability(),Transition.APPLICABLE);
			}

 * if the total probability is less than one, then add a self transition with 1 - total_prob

			if(total_prob.compareTo(one)==-1) {
				Transition trans = new Transition();
				trans.setName(event);
				trans.setSrc(src);
				trans.setProbability(one.subtract(total_prob));
				trans.setApplicability(Transition.APPLICABLE);

				HashMap<String, String> dest_state = getDestinationState(event,state,null,descr,requirements_description,trans);
				Integer dest_id = states_id.get(dest_state);
				trans.setId(id_events.get(event));
				transitions.add(trans);
				src_label_dest_transitions_map.put(trans.hashCode(), trans);
				updateTransitions3(Transition.hashCode(src, event),dest_id);


				nb_of_transitions.add(1);
			}
		}
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
}*/

/*private void add(HashMap<String, String> state, 
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
 */


