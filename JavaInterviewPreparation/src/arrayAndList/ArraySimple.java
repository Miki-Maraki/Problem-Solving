package arrayAndList;

import java.util.Scanner;

//Take 10 integer inputs from user and store them in an array and print them on screen.

public class ArraySimple {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [10];
		for(int i = 0; i < ar.length; i++) {
			System.out.println(" print the value of ar [" + i + "]");
			ar[i] = sc.nextInt();
		}
		for(int i = 0; i < ar.length; i++) {
			System.out.println(" the value of ar[" + i + "] is " + ar[i]);
		}
	}

}
