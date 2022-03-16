package javaInterview;

import java.util.Arrays;

// To find largest, smallest, second largest, second smallest in an array
// To change unsorted Array to sorted Array

public class LargeSmallArray {

	public static void main(String[] args) {
		int arr[] = { 55, 10, 8, 90, 43, 87, 95, 25, 50, 12 };
		System.out.println("unsorted Array = " + Arrays.toString(arr));
		
		Arrays.sort(arr); // a method how to sort an Array
		
		System.out.println("Sorted Array = " + Arrays.toString(arr));
		System.out.println("Smallest element = " + arr[0]);
		System.out.println("2nd Smallest element = " + arr[1]);
		System.out.println("Largest element = " + arr[9]);
		System.out.println("2nd Largest element = " + arr[8]);
	}

}
