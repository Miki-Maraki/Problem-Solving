package ch_7SingleArray;

import java.util.Scanner;
public class CreateArray {
	
/*	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter " + myList.length + " values: ");  //Initializing arrays with input values	
	for (int i = 0; i < myList.length; i++) ;
	  myList[i] = sc.nextDouble();
	  
	  for (int i = 0; i < myList.length; i++) { //Initializing arrays with random values
		  myList[i] = Math.random() * 100;
		}
	  
	  for (int i = 0; i < myList.length; i++) { //Printing arrays
		  System.out.print(myList[i] + " ");
		}
	  double total = 0;
	  for (int i = 0; i < myList.length; i++) {  // Summing all elements
	    total += myList[i];
	  }
	  double max = myList[0];
	  for (int i = 1; i < myList.length; i++) { // Finding the largest element
	    if (myList[i] > max) max = myList[i];
	  }
*/	  
	  
	  public static void main(String[] args) {
		    java.util.Scanner input = new java.util.Scanner(System.in);
		    System.out.print("Enter the number of items: ");
		    int num = input.nextInt();                               // num = Array size (Enter the number of items)
		    double[] numbers = new double[num]; // Create an array
		    double sum = 0;

		    System.out.print("Enter the numbers: "); // enter numbers based on Array size
		    for (int i = 0; i < num; i++) {
		      numbers[i] = input.nextDouble();
		      sum += numbers[i];
		    }
		    System.out.print("Sum of the numbers is "+ sum + "\n");
		    double average = sum / num;

		    int count = 0; // The numbers of elements above average
		    for (int i = 0; i < num; i++) 
		      if (numbers[i] > average) // Count if number[i] > average
		        count++;

		    System.out.println("Average is " + average);
		    System.out.println("Number of elements above the average is " + count);
	}
}

