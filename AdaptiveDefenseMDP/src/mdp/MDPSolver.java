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

	public void printAllInput() {
		try {
			ml.eval("P");
			ml.eval("R");
			ml.eval("discount");
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void solveMDP() {
		try {
			ml.eval("[V,policy]=mdp_policy_iteration(P,R,discount)");

			Future<double[]> future_v = ml.getVariableAsync("V");
			value = future_v.get();

			Future<double[]> future_policy = ml.getVariableAsync("policy");
			policy = future_policy.get();

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

