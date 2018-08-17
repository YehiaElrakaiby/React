package planning;

import java.util.List;

import fr.uga.pddl4j.util.BitOp;

public class PlanEnforcer {
	List<BitOp> planActions;
	Integer index=0;
	Integer planLength=0;
	boolean isOngoing;
	public PlanEnforcer() {
		// TODO Auto-generated constructor stub
	}

	public void setPlan(List<BitOp> planActions) {
		this.planActions = planActions;
		isOngoing = true;
		planLength = planActions.size();
		index =0;
	}

	public String getNext() {
		if(index<planLength) {
			String actionName = planActions.get(index).getName();
			index++;
			return actionName;
		} else return "noop";
	}

	public boolean hasNext() {
		if(isOngoing && index < planLength) {
			return true;
		}

		else return false;
	}

	public void setIsOngoing(boolean b) {
		this.isOngoing = b;
		
	}

}
