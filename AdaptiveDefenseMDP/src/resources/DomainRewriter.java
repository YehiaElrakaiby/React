package resources;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.EventDescription;
import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;

public class  DomainRewriter {

	public ArrayList<String>  state_variable_names = new ArrayList<String>();
	public ArrayList<ArrayList<String>> state_variables_domain_values = new ArrayList<ArrayList<String>>();
	public ArrayList<Integer> variables_weight = new ArrayList<Integer>();
	public ArrayList<Integer> state_variables_domain_size = new ArrayList<Integer>();
	private final static Logger LOGGER = LogManager.getRootLogger();

	public DomainRewriter(DomainDescription description, ArrayList<RequirementDescription> requirements_description) {
		readStateVariables(description.getState_variables());
		rewriteStateVariables(description.getState_variables());

		//		for(StateVariable var : description.getState_variables()){
		//			try {
		//				printer.print(var);
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}
		//			System.out.println();
		//		}

		LOGGER.info("State Variables Rewritten - Nb: " + description.getState_variables().size());

		rewriteRequirements(requirements_description,
				this.state_variable_names,
				this.state_variables_domain_values);
		//		for(RequirementDescription var : this.requirements_description){
		//			System.out.println(var.toString());
		//		}
		LOGGER.info("Requirements Rewritten - Nb: "+ + description.getRequirements().size());


		//for(RequirementDescription requirement : requirements_description ) {
		//System.out.println(requirement.toString());
		//}

		/*
		 * create files
		 */
		rewriteActionDescriptions(description.getAction_descriptions(),
				this.state_variable_names,
				this.state_variables_domain_values);
		//		for(ActionDescription var : description.getAction_descriptions()){
		//			try {
		//				printer.print(var);
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}
		//		}

		LOGGER.info("Actions Rewritten - Nb: " + description.getAction_descriptions().size());

		//		for(String name : this.actions) {
		//			System.out.println(name + " : " + actions.indexOf(name));
		//		}

		rewriteEventDescriptions(description.getEvent_descriptions(),
				this.state_variable_names,
				this.state_variables_domain_values);
		//		for(EventDescription var : description.getEvent_descriptions()){
		//			try {
		//				printer.print(var);
		//			} catch (IOException e) {
		//				e.printStackTrace();
		//			}
		//		}
		LOGGER.info("Events Rewritten - Nb: " + description.getEvent_descriptions().size());
	}


	private void readStateVariables(EList<StateVariable> state_variables) {
		Integer weight = 1;
		for(StateVariable state_variable : state_variables) {
			this.state_variable_names.add(state_variable.getName());
			this.state_variables_domain_size.add(state_variable.getValues().size());

			ArrayList<String> domain_values = new ArrayList<String>();
			for(String value : state_variable.getValues()) {
				domain_values.add(value);
			}

			this.state_variables_domain_values.add(domain_values);
			this.variables_weight.add(weight);
			weight = weight*state_variable.getValues().size();

		}		
	}
	private void rewriteStateVariables(EList<StateVariable> state_variables) {
		for(int i=0; i<state_variables.size();i++) {
			StateVariable state_variable = state_variables.get(i);
			String name = state_variable.getName();
			String newName = String.valueOf(this.state_variable_names.indexOf(name));
			state_variable.setName(newName);
			EList<String> state_variable_values = state_variable.getValues();
			for(int j=0; j<state_variable_values.size();j++) {
				String old_value = state_variable_values.get(j);
				String newValue = String.valueOf(this.state_variables_domain_values.get(i).indexOf(old_value));
				state_variable_values.set(j, newValue);
			}
		}		
	}
	public String getVariableName(Integer id) {
		return this.state_variable_names.get(id);
	}
	public String getVariableValue(Integer id_variable, Integer id_value) {
		return this.state_variables_domain_values.get(id_variable).get(id_value);
	}
	public void rewriteRequirements(ArrayList<RequirementDescription> requirements_description, 
			ArrayList<String> state_variable_names, 
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		for(RequirementDescription req:requirements_description) {
			if(req.getActivation()!=null)req.getActivation().rewrite(state_variable_names, state_variables_domain_values);
			if(req.getCancellation()!=null)req.getCancellation().rewrite(state_variable_names, state_variables_domain_values);
			if(req.getCondition()!=null)req.getCondition().rewrite(state_variable_names, state_variables_domain_values);
			String newName = String.valueOf(state_variable_names.indexOf(req.getName()));
			req.setName(newName);
		}
	}
	public void rewriteEventDescriptions(EList<EventDescription> event_descriptions,
			ArrayList<String> state_variable_names, 
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		for(EventDescription event : event_descriptions) {
			for(ContextualEffect contextual_effect : event.getProbabilistic_contextual_effects()) {
				Formula context = contextual_effect.getContext();
				rewriteFormula(context,state_variable_names,state_variables_domain_values);
				EList<ProbabilisticEffect> pb_effects = contextual_effect.getEffects();
				rewriteProbabilisticEffects(pb_effects,state_variable_names,state_variables_domain_values);
			}
		}
	}
	public void rewriteActionDescriptions(EList<ActionDescription> action_descriptions,
			ArrayList<String> state_variable_names, 
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		for(ActionDescription action_description: action_descriptions) {

			for(ContextualEffect contextual_effect : action_description.getContextual_effects()) {
				Formula context = contextual_effect.getContext();
				rewriteFormula(context,state_variable_names,state_variables_domain_values);
				EList<ProbabilisticEffect> pb_effects = contextual_effect.getEffects();
				rewriteProbabilisticEffects(pb_effects,state_variable_names,state_variables_domain_values);
			}
		}
	}
	private void rewriteProbabilisticEffects(EList<ProbabilisticEffect> effects,
			ArrayList<String> state_variable_names, 
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		for(ProbabilisticEffect effect : effects) {
			effect.rewrite(state_variable_names,state_variables_domain_values);
		}
	}
	private void rewriteFormula(Formula context,
			ArrayList<String> state_variable_names, 
			ArrayList<ArrayList<String>> state_variables_domain_values) {
		context.rewrite(state_variable_names,state_variables_domain_values);
	}
}
