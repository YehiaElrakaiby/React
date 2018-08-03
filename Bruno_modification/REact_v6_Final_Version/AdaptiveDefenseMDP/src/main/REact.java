package main;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextPrinter;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

import lts.operational.LTSG;
import mdp.MDPSolver;
import resources.RequirementDescription;
import visualizer.Graphviz_Writer;


public class REact implements REactInterface {
	/** This AdaptiveDefenseMDP class is the main class:
	 * 			Input: a domain description in the form of the emfText DSL specification file
	 * 			Output: a MDP solution, that is the optimal action to take in every possible state
	 * 			Procedure:
	 * 				1) the input is transformed into a LTS so that it can be visualized
	 * 				2) the transition matrix and the reward matrix are computed
	 * 				3) MDPToolBox is used to solve the MDP problem 
	 */

	/*
	 * 			MAIN CONFIGURATION OPTIONS
	 */
	//static String descriptionFileName = "toy_example2.AdaptiveCyberDefense";
	//static String descriptionFileName = "example_base_case.AdaptiveCyberDefense";

	static public String dotOption = Graphviz_Writer.SHOW_ALL;

	static String generationOption = LTSG.FULL;
	/*
	 * 			OTHER CONFIGURATION OPTIONS
	 */
	//static String files_location = "/Users/forensics/Documents/GraphivFilesReact/";

	//static Path domain_description_location = Paths.get( "Users","forensics","Documents",
	//		"runtime-EclipseApplication","ReactV5-PaperExamples",
	//		descriptionFileName);

	static public String noop_event_identifier = "noop";
	static public Double discount_factor = 0.98;

	static double averageTime = 0;
	static double averageTimeMDP = 0; 
	public static int output = 0;
	public static double[] finalPolicy;
	public static HashMap<Integer, String> controlEvents;
	public static double[][][] tm;

	/**
	 * Based on the contents of a description:
	 * (1) State Variables,
	 * (2) Attack and Adaptation Action Variables,
	 * (3) Action Descriptions,
	 * (4) Requirements,
	 * (5) Achieve and Maintain Reward Structures
	 * 
	 * Step 1: Construct a LTS based on State, Action Variables, Requirements and Action Descriptions. A LTS is a tuple <States, Transitions>
	 * Step 2: Construct Transition and Reward Matrices based on Transitions and Requirements
	 * Step 3: Construct a MDP = <Transition Matrix, Reward Matrix> and solve the MDP
	 * @param args
	 */

	static String controlStrategyFileName = "";
	static String controlPlanFileName = "";
	static String ltsFileName = "";
	static DomainDescription description;
	static DomainDescription description2;
	static LTSG lts;
	static LTSG lts2;
	static MDPSolver solver;
	static MDPSolver solver2;
	private static Logger LOGGER;

	/**
	 *  Use this function to compute the states, the transitions matrix and the reward matrix.
	 *  Solve the MDP with MDPToolbox
	 *  Generate explicit files for Storm and Prism
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		String descriptionFileName = args[0];
		String files_location = args[1];
		String fileNameLocation = args[2];
		Path domain_description_location = Paths.get( fileNameLocation,descriptionFileName);
		output = Integer.parseInt(args[3]);

		if((output < 0) ||(output>2)){
			output = 0;
		}


		//Performance test : the program is executed 5 times
		//for(int i = 0;i < 5;i++) {

		//Time of the beggining of the program
		long startTime = System.nanoTime();

		/*
		 * 1. Read the Domain Description 
		 */		
		try {
			description = loadTextual(domain_description_location);
			initializeFileNames(description.getName());
			LOGGER.info("domain description loaded");
		} catch (IOException e1) {
			LOGGER.error("domain description load failed"+e1.getMessage());
			e1.printStackTrace();
		}
		
