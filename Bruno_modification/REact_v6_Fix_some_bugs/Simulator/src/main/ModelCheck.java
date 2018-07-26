package main;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import javax.swing.JTextPane;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;

import lts.operational.ReqStateUpd;
import resources.ComputeRwd;
import resources.RequirementDescription;


public class ModelCheck {

	//Variables used for the gui
	public static Boolean clic = false;
	public static int posY;
	public static String actionName = "";
	public static String stateName;
	public static String stateNameInit;
	public static Boolean isExoEvent = false;
	public static String exoEventName = "";
	public static BigDecimal currentRew = new BigDecimal(0);
	public static BigDecimal totalRew = new BigDecimal(0);
	public static String reqName = "Name : \t";
	public static String reqRew = "Reward : \t";
	public static String reqTotal = "Total : \t";
	
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

		String[] argument1 = {"1.uncertainty.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		String[] argument2 = {"2.exogenous_events.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		String[] argument3 = {"3.prioritisation.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		String[] argument4 = {"4.trade_offs.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		String[] argument5 = {"5.mix.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		
		REact react = new REact();

		//Run REact
		react.main(argument4);


		/**
		 * SIMULATOR PART
		 */

		//Variables
		int indexState = 0;
		EList<ProbabilisticEffect> effects=null;
		String initialState = "location=table1";

		//Retrieve useful value form REact
		//double[] policy = {1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 1.0, 13.0, 1.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 4.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 1.0, 13.0, 1.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 4.0, 13.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 1.0, 13.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 4.0, 1.0, 1.0, 1.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 1.0, 4.0, 4.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 4.0, 2.0, 4.0, 2.0, 4.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0, 2.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 2.0, 2.0, 4.0, 2.0, 4.0, 2.0, 4.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 6.0, 6.0, 6.0, 12.0, 6.0, 12.0, 6.0, 6.0, 6.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 3.0, 12.0, 3.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 3.0, 12.0, 3.0, 6.0, 6.0, 6.0, 6.0, 6.0, 12.0, 6.0, 6.0, 6.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 3.0, 12.0, 3.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 12.0, 12.0, 12.0, 12.0, 6.0, 6.0, 12.0, 6.0, 12.0, 6.0, 6.0, 6.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 12.0, 12.0, 12.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 3.0, 1.0, 15.0, 1.0, 14.0, 3.0, 1.0, 3.0, 1.0, 9.0, 9.0, 9.0, 9.0, 14.0, 9.0, 9.0, 9.0, 9.0, 3.0, 1.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 8.0, 8.0, 8.0, 8.0, 14.0, 8.0, 8.0, 8.0, 8.0, 3.0, 3.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 3.0, 1.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 3.0, 1.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0}; 
		double[] policy = react.getPolicy();
		//for(int i = 0;i<policy.length;i++) {
		//	System.out.print(policy[i]+", ");
		//}
		HashMap<String, ActionDescription> actions = react.getActions();
		HashMap<String, Integer> action_id = react.getActionsId();
		HashMap<Integer, HashMap<String, String>> reactStates = react.getStates();	
		EList<EventDescription> eventDescription = react.getEvent();
		HashMap<String, RequirementDescription> requirement_description = react.getRequirementsDesciptions();

		//Output
		System.out.print("\t|\tAgent\t\t|");
		for(EventDescription d : eventDescription) {
			System.out.print("Event : "+ d.getName()+"\t|");
		}
		System.out.println("\tStates\t\t\t\t|");
		System.out.println("---------------------------------------------------------------------------------------------------------------------");
		//Find the initial state number
		for(int i = 0;i<reactStates.size();i++) {
			if(reactStates.get(i).toString().substring(1, reactStates.get(i).toString().length()-1).equals(initialState)) {
				indexState = i;
			}
		}
		System.out.println("Init\t\t\t\t\t\t\t\t\t\t|"+indexState+"-"+reactStates.get(indexState).toString());

		//Draw the initial state
		stateNameInit = indexState + "-"+reactStates.get(indexState);
		for( Entry<String, RequirementDescription> reqDescr : requirement_description.entrySet()) {
			RequirementDescription req = reqDescr.getValue();
			reqName = reqName +req.getName()+"\t\t";
		}
		Window.main(args);
		/*BigDecimal[] tabCumul = new BigDecimal[requirement_description.size()];
		for(int j=0;j<requirement_description.size();j++) {
			tabCumul[j]= new BigDecimal(0);
		}*/
		int[] tabCumul  = new int[requirement_description.size()];
		
		//For each action in the policy
		for(int act = 1; act<45;act++) {
			System.out.print(act+"\t|");
			int id_action = (int) (policy[indexState] -1);
			//Search the name of the numbered action
			for( Entry<String, Integer> a: action_id.entrySet()) {
				if(action_id.get(a.getKey()) == id_action) {
					actionName = a.getKey();
					System.out.print(action_id.get(a.getKey())+ " "+actionName+"\t|");
				}
			}
			int currentIndex = indexState;
			ActionDescription descr = actions.get(actionName);
			EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
			for(ContextualEffect contextual_effect : contextual_effects) {
				effects = contextual_effect.getEffects();
				HashMap<String, String> dst_state = new HashMap<String, String>(reactStates.get(indexState));
				
				BigDecimal tab[] = new BigDecimal[effects.size()];
				int i =0;
				//Store in a table the probability of each effect
				for(ProbabilisticEffect effect : effects){
					tab[i] = effect.getProbability();
					i++;
				}
				//For all of the actions different from the noop action
				if(id_action!=0) {
					//Generate a random number
					Random random = new Random();
					boolean rand = random.nextFloat() <  Double.parseDouble(tab[0].toString());
					//If the random number has the probability of the first effect
					if(rand == true) {
						if(effects.get(0)!=null) {
							updateStateVariables(dst_state,effects.get(0));
						}
						updateReqVariables(dst_state, requirement_description);
					}
					//From the state name, get the id of the state
					for(int j = 0; j < reactStates.size(); j++) {
						if(reactStates.get(j).equals(dst_state)) {
							indexState = j;
						}
					}
				}
				indexState = checkExogenousEvent(eventDescription,reactStates,indexState, requirement_description);
			}

			stateName = indexState+"-"+reactStates.get(indexState);
			BigDecimal[] tabRew = new BigDecimal[requirement_description.size()];
		
			int i =0;
			for( Entry<String, RequirementDescription> reqDescr : requirement_description.entrySet()) {
				RequirementDescription req = reqDescr.getValue();
				tabRew[i] = ComputeRwd.reward(req, reactStates.get(currentIndex), reactStates.get(indexState));
				currentRew = currentRew.add(ComputeRwd.reward(req, reactStates.get(currentIndex), reactStates.get(indexState)));
				tabCumul[i] = tabCumul[i] + tabRew[i].intValue();
				i++;
			}
			reqTotal = "Total : \t"+ tabCumul[0]+"\t\t"+tabCumul[1];
			reqRew = "Reward : \t"+ tabRew[0].toString()+"\t\t"+tabRew[1].toString();
			totalRew = totalRew.add(currentRew);
			System.out.println(stateName);
			boolean done = false;
			while(done!=true) {
				Thread.sleep(1);
				if(clic==true) {
					done =true;
				}
			}
			currentRew = new BigDecimal(0);
			isExoEvent = false;
			clic = false;
			done = false;
		}
	}

	//If an event occur on the mouse, run this function
	public static void leftClickAction(ActionEvent e, JCanvas jc, JCanvas panelPicture, JTextPane rewardText, JTextPane reqNameText, JTextPane reqRewText, JTextPane total) {
		String state = stateName;
		String action = actionName;
		clic = true;
		IDrawable draw = createDrawable(state,action);
		jc.addDrawable(draw);
		panelPicture.removeEventDrawable();
		if(isExoEvent == true) {
			IDrawable event = new EventDrawable(exoEventName);
			panelPicture.addEventDrawable(event);
		}
		IDrawable picture = new PictureDrawable(state);
		panelPicture.addPictureDrawable(picture);
		rewardText.setText("Total Reward : "+totalRew+"    Current Reward : "+currentRew);
		panelPicture.add(rewardText);
		reqRewText.setText(reqRew);
		panelPicture.add(reqRewText);
		total.setText(reqTotal);
		panelPicture.add(total);
	}

	//Draw the new transition
	public static IDrawable createDrawable(String state, String action) {
		if(isExoEvent ==true) {
			posY = posY + 100;
		}else {
			posY = posY + 50;}
		Point p = new Point(); 
		p.setLocation(20, posY);
		Dimension dim = new Dimension(500, 20);
		return new FormDrawable(Color.BLACK, p, dim, state, action, isExoEvent, exoEventName);

	}
	
	//Draw the new transition
		public static void createExogenousDrawable(String state, String action) {
			if(isExoEvent ==true) {
				posY = posY + 100;
			}else {
				posY = posY + 50;}
			Point p = new Point(); 
			p.setLocation(20, posY);
			Dimension dim = new Dimension(500, 20);
			new FormDrawable(Color.BLACK, p, dim, state, action, isExoEvent, exoEventName);

		}

	private static int checkExogenousEvent(EList<EventDescription> eventDescription, 
			HashMap<Integer, 
			HashMap<String, String>> reactStates, 
			int indexState, 
			HashMap<String, RequirementDescription> requirement_description) {
		for(EventDescription d : eventDescription) {
			for(ProbabilisticContextualEffect eff : d.getProbabilistic_contextual_effects()) {
				//Check if event can occur
				if(eff.getContext().verify(reactStates.get(indexState))) {
					//decide if it will occur or not
					Random random = new Random();
					boolean rand = random.nextFloat() <  Double.parseDouble(eff.getOccurrence_probability().toString());
					if(rand == true) {
						isExoEvent = true;
						System.out.print("Active\t\t\t|");
						exoEventName = d.getName();
						//if the event occurs then you apply the effects
						for(ProbabilisticEffect e : eff.getEffects()) {
							HashMap<String, String> dst_state = new HashMap<String, String>(reactStates.get(indexState));
							if(e!=null) {
								updateStateVariables(dst_state,e);
							}
							updateReqVariables(dst_state, requirement_description);
							
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

	public static void drawInitialState(JCanvas jc) {
		Dimension dim = new Dimension(500, 20);
		Point p = new Point(); 
		posY = 20;
		p.setLocation(20, posY);
		IDrawable draw = new FormDrawable(Color.RED, p, dim, stateNameInit,"",isExoEvent, exoEventName);
		jc.addDrawable(draw);	
	}
	
	private static void updateReqVariables(HashMap<String, String> state,  
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

	public static void drawInitialPoint(JCanvas panelPicture, JTextPane reqNameText) {
		IDrawable picture = new PictureDrawable(stateNameInit);
		panelPicture.addPictureDrawable(picture);
		reqNameText.setText(reqName);
		panelPicture.add(reqNameText);
	}
}

