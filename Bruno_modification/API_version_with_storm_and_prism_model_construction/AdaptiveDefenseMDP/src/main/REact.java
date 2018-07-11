package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil.Test;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
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
	//static String descriptionFileName = "1.classical_planning_v05.AdaptiveCyberDefense";
	
	static public String dotOption = Graphviz_Writer.SHOW_ALL;

	static String generationOption = LTSG.FULL;
	/*
	 * 			OTHER CONFIGURATION OPTIONS
	 */
	//static String files_location = "/Users/forensics/Documents/GraphivFilesReact/";

	//static Path domain_description_location = Paths.get( "Users","forensics","Documents",
	//		"runtime-EclipseApplication","ReactV4-PaperExamples",
	//		descriptionFileName);

	static public String noop_event_identifier = "noop";
	static public Double discount_factor = 0.98;
	
	static double averageTime = 0;
	static double averageTimeMDP = 0;
	public static int output = 0;

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
	static LTSG lts;
	static MDPSolver solver;
	private static Logger LOGGER;
	
	/**
	 *  Use this function to compute the states, the transitions matrix and the reward matrix.
	 *  Solve the MDP with MDPToolbox
	 *  Generate explicit files for Storm and Prism
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException{
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
		double[][][] tm = solver.buildTransitionMatrix(lts.getCtrl_actions_transitions_map(),ex_tm);
		LOGGER.info("The Transition Matrix of the MDP is created");
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

		long endTimeMDP = System.nanoTime();
		
		Graphviz_Writer.create(files_location+controlStrategyFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Strategy Graphviz file is created");

		Graphviz_Writer.createPlan(files_location+controlPlanFileName, lts.getStates(), lts.getId_control_events(), policy, value, tm, rm, dotOption);
		LOGGER.info("The Control Plan Graphviz file is created");
		
		
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

	/**
	 * Export the explicit transition file for Prism or Storm
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
				System.out.print(linked.get(browse));
				String[] compare = tabReward[transition].split(" ");
				System.out.println(" "+compare[0]);
				if(compare[0].trim().equals("0")){
					
				}
				else {
					if(compare[0].trim().equals(linked.get(browse).toString().trim())) {
						System.out.println(tabReward[transition]);
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
		for(int i = 0;i<tabLabel.length;i++) {
			tabLabelInt[i] = Integer.parseInt(tabLabel[i].trim());
		}
		ffw.close();
		generateLabelFile(outputFile,files_location);
		return str.toString();
	}
	
	
	/**
	 * Export the label file for Prism or Storm
	 * 
	 * @param tabLabel
	 * @param numberOfLabelledStates
	 * @param outputFile
	 * @param files_location
	 * @throws IOException
	 */
	private static void generateLabelFile(int outputFile,String files_location) throws IOException {
		String filename = files_location+"/storm.lab";
		int init = lts.getInitialState(description);
		if(outputFile == 2) {
			filename = files_location+"/prism.lab";
		}
		File ff=new File(filename);
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		
		String[] condition = new String[description.getRequirements().size()];
		String[] name = new String[description.getRequirements().size()];
		int inc = 0;
		for(Requirement requirement : description.getRequirements()) {
			name[inc] = requirement.getName();
			int rew = requirement.getReward();
			condition[inc] = requirement.getCondition().toString();
			inc++;
		}
		//Init of Prism file
		if(outputFile == 2) {
			ffw.write("0=\"init\" ");
			for(int j = 0; j<name.length;j++) {
				ffw.write(j+1+"=\""+name[j]+"\" ");
			}
			ffw.write("\n");
			ffw.write(init+": 0\n");
		//Init of Storm file
		}else if(outputFile == 1){
			ffw.write("#DECLARATION\ninit ");
			for(int j = 0; j<name.length;j++) {
				ffw.write(name[j]+" ");
			}
			ffw.write("\n#END\n");
		}
		
		String[] write = new String[lts.getNumberOfStates()];
		HashMap<Integer, HashMap<String, String>> states = lts.getStates();
		for(int i=0;i<lts.getNumberOfStates();i++) {
			for(int j = 0;j<inc;j++) {
				String[] conditionValue = condition[j].split(":");
				String comparator = conditionValue[1].trim().substring(0, conditionValue[1].length()-2);
				if(states.get(i).toString().contains(comparator) || i == init) {
					if(outputFile == 2 && i!=init) {
						int sum = j+1;
						write[i] = write[i]+" "+sum;	
					}
					else if(outputFile == 1 && i!=init){
						int sum = j+1;
						write[i] = write[i] +" "+name[j];
					}
				}
			}
		}
		for(int state=0;state<write.length;state++) {
			if(write[state]!=null || state ==init) {
				if(state == init && outputFile ==1)
					ffw.write(init+" init\n");
				else if(state!=init) {	
					if(outputFile==1)
						ffw.write(state+" "+write[state].substring(5)+"\n");
					else if(outputFile==2)
						ffw.write(state+": "+write[state].substring(5)+"\n");
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
	 * Model construction with Storm
	 * 
	 * @param files_location
	 * @param intDot
	 * @param reqId
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void storm(String files_location, int intDot, String reqId) throws IOException, InterruptedException {
		InputStream flux=new FileInputStream(files_location+"storm.lab"); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		ligne=buff.readLine();
		ligne=buff.readLine();
		System.out.println(ligne);
		buff.close();
		String[] reqFromFile = ligne.split(" ");
		if(intDot != 1) {
			intDot = 0;
		}
		StringBuffer output = new StringBuffer();
		String commandLine = "/usr/local/Cellar/stormchecker/1.2.1/bin/storm --explicit "+files_location+"storm.tra "+files_location+"storm.lab --transrew "+files_location+"storm.tra.rew";
		for(int j = 1;j<reqFromFile.length;j++) {
			if(reqFromFile[j].equalsIgnoreCase(reqId.trim())) {
				commandLine = commandLine + " --prop \"Pmax=? [F \\\""+reqFromFile[j]+"\\\"]\"";
			}
		}
		if(intDot == 1) {
			commandLine = commandLine + " --io:exportdot "+files_location+"storm.dot";
		}
		System.out.println(commandLine);
		Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",commandLine});
		p.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";			
		while ((line = reader.readLine())!= null) {
			output.append(line + "\n");}
		System.out.println(output.toString());
		if(output.toString().contains("ERROR")) {
			System.out.println("Error detected, your model has not been checked");
		}
		else {
			System.out.println("Model checked with success");
		}
	}
	
	/**
	 * Model construction with Prism
	 * 
	 * @param files_location
	 * @param intDot
	 * @param reqId
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void prism(String files_location, int intDot, String reqId) throws IOException, InterruptedException {
		InputStream flux=new FileInputStream(files_location+"prism.lab"); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		ligne=buff.readLine();
		buff.close();
		String[] reqFromFile = ligne.split("\"");
		if(intDot != 1) {
			intDot = 0;
		}
		StringBuffer output = new StringBuffer();
		String commandLine = "/Users/forensics/Downloads/prism-4.4-osx64/bin/prism -mdp -importmodel "+files_location+"prism.tra,sta,srew,lab ";
		for(int j = 3;j<reqFromFile.length;j=j+2) {
			if(reqFromFile[j].equalsIgnoreCase(reqId.trim())) {
				commandLine = commandLine + "-pctl 'Pmax=? [ F \""+reqFromFile[j]+"\"]'";
			}
		}
		if(intDot ==1) {
			commandLine = commandLine + " -exporttransdot "+files_location+"prism.dot";
		}
		Process p = Runtime.getRuntime().exec(new String[]{"bash","-c",commandLine});
		p.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";			
		while ((line = reader.readLine())!= null) {
			output.append(line + "\n");}
		System.out.println(output.toString());
		if(output.toString().contains("Error")) {
			System.out.println("Error detected, your model has not been checked");
		}
		else {
			System.out.println("Model checked with success");
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

