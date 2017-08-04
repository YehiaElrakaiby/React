package resources;

import java.math.BigDecimal;

public class Transition {
	private String name="";
	private Integer src=-1;
	private Integer dest=-1;
	private BigDecimal probability=new BigDecimal(-1);
	private Boolean applicable=false;
	private Integer reward=0;
	private Integer cost=0;

	private Integer id=0;
	private Boolean applicability=false;
	
	static public final Boolean APPLICABLE = true;
	static public final Boolean NOTAPPLICABLE = false;

	public Transition(String n, Integer src, Integer dest, BigDecimal prob) {
		this.name =n;
		this.src =src;
		this.dest= dest;
		this.probability = prob;
	}
	
	public Transition(String n, Integer src, Integer dest, BigDecimal prob, Boolean applicable) {
		this.name =n;
		this.src =src;
		this.dest= dest;
		this.probability = prob;
		this.applicable = applicable;
	}
	
	public Transition() {
		// TODO Auto-generated constructor stub
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

	public Integer getReward() {
		return reward;
	}

	public void setReward(Integer reward) {
		this.reward = reward;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}

	static public int hashCode(Integer src, String name, Integer dest) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}
	
	static public int hashCode(Integer src, String name) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void updateReward(int cost_reward) {
		this.reward+=cost_reward;
		
	}
	
	public void updateCost(int cost_reward) {
		this.cost+=cost_reward;
		
	}

	public Boolean getApplicability() {
		return applicability;
	}

	public void setApplicability(Boolean applicability) {
		this.applicability = applicability;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transition other = (Transition) obj;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (src == null) {
			if (other.src != null)
				return false;
		} else if (!src.equals(other.src))
			return false;
		return true;
	}

	@Override
	public String toString(){
		
		String  s; 
		if(this.applicable) {
			s =  this.applicable+"("+src +"<" +name +"(" + probability + ")"+ ">" + dest+")";
		} else {
			s =  this.applicable + "(" + src +"<" +name +"(" + probability + ")";
		}
		return s;

	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	
}
