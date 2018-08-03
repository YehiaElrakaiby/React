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
		if(src_status.startsWith("R")){
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
	static public BigDecimal reward(RequirementDescription req, 
			HashMap<String, String> src, 
			HashMap<String, String> dst) {
		if(req.getType().equals("ua")){
			return ComputeRwd.reward_ua(req,src,dst,"" );
		} else if(req.getType().equals("ca")){
			return ComputeRwd.reward_ca(req,src,dst,"");
		} else if(req.getType().equals("dfa")){
			return ComputeRwd.reward_dfa(req,src,dst,"");
		} else if(req.getType().equals("dea")){
			return ComputeRwd.reward_dea(req,src,dst,"");
		} else if(req.getType().equals("um")){
			return ComputeRwd.reward_um(req,src,dst,"");
		} else if(req.getType().equals("cm")){
			return ComputeRwd.reward_cm(req,src,dst,"");
		} else if(req.getType().equals("dfm")){
			return ComputeRwd.reward_dfm(req,src,dst,"");
		} else if(req.getType().equals("dem")){
			return ComputeRwd.reward_dem(req,src,dst,"");
		} else if(req.getType().equals("pdem")){
			return ComputeRwd.reward_pdem(req,src,dst,"");
		} else if(req.getType().equals("pm")){
			return ComputeRwd.reward_pm(req,src,dst,"");
		} else if(req.getType().equals("rpm")){
			return ComputeRwd.reward_rpm(req,src,dst,"");
		} else if(req.getType().equals("rpdem")){
			return ComputeRwd.reward_rpdem(req,src,dst,"");
		} else if(req.getType().equals("pdfm")) {
			return ComputeRwd.reward_pdfm(req,src,dst,"");
		} else if(req.getType().equals("rpdfm")){
			return ComputeRwd.reward_rpdfm(req,src,dst,"");
		} else return null;
	}

}
