package lts.operational;

import java.util.HashSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.emftext.language.AdaptiveCyberDefense.AdaptiveCyberDefenseFactory;
import org.emftext.language.AdaptiveCyberDefense.CA;
import org.emftext.language.AdaptiveCyberDefense.CM;
import org.emftext.language.AdaptiveCyberDefense.DEA;
import org.emftext.language.AdaptiveCyberDefense.DEM;
import org.emftext.language.AdaptiveCyberDefense.DFA;
import org.emftext.language.AdaptiveCyberDefense.DFM;
import org.emftext.language.AdaptiveCyberDefense.PDEM;
import org.emftext.language.AdaptiveCyberDefense.PDFM;
import org.emftext.language.AdaptiveCyberDefense.PM;
import org.emftext.language.AdaptiveCyberDefense.RPDEM;
import org.emftext.language.AdaptiveCyberDefense.RPDFM;
import org.emftext.language.AdaptiveCyberDefense.RPM;
import org.emftext.language.AdaptiveCyberDefense.UA;
import org.emftext.language.AdaptiveCyberDefense.UM;

import resources.RequirementDescription;

final public class ReqDescrFill {
	
	//protected HashSet<Reward> rewards = new HashSet<Reward>();
	private final static Logger LOGGER = LogManager.getRootLogger();

	static public void fillUARequirementDescription(
			UA req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("ua");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setCost_reward(req.getReward());

		//domain.add("req");

	}
	static public void fillCARequirementDescription(
			CA req, 
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("ca");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("R");

	}
	static public void fillDFARequirementDescription(
			DFA req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("dfa");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}

	}
	static public void fillDEARequirementDescription(
			DEA req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("dea");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}

	}

	static public void fillUMRequirementDescription(
			UM req,
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("um");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setCost_reward(req.getReward());

		//domain.add("req");
	}
	static public void fillCMRequirementDescription(
			CM req, 
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("cm");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("R");

	}
	static public void fillDFMRequirementDescription(
			DFM req, 
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("dfm");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("R");

		if(req.getDeadline()==-1) {
			LOGGER.error("deadline not set for requirement "+req.getName());
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}

	}
	static public void fillDEMRequirementDescription(
			DEM req, 
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("dem");

		descr.setName(name);

		descr.setCondition(req.getCondition());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("R");

		if(req.getDeadline()==-1) {
			LOGGER.error("deadline not set for requirement "+req.getName());
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}

	}
	static public void fillPMRequirementDescription(
			PM req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("pm");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("A");

		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}

	}
	static public void fillRPMRequirementDescription(
			RPM req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("rpm");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		domain.add("A");

		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}

	}
	static public void fillPDFMRequirementDescription(
			PDFM req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("pdfm");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}
		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}

	}
	static public void fillRPDFMRequirementDescription(
			RPDFM req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("rpdfm");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}
		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}

	}
	static public void fillPDEMRequirementDescription(
			PDEM req, 
			RequirementDescription descr, 
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("pdem");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}
		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}

	}
	static public void fillRPDEMRequirementDescription(
			RPDEM req, 
			RequirementDescription descr,
			HashSet<String> domain) {
		String name = req.getName();

		descr.setType("rpdem");

		descr.setName(name);

		descr.setCondition(req.getCondition());
		descr.setDuration(req.getDuration());

		descr.setActivation(req.getActivation());
		descr.setDeadline(req.getDeadline());

		if(req.getCancellation() != null) {
			descr.setCancellation(req.getCancellation());
		} else {
			/**
			 * if no cancellation then the requirement cannot be cancelled and false is used as cancellation condition
			 */
			descr.setCancellation(AdaptiveCyberDefenseFactory.eINSTANCE.createFalse());
		}

		descr.setCost_reward(req.getReward());

		domain.add("I");
		if(req.getDeadline()==-1) {
			domain.add("A-0");
		} else {
			for(int i=0; i< req.getDeadline(); i++) {
				domain.add("A-"+i);
			}
		}
		/**
		 * Notice that if there is no deadline, i.e., deadline =0, then the requirement has to be fulfilled immediately
		 */
		for(int i=0; i< req.getDuration(); i++) {
			domain.add("R-"+i);
		}		
	}


}
