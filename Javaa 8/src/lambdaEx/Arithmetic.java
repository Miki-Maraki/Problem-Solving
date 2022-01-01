package lambdaEx;

public class Arithmetic {

	public static void main(String[] args) {

		Maths m = (a, b) -> a + b; // LambdaEx is anonymous method
		System.out.println(m.add(3,4));

	}
}