package main;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.swing.JTextPane;

import org.apache.commons.lang.mutable.MutableInt;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateAtom;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import lts.operational.LTSG;
import lts.operational.ReqStateUpd;
import resources.ComputeRwd;
import resources.RequirementDescription;
import resources.StateVariableDescription;


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
	public static String reqName = "Name : \t\t";
	public static String reqRew = "Reward : \t\t";
	public static String reqTotal = "Total : \t\t";
	public static String reqDescr = "Description : ";
	public static String reqStatus = "Status : \t\t";
	
	static LTSG2 lts2;
	static DomainDescription description2;
	
	public static void main(String[] args) throws Exception {
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
		String[] argument5 = {"5.mix1.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		String[] argument6 = {"5.mix.AdaptiveCyberDefense", "/Users/forensics/Desktop/REact/","/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/",str};
		
		//Use LTSG2 the copy of LTSG to retrieve all the states
		Path domain_description_location2 = Paths.get("/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/5.mix1.AdaptiveCyberDefense"); 
		try {
			description2 = loadTextual(domain_description_location2);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String files_location = "/Users/forensics/Documents/GraphivFilesReact/";
		lts2 = new LTSG2(description2,generationOption,output,files_location);
		
		REact react = new REact();
		react.main(argument6);
		
		//Retrieve useful value form REact for Scenario1
		double[] policy = {4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 1.0, 4.0, 4.0, 17.0, 4.0, 16.0, 1.0, 13.0, 1.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 16.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 4.0, 2.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 12.0, 3.0, 3.0, 12.0, 3.0, 12.0, 12.0, 12.0, 12.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 1.0, 15.0, 3.0, 14.0, 3.0, 3.0, 3.0, 3.0, 9.0, 9.0, 9.0, 9.0, 9.0, 9.0, 9.0, 9.0, 9.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 8.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0, 3.0};
		HashMap<String, ActionDescription> actions = react.getActions2();
		HashMap<String, Integer> action_id = react.getActionsId2();
		HashMap<Integer, HashMap<String, String>> reactStates = lts2.getStates();
		EList<EventDescription> eventDescription = react.getEvent2();
		HashMap<String, RequirementDescription> requirement_description = react.getRequirementsDesciptions2();
		
		//Retrieve useful value form REact for Scenario2
		double[] policy1 = react.getPolicy();
		HashMap<String, ActionDescription> actions1 = react.getActions();
		HashMap<String, Integer> action_id1 = react.getActionsId();
		HashMap<Integer, HashMap<String, String>> reactStates1 = react.getStates();	
		EList<EventDescription> eventDescription1 = react.getEvent();
		HashMap<String, RequirementDescription> requirement_description1 = react.getRequirementsDesciptions();

	for(int i = 0;i<3;i++) {
		//Variables
		int indexState = 0;
		clic = false;
		actionName = "";
		exoEventName = "";
		currentRew = new BigDecimal(0);
		totalRew = new BigDecimal(0);
		reqName = "Name : \t\t";
		reqRew = "Reward : \t\t";
		reqTotal = "Total : \t\t";
		reqDescr = "Description : ";
		reqStatus = "Status : \t\t";
		String initialState = "location=table2, table1=empty, table2=ready";
		for(int j = 0;j<reactStates.size();j++) {
			if(reactStates.get(j).toString().substring(1, reactStates.get(j).toString().length()-1).contains(initialState)) {
				indexState = j;
			}
		}
		stateNameInit = indexState + "-"+reactStates.get(indexState);
		for( Entry<String, RequirementDescription> reqDescr : requirement_description.entrySet()) {
			RequirementDescription req = reqDescr.getValue();
			reqName = reqName +req.getName()+"\t\t";
		}
		

		Window.main(args);
		
		//Scenario 1
		reqDescr = reqDescr + "Customer paid in table2 (50)\t"+ "Food for table1 in preparation (1000)";
		Simu(args, policy, indexState, initialState, actions,action_id,reactStates,eventDescription,requirement_description);
		
		//Scenario 2
		reqDescr = "Description : Table2 empty in 2 steps (500)\tTable1 delivered in 10 steps (1000)";
		String initialState2 = "location=table2, table1=in_preparation, table2=delivered";
		Simu(args, policy1, indexState, initialState2, actions1,action_id1,reactStates1,eventDescription1,requirement_description1);
		Thread.sleep(1);
	}
	}
	
	public static void Simu(String[] args, double[] policy, int indexState, String initialState, HashMap<String, ActionDescription> actions, HashMap<String, Integer> action_id, HashMap<Integer, HashMap<String, String>> reactStates, EList<EventDescription> eventDescription, HashMap<String, RequirementDescription> requirement_description) throws InterruptedException {
		//Output
			int max = 45;
			int simul = 0;
			if(initialState.equals("location=table2, table1=empty, table2=ready")) {
				simul = 0;
			}
			else {
				max = 15;
			}
			EList<ProbabilisticEffect> effects=null;
				System.out.print("\t|\tAgent\t\t|");
				for(EventDescription d : eventDescription) {
					System.out.print("Event : "+ d.getName()+"\t|");
				}
				System.out.println("\tStates\t\t\t\t|");
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				//Find the initial state number
				for(int i = 0;i<reactStates.size();i++) {
					if(reactStates.get(i).toString().substring(1, reactStates.get(i).toString().length()-1).contains(initialState)) {
						indexState = i;
					}
				}
				System.out.println("Init\t\t\t\t\t\t\t\t\t\t|"+indexState+"-"+reactStates.get(indexState).toString());

				//Draw the initial state
				stateNameInit = indexState + "-"+reactStates.get(indexState);
				//for( Entry<String, RequirementDescription> reqDescr : requirement_description.entrySet()) {
				//	RequirementDescription req = reqDescr.getValue();
				//	reqName = reqName +req.getName()+"\t\t";
				//}
				//Window.main(args);

				int[] tabCumul  = new int[requirement_description.size()];
				
				//For each action in the policy
				for(int act = 1; act<max;act++) {
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
					String[] status = new String[requirement_description.size()];
					for( Entry<String, RequirementDescription> reqDescr : requirement_description.entrySet()) {
						RequirementDescription req = reqDescr.getValue();
						tabRew[i] = ComputeRwd.reward(req, reactStates.get(currentIndex), reactStates.get(indexState));
						currentRew = currentRew.add(ComputeRwd.reward(req, reactStates.get(currentIndex), reactStates.get(indexState)));
						tabCumul[i] = tabCumul[i] + tabRew[i].intValue();

						String req_id = req.getName();
						status[i] = reactStates.get(currentIndex).get(req_id);
						i++;
					}
					reqStatus = "Status : \t\t"+ status[0] +"\t\t"+ status[1];
					reqTotal = "Total : \t\t"+ tabCumul[0]+"\t\t"+tabCumul[1];
					reqRew = "Reward : \t\t"+ tabRew[0].toString()+"\t\t"+tabRew[1].toString();
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
					if(simul==0) {
						if(reactStates.get(currentIndex).toString().contains("location=table2, table1=in_preparation, table2=paid")) {
							act = 46;
						}
					}
				}
	}
	
	//If an event occur on the mouse, run this function
	public static void leftClickAction(ActionEvent e, JCanvas jc, JCanvas panelPicture, JTextPane rewardText, JTextPane reqNameText, JTextPane reqRewText, JTextPane total, JTextPane status, JTextPane reqDescrText) {
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
		status.setText(reqStatus);
		panelPicture.add(status);
		reqDescrText.setText(reqDescr);
		panelPicture.add(reqDescrText);
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
	
	
	public static DomainDescription loadTextual(Path configPath) throws IOException{
		new AdaptiveCyberDefenseMetaInformation().registerResourceFactory();
		ResourceSet resourceSet = new ResourceSetImpl();
		String temp = "/"+configPath.toString();
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);
		//AdaptiveCyberDefenseResourceFactory factory = new AdaptiveCyberDefenseResourceFactory();
		//Resource res = factory.createResource(org.eclipse.emf.common.util.URI.createURI("http://www.emftext.org/language/AdaptiveCyberDefense/True"));
		return description;
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
	
	protected HashMap<String, HashSet<String>> variables_domain = new LinkedHashMap<String, HashSet<String>> ();
	private static ArrayList<StateVariableDescription> fluents_array = new ArrayList<StateVariableDescription>();
	static String generationOption = LTSG.FULL;
	public static int output = 0;
	
}