		/*
		 * 1. Read the Domain Description for the second file
		 */		
		Path domain_description_location2 = Paths.get("/Users/forensics/Documents/runtime-EclipseApplication/ReactV5-PaperExamples/5.mix1.AdaptiveCyberDefense"); 
		try {
			description2 = loadTextual(domain_description_location2);
			initializeFileNames(description2.getName());
			LOGGER.info("domain description loaded");
		} catch (IOException e1) {
			LOGGER.error("domain description load failed"+e1.getMessage());
			e1.printStackTrace();
		}
		lts2 = new LTSG(description2,generationOption,output,files_location);
		solver2 = new MDPSolver(lts2.getNumberOfStates(),lts2.getNbActions());

		/*
		 * 2. Build the LTS using State and Action Variables, Action Descriptions and Requirements
		 */
		lts = new LTSG(description,generationOption,output,files_location);
		LOGGER.info("The labeled transition system LTSG created");

		lts.print();
		/*
		 * Initialize the MDPSolver class
		 */
		solver = new MDPSolver(lts.getNumberOfStates(),lts.getNbActions());
		LOGGER.info("The MDP Solver is initialized");

		/*
		 * Build the exogenous events matrix PrE based on the transition matrix of exogenous events PrE1,...,PrEn 
		 */
		double[][] ex_tm = solver.buildExogeousEventsMatrix(lts.getExogenous_events_id(), lts.getOccurrence_vectors(),lts.getExo_events_transitions_map());
		LOGGER.info("The exogenous event matrix PrE = PrE1 x...x PrEn is computed");
		LOGGER.trace("The exogenous event matrix \n"+print(ex_tm));

		/*
		 * Build the implicit transition matrix
		 */
		tm = solver.buildTransitionMatrix(lts.getCtrl_actions_transitions_map(),ex_tm);
		LOGGER.info("The Transition Matrix of the MDP is created");
		//If output is Storm or Prism file
		if(output != 0) {
			print(tm,output,files_location);
		}

		/*
		 * Construct the reward matrix
		 */
		double[][][] rm = solver.buildRewardMatrix(tm, lts.getRequirements_description(),lts.getActionDescriptions(),lts.getId_control_events(),lts.getStates());
		LOGGER.info("The Reward Matrix of the MDP is created");
		//LOGGER.trace("The reward matrix \n"+print(rm));
		//solver.printRewardMatrix();
		//If output is Storm or Prism file
		if(output != 0) {
			printReward(rm,output,files_location);
		}

		solver.checkInput();

		LOGGER.info("The MDP input is checked");

		Graphviz_Writer.create(files_location+ltsFileName, lts.getStates(), lts.getId_control_events(), tm, rm, dotOption);
		LOGGER.info("The LTS Graphviz file is created");

		/*
		 * Solve the MDP and compute the policy and value functions
		 */
		long startTimeMDP = System.nanoTime();

		solver.solveMDP();

		double[] policy = solver.getPolicy();
		double[] value = solver.getValue();
		LOGGER.info("The MDP is solved: The policy and value vectors based on the MDP are computed");

		finalPolicy = policy;

		long endTimeMDP = System.nanoTime();

		double[][] dtmc_tm = new double[policy.length][policy.length];
		double[][] dtmc_rm = new double[policy.length][policy.length];

