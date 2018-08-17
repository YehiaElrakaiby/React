package planning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

import fr.uga.pddl4j.encoding.CodedProblem;
import fr.uga.pddl4j.heuristics.relaxation.Heuristic;
import fr.uga.pddl4j.parser.ErrorManager;
import fr.uga.pddl4j.parser.Message;
import fr.uga.pddl4j.planners.ProblemFactory;
import fr.uga.pddl4j.planners.statespace.ff.FF;
import fr.uga.pddl4j.test.Tools;
import fr.uga.pddl4j.util.BitOp;
import fr.uga.pddl4j.util.Plan;

public class Planner {
	private FF planner = null;
	/**
	 * Computation timeout.
	 */
	private static final int TIMEOUT = 10;

	/**
	 * Default Heuristic Type.
	 */
	private static final Heuristic.Type HEURISTIC_TYPE = Heuristic.Type.FAST_FORWARD;

	/**
	 * Default Heuristic Weight.
	 */
	private static final double HEURISTIC_WEIGHT = 1.0;

	/**
	 * Default Trace level.
	 */
	private static final int TRACE_LEVEL = 0;

	/**
	 * Default statistics computation.
	 */
	private static final boolean STATISTICS = false;

	String localTestPath="";

	String currentDomain=null;

	String currentProblem=null;

	ProblemFactory factory=null;

	public Planner(String localTestPath) {
		planner = new FF(TIMEOUT * 1000, HEURISTIC_TYPE, HEURISTIC_WEIGHT, STATISTICS, TRACE_LEVEL);
		this.localTestPath = localTestPath;
		factory = new ProblemFactory();
		factory.setTraceLevel(TRACE_LEVEL);

	}
	
	public Planner() {
		planner = new FF(TIMEOUT * 1000, HEURISTIC_TYPE, HEURISTIC_WEIGHT, STATISTICS, TRACE_LEVEL);
		factory = new ProblemFactory();
		factory.setTraceLevel(TRACE_LEVEL);
	}

	public void setDomain(String domain) {
		this.currentDomain = localTestPath + domain;
	}

	/**
	 * Generate output plan KLC-planning validator formatted.
	 *
	 * @param currentTestPath the current sub dir to test
	 * @return 
	 */
	public List<BitOp> generatePlan(String problem) {
		this.currentProblem = localTestPath + problem;
		Plan plan = null;

		// Parses the PDDL domain and problem description
		try {

			ErrorManager errorManager = factory.parse(new File(currentDomain), new File(currentProblem));
			Iterator<Message> it1 = errorManager.getMessages().iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next().toString());
			}
			Assert.assertTrue(errorManager.isEmpty());

			CodedProblem pb = null;
			try {
				// Encodes and instantiates the problem in a compact representation
				//System.out.println("* Encoding [" + currentProblem + "]" + "...");
				pb = factory.encode();
				if (pb.isSolvable()) {
					// Searches for a solution plan
					//System.out.println("* Trying to solve [" + currentProblem + "]"
						//	+ " in " + TIMEOUT + " seconds");
					plan = planner.search(pb);
				} else {
					System.err.println("* Problem [" + currentProblem + "]" + " not solvable.");
				}
			} catch (OutOfMemoryError err) {
				System.out.println("ERR: " + err.getMessage() + " - test aborted");
				//return;
			} catch (IllegalArgumentException iaex) {
				if (iaex.getMessage().equalsIgnoreCase("problem to encode not ADL")) {
					System.err.println("[" + currentProblem + "]: Not ADL problem!");
				} else {
					throw iaex;
				}
			}

			if (plan == null) { // no solution in TIMEOUT computation time
				System.out.println("* No solution found in " + TIMEOUT + " seconds for " + currentProblem);
			} else if (plan.isEmpty()) { // Empty solution
				System.out.println("* Empty solution for " + currentProblem);
			} else { // Save output plan
				try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(currentProblem.substring(0,
						currentProblem.length() - Tools.PDDL_EXT.length()) + Tools.PLAN_EXT))) {
					bw.write(pb.toString(plan));
				}
				//System.out.println("* Solution found for " + currentProblem);
			}

		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
		return plan.actions();
	}
}


