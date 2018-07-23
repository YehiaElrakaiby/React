package main;

import java.util.HashMap;

public class States {
	
	private String[] name;
	private String[] value;
	int size = 0;

	public States(String states) {
		String[] splitStates = states.split(",");
		name = new String[splitStates.length];
		value = new String[splitStates.length];
		for(int i=0;i<splitStates.length;i++) {
			String[] splitName = splitStates[i].split("=");
			this.name[i] = splitName[0].trim();
			this.value[i] = splitName[1].trim();
			this.size++;
		}
	}
	
	public String getName(int index) {
		return this.name[index];
	}
	
	public String getValue(int index) {
		return this.value[index];
	}
	
	public int getSize() {
		return this.size;
	}
	

}
