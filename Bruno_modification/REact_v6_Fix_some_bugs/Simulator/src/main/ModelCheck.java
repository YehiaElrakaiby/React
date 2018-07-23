package main;


import java.io.FileReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Random;

import org.apache.commons.lang.mutable.MutableInt;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;


public class ModelCheck {

	public static void main(String[] args) throws Exception {
		/**
		 * REACT PART
		 */
		
		@SuppressWarnings("resource")
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Choose 0 for MDPToolbox.");
		//System.out.println("Choose 1 for Storm.");
		//System.out.println("Choose 2 for Prism.");
		//String str = sc.nextLine();
		String str = "0";
		
		String[] argument = {"Bruno.1.classical_planning_v05.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		REact react = new REact();
		
		//Run REact
		react.main(argument);
		
		/**
		 * SIMULATOR PART
		 */
		
		//Variables
		LinkedList<Event> eventList = new LinkedList<Event>();
		int indexState = 0;
		String actionName = "";
		EList<ProbabilisticEffect> effects=null;
		States initialState = new States("table1=occupied, location=hallway");
		
		//Retrieve useful value form REact
		double[] policy = react.getPolicy();
		HashMap<String, ActionDescription> actions = react.getActions();
		HashMap<String, Integer> action_id = react.getActionsId();
		HashMap<Integer, HashMap<String, String>> reactStates = react.getStates();	
		EList<EventDescription> eventDescription = react.getEvent();
		double[][][] tm = react.getTm();
		
		//Output
		System.out.print("\t|\tAgent\t\t|");
		for(EventDescription d : eventDescription) {
			System.out.print("Event : "+ d.getName()+"\t|");
		}
		System.out.println("\tStates\t\t\t\t|");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		System.out.print("0\t|");
		//Fin the initial state number
		for(int i = 0;i<reactStates.size();i++) {
			if(reactStates.get(i).toString().substring(1, reactStates.get(i).toString().length()-1).equals(initialState)) {
				indexState = i;
			}
		}
		//For each action in the policy
		for(int act = 1; act<policy.length;act++) {
			int id_action = (int) (policy[indexState] -1);
			//Search the name of the numbered action
			for( Entry<String, Integer> a: action_id.entrySet()) {
				if(action_id.get(a.getKey()) == id_action) {
					actionName = a.getKey();
					System.out.print(action_id.get(a.getKey())+ " "+actionName+"\t|");
				}
			}
			ActionDescription descr = actions.get(actionName);
			EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
			for(ContextualEffect contextual_effect : contextual_effects) {
				//Formula context = contextual_effect.getContext();
				//if(holds(context,reactStates.get(indexState))) {
					effects = contextual_effect.getEffects();
					if(id_action == 0) {
						for(int j = 0; j<policy.length;j++) {
							if(tm[indexState][j][0]!=0 && indexState!=j) {
								Random random = new Random();
								boolean rand = random.nextFloat() <  tm[indexState][j][0];
								if(rand == true) {
									for(EventDescription d : eventDescription) {
										for(ProbabilisticContextualEffect eff : d.getProbabilistic_contextual_effects()) {
											if(eff.getContext().verify(reactStates.get(indexState)))
												System.out.print("Active\t\t\t|");
											else
												System.out.print("Inactive\t\t|");
										}
									}
									indexState = j;
								}
								else 
									System.out.print("Inactive\t\t|Inactive\t\t|");
							}
						}
					}
					for(ProbabilisticEffect effect : effects){
						HashMap<String, String> dst_state = new HashMap<String, String>(reactStates.get(indexState));
						if(effect!=null) {
							updateStateVariables(dst_state,effect);
						}
						//Search the number of the current state
						for(int i = 0; i < reactStates.size(); i++) {
							if(reactStates.get(i).equals(dst_state)) {
								indexState = i;
							}
						}
						indexState = checkExogenousEvent(eventDescription,reactStates,indexState);
					}
				//}
			}
			System.out.print(indexState+"-"+reactStates.get(indexState));
			System.out.print("\n"+act+"\t|");
		}
	}
	
	
	private static int checkExogenousEvent(EList<EventDescription> eventDescription, HashMap<Integer, HashMap<String, String>> reactStates, int indexState) {
		for(EventDescription d : eventDescription) {
			for(ProbabilisticContextualEffect eff : d.getProbabilistic_contextual_effects()) {
				//Check if event can occur
				if(eff.getContext().verify(reactStates.get(indexState))) {
					//decide if it will occur or not
					Random random = new Random();
					boolean rand = random.nextFloat() <  Double.parseDouble(eff.getOccurrence_probability().toString());
					if(rand == true) {
						System.out.print("Active\t\t\t|");
						//if the event occurs then you apply the effects
						for(ProbabilisticEffect e : eff.getEffects()) {
							HashMap<String, String> dst_state = new HashMap<String, String>(reactStates.get(indexState));
							if(e!=null) {
								updateStateVariables(dst_state,e);
							}
							//Search the number of the current state
							for(int i = 0; i < reactStates.size(); i++) {
								if(reactStates.get(i).equals(dst_state)) {
									indexState = i;
								}
							}
							//Search the number of the current state
							for(int i = 0; i < reactStates.size(); i++) {
								if(reactStates.get(i).equals(dst_state)) {
									indexState = i;
								}
							}
						}
					}
					else {
						System.out.print("Inactive\t\t|");
					}
				}
				else {
					System.out.print("Inactive\t\t|");
				}
			}
		}
		return indexState;	
	}
	
	private static void updateStateVariables(HashMap<String, String> temp, ProbabilisticEffect effect) {
		EList<StateAtom> atoms = effect.getState_atoms();

		for(StateAtom atom : atoms) {
			String var = atom.getState_variable().getName();
			temp.put(var, atom.getValue());
		}		
	}
	
	private static boolean holds(Formula context, HashMap<String, String> state) {
		if(context.verify(state)) {
			return true;
		}
		return false;
	}
}

