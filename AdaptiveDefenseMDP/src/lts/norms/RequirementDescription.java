package lts.norms;

import java.util.HashMap;

public class RequirementDescription {
	private HashMap<String,String> activation;
	private HashMap<String,String> cancellation;
	private HashMap<String,String> condition;
	private int cost_reward;
	private String type;
	private String name;

	public RequirementDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequirementDescription(String id, String type, HashMap<String, String> condition, HashMap<String, String> activation, HashMap<String, String> cancellation,
			 int cost_reward) {
		super();
		this.activation = activation;
		this.cancellation = cancellation;
		this.condition = condition;
		this.cost_reward = cost_reward;
		this.type = type;
		this.name = id;
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

	public HashMap<String, String> getActivation() {
		return activation;
	}

	public void setActivation(HashMap<String, String> activation) {
		this.activation = activation;
	}

	public HashMap<String, String> getCancellation() {
		return cancellation;
	}

	public void setCancellation(HashMap<String, String> cancellation) {
		this.cancellation = cancellation;
	}

	public HashMap<String, String> getCondition() {
		return condition;
	}

	public void setCondition(HashMap<String, String> condition) {
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
		return "req [" + name + ", " + type + ", "
				+ condition + ", " + activation + ", " + cancellation + ", " + cost_reward + "]\n";
	}
	
	
	
	
	
	
}
