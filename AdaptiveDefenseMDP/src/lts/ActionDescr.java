package lts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class ActionDescr {
	private Set<HashMap<String, String>> precondition;
	private HashSet<Effect> effects;
	private Integer cost;
	private String type;

	public ActionDescr() {
		this.precondition = new HashSet<HashMap<String, String>>();
		this.effects = new HashSet<Effect>();
	}


	public Integer getCost() {
		return cost;
	}


	public void setCost(Integer cost) {
		this.cost = cost;
	}



	public Set<HashMap<String, String>> getPrecondition() {
		return precondition;
	}


	public void setPrecondition(Set<HashMap<String, String>> preconds) {
		this.precondition = preconds;
	}


	public HashSet<Effect> getEffects() {
		return effects;
	}


	public void setEffects(HashSet<Effect> effects) {
		this.effects = effects;
	}
	
	public void addEffect(Effect effect) {
		this.effects.add(effect);
	}

	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "<" + precondition + "," + effects + ">";
	}
	
	
	
	
	
	

}
