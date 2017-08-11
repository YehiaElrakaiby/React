package lts.operational;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.apache.commons.lang.mutable.MutableInt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.Achieve;
import org.emftext.language.AdaptiveCyberDefense.ActionAtom;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionType;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.InitialAtom;
import org.emftext.language.AdaptiveCyberDefense.InitialVariable;
import org.emftext.language.AdaptiveCyberDefense.Maintain;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.UnconditionalMaintain;

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
	 * LTS States:
	 *  Mapping state_id --> set of literals
	 */
	protected HashMap<HashMap<String,String>,Integer> states_id = new HashMap<HashMap<String,String>,Integer>();

	/**
	 *  LTS Transitions
	 *  Mapping transition_id --> Transition(name,src,dest,prob)
	 */
	protected HashSet<Transition> transitions = new HashSet<Transition>();
	protected HashMap<Integer,Transition> src_label_dest_transitions_map = new HashMap<Integer,Transition>();
	protected HashMap<Integer,HashSet<Integer>> src_label_nextStates_map = new HashMap<Integer,HashSet<Integer>>();

	/**
	 * Initial State
	 */
	protected HashMap<String,String> initial_state = new HashMap<String,String>();

	protected HashMap<String, Integer> control_events_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_control_events = new HashMap<Integer, String>();

	protected HashMap<String, Integer> exogenous_events_id = new HashMap<String,Integer>();
	protected HashMap<Integer, String> id_exogenous_events = new HashMap<Integer, String>();

	/*
	 * event_description:
	 * Map between an event (the toString() of the action described in an action description) and the action description itself
	 */
	protected HashMap<String,ActionDescription> event_description = new HashMap<String,ActionDescription>();

	private Integer nb_of_states=1;
	private Integer nb_of_control_events=0;
	private Integer nb_of_exogenous_events=0;
	private MutableInt nb_of_transitions = new MutableInt(0);

	/**
	 * Requirements:
	 * Mapping requirement id to requirement description
	 */
	HashMap<String,RequirementDescription> requirements_description = new HashMap<String,RequirementDescription>();

	private final static Logger LOGGER = LogManager.getRootLogger();
	
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
			updateTransitions(control_events_id,to_explore,state,state_nb);
			updateTransitions(exogenous_events_id,to_explore,state,state_nb);

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
				Transition trans = new Transition();
				trans.updateOrReward(-descr.getCost().intValue());
				trans.setName(event);
				Integer src = states_id.get(state);
				trans.setSrc(src);
				for(ProbabilisticEffect effect : effects) {
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
				/*
				 * if the total probability is less than one, then add a self transition with 1 - total_prob
				 */
				if(total_prob.compareTo(one)==-1) {
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
				if(trans.getApplicability()) {
					try {
						throw new Exception("problem");
					} catch (Exception e) {
						LOGGER.error("ERROR");
						e.printStackTrace();
					}
				}
				trans.setId(id_events.get(event));
				transitions.add(trans);
				src_label_dest_transitions_map.put(trans.hashCode(), trans);
				//updateTransitions3(Transition.hashCode(src, event),dest_id);


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

	private void updateTransitions3(int hashCode, Integer dest_id) {
		if(src_label_nextStates_map.containsKey(hashCode)) {
			HashSet<Integer> t = src_label_nextStates_map.get(hashCode);
			t.add(dest_id);
		} else {
			HashSet<Integer> t = new HashSet<Integer>();
			t.add(dest_id);
			src_label_nextStates_map.put(hashCode, t);
		}
	}

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
		ActionDescription descr = AdaptiveCyberDefenseFactory.eINSTANCE.createActionDescription();
		ActionAtom event = AdaptiveCyberDefenseFactory.eINSTANCE.createActionAtom();
		ActionVariable var = AdaptiveCyberDefenseFactory.eINSTANCE.createActionVariable();
		/*
		 * set preconditions
		 */
		descr.setFormula(AdaptiveCyberDefenseFactory.eINSTANCE.createTrue());
		/*
		 * set cost
		 */
		descr.setCost(new BigDecimal(0));
		var.setName("dnoop");		
		var.setType(ActionType.CONTROL);
		event.setActionvariable(var);
		event.setValue("tt");
		descr.setActionatom(event);
		//System.out.println(	descr.getActionatom().getActionvariable().getType().getLiteral());
		String ev = descr.getActionatom().getActionvariable().getName() + "=" + descr.getActionatom().getValue();

		this.control_events_id.put(ev,nb_of_control_events);
		this.id_control_events.put(nb_of_control_events,ev);

		this.event_description.put(ev, descr);
		this.nb_of_control_events++;	
	}

	private void readActionDescriptions(EList<ActionDescription> action_descriptions) {
		for(ActionDescription action : action_descriptions) {
			//action.getCost();
			String event = action.getActionatom().getActionvariable().getName() + "=" + action.getActionatom().getValue();

			if(action.getActionatom().getActionvariable().getType().getLiteral().equals("exogenous")) {
				this.exogenous_events_id.put(event,nb_of_exogenous_events);
				this.id_exogenous_events.put(nb_of_control_events,event);

				this.event_description.put(event, action);
				this.nb_of_exogenous_events++;
				//System.out.println(event);
			} else {
				this.control_events_id.put(event,nb_of_control_events);
				this.id_control_events.put(nb_of_control_events,event);

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

			addTransitions(control_events_id,state);
			addTransitions(exogenous_events_id,state);

		}
	}

	private void addTransitions(HashMap<String, Integer> id_events, HashMap<String, String> state) {
		Iterator<String> it_control = id_events.keySet().iterator();
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
				/*
				 * if the total probability is less than one, then add a self transition with 1 - total_prob
				 */
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
	/*
	private void addTransition(HashMap<String, String> state, HashMap<String, String> dest_state,
			String event, BigDecimal prob, boolean b) {
		Transition trans = new Transition(event,states_id.get(state),states_id.get(dest_state),prob,b);
		transitions.add(trans);
		nb_of_transitions.add(1);	
	}*/


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
			} else if(req.getType().equals("achieve")){
				updateAchieveReqAtomInState(temp,req,descr,trans);
			} else if(req.getType().equals("unconditional")){
				updateUnconditionalReqAtomInState(temp,req,descr,trans);
			}
		}
		temp.remove(descr.getActionatom().getActionvariable().getName());
	}

	private void updateUnconditionalReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req,
			ActionDescription descr, Transition trans) {
		if(req.getCondition().verify(state)) {
			/*
			 * Satisfaction and reward update
			 */
			trans.updateOrReward(req.getCost_reward());
		} else if(!req.getCondition().verify(state)) {
			/*
			 * Satisfaction and reward update
			 */
			trans.updateOrReward(-req.getCost_reward());
		}
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
				trans.updateOrReward(req.getCost_reward());
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("act-0")){
					state.put(req_id, "inact");
					/*
					 * Violation and reward update
					 */
					trans.updateOrReward(-req.getCost_reward());
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
			} else if (req.getCondition().verify(state)) {
				state.put(req_id, "req-"+(req.getDuration()-1));
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("act-0")){
					state.put(req_id, "inact");
					/*
					 * Violation and reward update
					 */
					trans.updateOrReward(-req.getCost_reward());
				} else  {
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
				trans.updateOrReward(-req.getCost_reward());
			} else if (descr.getActionatom().getActionvariable().getType().getLiteral().equals("control")) {
				if (status.equals("req-0")){
					state.put(req_id, "inact");
					/*
					 * Satisfaction and reward update
					 */
					trans.updateOrReward(req.getCost_reward());
				} else {
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
			HashSet<String> domain = new HashSet<String>();
			String name = requirement.getName();
			//System.out.println(name);
			RequirementDescription descr = new RequirementDescription();

			if(requirement.getClass().getName().endsWith("MaintainImpl")){
				Maintain req = (Maintain) requirement;
				fillMaintainRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith("AchieveImpl")){
				Achieve req = (Achieve) requirement;
				fillAchieveRequirementDescription(req,descr,domain);
			} else 	if(requirement.getClass().getName().endsWith("UnconditionalMaintainImpl")){
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

	public HashMap<String, RequirementDescription> getRequirements_description() {
		return requirements_description;
	}

	public HashMap<Integer, Transition> getTransitions2() {
		return src_label_dest_transitions_map;
	}

	public HashMap<Integer, HashSet<Integer>> getTransitions3() {
		return src_label_nextStates_map;
	}



	public void print() {
		LOGGER.info("Nb of fluent Descriptions: "+this.variables_domain.size()+"\n");
		LOGGER.trace("Fluent Descriptions:\n "+this.variables_domain.toString()+"\n");

		LOGGER.info("Total Number of States:\n "+this.nb_of_states+"\n");

		LOGGER.info("Nb of Action Descriptions: "+this.event_description.size()+"\n");
		LOGGER.trace("Action Descriptions:\n "+this.event_description.toString()+"\n");

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

	public HashMap<String, Integer> getControl_events_id() {
		return control_events_id;
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

}
