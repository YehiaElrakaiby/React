package resources;

public class Reward {
	private Integer src=-1;
	private Integer dest=-1;
	private Integer reward=0;
	
	public Reward(Integer src, Integer dest, Integer reward) {
		super();
		this.src = src;
		this.dest = dest;
		this.reward = reward;
	}

	public Reward() {
		// TODO Auto-generated constructor stub
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

	public Integer getReward() {
		return reward;
	}

	public void setReward(Integer reward) {
		this.reward = reward;
	}
	
	public void updateReward(Integer reward) {
		this.reward += reward;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reward other = (Reward) obj;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (src == null) {
			if (other.src != null)
				return false;
		} else if (!src.equals(other.src))
			return false;
		return true;
	}
	

}
