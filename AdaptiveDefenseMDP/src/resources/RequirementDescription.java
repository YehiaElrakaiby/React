package resources;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;

import org.emftext.language.AdaptiveCyberDefense.Formula;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.IAdaptiveCyberDefenseTextPrinter;
import org.emftext.language.AdaptiveCyberDefense.resource.AdaptiveCyberDefense.mopp.AdaptiveCyberDefenseMetaInformation;

public class RequirementDescription {
	private Formula activation;
	private Formula cancellation;
	private Formula condition;
	private int deadline;
	private int duration;
	private int cost_reward;
	private String perUnitCost;

	private String type;
	private String name;
	private HashSet<String> statuses = new HashSet<String>();

	public RequirementDescription() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Formula getActivation() {
		return activation;
	}

	public void setActivation(Formula activation) {
		this.activation = activation;
	}

	public Formula getCancellation() {
		return cancellation;
	}

	public void setCancellation(Formula cancellation) {
		this.cancellation = cancellation;
	}

	public Formula getCondition() {
		return condition;
	}

	public void setCondition(Formula condition) {
		this.condition = condition;
	}

	public int getCost_reward() {
		return cost_reward;
	}

	public void setCost_reward(int cost_reward) {
		this.cost_reward = cost_reward;
	}
	IAdaptiveCyberDefenseTextPrinter printer;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@Override
	public String toString() {
		printer = new AdaptiveCyberDefenseMetaInformation().createPrinter(out, null);

		StringBuilder str = new StringBuilder();
		try {
			printer.print(condition);
		} catch (IOException e) {
			e.printStackTrace();
		}
		str.append("req [" + name + " = " + type + " \n if " + out);
		
		//System.out.println(out);
		
		if(duration!=0) str.append("\n for " + duration);
		if(deadline!=0) str.append("\n within " + deadline);
		try {
			out.reset();
			if(activation!=null)printer.print(activation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(activation!=null)str.append("\n after "+out);
		try {
			out.reset();
			if(cancellation!=null)printer.print(cancellation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(cancellation!=null)str.append("\n unless "+out);
		
		str.append(" reward " + cost_reward);
		str.append("]\n");
		return str.toString();
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public HashSet<String> getStatuses() {
		return statuses;
	}

	public void setStatuses(HashSet<String> statuses) {
		this.statuses = statuses;
	}

	public String getPerUnitCost() {
		return perUnitCost;
	}

	public void setPerUnitCost(String string) {
		this.perUnitCost = string;
	}






}
