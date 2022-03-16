package numbersAndLoop;

// A number is said to be a perfect number if the sum of its positive divisors excluding 
// the number itself is equal to that number.

public class PerfectNumber {

	public static void isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is Perfect number");
		} else {
			System.out.println(n + " is not Perfect number");
		}
	}

	public static void main(String[] args) {

		isPerfect(5);// f
		isPerfect(6);// t 1+2+3 = 6
		isPerfect(18);// f
		isPerfect(45);// f

	}
}
