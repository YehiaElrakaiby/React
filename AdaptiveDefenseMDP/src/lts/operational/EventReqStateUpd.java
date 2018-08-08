package lts.operational;


import resources.RequirementDescription;

final public class EventReqStateUpd {
	
	static public void updateCAReqAtomInState(
			int[] state, 
			RequirementDescription req,
			Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
		/**
		 * For a conditional achieve requirement, its status is updated according to activation, cancellation and condition as follows:
		 * (1) if status is inact: if activation is true, then act 
		 * (2) if status is act:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * 
		 */
		//		if(status.equals("I")) {
		//			if(req.getActivation().verify(state)) {
		//				state.put(req_id, "R");
		//			}
		//		}
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index]=1;
			}
		}

		else if(state[index]==1){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(req.getCondition().verify(state)) {
				state[index]=0;
			} 
		} 		
	}
	static public void updateDFAReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index]=req.getDeadline();
				//Integer deadline = req.getDeadline()-1;
				//state.put(req_id, "A-"+deadline);
			}
		}
		else if(0<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(req.getCondition().verify(state)) {
				state[index]=0;
			} else if (state[index]==1){
				state[index]=0;
			} 
		} 

	}
	static public void updateDEAReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index]=req.getDeadline();
			}
		}

		else if(0<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(state[index]==1 && req.getCondition().verify(state)) {
				state[index]=0;
			} else if (state[index]==1){
				state[index]=0;
			} 
		} 	
	}

	static public void updateUMReqAtomInState(int[] state, 
			RequirementDescription req,
			Integer index) {
	}
	static public void updateUAReqAtomInState(int[] state, 
			RequirementDescription req,
			Integer index) {
	}
	static public void updateCMReqAtomInState(
			int[] state, 
			RequirementDescription req,
			Integer index) {

		/**
		 * For a conditional achieve requirement, its status is updated according to activation, cancellation and condition as follows:
		 * (1) if status is inact: if activation is true, then act 
		 * (2) if status is act:
		 * (2.1) if cancellation holds then inact
		 * (2.2) if condition holds then inact (and update reward of transition)
		 * 
		 */
		if(state[index]==0) {//status.equals("I")) {
			if(req.getActivation().verify(state)) {
				//state.put(req_id, "R");
				state[index]=1;
			}
		}

		else if(state[index]==1) {//status.equals("R")){
			if(req.getCancellation().verify(state)) {
				//state.put(req_id, "I");
				state[index]=0;
			} 
		}

	} 				

	static public void updateDFMReqAtomInState(
			int[] state, 
			RequirementDescription req,
			Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {//status.equals("I")) {
			if(req.getActivation().verify(state)) {
				state[index] = req.getDeadline()+1;
			}
		}

		else if(1<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(req.getCondition().verify(state)) {
				state[index]=1;
			} 
		}

		if(state[index]==1){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} 			
		}

	}
	static public void updateDEMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index] = req.getDeadline()+1;
			}
		}

		else if(1<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} 
		}

		else if(state[index]==1){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} 
		}

	}
	static public void updatePMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state) && !req.getCondition().verify(state)) {
				state[index]=1;
			} else if(req.getActivation().verify(state) && req.getCondition().verify(state)) {
				state[index]=req.getDuration()+1;
			}
		}

		else if(state[index]==1){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (req.getCondition().verify(state)) {
				state[index]=req.getDuration()+1;
			} 
		}

		else if(1<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (state[index]==2){
				state[index]=0;
			} 
		}		
	}
	static public void updateRPMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state) && !req.getCondition().verify(state)) {
				state[index]=1;
			} else if(req.getActivation().verify(state) && req.getCondition().verify(state)) {
				state[index]=req.getDuration()+1;
			}
		}

		else if(state[index]==1){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (req.getCondition().verify(state)) {
				state[index]=req.getDuration()+1;;
			} 
		}

		else if(1<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(!req.getCondition().verify(state)) {
				state[index]=0;
			} else if (state[index]==2){
				state[index]=0;
			} 
		}		
	}
	static public void updatePDFMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state) && ! req.getCondition().verify(state)) {
				state[index] = req.getDeadline();
			} else if(req.getActivation().verify(state) && req.getCondition().verify(state)) {
				state[index] = req.getDeadline()+req.getDuration();
			}
		}

		else if(0<state[index] && state[index]<= req.getDeadline()){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else  if (state[index]==1){
				state[index]=req.getDuration()+req.getDeadline();
			} 
		}

		else if(req.getDeadline()<state[index] && state[index]<= req.getDeadline()+req.getDuration()){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (state[index]==req.getDeadline()+1){
				state[index]=0;
			} 
		}
	} 
	static public void updateRPDFMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index]=req.getDeadline();
			}
		}

		else if(0<state[index]&& state[index]<=req.getDeadline()){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (req.getCondition().verify(state)){
				state[index]=req.getDeadline()+req.getDuration();
				/*
				 * Satisfaction and reward update: Notice that no reward is given here
				 * since the system is not actually obliged to maintain the requirement yet
				 */
			} else  if (state[index]==1){
				state[index]=req.getDeadline()+req.getDuration();
			} 
		}

		else if(req.getDeadline()<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (state[index]==req.getDeadline()+1){
				state[index]=0;
			} 
		}
	}
	static public void updatePDEMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index] = req.getDeadline();
			}
		}

		else if(0<state[index] && state[index]<=req.getDeadline()){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (state[index]==1) {
				state[index]=req.getDeadline()+req.getDuration();
			} 
		}

		else if(req.getDeadline()<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(!req.getCondition().verify(state)) {
				state[index]=0;
			} else if (state[index]==req.getDeadline()+1){
				state[index]=0;
			} 
		}		
	}
	static public void updateRPDEMReqAtomInState(
			int[] state, 
			RequirementDescription req,Integer index) {
		//String req_id = req.getName();
		//String status = state.get(req_id);
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
		if(state[index]==0) {
			if(req.getActivation().verify(state)) {
				state[index] = req.getDeadline();
			}
		}

		else if(0<state[index] && state[index]<=req.getDeadline()){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if (req.getCondition().verify(state)) {
				state[index]=req.getDeadline()+req.getDuration();
			} else  if (state[index]==1){
				state[index]=req.getDeadline()+req.getDuration();
			} 
		}

		else if(req.getDeadline()<state[index]){
			if(req.getCancellation().verify(state)) {
				state[index]=0;
			} else if(!req.getCondition().verify(state)) {
				state[index]=0;

			} else if (state[index]==req.getDeadline()+1){
				state[index]=0;
			} 
		}		
	}
	public static void updateReqAtomInState(int[] state, RequirementDescription req, Integer index) {
		if(req.getType().equals("ua")){
			EventReqStateUpd.updateUAReqAtomInState(state,req,index);
		} else if(req.getType().equals("ca")){
			EventReqStateUpd.updateCAReqAtomInState(state,req,index);
		} else if(req.getType().equals("dfa")){
			EventReqStateUpd.updateDFAReqAtomInState(state,req,index);
		} else if(req.getType().equals("dea")){
			EventReqStateUpd.updateDEAReqAtomInState(state,req,index);
		}  else if(req.getType().equals("um")){
			EventReqStateUpd.updateUMReqAtomInState(state,req,index);
		} else if(req.getType().equals("cm")){
			EventReqStateUpd.updateCMReqAtomInState(state,req,index);
		} else if(req.getType().equals("dfm")){
			EventReqStateUpd.updateDFMReqAtomInState(state,req,index);
		} else if(req.getType().equals("dem")){
			EventReqStateUpd.updateDEMReqAtomInState(state,req,index);
		} else if(req.getType().equals("pm")){
			EventReqStateUpd.updatePMReqAtomInState(state,req,index);
		} else if(req.getType().equals("rpm")){
			EventReqStateUpd.updateRPMReqAtomInState(state,req,index);
		} else if(req.getType().equals("pdem")){
			EventReqStateUpd.updatePDEMReqAtomInState(state,req,index);
		} else if(req.getType().equals("rpdem")){
			EventReqStateUpd.updateRPDEMReqAtomInState(state,req,index);
		} else if(req.getType().equals("pdfm")) {
			EventReqStateUpd.updatePDFMReqAtomInState(state,req,index);
		} else if(req.getType().equals("rpdfm")){
			EventReqStateUpd.updateRPDFMReqAtomInState(state,req,index);
		}		
	}
}
