package resources;

import java.math.BigDecimal;

public class Transition {
	private String name;
	private Integer src;
	private Integer dest;
	private Event event;
	private BigDecimal probability;
	
	public Transition(String n,Integer src, Integer dest, Event e, BigDecimal prob) {
		this.name =n;
		this.src =src;
		this.dest= dest;
		this.event=e;
		this.probability = prob;
	}
	
	public Transition(String n, Integer src, Integer dest, BigDecimal prob) {
		this.name =n;
		this.src =src;
		this.dest= dest;
		this.event=null;
		this.probability = prob;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSrc() {
		return src;
	}


	public void setSrc(Integer src) {
		this.src = src;
	}


	public Integer getDest() {
		return dest;
	}


	public void setDest(Integer dest) {
		this.dest = dest;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}

	
	
	public BigDecimal getProbability() {
		return probability;
	}


	public void setProbability(BigDecimal probability) {
		this.probability = probability;
	}


	@Override
	public String toString(){
		String s;
		if(event!=null) s = name + " : (" + probability + ") [" + src +" --" +event.name + "--> " + dest+ "] ";
		else  s =  "(" + probability + ") [" + src +" --" +name + "--> " + dest+ "] ";
		return s;

	}
}
