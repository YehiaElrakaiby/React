package lts;

import java.util.HashMap;
import java.util.HashSet;


public class ActionDescr {
	private HashMap<String,String> precondition;
	private HashSet<Effect> effects;
	private Integer cost;
	private String type;

	public ActionDescr() {
		this.precondition = new HashMap<String,String>();
		this.effects = new HashSet<Effect>();
	}


	public Integer getCost() {
		return cost;
	}


	public void setCost(Integer cost) {
		this.cost = cost;
	}



	public HashMap<String, String> getPrecondition() {
		return precondition;
	}


	public void setPrecondition(HashMap<String, String> precondition) {
		this.precondition = precondition;
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
