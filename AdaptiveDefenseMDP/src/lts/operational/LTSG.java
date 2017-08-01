package lts.operational;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.lang.mutable.MutableInt;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionAtom;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionType;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialStateAtom;
import org.emftext.language.AdaptiveCyberDefense.Maintain;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.RequirementAtom;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.impl.ActionAtomImpl;
import org.emftext.language.AdaptiveCyberDefense.impl.ActionDescriptionImpl;
import org.emftext.language.AdaptiveCyberDefense.impl.ActionVariableImpl;
import org.emftext.language.AdaptiveCyberDefense.impl.FalseImpl;
import org.emftext.language.AdaptiveCyberDefense.impl.TrueImpl;

import resources.StateVariableDescription;
import resources.RequirementDescription;
import resources.Transition;

/**
 * 
 * @author yehia
 *
 */
public class LTSG {

	public static final String FULL = "full";
	public static final String INITIAL = "initial";

	/**
	 * Fluent Description:
	 *  Mapping variable_name --> Domain(variable) 
	 */
	protected HashMap<String, HashSet<String>> variables_domain = new HashMap<String, HashSet<String>> ();

	/**
	 * req_type:
	 *  Mapping requirement_name --> Type(requirement) 
	 */
	//protected HashMap<String,String> req_type = new HashMap<String, String>() ;

	/** LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<Integer,HashMap<String,String>> states = new HashMap<Integer,HashMap<String,String>> ();

	/**
	 * Applicable actions:
	 *  Mapping state_id --> set of action_names
	 */
	//protected HashMap<Integer,HashSet<String>> applicable = new HashMap<Integer,HashSet<String>>();
	/**
	 * NotApplicable actions:
	 *  Mapping state_id --> action_name
	 */
	//protected HashMap<Integer,HashSet<String>> not_applicable = new HashMap<Integer,HashSet<String>>();

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
	//protected HashSet<Transition> control_transitions = new HashSet<Transition>();
	//protected HashSet<Transition> exogenous_transitions = new HashSet<Transition>();
	//protected HashSet<Transition> exploit_transitions = new HashSet<Transition>();

	/**
	 * Initial State
	 */
	protected HashMap<String,String> initial_state = new HashMap<String,String>();

	protected HashMap<String, Integer> id_control_events = new HashMap<String,Integer>();

	protected HashMap<String, Integer> id_exploit_events = new HashMap<String,Integer>();

	protected HashMap<String, Integer> id_exogenous_events = new HashMap<String,Integer>();

	/*
	 * event_description:
	 * Map between an event (the toString() of the action described in an action description) and the action description itself
	 */
	protected HashMap<String,ActionDescription> event_description = new HashMap<String,ActionDescription>();

	private Integer nb_of_states=1;
	private Integer nb_of_control_events=0;
	private Integer nb_of_exploit_events=0;
	private Integer nb_of_exogenous_events=0;
	private MutableInt nb_of_transitions = new MutableInt(0);

	//double[][][] dreward_matrix,areward_matrix;
	//double[][][] dtransition_matrix,atransition_matrix;

	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements_description = new HashMap<String,RequirementDescription>();

