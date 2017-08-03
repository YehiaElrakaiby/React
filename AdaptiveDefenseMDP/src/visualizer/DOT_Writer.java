package visualizer;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import resources.Transition;


public class DOT_Writer {
	String outputFileName;
	Set<String> fluentsToHide;
	Set<String> fluentsStartingWithToHide;
	Set<String> states_to_show;
	Set<String> policyFluents;
	Boolean show_negated;
	//Boolean show_only_states_in_transition;
	Boolean show_void_transition;
	Boolean show_action_names;
	Boolean show_state_name_in_node;
	//Boolean remove_similar_states;
	Boolean remove_policy_component;
	//String void_transition;
	HashMap<Integer, HashMap<String, String>> states;

	BufferedWriter bw;
	File file;
	private String option = "ap utility req";

	public static final String SHOW_UTIL = "utility";
	public static final String SHOW_AP = "ap";
	public static final String SHOW_REQ = "req";

	public static final String SHOW_UTIL_AP = "utility ap";
	public static final String SHOW_UTIL_REQ = "utility req";
	public static final String SHOW_AP_REQ = "ap req";
	public static final String SHOW_ALL = "utility ap req";


	public DOT_Writer(String pathTographivFile,
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions,
			String option) {
		this.states = states;
		this.transitions = transitions;
		this.outputFileName=pathTographivFile;
		this.show_action_names=true;
		this.show_void_transition=true;
		//this.show_only_states_in_transition=only_show_states_in_transition;
		this.show_negated=false;
		//this.remove_similar_states = remove_similar_states2;
		this.show_state_name_in_node = true;
		//this.remove_policy_component = remove_policy_component;
		//this.fluentsToHide=fluentsToHide2;
		//this.fluentsStartingWithToHide=fluentsStartingWithToHide2;
		//this.states_to_show = states_to_show;
		//this.policyFluents = policyFluents;
		//this.policyTransitions = policyTransitions;
		//findVoidTransition();
		this.option=option;
		file=null;
	}


	public DOT_Writer(String pathTographivFile,
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions) {
		this.states = states;
		this.transitions = transitions;
		this.outputFileName=pathTographivFile;
		this.show_action_names=true;
		this.show_void_transition=true;
		//this.show_only_states_in_transition=only_show_states_in_transition;
		this.show_negated=false;
		//this.remove_similar_states = remove_similar_states2;
		this.show_state_name_in_node = true;
		//this.remove_policy_component = remove_policy_component;
		//this.fluentsToHide=fluentsToHide2;
		//this.fluentsStartingWithToHide=fluentsStartingWithToHide2;
		//this.states_to_show = states_to_show;
		//this.policyFluents = policyFluents;
		//this.policyTransitions = policyTransitions;
		//findVoidTransition();
		file=null;
	}

