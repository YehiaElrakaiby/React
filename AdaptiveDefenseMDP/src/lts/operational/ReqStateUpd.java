package lts.operational;

import java.util.HashMap;

import resources.RequirementDescription;

final public class RequirementStateUpdater {

	static public void updateCAReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a conditional achieve requirement, its status is updated according to activation, cancellation and condition as follows:
		 * (1) if status is inact: if activation is true, then act 
		 * (2) if status is act:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * 
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				state.put(req_id, "A");
			}
		}

		if(status.equals("A")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(req.getCondition().verify(state)) {
				state.put(req_id, "I");
			} 
		} 		
	}
	static public void updateDFAReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For an achieve requirement, its status is updated according to activation, cancellation, condition and control actions (time) as follows:
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * (2.3) if control action 
		 * (2.3.1) act-0 then inact (and update reward of transition)
		 * (2.3.2) else control action, then act-(X-1)
		 * 
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+deadline);
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(status.equals("A-0") && req.getCondition().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("A-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}

		} 
	}
	static public void updateDEAReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For an achieve requirement, its status is updated according to activation, cancellation, condition and control actions (time) as follows:
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * (2.3) if control action 
		 * (2.3.1) act-0 then inact (and update reward of transition)
		 * (2.3.2) else control action, then act-(X-1)
		 * 
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+deadline);
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(req.getCondition().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("A-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}

		} 
	}
	static public void updateUMReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req) {
	}
	static public void updateUAReqAtomInState(HashMap<String, String> state, 
			RequirementDescription req) {
	}
	static public void updateCMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a conditional achieve requirement, its status is updated according to activation, cancellation and condition as follows:
		 * (1) if status is inact: if activation is true, then act 
		 * (2) if status is act:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * 
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				state.put(req_id, "R");
			}
		}

		if(status.equals("R")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} 
		}

	} 				

	static public void updateDFMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("A-0")){
				state.put(req_id, "R");
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} 			
		}

	}
	static public void updateDEMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (req.getCondition().verify(state)){
				state.put(req_id, "R");
				/*
				 * Satisfaction and reward update: Notice that no reward is given here
				 * since the system is not actually obliged to maintain the requirement yet
				 */
			} else if (status.equals("A-0")){
				state.put(req_id, "R");
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} 
		}

	}
	static public void updatePMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				state.put(req_id, "A");
			}
		}

		if(status.startsWith("A")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (req.getCondition().verify(state)) {
				state.put(req_id, "R-"+(req.getDuration()-1));
			} 
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}		
	}
	static public void updateRPMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				state.put(req_id, "A");
			}
		}

		if(status.startsWith("A")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (req.getCondition().verify(state)) {
				state.put(req_id, "R-"+(req.getDuration()-1));
			} 
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(!req.getCondition().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}		
	}
	static public void updatePDFMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else  if (status.equals("A-0")){
				state.put(req_id, "R-"+(req.getDuration()-1));
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}
	} 
	static public void updateRPDFMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (req.getCondition().verify(state)){
				state.put(req_id, "R-"+(req.getDuration()-1));
				/*
				 * Satisfaction and reward update: Notice that no reward is given here
				 * since the system is not actually obliged to maintain the requirement yet
				 */
			} else  if (status.equals("A-0")){
				state.put(req_id, "R-"+(req.getDuration()-1));
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}
	}
	static public void updatePDEMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("A-0")) {
				state.put(req_id, "R-"+(req.getDuration()-1));
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(!req.getCondition().verify(state)) {
				state.put(req_id, "I");
			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}		
	}
	static public void updateRPDEMReqAtomInState(
			HashMap<String, String> state, 
			RequirementDescription req) {
		String req_id = req.getName();
		String status = state.get(req_id);
		/**
		 * For a maintain requirement, its status is updated according to activation, cancellation and control actions as follows:
		 * Notice that condition does not affect the update of status
		 * (1) if status is inact: if activation is true, then act-D where D is the deadline
		 * 
		 * (2) if status is act-X:
		 * (2.1) if cancellation holds then inact
		 * (2.2) else if act-0 then req-D where D is duration
		 * (2.3) else if control action, then act-(X-1)
		 * 
		 * (3) if status is req-X
		 * (3.1) if cancellation then inact
		 * (3.2) if req-X and not condition then inact (and subtract violation cost)
		 * (3.2) else if req-0 then inact (and add satisfaction reward)
		 * (3.3) else control action, then req-(X-1) ()
		 */
		if(status.equals("I")) {
			if(req.getActivation().verify(state)) {
				Integer deadline = req.getDeadline();
				state.put(req_id, "A-"+(deadline-1));
			}
		}

		if(status.startsWith("A-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if (req.getCondition().verify(state)) {
				state.put(req_id, "R-"+(req.getDuration()-1));
			} else  if (status.equals("A-0")){
				state.put(req_id, "R-"+(req.getDuration()-1));
			} else  {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "A-"+(remainingTime-1));
			}
		}

		if(status.startsWith("R-")){
			if(req.getCancellation().verify(state)) {
				state.put(req_id, "I");
			} else if(!req.getCondition().verify(state)) {
				state.put(req_id, "I");

			} else if (status.equals("R-0")){
				state.put(req_id, "I");
			} else {
				Integer remainingTime = new Integer(status.substring(4));
				state.put(req_id, "R-"+(remainingTime-1));
			}
		}		
	}

}
