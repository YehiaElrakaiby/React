package lts.norms.readers;

import java.io.IOException;
import java.nio.file.Path;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.AttackerAction;
import org.emftext.language.AdaptiveCyberDefense.ConditionExpression;
import org.emftext.language.AdaptiveCyberDefense.DefenderAction;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.Requirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

public class DomainDescriptionReader {
	
	private DomainDescription description;
	private EList<StateVariable> state_variables;
	private EList<ActionDescription> action_descriptions;
	private ConditionExpression initial;
	private EList<Requirement> requirements;
	private EList<AttackerAction> attacker_actions;
	private EList<DefenderAction> defender_actions;

	public DomainDescriptionReader(){
		
	}
	
	
	public DomainDescriptionReader(Path configPath) {
		
		description = loadDomainDescription(configPath);		
		
		state_variables = description.getStatevariable();
		action_descriptions = description.getActiondescription();
		initial = description.getInit();
		requirements = description.getRequirements();
		attacker_actions = description.getAttacker_actions();
		defender_actions = description.getDefender_actions();

	}


	public DomainDescription loadDomainDescription(Path configPath) {
		DomainDescription temp_description = null;
		
		try {
			 temp_description = loadTextual(configPath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return temp_description;
	}
	
	private DomainDescription loadTextual(Path configPath) throws IOException{
		new AdaptiveCyberDefenseMetaInformation().registerResourceFactory();
		ResourceSet resourceSet = new ResourceSetImpl();
		//String temp = configPath.toFile().getPath();
		String temp = "/"+configPath.toString();
		System.out.println(temp);
		//temp="/Users/yehia/Documents/runtime-EclipseApplication/AdaptiveCyberDefenseSpecifications/domain_description.AdaptiveCyberDefense";
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);
		return description;
	}


	public DomainDescription getDescription() {
		return description;
	}


	public void setDescription(DomainDescription description) {
		this.description = description;
	}


	public EList<StateVariable> getState_variables() {
		return state_variables;
	}


	public void setState_variables(EList<StateVariable> state_variables) {
		this.state_variables = state_variables;
	}


	public EList<ActionDescription> getAction_descriptions() {
		return action_descriptions;
	}


	public void setAction_descriptions(EList<ActionDescription> action_descriptions) {
		this.action_descriptions = action_descriptions;
	}


	public ConditionExpression getInitial() {
		return initial;
	}


	public void setInitial(ConditionExpression initial) {
		this.initial = initial;
	}


	public EList<Requirement> getRequirements() {
		return requirements;
	}


	public void setRequirements(EList<Requirement> requirements) {
		this.requirements = requirements;
	}


	public EList<AttackerAction> getAttacker_actions() {
		return attacker_actions;
	}


	public void setAttacker_actions(EList<AttackerAction> attacker_actions) {
		this.attacker_actions = attacker_actions;
	}


	public EList<DefenderAction> getDefender_actions() {
		return defender_actions;
	}


	public void setDefender_actions(EList<DefenderAction> defender_actions) {
		this.defender_actions = defender_actions;
	}


	
	
	

}