		Graphviz_Writer.create(files_location+controlStrategyFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Strategy Graphviz file is created");

		Graphviz_Writer.createPlan(files_location+controlPlanFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Plan Graphviz file is created");

		findDTMC(policy,tm,rm,dtmc_tm,dtmc_rm);

		//System.out.println(" DTMC Transitions");
		//System.out.println(print(dtmc_tm));

		//System.out.println(" DTMC Rewards");
		//System.out.println(print(dtmc_rm));

		controlEvents = lts.getId_control_events();

		printDTMC(files_location, dtmc_tm);
		printDTMCReward(files_location, dtmc_rm);

		if(output == 1) {
			storm(files_location,1);
			stormDTMC(files_location,1);
		}
		else if(output == 2) {
			prism(files_location,1);
		}
		//IAdaptiveCyberDefenseTextPrinter printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(System.out, null);
		//System.out.println(description.getEvent_descriptions());
		//printer.print(description.getProperties().get(0));

		//long endTimeMDP = System.nanoTime();

		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);
		//showInGraphiv(graphiz_file, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_REQ);
		//showInGraphiv(files_location+ltsFileName, lts.getStates(), lts.getTransitions(), DOT_Writer.SHOW_ALL);

		//LOGGER.info("The labeled transition system .dot file is created");

		//double[] valueO = computeOperationalStrategyAndPlan();

		//LOGGER.info("The value vector based on operational goals is computed");

		//double[] valueA = computeAttackStrategyAndPlan();

		//LOGGER.info("The value vector based on security goals is computed");

		//computeTradeOffStrategyAndPlan(valueA,valueO);

		//Time of the end of the program
		long endTime = System.nanoTime();
		//Execution time of the program
		long elapsedTime = endTime - startTime;
		long elapsedTimeMDP = endTimeMDP - startTimeMDP;
		//Convert nanoseconds to seconds
		double elapsedTimeSecond = ((double)elapsedTime) / 1E9;
		double elapsedTimeSecondMDP = ((double)elapsedTimeMDP) / 1E9;
		//Display elapsed time
		System.out.println("Took "+ elapsedTimeSecond + " s");
		System.out.println("MDP Took "+ elapsedTimeSecondMDP + " s");
		/* On if Boucle for = on
		averageTime = averageTime + elapsedTimeSecond;
		averageTimeMDP = averageTimeMDP + elapsedTimeSecondMDP;
		}

		System.out.println("Average time : " + averageTime / 5);
		System.out.println("Average time MDP : " + averageTimeMDP / 5);
		 */	
	}
	
	//All of the getter with a number two are used to get the element of a second model in the same time than the first one
	
	public EList<EventDescription> getEvent(){
		return description.getEvent_descriptions();
	}
	
	public EList<EventDescription> getEvent2(){
		return description2.getEvent_descriptions();
	}
	
	public HashMap<String, RequirementDescription> getRequirementsDesciptions(){
		return lts.getRequirements_description();
	}
	
	public static HashMap<String, RequirementDescription> getRequirementsDesciptions2(){
		return lts2.getRequirements_description();
	}

	public HashMap<String, ActionDescription> getActions(){
		return lts.getActionDescriptions();
	}
	
	public HashMap<String, ActionDescription> getActions2(){
		return lts2.getActionDescriptions();
	}
	
	public HashMap<String, Integer> getActionsId(){
		return lts.getActionsId();
	}
	
	public HashMap<String, Integer> getActionsId2(){
		return lts2.getActionsId();
	}

	public double[] getPolicy() {
		return this.finalPolicy;
	}

	public HashMap<Integer, HashMap<String, String>> getStates() {
		return lts.getStates();
	}
	
	public HashMap<Integer, HashMap<String, String>> getStates2() {
		return lts2.getStates();
	}

	/**
	 * Create the DTMC transitions and reward matrix 
	 * 
	 * @param policy
	 * @param tm
	 * @param rm
	 * @param dtmc_tm
	 * @param dtmc_rm
	 */
	private static void findDTMC(double[] policy, double[][][] tm, double[][][] rm, double[][] dtmc_tm,
			double[][] dtmc_rm) {
		for(int j=0;j<policy.length; j++) {
			for(int k=0;k<policy.length; k++) {
				dtmc_tm[j][k] = tm[j][k][(int) policy[j]-1];
				dtmc_rm[j][k] = rm[j][k][(int) policy[j]-1];
			}
		}


	}
	/**
	 * Export the DTMC Transition matrix into the file "stormDTMC.tra"
	 * 
	 * @param files_location
	 * @param dtmc_tm
	 * @throws IOException
	 */
	public static void printDTMC(String files_location, double[][] dtmc_tm) throws IOException {
		String filename = files_location+"/stormDTMC.tra";
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		ffw.write("dtmc\n");
		int nb_of_states = dtmc_tm.length;
		int nb_of_actions = dtmc_tm[0].length;

		for(int k =0; k<nb_of_states;k++){
			for(int i=0; i<nb_of_actions;i++) {
				if(dtmc_tm[k][i] != 0) {
					ffw.write(k +" "+i+" "+dtmc_tm[k][i] +"\n");
				}
			}
		}
		ffw.close();
	}

