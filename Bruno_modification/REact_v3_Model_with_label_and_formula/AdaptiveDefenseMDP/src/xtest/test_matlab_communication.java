package xtest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

public class test_matlab_communication {

	private static double[][][] p;
	private static double[][][] r;
	private static double discount;
	private static MatlabEngine ml;
	private static Future<MatlabEngine> eng;
	private static double[] value;
	private static double[] policy;
	private static ArrayList<double[][]> a;

	public static void main(String[] args) {
		problem1();
		
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


	private static void problem1() {
		try {
			//Start MATLAB asynchronously
			eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			ml = eng.get();

			// Square the returned elements using the power function in MATLAB
			//Object res = ml.feval("cat", 3, Double.valueOf(2));

			double[][][] p = new double[2][2][3];
			//wait
			p[0][0][0] = 0.991;
			p[0][1][0] = 0.009;
			p[1][0][0] = 1;
			p[1][1][0] = 0;
			//cut
			p[0][0][1] = 0.992;
			p[0][1][1] = 0.008;
			p[1][0][1] = 0.5;
			p[1][1][1] = 0.5;
			//noop
			p[0][0][2] = 1;
			p[0][1][2] = 0;
			p[1][0][2] = 0;
			p[1][1][2] = 1;

			double[][][] r = new double[2][2][3];
			//state 1 provides a reward of 10 - state 0 does not provide any reward - a living reward of -1
			r[0][0][0] = -1;
			r[0][1][0] = 10;
			r[1][0][0] = -1;
			r[1][1][0] = 0;
			r[0][0][1] = -1;
			r[0][1][1] = 10;
			r[1][0][1] = -1;
			r[1][1][1] = 0;
			r[0][0][2] = -1;
			r[0][1][2] = 10;
			r[1][0][2] = -1;
			r[1][1][2] = 0;



			ml.putVariableAsync("P", p);
			ml.eval("P");

			ml.putVariableAsync("R", r);
			ml.eval("R");

			ml.eval("mdp_check(P,R)");

			ml.eval("mdp_computePR(P,R)");

			ml.putVariableAsync("discount", 0.96);

			ml.eval("discount");


			ml.eval("[V,policy]=mdp_LP(P,R,discount)");

			ml.eval("[V,policy]=mdp_policy_iteration(P,R,discount)");

			//ml.eval("[V,policy,iter]=mdp_policy_iteration_modified(P,R,discount");

			ml.eval("[V,avg_reward]=mdp_relative_value_iteration(P,R)");

			ml.eval("[V,iter]=mdp_value_iteration(P,R,discount)");






			/*
			Future<double[]> future_v = ml.getVariableAsync("V");
			double[] v = future_v.get();
			for(double e:v) {
				System.out.println(e);
			}			
			Future<double[]> future_policy = ml.getVariableAsync("policy");
			double[] policy = future_policy.get();
			for(double e:policy) {
				System.out.println(e);
			}*/



			//Disconnect from the MATLAB session
			ml.disconnect();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void problem2() {
		try {
			//Start MATLAB asynchronously
			Future<MatlabEngine> eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			MatlabEngine ml = eng.get();

			// Square the returned elements using the power function in MATLAB
			//Object res = ml.feval("cat", 3, Double.valueOf(2));

			double[][][] p = new double[2][2][2];
			p[0][0][0] = 1;
			p[0][1][0] = 0;
			p[1][0][0] = 1;
			p[1][1][0] = 0;
			p[0][0][1] = 0.2;
			p[0][1][1] = 0.8;
			p[1][0][1] = 0.5;
			p[1][1][1] = 0.5;

			double[][][] r = new double[2][2][2];
			r[0][0][0] = 1;
			r[0][1][0] = 0;
			r[1][0][0] = 3;
			r[1][1][0] = 0;
			r[0][0][1] = 1;
			r[0][1][1] = 5;
			r[1][0][1] = 1;
			r[1][1][1] = 5;



			ml.putVariableAsync("P", p);
			ml.eval("P");

			ml.putVariableAsync("R", r);
			ml.eval("R");

			ml.eval("mdp_check(P,R)");

			ml.eval("mdp_computePR(P,R)");

			ml.putVariableAsync("discount", 0.96);

			ml.eval("discount");


			ml.eval("[V,policy]=mdp_LP(P,R,discount)");

			Future<double[]> future_v = ml.getVariableAsync("V");
			double[] v = future_v.get();
			for(double e:v) {
				System.out.println(e);
			}			
			Future<double[]> future_policy = ml.getVariableAsync("policy");
			double[] policy = future_policy.get();
			for(double e:policy) {
				System.out.println(e);
			}



			//Disconnect from the MATLAB session
			ml.disconnect();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void problem3() {
		try {
			//Start MATLAB asynchronously
			Future<MatlabEngine> eng = MatlabEngine.startMatlabAsync();

			// Get engine instance from the future result
			MatlabEngine ml = eng.get();

			// Square the returned elements using the power function in MATLAB
			//Object res = ml.feval("cat", 3, Double.valueOf(2));

			double[][][] p = new double[2][2][2];
			p[0][0][0] = 0.91;
			p[0][1][0] = 0.09;
			p[1][0][0] = 1;
			p[1][1][0] = 0;
			p[0][0][1] = 0.92;
			p[0][1][1] = 0.08;
			p[1][0][1] = 0.5;
			p[1][1][1] = 0.5;


			double[][][] r = new double[2][2][2];
			r[0][0][0] = -1;
			r[0][1][0] = 10;
			r[1][0][0] = -1;
			r[1][1][0] = 10;
			r[0][0][1] = -1;
			r[0][1][1] = 10;
			r[1][0][1] = -1;
			r[1][1][1] = 10;



			ml.putVariableAsync("P", p);
			ml.eval("P");

			ml.putVariableAsync("R", r);
			ml.eval("R");

			ml.eval("mdp_check(P,R)");

			ml.eval("mdp_computePR(P,R)");

			ml.putVariableAsync("discount", 0.96);

			ml.eval("discount");


			ml.eval("[V,policy]=mdp_LP(P,R,discount)");

			Future<double[]> future_v = ml.getVariableAsync("V");
			double[] v = future_v.get();
			for(double e:v) {
				System.out.println(e);
			}			
			Future<double[]> future_policy = ml.getVariableAsync("policy");
			double[] policy = future_policy.get();
			for(double e:policy) {
				System.out.println(e);
			}



			//Disconnect from the MATLAB session
			ml.disconnect();
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
	}


}



