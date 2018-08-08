package resources;

import java.math.BigDecimal;

public final class ComputeRwd {

	
	static public BigDecimal reward_ua(
			RequirementDescription req, 
			int[] src, 
			int[] dst, 
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		if(!req.getCondition().verify(src) && req.getCondition().verify(dst)) {
			reward=reward.add(new BigDecimal(req.getCost_reward()));
		}

		return reward;
	}
	static public BigDecimal reward_ca(
			RequirementDescription req, 
			int[] src, 
			int[] dst,
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		if(index>src.length || index<0) {
			System.out.println("Problem index out of bounds:");
		}
		if(src[index]==1){
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dfa(
			RequirementDescription req, 
			int[] src, 
			int[] dst, 
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		if(0<src[index]){
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dea(
			RequirementDescription req, 
			int[] src, 
			int[] dst, 
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		if(src[index]==1) {
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_um(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
			reward=reward.add(new BigDecimal(req.getCost_reward()));
		}
		return reward;
	}
	static public BigDecimal reward_cm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, 
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==1 && dst[index]==1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dfm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==1 && dst[index]==1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dem(
			RequirementDescription req, 
			int[] src, 
			int[] dst, 
			Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==1 && dst[index]==1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pdfm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();

		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==1 && dst[index]==1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpdfm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==req.getDeadline()+2 && dst[index]==req.getDeadline()+1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pdem(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(req.getDeadline()<src[index] && req.getDeadline()<dst[index]){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpdem(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = src.get(req_id);

		if(src[index]==req.getDeadline()+2 && dst[index]==req.getDeadline()+1){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = dst.get(req_id);

		if(1<src[index] && 1<dst[index]){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpm(
			RequirementDescription req, 
			int[] src, 
			int[] dst, Integer index) {
		BigDecimal reward = new BigDecimal(0);
		//String req_id = req.getName();
		//String src_status = src.get(req_id);
		//String dst_status = dst.get(req_id);

		if(src[index]==3 && dst[index]==2){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	public static BigDecimal reward(RequirementDescription req, int[] src_state, int[] dest_state, Integer req_index, BigDecimal rew) {
		if(req.getType().equals("ua")){
			rew=rew.add(ComputeRwd.reward_ua(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("ca")){
			rew=rew.add(ComputeRwd.reward_ca(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("dfa")){
			rew=rew.add(ComputeRwd.reward_dfa(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("dea")){
			rew=rew.add(ComputeRwd.reward_dea(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("um")){
			rew=rew.add(ComputeRwd.reward_um(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("cm")){
			rew=rew.add(ComputeRwd.reward_cm(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("dfm")){
			rew=rew.add(ComputeRwd.reward_dfm(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("dem")){
			rew=rew.add(ComputeRwd.reward_dem(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("pdem")){
			rew=rew.add(ComputeRwd.reward_pdem(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("pm")){
			rew=rew.add(ComputeRwd.reward_pm(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("rpm")){
			rew=rew.add(ComputeRwd.reward_rpm(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("rpdem")){
			rew=rew.add(ComputeRwd.reward_rpdem(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("pdfm")) {
			rew=rew.add(ComputeRwd.reward_pdfm(req,src_state,dest_state,req_index));
		} else if(req.getType().equals("rpdfm")){
			rew=rew.add(ComputeRwd.reward_rpdfm(req,src_state,dest_state,req_index));
		} 	
		return rew;
	}

}
