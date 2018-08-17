package simulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;

import lts.operational.MDPBuilder;
import resources.ComputeRwd;
import resources.DomainRewriter;
import resources.RequirementDescription;

public class Simulator {
	
	PrintWriter results_writer=null;
	PrintWriter writer = null;
	public enum Controller {
		REACT,
		MAPE
	}
	REactController reactController;
	MAPEController mapeController;
	long startTime, mape_cumulatativeTime=0, react_cumulatativeTime = 0;
	BigDecimal react_cumulatativeReward = new BigDecimal(0);
	BigDecimal mape_cumulatativeReward = new BigDecimal(0);

	public Simulator(DomainRewriter rewriter, 
			ArrayList<RequirementDescription> requirements_description, 
			Integer nbOfSteps, 
			DomainDescription description, 
			double[] policy, 
			int[] initial_state,
			String descriptionFileName,
			PrintWriter p) {
		this.results_writer = p;
		// Loop for number of simulation steps
		reactController = new REactController(policy,
				rewriter.variables_weight);

		simulateController(nbOfSteps, 
				Controller.REACT, 
				initial_state, 
				description, 
				requirements_description,
				rewriter,
				descriptionFileName);
		writer.println("Total decision time per step: " + this.react_cumulatativeTime/nbOfSteps);
		writer.println("Total rewards per step: " + this.react_cumulatativeReward.intValue()/nbOfSteps);
		results_writer.println(this.react_cumulatativeTime/nbOfSteps+" "+this.react_cumulatativeReward.intValue()/nbOfSteps);
	}

	public Simulator(DomainRewriter rewriter, 
			ArrayList<RequirementDescription> requirements_description,
			Integer nbOfSteps, 
			DomainDescription description, 
			int[] initial_state, 
			String localPath, 
			String domainFileName, 
			String descriptionFileNamePlanning,
			PrintWriter p) {
		this.results_writer = p;

		mapeController = new MAPEController(description,
				requirements_description,
				rewriter,
				localPath,
				domainFileName);

		simulateController(nbOfSteps, 
				Controller.MAPE, 
				initial_state, 
				description, 
				requirements_description,
				rewriter,
				descriptionFileNamePlanning);

		results_writer.println(this.mape_cumulatativeTime/nbOfSteps+"\t"+this.mape_cumulatativeReward.intValue()/nbOfSteps);
		writer.println("Total decision time per step: " + this.mape_cumulatativeTime/nbOfSteps);
		writer.println("Total rewards per step: " + this.mape_cumulatativeReward.intValue()/nbOfSteps);	

	}

