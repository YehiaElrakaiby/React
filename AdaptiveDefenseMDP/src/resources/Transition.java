package resources;

import java.math.BigDecimal;

public class Transition {
	private String event="";
	private Integer src=-1;
	private Integer dest=-1;
	private BigDecimal probability=new BigDecimal(-1);
	//private Integer orReward=0;
	//private Integer actionCost=0;
	private Integer id=0;

	//private Boolean applicability=false;

	//static public final Boolean APPLICABLE = true;
	//static public final Boolean NOTAPPLICABLE = false;

	public Transition(String n, Integer src, Integer dest, BigDecimal prob) {
		this.event =n;
		this.src =src;
		this.dest= dest;
		this.probability = prob;
	}

	public Transition(String n, Integer src, Integer dest, BigDecimal prob, Boolean applicable) {
		this.event =n;
		this.src =src;
		this.dest= dest;
		this.probability = prob;
	}

	public Transition() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return event;
	}


	public void setName(String name) {
		this.event = name;
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

	/*public Integer getOrReward() {
		return orReward;
	}

	public void setOrReward(Integer reward) {
		this.orReward = reward;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
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

	/*public void updateOrReward(int reward) {
		this.orReward+=reward;

	}*/

	/*public Boolean getApplicability() {
		return applicability;
	}

	public void setApplicability(Boolean applicability) {
		this.applicability = applicability;
	}
	 */
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
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
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
		s =  "\n"+"("+src +"<" +event +"(" + probability + ")"+ ">" + dest+")";

		return s;

	}

	/*public Integer getActionCost() {
		return actionCost;
	}

	public void setActionCost(Integer actionCost) {
		this.actionCost = actionCost;
	}*/


}
