package resources;

import java.util.ArrayList;

public class Utils {

	public static Integer getStateIdentifier(int[] state, ArrayList<Integer> variables_weight) {
		Integer identifier = 0;
		for(int i=0;i<state.length; i++ ) {
			identifier += state[i]*variables_weight.get(i);
		}
		return identifier;
	}
	
	
	public static int[] findStateFromIdentifier(Integer id, ArrayList<Integer> variables_weight) {
		int[] state = new int[variables_weight.size()];
		for(int j=variables_weight.size()-1; 0<j;j--) {
			state[j]=id/variables_weight.get(j);
			id-=(state[j]*variables_weight.get(j));
		}
		state[0]= id;
		return state;
	}
}