	public LTSG(DomainDescription description, String option) {
		/*
		 *  Initialize
		 */
		initialize(description);

		/*
		 * (1) Read state variables 
		 * (2) Read requirements 
		 * (3) Read event descriptions
		 * (4) Generate the state space
		 * (5) Generate Transitions
		 */
		if(option.equals(FULL)) {

			generateStatesFromFluentDescriptions();

			//createDRewardAndTransitionMatrices(this.nb_of_states,this.nb_of_control_events,this.nb_of_exploit_events);

			generateTransitions(this.requirements_description);
		}

		else if(option.equals(INITIAL)) {
			setInitialState(description);

			generateLTSFromInitialState();
		}
	}

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
		 * a link list to add the states whose outgoing transitions should be explored
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
			/*
			 * iterate over actions, for every action, test if the action is executable, i.e.,
			 * its precondition holds. If true, then calculate the resulting state and add it to the toExplore list
			 * Also add this state to the maps states and id_states
			 */
			updateTransitions(id_control_events,to_explore,state,state_nb);
			updateTransitions(id_exploit_events,to_explore,state,state_nb);
			updateTransitions(id_exogenous_events,to_explore,state,state_nb);

		}
	}

	private void updateTransitions(HashMap<String, Integer> id_events, 
			LinkedList<Integer> to_explore, 
			HashMap<String, String> state, 
			MutableInt state_nb) {
		Iterator<String> it = id_events.keySet().iterator();

		BigDecimal one = new BigDecimal(1);
		while(it.hasNext()) {
			String event = it.next();
			//String event = id_control_events2.get(event_id);
			ActionDescription descr = this.event_description.get(event);
			if(applicable(descr,state)) {
				//updateApplicableMap(event,state_nb.toInteger());
				EList<ProbabilisticEffect> effects = descr.getProbabilisticeffect();
				BigDecimal total_prob = new BigDecimal(0);
				for(ProbabilisticEffect effect : effects) {
					Transition trans = new Transition();
					trans.setName(event);
					trans.setSrc(state_nb.toInteger());
					trans.setProbability(effect.getProbability());
					HashMap<String, String> dest_state = getDestinationState(event,state,effect,descr,requirements_description,trans);
					Integer dest_id = updateStates(to_explore,dest_state,state_nb);
					trans.setDest(dest_id);
					trans.setApplicable(Transition.APPLICABLE);
					transitions.add(trans);
					//addTransition(state,dest_state,event,effect.getProbability(),Transition.APPLICABLE);
					total_prob = total_prob.add(effect.getProbability());
					//System.out.println(total_prob.toString());
				}
				/*
				 * if the total probability is less than one, then add a self transition with 1 - total_prob
				 */

				if(total_prob.compareTo(one)==-1) {
					Transition trans = new Transition();
					trans.setName(event);
					trans.setSrc(state_nb.toInteger());
					HashMap<String, String> dest_state = getDestinationState(event,state,null,descr,requirements_description,trans);
					trans.setDest(state_nb.toInteger());
					trans.setApplicable(Transition.APPLICABLE);
					trans.setProbability(one.subtract(total_prob));
					addTransition(state,state,event,one.subtract(total_prob),Transition.APPLICABLE);
				}
			} else {
				//updateNotApplicableMap(event,state_nb.toInteger());
				Transition trans = new Transition();
				trans.setName(event);
				trans.setSrc(state_nb.toInteger());
				trans.setApplicable(Transition.NOTAPPLICABLE);
			}
		}		
	}

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

	private Integer updateStates(LinkedList<Integer> to_explore, HashMap<String, String> dest_state, MutableInt state_nb) {
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

	private void setInitialState(DomainDescription description) {
		for(InitialStateAtom atom : description.getInitial_atoms()) {
			if(atom.getClass().toString().endsWith("StateAtomImpl")) {
				StateAtom satom = (StateAtom) atom;
				this.initial_state.put(satom.getStatevariable().getName(), satom.getValue());
			} else if(atom.getClass().toString().endsWith("RequirementAtomImpl")) {
				RequirementAtom ratom = (RequirementAtom) atom;
				this.initial_state.put(ratom.getRequirement().getName(), ratom.getStatus().getLiteral());
			}
		}
		Iterator<String> it = requirements_description.keySet().iterator();
		while(it.hasNext()){
			String reqID = it.next();
			//RequirementDescription descr = requirements_description.get(reqID);
			if(!initial_state.containsKey(reqID)){
				initial_state.put(reqID, "inact");
			}
		}
	}

	private void initialize(DomainDescription description) {
		readStateVariables(description.getState_variables());
		readRequirements(description.getRequirements());	
		addNoOpActions();
		readActionDescriptions(description.getAction_descriptions());
	}

	private void addNoOpActions() {
		/*
		 * Create a noop action description
		 */
		ActionDescription descr = new ActionDescriptionImpl();
		ActionAtom event = new ActionAtomImpl();
		ActionVariable var = new ActionVariableImpl();
		/*
		 * set preconditions
		 */
		descr.setFormula(new TrueImpl());
		/*
		 * set cost
		 */
		descr.setCost(new BigDecimal(0));

		var.setName("dnoop");		
		var.setType(ActionType.CONTROL);
		event.setActionvariable(var);
		event.setValue("tt");
		descr.setActionatom(event);
		String ev = descr.getActionatom().getActionvariable().getName() + "=" + descr.getActionatom().getValue();

		this.id_control_events.put(ev,nb_of_control_events);
		this.event_description.put(ev, descr);
		this.nb_of_control_events++;	

		var.setName("anoop");		
		var.setType(ActionType.EXPLOIT);
		event.setActionvariable(var);
		event.setValue("tt");
		descr.setActionatom(event);
		ev = descr.getActionatom().getActionvariable().getName() + "=" + descr.getActionatom().getValue();

		this.id_exploit_events.put(ev,nb_of_exploit_events);
		this.event_description.put(ev, descr);
		this.nb_of_exploit_events++;	
	}


	/*private void createDRewardAndTransitionMatrices(Integer nb_of_states, Integer nb_of_control_events, Integer nb_of_exploit_events) {
		dreward_matrix = new double[states.size()][states.size()][nb_of_control_events];
		areward_matrix = new double[states.size()][states.size()][nb_of_exploit_events];

		dtransition_matrix = new double[states.size()][states.size()][nb_of_control_events];
		atransition_matrix = new double[states.size()][states.size()][nb_of_exploit_events];
	}*/

	private void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		for(ActionDescription action : action_descriptions) {
			//action.getCost();
			String event = action.getActionatom().getActionvariable().getName() + "=" + action.getActionatom().getValue();

			if(action.getActionatom().getActionvariable().getType().getLiteral().equals("exploit")){
				this.id_exploit_events.put(event,nb_of_exploit_events);
				this.event_description.put(event, action);
				this.nb_of_exploit_events++;
				//System.out.println(event);
			} else if(action.getActionatom().getActionvariable().getType().getLiteral().equals("exogenous")) {
				this.id_exogenous_events.put(event,nb_of_exogenous_events);
				this.event_description.put(event, action);
				this.nb_of_exogenous_events++;
				//System.out.println(event);
			} else {
				this.id_control_events.put(event,nb_of_control_events);
				this.event_description.put(event, action);
				this.nb_of_control_events++;
				//System.out.println(event);
			};
		}

	}

	private void generateTransitions(HashMap<String, RequirementDescription> requirements_description) {
		/*
		 * (1) Iterate Over All States
		 * (2) Iterate over all control, exogenous and exploit events and update the transition and reward matrix accordingly
		 * (*) Notice that when the event is a control event then only the dreward and dtransition are updated
		 * (2.1) If there is an effect law of an event that is applicable, then apply it
		 * (2.2) If there is an effect law that is not applicable, then it is a self transition in the transition matrix
		 */

		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer state_id = it.next();
			HashMap<String, String> state = states.get(state_id);

			addTransitions(id_control_events,state);
			addTransitions(id_exploit_events,state);
			addTransitions(id_exogenous_events,state);

		}
	}

	private void addTransitions(HashMap<String, Integer> id_control_events2, HashMap<String, String> state) {
		Iterator<String> it_control = id_control_events2.keySet().iterator();
		while(it_control.hasNext()) {
			String event = it_control.next();
			//String event = id_control_events2.get(event_id);
			ActionDescription descr = this.event_description.get(event);
			/*
			 * A transition is defined for every two states and event label has 
			 * (1) a name (event label), 
			 * (2) a boolean representing the applicability of the event, 
			 * (3) a source state,
			 * (4) a destination state,
			 * (5) a transition probability,
			 * (6) a reward
			 */

			if(applicable(descr,state)) {
				EList<ProbabilisticEffect> effects = descr.getProbabilisticeffect();
				BigDecimal total_prob = new BigDecimal(0);
				BigDecimal one = new BigDecimal(1);
				for(ProbabilisticEffect effect : effects) {
					Transition trans = new Transition();
					trans.setName(event);
					trans.setSrc(states_id.get(state));
					trans.setProbability(effect.getProbability());
					trans.setApplicable(Transition.APPLICABLE);
					HashMap<String, String> dest_state = getDestinationState(event,state,effect,descr,requirements_description,trans);
					total_prob.add(effect.getProbability());
					trans.setDest(states_id.get(dest_state));

					transitions.add(trans);
					nb_of_transitions.add(1);	
					//addTransition(state,dest_state,event,effect.getProbability(),Transition.APPLICABLE);
				}
				/*
				 * if the total probability is less than one, then add a self transition with 1 - total_prob
				 */
				if(total_prob.compareTo(one)==-1) {
					Transition trans = new Transition(event,states_id.get(state),states_id.get(state),one.subtract(total_prob),Transition.APPLICABLE);
					transitions.add(trans);
					nb_of_transitions.add(1);
				}
			}
		}		
	}

	private HashMap<String, String> getDestinationState(String event, 
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

	}

	private void addTransition(HashMap<String, String> state, HashMap<String, String> dest_state,
			String event, BigDecimal prob, boolean b) {
		Transition trans = new Transition(event,states_id.get(state),states_id.get(dest_state),prob,b);
		transitions.add(trans);
		nb_of_transitions.add(1);	
	}
	

	private void updateReqVariables(HashMap<String, String> temp,  
			ActionDescription descr, 
			HashMap<String, RequirementDescription> requirements_description, 
			Transition trans) {
		temp.put(descr.getActionatom().getActionvariable().getName(), descr.getActionatom().getValue());
		Iterator<String> it = requirements_description.keySet().iterator();
		RequirementDescription req;
		while(it.hasNext()) {
			String reqID = it.next();
			req = requirements_description.get(reqID);
			if(req.getType().equals("maintain")) {
				updateMaintainReqAtomInState(temp,req,descr,trans);
			} else {
				updateAchieveReqAtomInState(temp,req,descr,trans);
			}
		}
		temp.remove(descr.getActionatom().getActionvariable().getName());
	}

	private void updateAchieveReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req, 
			ActionDescription descr, 
			Transition trans) {
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
				trans.updateReward(req.getCost_reward());
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("act-0")){
					state.put(req_id, "inact");
					/*
					 * Violation and reward update
					 */
					trans.updateReward(-req.getCost_reward());
				} else {
					Integer remainingTime = new Integer(status.substring(4));
					state.put(req_id, "act-"+(remainingTime-1));
				}
			}
		} 
	}

	private void updateMaintainReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req, 
			ActionDescription descr, 
			Transition trans) {
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
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("act-0")){
					state.put(req_id, "req-"+(req.getDuration()-1));
				} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
					Integer remainingTime = new Integer(status.substring(4));
					state.put(req_id, "act-"+(remainingTime-1));
				}
			}
		} 

		if(status.startsWith("req-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "inact");
			} else if(!req.getCondition().verify(state)) {
				state.put(req_id, "inact");
				/*
				 * Violation and reward update
				 */
				trans.updateReward(-req.getCost_reward());
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("req-0")){
					state.put(req_id, "inact");
					/*
					 * Satisfaction and reward update
					 */
					trans.updateReward(req.getCost_reward());
				} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
					Integer remainingTime = new Integer(status.substring(4));
					state.put(req_id, "req-"+(remainingTime-1));
				}
			}
		} 

	}

	private void updateStateVariables(HashMap<String, String> temp, ProbabilisticEffect effect) {
		EList<StateAtom> atoms = effect.getStateatoms();

		for(StateAtom atom : atoms) {
			String var = atom.getStatevariable().getName();
			temp.put(var, atom.getValue());
		}		
	}

	private boolean applicable(ActionDescription descr, HashMap<String, String> state) {
		Formula precondition = descr.getFormula();
		if(precondition.verify(state)) {
			return true;
		}
		return false;
	}

	private void readRequirements(EList<OperationalRequirement> requirements) {
		for(OperationalRequirement requirement : requirements) {
			String name = requirement.getName();
			HashSet<String> domain = new HashSet<String>();

			//System.out.println(name);
			RequirementDescription descr = new RequirementDescription();
			descr.setName(name);
			descr.setCondition(requirement.getCondition());
			descr.setCost_reward(requirement.getCost());
			descr.setDeadline(requirement.getDeadline());
			/**
			 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
			 */
			for(int i=0; i< requirement.getDeadline(); i++) {
				domain.add("act-"+i);
			}

			if( requirement.getActivation() != null) {
				descr.setActivation(requirement.getActivation());
				domain.add("inact");
			} else {
				/**
				 * if no activation then the requirement is unconditional and should be always active hence true is used as activation condition
				 */
				descr.setActivation(new TrueImpl());
			}

			if(requirement.getCancellation() != null) {
				descr.setCancellation(requirement.getCancellation());
			} else {
				/**
				 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
				 */
				descr.setCancellation(new FalseImpl());
			}


			if(requirement.getClass().getName().equals("org.emftext.language.AdaptiveCyberDefense.impl.MaintainImpl")){
				//this.req_type.put(name, "maintain");
				//System.out.println(requirement.getClass().getName());
				Maintain req = (Maintain) requirement;
				descr.setDuration(req.getDuration());
				descr.setType("maintain");
				/**
				 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
				 */
				for(int i=0; i< req.getDuration(); i++) {
					domain.add("req-"+i);
				}

			} else {
				descr.setType("achieve");
				//req_type.put(name, "achieve");
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

	public HashMap<Integer, HashMap<String, String>> getStates() {
		return states;
	}

	public HashSet<Transition> getTransitions() {
		return transitions;
	}

	public HashMap<String, Integer> getId_control_events() {
		return id_control_events;
	}

	public HashMap<String, Integer> getId_exploit_events() {
		return id_exploit_events;
	}

	public HashMap<String, RequirementDescription> getRequirements_description() {
		return requirements_description;
	}

	public void print() {
		System.out.println("\n\n\n\t\t*********  Printing LTS  ***************\n\n");
		System.out.println("Nb of fluent Descriptions: "+this.variables_domain.size()+"\n");
		System.out.println("Fluent Descriptions:\n "+this.variables_domain.toString()+"\n");
		System.out.println("Requirement Descriptions:\n "+this.requirements_description.toString()+"\n");

		System.out.println("Total Number of States:\n "+this.nb_of_states+"\n");

		System.out.println("Nb of Action Descriptions: "+this.event_description.size()+"\n");
		System.out.println("Action Descriptions:\n "+this.event_description.toString()+"\n");

		System.out.println("Nb of States to Explore: "+this.states.size()+"\n");
		System.out.println("States:\n "+this.states.toString()+"\n");

		System.out.println("Nb of Transitions: "+this.transitions.size()+"\n");
		System.out.println("Transitions:\n "+this.transitions.toString()+"\n");

		//System.out.println("Nb of Requirements: "+this.requirements.size()+"\n");
		//System.out.println("Requirements:\n "+this.requirements.toString()+"\n");


		System.out.println("\n\n\t\t*********  End Printing LTS  ***************\n\n\n");

	}

}