	/**
	 * Export the DTMC Reward matrix into the file "stormDTMC.tra.rew"
	 * 
	 * @param files_location
	 * @param dtmc_rm
	 * @throws IOException
	 */
	public static void printDTMCReward(String files_location, double[][] dtmc_rm) throws IOException {
		String filename = files_location+"/stormDTMC.tra.rew";
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		ffw.write("dtmc\n");
		int nb_of_states = dtmc_rm.length;
		int nb_of_actions = dtmc_rm[0].length;

		for(int k =0; k<nb_of_states;k++){
			for(int i=0; i<nb_of_actions;i++) {
				if(dtmc_rm[k][i] != 0) {
					ffw.write(k +" "+i+" "+dtmc_rm[k][i] +"\n");
				}
			}
		}
		ffw.close();
	}



	/**
	 * Export the explicit transition file for Prism or Storm
	 * The selection of Prism or Storm depends of the value of outputFile
	 * Choose "1" for Storm and "2" for Prism
	 * 
	 * @param tm
	 * @param outputFile
	 * @param files_location
	 * @return
	 * @throws IOException
	 */
	public static String print(double[][][] tm, int outputFile,String files_location) throws IOException {
		String filename = files_location+"/storm.tra";
		if(outputFile == 2) {
			filename = files_location+"/prism.tra";
		}
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);

