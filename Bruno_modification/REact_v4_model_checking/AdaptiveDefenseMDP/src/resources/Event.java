package resources;

import java.util.HashSet;

public class Event {
	
	private HashSet<String> exogenous_actions;
	private String action;
	
	public Event() {
		
	}

	public HashSet<String> getExogenous_actions() {
		return exogenous_actions;
	}

	public void setExogenous_actions(HashSet<String> exogenous_actions) {
		this.exogenous_actions = exogenous_actions;
	}
	
	public void addExogenous_action(String exogenous_action) {
		this.exogenous_actions.add(exogenous_action);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

}
