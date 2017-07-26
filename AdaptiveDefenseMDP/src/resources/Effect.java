package lts;

import java.math.BigDecimal;
import java.util.HashMap;

public class Effect {
	private HashMap<String,String> effect;
	private BigDecimal prob;
	
	public Effect(HashMap<String, String> effect, BigDecimal prob) {
		super();
		this.effect = effect;
		this.prob = prob;
	}

	public Effect() {
		this.effect = new HashMap<String,String>();
	}

	public HashMap<String, String> getEffect() {
		return effect;
	}

	public void setEffect(HashMap<String, String> effect) {
		this.effect = effect;
	}

	public BigDecimal getProb() {
		return prob;
	}

	public void setProb(BigDecimal prob) {
		this.prob = prob;
	}

	@Override
	public String toString() {
		return "[" + prob + ", " + effect + "]";
	}
	
	
	
	
	
	
}
