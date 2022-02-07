package javaInterview;

// To find the second minimum element of the given array, first of all, sort the array.
public class SecondMinimumArray {
	
	public static void main(String [] args) {
		
		int temp;
		int [] arr = {34, 21, 89, 45, 19, 40, 29, 57, 61, 43};
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]); // minimum 19
		System.out.println(arr[arr.length-2]); // minimum 21
		System.out.println(arr[arr.length-3]); // minimum 29
		System.out.println(arr[arr.length-4]); // minimum 34
	}

}
