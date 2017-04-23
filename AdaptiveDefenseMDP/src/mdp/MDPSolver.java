package mdp;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

public class MDPSolver {

	private double[][][] p;
	private double[][][] r;
	private double discount;
	private MatlabEngine ml;
	private Future<MatlabEngine> eng;
	private double[] value;
	private double[] policy;

	public MDPSolver(Integer nb_of_states,Integer nb_of_actions){
		p = new double[nb_of_states][nb_of_states][nb_of_actions];
		r = new double[nb_of_states][nb_of_states][nb_of_actions];
	}

	public MDPSolver() {
		try {
			//Start MATLAB asynchronously
			eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			ml = eng.get();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public double[][][] getP() {
		return p;
	}

	public void setP(double[][][] p) {
		this.p = p;
		try {
			ml.putVariableAsync("P", p);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	public double[][][] getR() {
		return r;
	}

	public void setR(double[][][] r) {
		this.r = r;
		try {
			ml.putVariableAsync("R", r);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
		try {
			ml.putVariableAsync("discount", d);
		} catch (EngineException | IllegalStateException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printTransitionMatrix() {
		try {
			ml.eval("P");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void printRewardMatrix() {
		try {
			ml.eval("R");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void checkAllInput() {
		try {
			check(this.p);
			//check(this.r);
			ml.eval("P");
			ml.eval("R");
			ml.eval("discount");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	static void check(double[][][] p2) {
		int nb_of_states = p2.length;
		System.out.println("Number of states is: "+nb_of_states);
		int nb_of_actions = p2[0][0].length;
		System.out.println("Number of actions is: "+nb_of_actions);

		for(int k=0;k<nb_of_actions;k++) {
			for(int i=0;i<nb_of_states;i++) {
				double sum_of_row=0;
				String row = "";
				for(int j=0;j<nb_of_states;j++) {
					sum_of_row+=p2[i][j][k];
					row=row+" "+p2[i][j][k];
				}
				if(sum_of_row != 1.0) {
					System.out.println("Problem with row action is "+k+" state is "+i);
					System.out.println(row);

				}
				//System.out.println();
			}
			//System.out.println();
		}
		//System.out.println();
	}

	public void solveMDP() {
		try {
			ml.eval("[V,policy,iter,cpu_time]=mdp_policy_iteration(P,R,discount)");

			Future<double[]> future_v = ml.getVariableAsync("V");
			value = future_v.get();

			Future<double[]> future_policy = ml.getVariableAsync("policy");
			policy = future_policy.get();
			
//			Future<double[]> future_iter = ml.getVariableAsync("iter");
//			double[] iter = future_iter.get();
//			System.out.println("Nb of Iterations is: "+iter[0]);
//			
//			Future<double[]> future_cpu_time = ml.getVariableAsync("cpu_time");
//			double[] cpu_time = future_cpu_time.get();
//			System.out.println("CPU Time is: "+cpu_time[0]);

		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void printMDPSolution() {
		for(double e:value) {
			System.out.println(e);
		}			
		for(double e:policy) {
			System.out.println(e);
		}
	}



	public double[] getValue() {
		return value;
	}

	public double[] getPolicy() {
		return policy;
	}

	public void disconnet() {
		try {
			//Disconnect from the MATLAB session
			ml.disconnect();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void checkInput() {
		try {
			//Disconnect from the MATLAB session
			ml.eval("mdp_check(P,R)");
		} catch (ExecutionException | CancellationException | InterruptedException e) {
			e.printStackTrace();
		}	
	}
}

