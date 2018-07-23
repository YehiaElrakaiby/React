package main;

import java.awt.Desktop.Action;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.emftext.language.AdaptiveCyberDefense.ActionDescription;
import org.emftext.language.AdaptiveCyberDefense.ContextualEffect;
import org.emftext.language.AdaptiveCyberDefense.ProbabilisticEffect;

import resources.Transition;

public class Agent {
	
	private String[] name;

	public Agent(double[] policy, double[][][] tm, HashMap<Integer, String> controlEvents, HashMap<String, ActionDescription> actions, HashMap<String, Integer> action_id) {
/*		this.name = new String[policy.length];
		for(int i = 0; i<policy.length;i++) {
			Integer optimal_action = new Double(policy[i]).intValue()-1;
			String trans_name=controlEvents.get(optimal_action);
			if(trans_name.endsWith("=tt")){
				trans_name=trans_name.substring(0,trans_name.indexOf("=tt"));
			}
			for(int j = 0; j<policy.length;j++) {
				if(tm[i][j][optimal_action]!=0){
					name[i] = controlEvents.get(optimal_action);
					System.out.println(name[i]+" "+i);
				}
			}
		}
		int i =0;
		for(Entry<String, ActionDescription> a : actions.entrySet()) {
			System.out.println(a.getKey());
			System.out.println(actions.get(a.getKey()).getName() + i);
			i++;
		}
	*/

		//for( Entry<String, Integer> a: action_id.entrySet()) {
		//	System.out.println(action_id.get(a.getKey())+ " "+a.getKey());
			//ActionDescription descr = this.action_descriptions.get(action_name);
			//
			//Integer action_id = actions_id.get(action_name);
			//EList<ContextualEffect> contextual_effects = descr.getContextual_effects();
			//
			//
			//EList<ProbabilisticEffect> effects=null;
			//
		//}
	}
	
	public String getName(int index) {
		return this.name[index];
	}

}