	private void simulateController(Integer nbOfSteps, 
			Controller controller, 
			int[] is, 
			DomainDescription description, 
			ArrayList<RequirementDescription> requirements_description, 
			DomainRewriter rewriter, 
			String descriptionFileNamePlanning) {

		int[] currentState = is;
		String files_path="/Users/yehia/git/AdaptiveDefenseMDP/performance_files/";
		
		try {
			writer = new PrintWriter(new FileOutputStream(files_path+descriptionFileNamePlanning+".txt"),true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for(int i=0; i<nbOfSteps; i++) {
			writer.println("\nStep "+i);

			print(currentState,rewriter);

			BigDecimal instantaneousReward = new BigDecimal(0);

			//choose action using controller
			startTime = System.nanoTime();
			Integer action=-1;
			if(controller == Controller.REACT ) {
				action = reactController.getAction(currentState);
				react_cumulatativeTime+=System.nanoTime() - startTime;
			} else {
				action = mapeController.getAction(currentState);
				mape_cumulatativeTime+=System.nanoTime() - startTime;
			}


			int[] nextState = updateTheState(currentState,
					description.getAction_descriptions().get(action),
					description.getEvent_descriptions(),
					requirements_description);

			instantaneousReward = computeInstantaneous(currentState,
					nextState,
					requirements_description);

			if(instantaneousReward.compareTo(new BigDecimal(0))==1) {
				writer.println(instantaneousReward);
			}
			if(controller == Controller.REACT ) {
				react_cumulatativeReward = react_cumulatativeReward.add(
						instantaneousReward);
			} else {
				mape_cumulatativeReward = mape_cumulatativeReward.add(
						instantaneousReward);
			}

			currentState = nextState;
		}

	}

	private void print(int[] currentState, DomainRewriter rewriter) {
		for(int i=0; i< currentState.length; i++) {
			writer.print(rewriter.getVariableName(i) + "=" + rewriter.getVariableValue(i, currentState[i])+"\t");
		}
		writer.println();

	}

	//	private void printHeader(DomainRewriter rewriter, DomainDescription description) {
	//		System.out.print("\t|\tAgent\t\t|");
	//		for(EventDescription d : description.getEvent_descriptions()) {
	//			System.out.print("Event : "+ d.getName()+"\t|");
	//		}
	//		System.out.println("\tStates\t\t\t\t|");
	//		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	//
	//		
	//	}

	private  int[] updateTheState(int[] currentState, 
			ActionDescription actionDescription,
			EList<EventDescription> event_descriptions,
			ArrayList<RequirementDescription> requirements_description) {
		int[] nextState = currentState.clone();

		//Apply effects of the action if the action is executable
		try {
			nextState = executeAction(nextState,
					actionDescription,
					requirements_description);
		} catch (Exception e) {
			writer.println("The action is not executable in the current state!");
			if(mapeController!=null)this.mapeController.enforcer.setIsOngoing(false);
			//e.printStackTrace();
		}
		writer.print(actionDescription.getName()+"\t");

		//Verify and apply the effects of events
		for(int k=0; k<event_descriptions.size();k++) {
			nextState = executeEvent(nextState,
					event_descriptions.get(k),
					requirements_description);
		}
		writer.println();
		return nextState;

	}

	private BigDecimal computeInstantaneous(int[] currentState, 
			int[] nextState, 
			ArrayList<RequirementDescription> requirements_description) {
		BigDecimal rew = new BigDecimal(0);
		for( RequirementDescription req : requirements_description){
			Integer req_index = Integer.valueOf(req.getName());
			rew=ComputeRwd.reward(req,currentState,nextState,req_index,rew);
		}
		return rew;
	}

	private int[] executeEvent(int[] currentState, 
			EventDescription descr,
			ArrayList<RequirementDescription> requirements_description) {
		int[] dst_state = currentState.clone();
		// Update the state (probabilistically) after execution of the selected action

		EList<ProbabilisticContextualEffect> prob_effects = descr.getProbabilistic_contextual_effects();

		for( ProbabilisticContextualEffect contextual_effect : prob_effects) {
			Formula context = contextual_effect.getContext();
			if(MDPBuilder.holds(context,currentState)) {
				Random random = new Random();
				boolean rand = random.nextFloat() <  contextual_effect.getOccurrence_probability().doubleValue();
				if(rand == true) {
					writer.print(descr.getName()+"\t");
					EList<ProbabilisticEffect> effects = contextual_effect.getEffects();
					dst_state = applyProbabilisticEffects(dst_state, effects, requirements_description);
				}
			}
		}
		return dst_state;
	}

	private int[] executeAction(int[] currentState, 
			ActionDescription action_description, 
			ArrayList<RequirementDescription> requirements_description) throws Exception {
		int[] dst_state = currentState.clone();
		// Update the state (probabilistically) after execution of the selected action
		EList<ContextualEffect> contextual_effects = action_description.getContextual_effects();
		boolean executed = false;
		for(ContextualEffect contextual_effect : contextual_effects) {
			Formula context = contextual_effect.getContext();
			if(MDPBuilder.holds(context,currentState)) {
				executed=true;
				EList<ProbabilisticEffect> effects = contextual_effect.getEffects();
				dst_state = applyProbabilisticEffects(dst_state, 
						effects, 
						requirements_description);
			} 
		}
		if(!executed) {
				throw new Exception("Action is not executable");
		}
		return dst_state;
	}



	private int[] applyProbabilisticEffects(int[] dst_state, 
			EList<ProbabilisticEffect> effects,
			ArrayList<RequirementDescription> requirements_description) {
		if(effects.size()!=0) {
			BigDecimal tab[] = new BigDecimal[effects.size()];
			int i =0;
			int most_likely_effect=0;
			BigDecimal most_likely_prob=new BigDecimal(0);
			//Store in a table the probability of each effect
			for(ProbabilisticEffect effect : effects){
				tab[i] = effect.getProbability();
				if(tab[i].compareTo(most_likely_prob)==1) {
					most_likely_prob=tab[i];
					most_likely_effect=i;
				}
				//System.out.println(tab[i]);
				i++;
			}
			//Generate a random number
			Random random = new Random();
			float compare = random.nextFloat();
			boolean appliedMostlikely=false;
			//boolean rand = random.nextFloat() <  Double.parseDouble(tab[0].toString());
			//If the random number has the probability of the first effect
			float total=0;
			for(int k=0; k<tab.length; k++) {
				if(total < compare && compare <= total+tab[k].floatValue()) {
					if(k==most_likely_effect){
						//throw new Exception("The action did not produce its most likely effect");
						appliedMostlikely=true;
					}
					if(effects.get(k)!=null) {
						MDPBuilder.updateStateVariables(dst_state,effects.get(k));
					}
					MDPBuilder.updateReqVariables(dst_state, requirements_description);
				}
			}
			if(!appliedMostlikely) {
				if(mapeController!=null)this.mapeController.invalidatePlan();
			}
		}
		return dst_state;
	}


}
