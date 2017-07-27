package resources;

import java.math.BigDecimal;

public class Transition {
	private String name;
	private Integer src;
	private Integer dest;
	private BigDecimal probability;
	
	
	public Transition(String n, Integer src, Integer dest, BigDecimal prob) {
		this.name =n;
		this.src =src;
		this.dest= dest;
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

	
	public BigDecimal getProbability() {
		return probability;
	}


	public void setProbability(BigDecimal probability) {
		this.probability = probability;
	}


	@Override
	public String toString(){
		String  s =  "("+src +"<" +name +"(" + probability + ")"+ ">" + dest+")";
		return s;

	}
}
