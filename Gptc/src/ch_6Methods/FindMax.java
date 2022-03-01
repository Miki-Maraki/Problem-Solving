package ch_6Methods;

// White a method that return maximum between two numbers 
public class FindMax {

	public int maxNum(int num1, int num2) { // method
		int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		return result; // Return result
	}

	public static void main(String[] args) {
		FindMax fm = new FindMax();
		int i = 55;
		int j = 42;
		int k = fm.maxNum(i, j); // Invoke max method
		System.out.println("The maximum between " + i + " and " + j + " is : " + k);
	}
}
