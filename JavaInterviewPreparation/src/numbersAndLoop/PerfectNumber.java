package numbersAndLoop;

import java.util.Scanner;
 // A number is said to be a perfect number if the sum of its positive divisors excluding 
 // the number itself is equal to that number.

public class PerfectNumber {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer:");
		n = s.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("The number is Perfect");
		} else {
			System.out.println("The number is not Perfect");
		}
	}
}
