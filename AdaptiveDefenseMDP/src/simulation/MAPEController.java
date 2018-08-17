package simulation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;

import fr.uga.pddl4j.planners.statespace.ff.FF;
import fr.uga.pddl4j.test.Tools;
import fr.uga.pddl4j.util.BitOp;
import lts.operational.MDPBuilder;
import planning.PlanEnforcer;
import planning.Planner;
import resources.DomainRewriter;
import resources.RequirementDescription;
import resources.Utils;

public class MAPEController {

	boolean planningRequired;

	Planner planner = new Planner();
	PrintWriter problemWriter;
	String problemFileName = "problem.pddl";
	DomainDescription description;
	ArrayList<RequirementDescription> requirements_description;
	DomainRewriter rewriter;
	Boolean planOngoing;
	Boolean invalidatedPlan;
	String path;
	Integer nbOfVariables;
	Integer nbOfRequirements;
	ArrayList<String> activeReqs= new ArrayList<String>(), reqsInPlan= new ArrayList<String>();
	String[] list = { 
			"(table1 requested)", 
			"(table1 in_preparation)", 
			"(table1 delivered)", 
			"(table1 empty)",
			"(table2 requested)", 
			"(table2 in_preparation)", 
			"(table2 delivered)", 
			"(table2 empty)",
			"(table3 requested)", 
			"(table3 in_preparation)", 
			"(table3 delivered)", 
			"(table3 empty)"};
	PlanEnforcer enforcer;

	public MAPEController(DomainDescription description, 
			ArrayList<RequirementDescription> requirements_description, 
			DomainRewriter rewriter,
			String domainPath,
			String domainFileName) {
		this.description = description;
		this.requirements_description = requirements_description;
		this.rewriter = rewriter;
		this.planOngoing=false;
		this.planningRequired=false;
		this.planner.setDomain(domainPath+domainFileName);
		this.path=domainPath;
		this.nbOfRequirements = requirements_description.size();
		this.nbOfVariables = description.getState_variables().size();
		this.enforcer = new PlanEnforcer();
		this.invalidatedPlan=false;
	}


	// find the id of the action that corresponds to the current state
	public Integer getAction(int[] currentState) {
		/*
		 *  This method will check the state to determine whether there are requirements whose activation condition are true
		 *  if there are more than one active requirement then the one with the most reward is selected
		 *  it will also check the cancellation condition of the active requirement to determine whether it should be cancelled
		 */
		if(invalidatedPlan && !activeReqs.isEmpty()) {
			invalidatedPlan=false;
			formulatePlanningProblem(this.activeReqs,currentState);
			List<BitOp> planActions = this.planner.generatePlan(path+problemFileName);
			enforcer.setPlan(planActions);
		}
		else if(!enforcer.hasNext()) {
			planningRequired = analyzeState(currentState);
			if(planningRequired) {
				formulatePlanningProblem(this.activeReqs,currentState);
				List<BitOp> planActions = this.planner.generatePlan(path+problemFileName);
				enforcer.setPlan(planActions);
			} 
			
		} 

		String nextAction = enforcer.getNext();
		Integer index = 0;
		for(ActionDescription action : description.getAction_descriptions()) {
			if(action.getName().equals(nextAction)) {
				break;
			}
			index++;
		}
		return index;
	}

	//enforce(currentPlan);



	private void formulatePlanningProblem(ArrayList<String> activeReqs, int[] currentState) {
		StringBuilder str = new StringBuilder();

		str.append("(define (problem test)\n");
		str.append("(:domain FOODX)\n");
		str.append("(:INIT ");
		writeInitialState(str,currentState);
		str.append(")");
		str.append("\n(:goal ");
		//if(activeReqs.size()>1) {
			//str.append("(AND ");
		//}
		appendGoalState(str,activeReqs);
		//if(activeReqs.size()>1) {
			//str.append(") ");
		//}
		str.append(")");
		str.append(")");

		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(this.path+this.problemFileName))) {
			bw.write(str.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		//		try {
		//			problemWriter = new PrintWriter(new FileOutputStream(this.path+problemFileName),true);
		//		} catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		}
		//		problemWriter.print(str.toString());

		System.out.println();
	}



	private void appendGoalState(StringBuilder str, ArrayList<String> activeReqs) {

		for(RequirementDescription req : requirements_description) {
			if(activeReqs.contains(req.getName())) {
				Integer reqId = Integer.valueOf(req.getName()) - (this.nbOfVariables-this.nbOfRequirements);
				str.append(this.list[reqId]);
				break;
			}
		}

	}


	private void writeInitialState(StringBuilder str, int[] currentState) {

		for(int i =0; i< (this.nbOfVariables-this.nbOfRequirements); i++) {
			str.append("("+this.rewriter.getVariableName(i) +" "+ this.rewriter.getVariableValue(i, currentState[i])+")");
		}

	}


	private boolean analyzeState(int[] currentState) {
		activeReqs = new ArrayList<String>();
		for(RequirementDescription req : this.requirements_description) {
			/*
			 * if the activation condition of a requirement is true and the requirement is not active, then activate the requirement
			 */
			if(MDPBuilder.holds(req.getActivation(),currentState) && !MDPBuilder.holds(req.getCondition(), currentState)) {
				if(!activeReqs.contains(req.getName())) this.activeReqs.add(req.getName());
			}
		}
		/*
		 * if all active requirements are included in the plan, return true else return false
		 */
		if(!activeReqs.isEmpty()) {
			return true;
		} else
			return false;
	}


	public void invalidatePlan() {
		this.invalidatedPlan=true;
		
	}


}
