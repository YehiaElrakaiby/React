package lts.norms.readers;

import java.io.IOException;
import java.nio.file.Path;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emftext.language.AdaptiveCyberDefense.AchieveRS;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ActionVariable;
import org.emftext.language.AdaptiveCyberDefense.DomainDescription;
import org.emftext.language.AdaptiveCyberDefense.InitialStateAtom;
import org.emftext.language.AdaptiveCyberDefense.MaintainRS;
import org.emftext.language.AdaptiveCyberDefense.OperationalRequirement;
import org.emftext.language.AdaptiveCyberDefense.StateVariable;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

/**
 * This class opens a domain description file of the extension .react 
 * and reads elements of it that are relevant to the construction of an LTS based on the description
 * This class is a helper class to the NormsLTS class, i.e., the Norms class uses this class to access information about domain descriptions
 * @author yehia
 */
public class DomainDescriptionReader {
	
	private DomainDescription description;
	private EList<StateVariable> state_variables;
	private EList<ActionDescription> action_descriptions;
	private EList<InitialStateAtom> initial;
	private EList<OperationalRequirement> requirements;
	private EList<ActionVariable> actions;
	private AchieveRS achieveRS;
	private MaintainRS maintainRS; 
	
	public DomainDescriptionReader(Path configPath) {
		
		description = loadDomainDescription(configPath);		
		state_variables = description.getState_variables();
		action_descriptions = description.getAction_descriptions();
		initial = description.getInitial_atoms();
		requirements = description.getRequirements();
		actions = description.getActions();
		achieveRS = description.getAchievers();
		maintainRS = description.getMaintainrs();

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
		String temp = "/"+configPath.toString();
		System.out.println(temp);
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(temp), true);
		DomainDescription description = (DomainDescription) resource.getContents().get(0);
		return description;
	}

	public DomainDescription getDescription() {
		return description;
	}

	public EList<StateVariable> getState_variables() {
		return state_variables;
	}
	
	

	public EList<InitialStateAtom> getInitial() {
		return initial;
	}
	
	public EList<OperationalRequirement> getRequirements() {
		return requirements;
	}


	public AchieveRS getAchieveRS() {
		return achieveRS;
	}


	public MaintainRS getMaintainRS() {
		return maintainRS;
	}	
	

}
