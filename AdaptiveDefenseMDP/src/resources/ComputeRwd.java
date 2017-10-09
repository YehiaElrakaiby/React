package resources;

import java.math.BigDecimal;
import java.util.HashMap;

public final class ComputeRwd {

	
	static public BigDecimal reward_ua(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		if(!req.getCondition().verify(src) && req.getCondition().verify(dst)) {
			reward=reward.add(new BigDecimal(req.getCost_reward()));
		}

		return reward;
	}
	static public BigDecimal reward_ca(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		if(src_status.startsWith("A")){
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dfa(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		if(src_status.startsWith("A")){
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dea(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		if(src_status.equals("A-0")) {
			if(req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_um(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
			reward=reward.add(new BigDecimal(req.getCost_reward()));
		}
		return reward;
	}
	static public BigDecimal reward_cm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.equals("R") && dst_status.equals("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dfm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.equals("R") && dst_status.equals("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_dem(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.equals("R") && dst_status.equals("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pdfm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();

		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.startsWith("R") && dst_status.startsWith("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpdfm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.startsWith("R-1") && dst_status.startsWith("R-0")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pdem(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.startsWith("R") && dst_status.startsWith("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpdem(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = src.get(req_id);

		if(src_status.startsWith("R-1") && dst_status.startsWith("R-0")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_pm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = dst.get(req_id);

		if(src_status.startsWith("R") && dst_status.startsWith("R")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}
	static public BigDecimal reward_rpm(
			RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst, 
			String action_name) {
		BigDecimal reward = new BigDecimal(0);
		String req_id = req.getName();
		String src_status = src.get(req_id);
		String dst_status = dst.get(req_id);

		if(src_status.startsWith("R-1") && dst_status.startsWith("R-0")){
			if(req.getCondition().verify(src) && req.getCondition().verify(dst)) {
				reward=reward.add(new BigDecimal(req.getCost_reward()));
			}
		}
		return reward;
	}

}
