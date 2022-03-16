package numbersAndLoop;

import java.util.Scanner;

public class SeparateNumber {

	public static void indentfyNumber(int [] num) {
		int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				System.out.print(num[i] + " are Positive numbers");
			} else if (num[i] < 0) {
				System.out.println(num[i] + " are Negative numbers");
			} else {
				System.out.println(num[i] + " are zero numbers");
			}
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " are Even numbers");
			} else {
				System.out.println(num[i] + " are odd numbers");
			}
	   }
		System.out.println(pos + " are Positive numbers");
	}
	public static void main(String[] args) {
		int [] num = {3, -12, 5, 20, 19, 0, 33, 22, -28};
		indentfyNumber( num);
		
		/*Scanner s = new Scanner(System.in);
		int[] z = new int[20];
		int pos = 0, neg = 0, odd = 0, even = 0, zero = 0;
		for (int i = 0; i < z.length; i++) {
			System.out.println("print the value of z[" + i + "]");
			z[i] = s.nextInt();
			if (z[i] > 0) {
				pos++;
			} else if (z[i] < 0) {
				neg++;
			} else {
				zero++;
			}
			if (z[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.println("Positive : " + pos);
			System.out.println("Negative : " + neg);
			System.out.println("zero : " + zero);
			System.out.println("odd : " + odd);
			System.out.println("Even : " + even);
		}*/
	}

}