		StringBuilder str = new StringBuilder();
		int nb_of_states = tm.length;
		int nb_of_actions = tm[0][0].length;
		String tabStart[] = new String [nb_of_states];
		int index = 0;
		int ref = 0;
		for(int k =0; k<nb_of_actions;k++){
			str.append("\nAction "+k+"\n");
			for(int i=0; i<nb_of_states;i++) {
				for(int j =0; j< nb_of_states;j++) {
					str.append(tm[i][j][k]);
					str.append(" ");
					if(tm[i][j][k] != 0) {
						index = ref;
						String res = i+" "+index+" "+j+" "+tm[i][j][k]+"\n";
						tabStart[i] = tabStart[i] + res;
					}
				}
				str.append("\n");
			}
			ref++;
		}
		if(output == 2) {   
			ffw.write(nb_of_states+" "+lts.getNbTransitions()+" "+lts.getNbTransitions()+"\n");
		}
		else {
			ffw.write("mdp\n");
		}
		for(int i = 0;i<tabStart.length;i++) {
			ffw.write(tabStart[i].substring(4));
		}
		ffw.close();
		return str.toString();
	}

	/**
	 * Export the reward file for Prism or Storm
	 * The selection of Prism or Storm depends of the value of outputFile
	 * Choose "1" for Storm and "2" for Prism
	 * 
	 * @param rm
	 * @param outputFile
	 * @param files_location
	 * @return
	 * @throws IOException
	 */
	public static String printReward(double[][][] rm,int outputFile, String files_location) throws IOException {
		//Name of the file
		String filename = files_location+"/storm.tra.rew";
		if(outputFile == 2) {
			filename = files_location+"/prism.srew";
		}
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		int z = 0;
		int index = 0;

		//Variables
		StringBuilder str = new StringBuilder();
		int nb_of_states = rm.length;
		int nb_of_actions = rm[0][0].length;
		String tabReward[] = new String [nb_of_states*10];
		String tabLabel[] = new String [nb_of_states];

		int tabLabelInt[] = new int [nb_of_states];
		LinkedList linked = new LinkedList();

		Set set = new TreeSet();
		int stateAlreadyExist[] = new int [nb_of_states];
		ArrayList arrayListLabel = new ArrayList();
		//For each actions
		for(int k =0; k<nb_of_actions;k++){
			str.append("\nAction "+k+"\n");
			//For each states
			for(int i=0; i<nb_of_states;i++) {
				for(int j =0; j< nb_of_states;j++) {
					str.append(rm[i][j][k]);
					str.append(" ");
					//If reward
					if(Math.round(rm[i][j][k]) != 0) {
						String res;
						//Create the table for Prism files
						if(outputFile == 2) {
							Boolean exist = false;
							if(outputFile == 2) {
								for(int a=0;a<nb_of_states;a++) {
									if(j == stateAlreadyExist[a]) {
										exist = true;
									}
								}
								if(exist==false) {
									res = j+" "+Math.round(rm[i][j][k])+"\n";
									tabReward[z] = res;
									arrayListLabel.add(j);
									linked.add(j);
									set.addAll(arrayListLabel);
									tabLabel = set.toString().substring(1,set.toString().length()-1).split(",");
									stateAlreadyExist[z] = j;
									z++;
								}
							}
						}
						else {
							res = i+" "+index+" "+j+" "+Math.round(rm[i][j][k])+"\n";
							tabReward[z] = res;
							linked.add(i);
							arrayListLabel.add(j);
							set.addAll(arrayListLabel);
							tabLabel = set.toString().substring(1,set.toString().length()-1).split(",");
							z++;
						}
					}
				}
				str.append("\n");
			}
			index++;
		}
		Collections.sort(linked);
		int index2 = 0;
		for(int browse= 0;browse<linked.size();browse++) {
			for(int transition = 0; transition<z;transition++) {
				String[] compare = tabReward[transition].split(" ");
				if(compare[0].trim().equals("0")){

				}
				else {
					if(compare[0].trim().equals(linked.get(browse).toString().trim())) {
						//String tr = compare[0]+" "+index2+" "+compare[2]+" "+compare[3];
						String tr = tabReward[transition];
						linked.set(browse, tr);
						index2++;
						tabReward[transition] = "0";
					}
				}
			}index2 = 0;
		}
		//Init of the Prism file
		if(outputFile == 2) {
			ffw.write(nb_of_states+" "+z+"\n");
		}
		//Write the reward lines
		for(int i = 0;i<linked.size();i++) {
			ffw.write(linked.get(i).toString());
		}
		//Format the states of the label table for the function generateLabelFile
		//for(int i = 0;i<tabLabel.length;i++) {
		//	tabLabelInt[i] = Integer.parseInt(tabLabel[i].trim());
		//}
		ffw.close();
		if(output == 1)
			generateLabelFile(files_location);
		else if(output == 2)
			generateLabelFilePrism(files_location);
		return str.toString();
	}

	/**
	 * Generate the label file for Storm
	 * 
	 * @param files_location
	 * @throws IOException
	 */
	private static void generateLabelFile(String files_location) throws IOException {
		String filename = files_location+"/storm.lab";
		int init = lts.getInitialState(description);
		HashMap<String, Formula> test = lts.getLabels();
		String[] labelName = test.keySet().toString().substring(1,test.keySet().toString().length()-1).split(",");
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		ffw.write("#DECLARATION\ninit ");
		for(int i = 0 ; i< labelName.length ; i++) {
			ffw.write(labelName[i].trim()+" ");
		}
		ffw.write("\n#END\n");
		HashMap<Integer, HashSet<String>> label = lts.getStatesLabels();
		for(int i = 0; i < label.size() ; i++) {
			if(label.get(i).toString() != "[]" || i == init) {
				if(i==init)
					ffw.write(init+" init\n");
				else {
					if(label.get(i).toString().substring(1, label.get(i).toString().length()-1).contains(",")) {
						String[] lab =label.get(i).toString().substring(1, label.get(i).toString().length()-1).split(",");
						ffw.write(i+" ");
						for (int j=0;j<lab.length;j++) {
							ffw.write(lab[j]+" ");
						}
						ffw.write("\n");
					}
					else {
						ffw.write(i +" "+label.get(i).toString().substring(1, label.get(i).toString().length()-1)+"\n");	
					}

				}
			}
		}
		ffw.close();	
	}

	/**
	 * Generate the label file for Prism
	 * 
	 * @param files_location
	 * @throws IOException
	 */
	private static void generateLabelFilePrism(String files_location) throws IOException {
		String filename = files_location+"/prism.lab";
		int init = lts.getInitialState(description);
		HashMap<String, Formula> test = lts.getLabels();
		String[] labelName = test.keySet().toString().substring(1,test.keySet().toString().length()-1).split(",");
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		ffw.write("0=\"init\" ");
		String tablLabel;
		for(int i = 0 ; i< labelName.length ; i++) {
			ffw.write(i+1 +"=\""+labelName[i].trim()+"\" ");
		}
		ffw.write("\n");
		HashMap<Integer, HashSet<String>> label = lts.getStatesLabels();
		for(int i = 0; i < label.size() ; i++) {
			if(label.get(i).toString() != "[]" || i == init) {
				if(i==init)
					ffw.write(init+": 0\n");
				else {
					for(int j = 0 ; j< labelName.length ; j++) {
						if(label.get(i).toString().substring(1, label.get(i).toString().length()-1).trim().equals(labelName[j].trim())) {
							int value = j + 1;	
							ffw.write(i +": "+ value +"\n");
						}
					}
				}
			}
		}
		ffw.close();	
	}

	private static String print(double[][] ex_tm) {
		StringBuilder str = new StringBuilder();
		int nb_of_states = ex_tm.length;
		for(int i=0; i<nb_of_states;i++) {
			for(int j =0; j< nb_of_states;j++) {
				str.append(ex_tm[i][j]);
				str.append(" ");
			}
			str.append("\n");
		}
		return str.toString();
	}

	private static void initializeFileNames(String name) {
		controlStrategyFileName = name+"_strategy.dot";
		controlPlanFileName = name+"_plan.dot";
		ltsFileName = name+"_lts.dot";
		updateLog4jConfiguration(name);
	}

	/**
	 * Model construction and model checking with Storm for MDP
	 * Generate the associate dot file if the variable intDot equals "1"
	 * 
	 * @param files_location
	 * @param intDot
	 * @throws Exception
	 */
	public static void storm(String files_location, int intDot) throws Exception {
		//Generate dot file if intDot == 1
		if(intDot != 1) {
			intDot = 0;
		}
		//For each properties in the model file
		for(int i = 0 ; i< description.getProperties().size() ; i++) {
			StringBuffer output = new StringBuffer();
			String commandLine = "/usr/local/Cellar/stormchecker/1.2.1/bin/storm --explicit "+files_location+"storm.tra "+files_location+"storm.lab --transrew "+files_location+"storm.tra.rew";
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			IAdaptiveCyberDefenseTextPrinter printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(stream, null);
			printer.print(description.getProperties().get(i));
			//Customize property to match Storm syntax
			String reg = "\\[\\s*[A-Z]+\\s*";
			String[] property = stream.toString().split(reg);
			String prop = property[0] + "[F \\\"" + property[1];
			String reg2 = "\\]";
			String[] property1 = prop.toString().split(reg2);
			String endProperty = property1[0] + "\\\" ]";
			if(stream.toString().contains("multi")){
				String[] multi = stream.toString().split(",");
				for(int j = 1;j<multi.length;j++) {
					String streamMulti = multi[j];
					String[] propertyMulti = streamMulti.toString().split(reg);
					String propMulti = propertyMulti[0] + "[F \\\"" + propertyMulti[1];
					String[] property1Multi = propMulti.toString().split(reg2);
					endProperty = endProperty +", "+ property1Multi[0] + "\\\" ]";
				}
				endProperty = endProperty + ")";
			}
			commandLine = commandLine +" --prop \""+endProperty+"\"";
			if(intDot == 1) {
				commandLine = commandLine + " --io:exportdot "+files_location+"storm.dot";
			}
			//Print the result in the console
			Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",commandLine});
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");}
			System.out.println(output.toString());
			//Check the errors
			if(output.toString().contains("ERROR")) {
				System.out.println("Error detected, your model has not been checked");
			}
			else {
				System.out.println("Model checked with success");
			}
		}
	}

	/**
	 * Model construction and model checking with Storm for DTMC
	 * Generate the associate dot file if the variable intDot equals "1"
	 * 
	 * @param files_location
	 * @param intDot
	 * @throws Exception
	 */
	public static void stormDTMC(String files_location, int intDot) throws Exception {
		//Generate dot file if intDot == 1
		if(intDot != 1) {
			intDot = 0;
		}
		//For each properties in the model file
		for(int i = 0 ; i< description.getProperties().size() ; i++) {
			StringBuffer output = new StringBuffer();
			String commandLine = "/usr/local/Cellar/stormchecker/1.2.1/bin/storm --explicit "+files_location+"stormDTMC.tra "+files_location+"storm.lab --transrew "+files_location+"stormDTMC.tra.rew";
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			IAdaptiveCyberDefenseTextPrinter printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(stream, null);
			printer.print(description.getProperties().get(i));
			//Customize property to match Storm syntax
			if(stream.toString().contains("multi")){
			}
			else {
				String reg = "\\[\\s*[A-Z]+\\s*";
				String[] property = stream.toString().split(reg);
				String prop = property[0] + "[F \\\"" + property[1];
				String reg2 = "\\]";
				String[] property1 = prop.toString().split(reg2);
				String endProperty = property1[0] + "\\\" ]";
				commandLine = commandLine +" --prop \""+endProperty+"\"";
				if(intDot == 1) {
					commandLine = commandLine + " --io:exportdot "+files_location+"storm.dot";
				}
				//Print the result in the console
				Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",commandLine});
				p.waitFor();
				BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String line = "";			
				while ((line = reader.readLine())!= null) {
					output.append(line + "\n");}
				System.out.println(output.toString());
				//Check the errors
				if(output.toString().contains("ERROR")) {
					System.out.println("Error detected, your model has not been checked");
				}
				else {
					System.out.println("Model checked with success");
				}
			}
		}
	}

	/**
	 * Model construction and model checking with Prism for MDP
	 * Generate the associate dot file if the variable intDot equals "1"
	 * Multiobjective not working for the moment
	 * 
	 * @param files_location
	 * @param intDot
	 * @throws Exception
	 */
	public static void prism(String files_location, int intDot) throws Exception {
		//Generate dot file if intDot == 1
		if(intDot != 1) {
			intDot = 0;
		}
		//For each properties in the model file
		for(int i = 0 ; i< description.getProperties().size() ; i++) {
			StringBuffer output = new StringBuffer();
			String commandLine = "/Users/forensics/Downloads/prism-4.4-osx64/bin/prism -mdp -importmodel "+files_location+"prism.tra,sta,srew,lab ";
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			IAdaptiveCyberDefenseTextPrinter printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(stream, null);
			printer.print(description.getProperties().get(i));
			//Customize property to match Storm syntax
			String reg = "\\[\\s*[A-Z]+\\s*";
			String[] property = stream.toString().split(reg);
			String prop = property[0] + "[F \"" + property[1];
			String reg2 = "\\]";
			String[] property1 = prop.toString().split(reg2);
			String endProperty = property1[0] + "\" ]";
			commandLine = commandLine +" -pctl '"+endProperty+"'";
			if(intDot ==1) {
				commandLine = commandLine + " -exporttransdot "+files_location+"prism.dot";
			}
			//Print the result in the console
			Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",commandLine});
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";			
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");}
			System.out.println(output.toString());
			//Check the errors
			if(output.toString().contains("Error")) {
				System.out.println("Error detected, your model has not been checked");
			}
			else {
				System.out.println("Model checked with success");
			}
		}
	}

	static private void updateLog4jConfiguration(String name) { 
		System.setProperty("descriptionName", name);
		LOGGER = LogManager.getLogger();
	}

	/*
	private static void showInGraphiv(
			String file_path, 
			HashMap<Integer, HashMap<String, String>> states,
			HashSet<Transition> transitions, String option) {
		DOT_Writer visualizer = new DOT_Writer(file_path,states,transitions,option);
		visualizer.openFromDesktop();			
	}
	 */

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
}

