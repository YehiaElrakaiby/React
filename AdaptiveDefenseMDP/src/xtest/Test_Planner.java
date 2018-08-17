package xtest;

import planning.Planner;

public class Test_Planner {
	static Planner planner;
	
	public static void main(String[] args) {
		planner = new Planner("/Users/yehia/git/AdaptiveDefenseMDP/src/planning/");
		
		planner.setDomain("foodX2.pddl");

		planner.generatePlan("problem.pddl");
	}

}
