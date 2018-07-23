package main;

public class Condition {

	private String nameCondition;
	private String valueCondition;
	
	public Condition(String condition) {
		String[] split = condition.split("=");
		this.nameCondition = split[0].trim();
		this.valueCondition = split[1].trim();
	}

	public String getNameCondition() {
		return this.nameCondition;
	}
	
	public String getValueCondition() {
		return this.valueCondition;
	}
	
}