	public File writeToFile() {

		file = new File(outputFileName);

		//		if(this.show_only_states_in_transition){
		//			remove_states_not_in_transition();
		//		}

		//		if(this.fluentsToHide.size()!=0 || this.fluentsStartingWithToHide.size()!=0 || !this.show_negated){
		//			hide_fluents();
		//		}

		//if(this.remove_similar_states){
		//remove_duplicate_states();
		//}

		//		if(this.remove_policy_component){
		//			remove_policy_component();
		//		}

		//if file does not exist, then create it
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("digraph R {\n");

			writeNodes();
			writeTransitions();

			bw.write("}");
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	public void openFromDesktop(){
		/*
		 * Open file from desktop
		 */
		Desktop dt = Desktop.getDesktop();
		try {
			if(file!=null)dt.open(file);
			else {
				this.writeToFile();
				//dt.open(file);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeNodes() {
		Iterator<Integer> it = states.keySet().iterator();
		while(it.hasNext()){
			Integer stateName = it.next();

			try {
				bw.write(stateName+" [label=\"");

				if(show_state_name_in_node){
					bw.write(stateName+"\\n");
				}

				HashMap<String, String> literals = states.get(stateName);
				Set<String> set = literals.keySet();
			    List<String> list=asSortedList(set);
				for(String fluent_name : list) {
					String value = literals.get(fluent_name);
					if(!filter(fluent_name)) {
						if(value.equals("tt")) {
							bw.write(fluent_name+"\\n");
						} else if(value.equals("ff")) {

						} else {
							bw.write(fluent_name+"="+value+"\\n");
						}
					}
				}
				bw.write("\"]\n");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//		Iterator<State> state = states.iterator();
		//		while(state.hasNext()){
		//			State s = state.next();
		//
		//			String stateName = s.getName();
		//			if(states_to_show.isEmpty() || states_to_show.contains(stateName)){
		//				try {
		//					bw.write(stateName+" [label=\"");
		//
		//					if(show_state_name_in_node){
		//						bw.write(stateName+"\\n");
		//					}
		//
		//					Iterator<FluentConstant> fluent = s.getFluents().iterator();
		//					while(fluent.hasNext()){
		//						FluentConstant f = fluent.next();
		//						bw.write(f.toString()+"\\n");
		//					}
		//					bw.write("\"]\n");
		//
		//				} catch (IOException e) {
		//					// TODO Auto-generated catch block
		//					e.printStackTrace();
		//				}
		//			}
		//		}
	}
	public static
	<T extends Comparable<? super T>> List<T> asSortedList(Collection<T> c) {
	  List<T> list = new ArrayList<T>(c);
	  java.util.Collections.sort(list);
	  return list;
	}
	private boolean filter(String fluent_name) {
		if(this.option.contains("utility") && fluent_name.startsWith("utility")) {
			return false;
		} else if(this.option.contains("ap") && !fluent_name.startsWith("utility") && !fluent_name.startsWith("req")) {
			return false;
		}  else if(this.option.contains("req") && fluent_name.startsWith("req")) {
			return false;
		} 
		return true;
	}
	HashSet<Transition> transitions; 

	private void writeTransitions() {
		for(Transition transition_description : transitions){
			if(transition_description.getApplicability()) {
				Integer src = transition_description.getSrc();
				Integer dst = transition_description.getDest();
				try {
					bw.write(src+" -> "+dst);

					bw.write(" [label=\"");

					bw.write(
							transition_description.getName() +" "
							+ transition_description.getProbability() +" "
							+ transition_description.getReward() +" "
							+"\\n");

					bw.write("\"]\n");

					bw.write("\n");

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}




		//		Iterator<Transition> transition = transitions.iterator();
		//
		//		while(transition.hasNext()){
		//			Transition t = transition.next();
		//			if(this.show_void_transition || !t.getEvent().getName().equals(this.void_transition)){
		//				String src = t.getSrc();
		//				String dst = t.getDest();
		//
		//				if(states_to_show.isEmpty() || (states_to_show.contains(src) && states_to_show.contains(dst))){
		//
		//					try {
		//						bw.write(t.getSrc()+" -> "+t.getDest());
		//						if(this.show_action_names==false){
		//							bw.write("[label="+t.getEvent().getName()+"]");
		//						}
		//						else if (this.show_action_names==true){
		//							bw.write(" [label=\"");
		//							Iterator<ActionConstant> action = t.getEvent().getActions().iterator();
		//
		//							while(action.hasNext()){
		//								if(this.show_negated==true){
		//									bw.write(action.next().toString()+"\\n");
		//								}else 
		//								{
		//									ActionConstant a = action.next();
		//									if(!a.getValue().equals("ff")){
		//										bw.write(a.toString()+"\\n");
		//									}
		//
		//								}
		//							}
		//							bw.write("\"]\n");
		//						}
		//						bw.write("\n");
		//
		//					} catch (IOException e) {
		//						// TODO Auto-generated catch block
		//						e.printStackTrace();
		//					}
		//				}
		//			}
		//		}

	}



	/**
	 * This function removes the policy component of an LTS as follows
	 * 1) remove the policy fluents from the states
	 * 2) remove the policy transitions
	 * 3) Identify similar states and select one identifier to represent them
	 * 4) rewrite transitions 
	 */
	//	private void remove_policy_component() {
	//		/*
	//		 * remove policy fluents
	//		 */
	//		this.remove_policy_fluents();
	//		/*
	//		 * find similar states, create hashMap  state_id1 -> state_id2 where id2 is the name of the state that is equivalent to id1 and represents it 
	//		 * delete the duplicated states
	//		 */
	//		HashMap<String,String> states_map = new HashMap<String,String>();
	//
	//		createHashMapSimilarStatesDeleteDuplicateStates(states_map);
	//
	//		System.out.println("\n\n States Map:\n "+states_map +"\n\n");
	//
	//		/*
	//		 * update the transitions
	//		 */
	//		updateLTSTransitions(states_map);
	//	}

	/**
	 * Updates the transition by updating the source and destination of transitions according to the states_map mappings
	 * removes duplicated transitions if there are two transitions having same source, destination and event
	 * remove policy transitions
	 * @param states_map
	 */
	//	private void updateLTSTransitions(HashMap<String, String> states_map) {
	//
	//		rewriteTransitionsUsingMappings(states_map);
	//
	//		removeDuplicateTransitions();
	//
	//		removePolicyTransitions();
	//
	//	}

	//	private void removePolicyTransitions() {
	//		HashMap<String, Transition> transitions = lts.getTransitions();
	//		 Iterator<String> it = transitions.keySet().iterator();
	//		//Set<Transition> transitions_to_remove = new HashSet<Transition>();
	//
	//		while(it.hasNext()){
	//			String transition_id = it .next();
	//			Transition trans = transitions.get(transition_id);
	//			String actionName = trans.getName();
	//			/*Set<ActionConstant> actions = trans.getEvent().getActions();
	//			Iterator<ActionConstant> it2 = actions.iterator();
	//			while(it2.hasNext()){
	//				ActionConstant actionConstant = it2.next();
	//				if(actionConstant.getValue().equals("tt")){
	//					String actionName = actionConstant.getName();
	//					Iterator<String> it3 = policyTransitions.iterator();
	//					while(it3.hasNext()){
	//						String policyAction = it3.next();
	//						if(actionName.contains(policyAction)){
	//							it.remove();
	//						}
	//
	//					}
	//				}
	//			}*/
	//
	//		}
	//
	//		/*it = transitions.iterator();
	//		while(it.hasNext()){
	//			Transition trans = it.next();
	//			if(transitions_to_remove.contains(trans)){
	//				it.remove();
	//			}
	//		}*/
	//		/*
	//		 * update the LTS
	//		 */
	//		//lts.setTransitions(transitions);
	//
	//
	//
	//	}

	//	private void removeDuplicateTransitions() {
	//		Set<Transition> transitions = lts.getTransitions();
	//		/*
	//		 * Find similar transitions, i.e. same source same destination and same event
	//		 */
	//		Iterator<Transition> it = transitions.iterator();
	//		Set<Transition> transitions_to_remove = new HashSet<Transition>();
	//		while(it.hasNext()){
	//			Transition trans = it .next();
	//			if(!transitions_to_remove.contains(trans)){
	//				Set<Transition> eqSet = getSameTransition(trans); 
	//				transitions_to_remove.addAll(eqSet);
	//			}
	//		}
	//		//System.out.println(transitions_to_remove.toString());
	//
	//		/*
	//		 * remove similar transitions from the LTS
	//		 */
	//		it = transitions.iterator();
	//		while(it.hasNext()){
	//			Transition trans = it.next();
	//			if(transitions_to_remove.contains(trans)){
	//				it.remove();
	//			}
	//		}
	//		/*
	//		 * update the LTS
	//		 */
	//		lts.setTransitions(transitions);
	//
	//	}

	//	private void rewriteTransitionsUsingMappings(
	//			HashMap<String, String> states_map) {
	//
	//		Set<Transition> transitions = lts.getTransitions();
	//
	//		//Set<Transition> new_transitions = new HashSet<Transition>();
	//
	//		Iterator<Transition> it = transitions.iterator();
	//
	//		while(it.hasNext()){
	//			Transition transition = it.next();
	//
	//			String src = transition.getSrc();
	//			String newSrc;
	//			if(states_map.containsKey(src)){
	//				newSrc = states_map.get(src);
	//				transition.setSrc(newSrc);
	//				//System.out.println("new transition: "+transition.toString());
	//
	//			}
	//
	//			String dst = transition.getDest();
	//
	//			if(states_map.containsKey(dst)){
	//				String newDst = states_map.get(dst);
	//				transition.setDest(newDst);
	//				//System.out.println("Rewrite "+dst+" --> "+newDst);
	//
	//			}
	//
	//			//new_transitions.add(transition);
	//			//System.out.println(transitions.toString());
	//
	//			//String newSrc = states_map.get(src);
	//			//System.out.println("Src/newSrc "+src+" / "+newSrc);
	//
	//			//String newDst = states_map.get(dst);
	//			//System.out.println("dst/newDst "+dst+" / "+newDst);
	//
	//		}
	//		//lts.setTransitions(new_transitions);
	//		System.out.println(transitions.toString());
	//
	//
	//	}

	//	private Set<Transition> getSameTransition(Transition trans) {
	//		Set<Transition> set = new HashSet<Transition>();
	//		Iterator<Transition> it = lts.getTransitions().iterator();
	//		while(it.hasNext()){
	//			Transition t = it.next();
	//			if(!t.getName().equals(trans.getName())
	//					&& t.getDest().equals(trans.getDest()) 
	//					&& t.getSrc().equals(trans.getSrc())
	//					&& t.getEvent().getName().equals(trans.getEvent().getName())){
	//				set.add(t);
	//				System.out.println("Transition "+ trans.toString() + " is equivalent to "+ set.toString());
	//
	//			}
	//		}
	//		return set;
	//	}

	/**
	 * Goes through the states, determines for each state s its set of equivalent states SE, and maps every state in SE to s
	 * @param states_map: a map each state in the LTS to an equivalent state
	 */
	//	private void createHashMapSimilarStatesDeleteDuplicateStates(HashMap<String, String> states_map) {
	//
	//		/*
	//		 * used to store the names of the states that should be removed
	//		 */
	//		Set<State> states_to_remove = new HashSet<State>();
	//
	//		Set<State> states =  lts.getStates();
	//
	//		Iterator<State> it1 = states.iterator();
	//
	//		System.out.println("\n\n Finding Equivalent States\n" );
	//
	//		while(it1.hasNext()){
	//			State s = it1.next();
	//			if(!states_to_remove.contains(s)){
	//				/*
	//				 * This state is mapped to itself since it was not yet visited
	//				 */
	//				//states_map.put(s.getName(), s.getName());
	//				//System.out.println("Equivalent of "+s.getName()+" "+s.getName());
	//
	//				Set<State> SE = get_similar_states(s, lts.getStates());
	//
	//				System.out.println("Equivalent of "+s.getName()+" "+SE.toString());
	//
	//				Iterator<State> it2 = SE.iterator();
	//
	//				while(it2.hasNext()){
	//					State se = it2.next();
	//					/*
	//					 * Each equivalent state in SE is mapped to the state s
	//					 * each equivalent state is removed from the lts
	//					 */
	//					states_map.put(se.getName(), s.getName());
	//					//System.out.println("Equivalent of "+se.getName()+" "+s.getName());
	//					states_to_remove.add(se);
	//					//System.out.println("To remove "+se.getName());
	//
	//				}
	//			} 
	//		}
	//		/*
	//		 * update the lts
	//		 */
	//		for(State state : states_to_remove){
	//			lts.removeState(state);
	//		}
	//		System.out.println("\nStates after removal of duplicates: "+ lts.getStates().toString()+"\n\n");
	//		//lts.setStates(states);
	//	}

	//	private void remove_duplicate_states (){
	//		Set<State> states = lts.getStates();
	//		Iterator<State> it1 = states.iterator();
	//
	//		while(it1.hasNext()){
	//			State s = it1.next();
	//			Set<State> SE = get_similar_states(s, lts.getStates());
	//			System.out.println("Equivalent of "+s.getName()+" "+SE.toString());
	//
	//			/*
	//			 *  1) find path(s) from s to its similar states in SE, i.e. e1;...;en
	//			 *  2) replace transitions from (se, ek, s'') BY (s, e1;...;en; ek, s'')  
	//			 */
	//			Iterator<State> ti = SE.iterator();
	//			while(ti.hasNext()){
	//
	//				State tar = ti.next();
	//				Set<ArrayList<Event>> Paths = findPaths(s,tar);
	//				System.out.println("paths from "+s.getName()+"to "+tar.getName()+": "+ Paths.toString());
	//
	//				/*
	//				 * Given the source and destination states and the Paths between the two
	//				 * the replace function updates the LTS
	//				 * Why and How
	//				 * 1) one idea is to find all outgoing transitions of the similar and replace it with path...outgoingEvent
	//				 * 2) model all paths as self transitions!
	//				 * The thing is why should we do it in the first place? Shall we add the state identifier next to the path to show that it
	//				 * is not the same state but a similar from which the transition is initiated? 
	//				 */
	//				replaceTransitions(s,tar,Paths);
	//
	//			}
	//		}
	//	}

	//	private Set<ArrayList<Event>> findPaths(State s, State tar) {
	//		Set<ArrayList<Event>> Paths = new HashSet<ArrayList<Event>>();
	//		Set<State> visited = new HashSet<State>();
	//		ArrayList<Event> path = new ArrayList<Event>();
	//		exploreOutgoingTransitions(s,tar,visited,path,Paths);
	//		return Paths;
	//	}

	//	private void exploreOutgoingTransitions(State cs, State tar, Set<State> visited, ArrayList<Event> path, Set<ArrayList<Event>> paths) {
	//		/*
	//		 * Add the current state cs to visited
	//		 */
	//		visited.add(cs);
	//
	//		/*
	//		 * find the outgoing transitions TE from cs (OK)
	//		 */
	//		Set<Transition> TE= findOutgoingTransitions(cs);
	//
	//		/*
	//		 * check each transition, if there are any
	//		 */
	//
	//		Iterator<Transition> ti2 = TE.iterator();
	//		while(ti2.hasNext()){
	//			Transition t = ti2.next();
	//			/*
	//			 *  explore the transition
	//			 */
	//			exploreTransition(cs, tar, visited, path, paths, t);
	//		}
	//	}



	//	private void exploreTransition(State cs, State tar, Set<State> visited, ArrayList<Event> path, 
	//			Set<ArrayList<Event>> paths, Transition t) {
	//
	//		/*
	//		 * find destination state of transition "dest" from its name
	//		 */
	//		State dest = findStateFromName(t.getDest());
	//
	//		/*
	//		 * Case 1: the transition destination is the target
	//		 */
	//		if(t.getDest().equals(tar.getName())){
	//			path.add(t.getEvent());
	//			ArrayList<Event> newpath = new ArrayList<Event>();
	//			newpath.addAll(path);
	//			paths.add(newpath);
	//			path.remove(t.getEvent());
	//		}
	//
	//		/*
	//		 * Case 2: the transition destination has been visited
	//		 */
	//		else if(contains(visited,dest)){
	//
	//		}
	//
	//		/*
	//		 * Case 3: the transition destination has not been visited and is not the target
	//		 */
	//		else {
	//			//THere is probably a problem with the visited.add method as it does sometimes not add the state to visited!!!
	//			visited.add(dest);
	//			path.add(t.getEvent());
	//			exploreOutgoingTransitions(dest, tar, visited, path, paths);
	//			path.remove(t.getEvent());
	//		}
	//
	//	}

	//	private boolean contains(Set<State> visited, State dest) {
	//		boolean found = false;
	//		Iterator<State> i = visited.iterator();
	//		while(i.hasNext()){
	//			State s = i.next();
	//			if(s.getName().equals(dest.getName())){
	//				found = true;
	//			}
	//		}
	//		return found;
	//	}

	//	private Set<Transition> findOutgoingTransitions(State cs) {
	//		Set<Transition> transitions = lts.getTransitions();
	//		Set<Transition> TE = new HashSet<Transition>();
	//
	//		Iterator<Transition> ti = transitions.iterator();
	//
	//		while(ti.hasNext()){
	//			Transition t = ti.next();
	//
	//			/*
	//			 *  find destination state of the transitions from their name (OK)
	//			 *  to compare it with the source and target states
	//			 */
	//			Iterator<State> it = lts.getStates().iterator();
	//			boolean found = false;
	//			State dest = null;
	//			while(it.hasNext() && !found){
	//				dest = it.next();
	//				if(dest.getName().equals(t.getDest())){
	//					found = true;
	//				}
	//			}
	//			/*
	//			 * if a) the transition source is the current state and b)
	//			 * it is not a self transition and the destination of the
	//			 * transition has not been visited then add it to TE (OK)
	//			 */
	//			if(t.getSrc().equals(cs.getName())){
	//				TE.add(t);
	//			}
	//		}
	//		return TE;
	//	}

	//	private State findStateFromName(String destName) {
	//		Iterator<State> it = lts.getStates().iterator();
	//		State dest = null;
	//		boolean found = false;
	//		while(it.hasNext() && !found){
	//			dest = it.next();
	//			if(dest.getName().equals(destName)){
	//				found = true;
	//			}
	//		}
	//		return dest;
	//	}

	//	private void findVoidTransition() {
	//		// TODO Auto-generated method stub
	//		Iterator<Event> j = lts.getEvents().iterator();
	//		while(j.hasNext()){
	//			Event ev = j.next();
	//			Iterator<ActionConstant> i = ev.getActions().iterator();
	//			Boolean test=true;
	//			while(i.hasNext()){
	//
	//				if(!i.next().getValue().equals("ff")){
	//					test=false;
	//				}
	//			}
	//			if(test==true){
	//				this.void_transition=ev.getName();
	//				//System.out.println(this.void_transition);
	//				break;
	//			}
	//
	//
	//		}
	//
	//
	//	}


	//	private void replaceTransitions(State s, State tar,
	//			Set<ArrayList<Event>> paths) {
	//		// TODO Auto-generated method stub
	//
	//	}
	//
	//
	//	private Set<State> get_similar_states(State s, Set<State> states) {
	//		Set<State> SE = new HashSet<State>();
	//		Iterator<State> it2 = states.iterator();
	//		while(it2.hasNext()){
	//			State se = it2.next();
	//			if(!se.getName().equals(s.getName()) && s.equalsFluents(se)){
	//				SE.add(se);
	//			}
	//		}
	//		return SE;
	//	}


	//	private void hide_fluents() {
	//		/*
	//		 * 1) Iterate over the different states, 
	//		 * 		a) if a state contains one of the fluents to hide then remove this fluent from the state
	//		 *	 	b) if a state contains a fluent which starts with a string in fluentsStartingWithToHide, then remove the fluent from the state
	//		 * 		c) if the option show_negated is false and the value of the fluent is "ff" then remove the fluent from he state
	//		 * 2) update the LTS
	//		 */
	//		Set<State> states= lts.getStates();
	//		Iterator<State> s = states.iterator();
	//		while(s.hasNext()){
	//			State cs = s.next();
	//			Set<FluentConstant> fluents = cs.getFluents();
	//			Iterator<FluentConstant> f = fluents.iterator();
	//			while(f.hasNext()){
	//				FluentConstant cf = f.next();
	//				String fname = cf.getName();
	//				if(fluentsToHide.contains(fname)){
	//					f.remove();
	//				} else {
	//					if(cf.getValue().equals("ff")&&this.show_negated==false){
	//						f.remove();
	//					} else {
	//						Iterator<String> j = this.fluentsStartingWithToHide.iterator();
	//						while(j.hasNext()){
	//							String fsw = j.next();
	//							if(fname.startsWith(fsw)){
	//								f.remove();
	//							}
	//						}
	//					}
	//				}
	//			}
	//		}
	//	}

	//	private void remove_policy_fluents() {
	//		/*
	//		 * 1) Iterate over the different states, 
	//		 *	 	if a state contains a fluent which starts with a string in policyFluents, then remove the fluent from the state
	//		 * 2) update the LTS
	//		 */
	//		Set<State> states= lts.getStates();
	//		Iterator<State> s = states.iterator();
	//		while(s.hasNext()){
	//			State cs = s.next();
	//			Set<FluentConstant> fluents = cs.getFluents();
	//			Iterator<FluentConstant> f = fluents.iterator();
	//			while(f.hasNext()){
	//				FluentConstant cf = f.next();
	//				String fname = cf.getName();
	//				if(policyFluents.contains(fname)){
	//					f.remove();
	//				} else {
	//					if(cf.getValue().equals("ff")&&this.show_negated==false){
	//						f.remove();
	//					} else {
	//						Iterator<String> j = this.policyFluents.iterator();
	//						while(j.hasNext()){
	//							String fsw = j.next();
	//							if(fname.startsWith(fsw)){
	//								f.remove();
	//							}
	//						}
	//					}
	//				}
	//			}
	//		}
	//	}

	//	private void remove_states_not_in_transition() {
	//		/*
	//		 * If the states not in transition should be hidden, then 
	//		 * 1) find these states (states which do not appear as a destination in any transition)
	//		 * 2) remove these states from states  
	//		 * 3) remove any transitions from these states to other states 
	//		 * 4) update the LTS
	//		 */
	//		Set<State> states= lts.getStates();
	//		Set<Transition> transitions=lts.getTransitions();
	//		Iterator<State> s;
	//		Iterator<Transition> t;
	//		Set<String> states_not_in_transition = new HashSet<String>();
	//
	//		/*
	//		 * 1) find these states (states which do not appear as a destination in any transition)
	//		 */
	//		s = states.iterator();
	//		while(s.hasNext()){
	//			String sname = s.next().getName();
	//			Boolean found=false;
	//			t = transitions.iterator();
	//			while(t.hasNext()){
	//				if(sname.equals(t.next().getDest())){
	//					found=true;
	//				}	
	//			}
	//			if(!found){
	//				states_not_in_transition.add(sname);
	//			}
	//		}
	//		/*
	//		 * 2) remove these states from states 
	//		 */
	//		s= states.iterator();
	//		while(s.hasNext()){
	//			State cs = s.next();
	//			if(states_not_in_transition.contains(cs.getName())){
	//				s.remove();
	//			}
	//		}
	//		/*
	//		 * 3) remove any transitions from these states to other states
	//		 */
	//		t= transitions.iterator();
	//		while(t.hasNext()){
	//			Transition ct = t.next();
	//			if(states_not_in_transition.contains(ct.getSrc())){
	//				t.remove();
	//			}
	//		}
	//		/*
	//		 * 4) Update the lts
	//		 */
	//		lts.setStates(states);
	//		lts.setTransitions(transitions);
	//
	//	}


	//	public String getInitialState() {
	//		return initialState;
	//	}
	//
	//	public void setInitialState(String initialState) {
	//		this.initialState = initialState;
	//	}

	public String getOutputFileName() {
		return outputFileName;
	}

	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}

	public Set<String> getFluentsToHide() {
		return fluentsToHide;
	}

	public void setFluentsToHide(Set<String> fluentsToHide) {
		this.fluentsToHide = fluentsToHide;
	}

	public void addFluentToHide(String fluentToHide) {
		this.fluentsToHide.add(fluentToHide);
	}

	public void addFluentStartingWithToHide(String fluentToHide) {
		this.fluentsStartingWithToHide.add(fluentToHide);
	}

	public Boolean getShow_negated() {
		return show_negated;
	}

	public void setShow_negated(Boolean show_negated) {
		this.show_negated = show_negated;
	}

	//	public Boolean getShow_only_states_in_transition() {
	//		return show_only_states_in_transition;
	//	}
	//
	//	public void setShow_only_states_in_transition(
	//			Boolean show_only_states_in_transition) {
	//		this.show_only_states_in_transition = show_only_states_in_transition;
	//	}

	public Boolean getshow_void_transition() {
		return show_void_transition;
	}

	public void setshow_void_transition(Boolean show_void_transition) {
		this.show_void_transition = show_void_transition;
	}

	public Boolean getShow_action_names() {
		return show_action_names;
	}

	public void setShow_action_names(Boolean show_action_names) {
		this.show_action_names = show_action_names;
	}

}


