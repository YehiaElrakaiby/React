package xtest;
import java.math.*;

public class Test_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bd = new BigDecimal(10);
		print(bd);
		bd = bd.add(BigDecimal.valueOf(100));
		print(bd);
		bd = bd.subtract(BigDecimal.valueOf(20));
		print(bd);

	}

	static void print(BigDecimal bd) {
		System.out.println(bd);
	}
}
