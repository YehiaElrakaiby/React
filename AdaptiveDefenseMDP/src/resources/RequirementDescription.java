package resources;

import java.util.HashSet;

import org.emftext.language.AdaptiveCyberDefense.Formula;

public class RequirementDescription {
	private Formula activation;
	private Formula cancellation;
	private Formula condition;
	private int deadline;
	private int duration;
	private int cost_reward;
	private Boolean perUnitCost;

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

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("req [" + name + " = " + type + " "+ condition); 
		if(duration!=0) str.append(" for " + duration);
		if(deadline!=0) str.append(" within " + deadline);
		if(activation!=null)str.append(" after " + activation.toString());
		if(cancellation!=null)str.append(" unless " + cancellation.toString());
		str.append(" cost " + cost_reward);
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

	public Boolean isPerUnitCost() {
		return perUnitCost;
	}

	public void setPerUnitCost(Boolean perUnitCost) {
		this.perUnitCost = perUnitCost;
	}






}
