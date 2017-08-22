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
	

}