/*private static double[] computeOperationalStrategyAndPlan() {
//LOGGER.info("Nb of Transitions: "+lts.getTransitions().size()+"\n");
//LOGGER.info("Transitions:\n "+lts.getTransitions().toString()+"\n");

double[][][] TM = MDP_Computer.getTransitionMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
LOGGER.info("The transition matrix based on operational goals and control events is computed");

double[][][] RM = MDP_Computer.getRewardMatrix(lts.getStates(),lts.getTransitions(),lts.getControl_events_id());
LOGGER.info("The reward matrix based on operational goals and control events is computed");

//lts.readDomainDescription(domain_description_location);
//lts.generateLTSFromInitialState();
//lts.showInGraphiv("/Users/yehia/Documents/lts.dot",NormsLTS.SHOW_ALL);
//lts.print();

solveMDP(TM, RM, 0.96);
double[] policy = solver.getPolicy();
double[] value = solver.getValue();
LOGGER.info("The policy and value vectors based on the MDP that includes reward and transition matrices based on operational are computed");

//solver.printRewardMatrix();
//solver.printTransitionMatrix();

HashSet<Transition> filtered_transitions = MDP_Computer.updateTransitionsUsingPolicy(lts.getTransitions(), lts.getControl_events_id(), policy,MDP_Computer.SHOW_NOOP);
LOGGER.info("The transitions are filtered based on the computed policy");

HashMap<Integer, HashMap<String, String>> states_value = MDP_Computer.updateStatesUsingValue(lts.getStates(), value);
LOGGER.info("A copie of the LTS states are created using the computed state values");

showInGraphiv(files_location+controlStrategyFileName,states_value,filtered_transitions,DOT_Writer.SHOW_NONE);
LOGGER.info("A graph is created using the computed policy transitions and the states updated with their values");

///////////// NEW PART
HashSet<Transition> exogenous_transitions = MDP_Computer.getTransitionsUsingEventsId(lts.getTransitions(), lts.getExogenous_events_id());
LOGGER.info("The transitions caused by exogenous actions are identified");

Graphviz_Writer.write_dot_file(files_location+controlStrategyFileName,states_value,filtered_transitions,exogenous_transitions,DOT_Writer.SHOW_ALL);
LOGGER.info("A graph is created using the computed policy transitions, exogenous transitions and the states updated with their values");

//////// END NEW PART
HashSet<Transition> plan_transitions = MDP_Computer.findPlanTransitionsUsingPolicy(lts.getTransitions2(), lts.getTransitions3(), lts.getId_control_events(), policy);
LOGGER.info("Transitions are reduced to those which are reachable from the initial state to create a plan rather than a strategy");

HashMap<Integer, HashMap<String, String>> plan_states = MDP_Computer.filterStatesUsingTransitions(states_value, plan_transitions);
LOGGER.info("States are filtered based on plan transitions");

showInGraphiv(files_location+controlPlanFileName,plan_states,plan_transitions,DOT_Writer.SHOW_NONE);
LOGGER.info("A Graph is created showing the computed operatio plan");

return value;
}*/

/*private static void solveMDP(double[][][] p, double[][][] r, double discount) {

solver.setP(p);
//solver.printTransitionMatrix();;
solver.setR(r);
//solver.printRewardMatrix();
solver.setDiscount(0.96);
solver.checkInput();

//LOGGER.info(lts.getAttack_actions().toString());
solver.checkAllInput();
solver.solveMDP();
}
 */

