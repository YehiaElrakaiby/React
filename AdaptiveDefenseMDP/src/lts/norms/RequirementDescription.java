package lts.norms;

import java.util.HashMap;
import java.util.Set;

public class RequirementDescription {
	private Set<HashMap<String,String>> activation;
	private Set<HashMap<String,String>> cancellation;
	private Set<HashMap<String,String>> condition;
	private int cost_reward;
	private String type;
	private String name;

	public RequirementDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequirementDescription(String id, String type, Set<HashMap<String, String>> reqs, Set<HashMap<String, String>> acts, Set<HashMap<String, String>> deads,
			 int cost_reward) {
		super();
		this.activation = acts;
		this.cancellation = deads;
		this.condition = reqs;
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

	public Set<HashMap<String,String>> getActivation() {
		return activation;
	}

	public void setActivation(Set<HashMap<String,String>> activation) {
		this.activation = activation;
	}

	public Set<HashMap<String,String>> getCancellation() {
		return cancellation;
	}

	public void setCancellation(Set<HashMap<String,String>> cancellation) {
		this.cancellation = cancellation;
	}

	public Set<HashMap<String,String>> getCondition() {
		return condition;
	}

	public void setCondition(Set<HashMap<String,String>> condition) {
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
