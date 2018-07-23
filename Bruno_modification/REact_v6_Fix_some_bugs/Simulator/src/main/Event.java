package main;

import java.util.LinkedList;

public class Event {
	
	private String name;
	LinkedList<Condition> conditionList = new LinkedList<Condition>();
	private String probability;
	private String effects;


	public Event(String exoEvent) {
		//name
		String[] cut = exoEvent.substring(6).split("if");
		this.name = cut[0];
		
		//condition
		Condition condition = null;
		cut = exoEvent.split("if");
		String[] cut2 = cut[1].split("occurrence");
		String[] cut3 = cut2[0].trim().split("&");
		for(int i=0;i<cut3.length;i++) {
			condition = new Condition(cut3[i].trim());
			this.conditionList.add(condition);
		}
		
		
		//probability
		cut = exoEvent.split("probability");
		cut2 = cut[1].split("effects");
		this.probability = cut2[0].trim();
		
		//effects
		cut = exoEvent.split("<");
		cut2 = cut[1].split(">");
		this.effects = cut2[0].trim();	
	}
	
	public String getName() {
		return this.name;
	}
	
	public LinkedList<Condition> getCondition() {
		return this.conditionList;
	}
	
	public String getProbability() {
		return this.probability;
	}
	
	public String getEffect() {
		return this.effects;
	}
	

}
