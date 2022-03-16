package javaInterview;

//Java program to find the 2nd largest number in an array
//To find the second largest element of the given array, first of all, sort the array.
//Compare the first two elements of the array
//If the first element is greater than the second swap them.
//Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
//Repeat this till the end of the array.
//After sorting an array print the second element from the end of the array.

public class SecondLargestArray {
	
	public static void main(String [] args) {
		
		int temp;
		int [] arr = {21, 11, 39, 32, 54, 27, 19, 49, 63, 44, 30};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];       
					arr[j] = temp;
				}                               
			}
		}
		System.out.println(arr[arr.length-1]);  //     largest 63
		System.out.println(arr[arr.length-2]);  // 2nd largest 54
		System.out.println(arr[arr.length-3]);  // 3rd largest 49
		System.out.println(arr[arr.length-4]);  // 4th largest 44
	}

}
