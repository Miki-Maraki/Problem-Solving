package ch_7SingleArray;

import java.util.Scanner;

public class CountOccurrence {
	
	public static void main(String[] args) {
		
		// create auto-generate 
		Scanner input = new Scanner(System.in);
		int[] counts = new int[100];
		System.out.println("Count occurrence in single dimension array \t\n");
		
		// prompt the user to compute the array
		System.out.print("Enter the integers between 1 and 100:");
		count(counts);
		
		// display the output
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));					
		}
	}
	/** Method count reads integers between 1 and 100
	 * and counts the occurrences of each **/
	public static void count(int[] counts) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num; 
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)
				counts[num-1]++;
		} while (num !=0);
}

}
