package list;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 6, 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		System.out.println("Duplicate elements in a given array: ");
		
		// Searches for duplicate element and print
		// The first loop will select an element and the second loop will iteration through the array by
		// comparing the selected element with other elements. If a match is found, print the duplicate element.
		for (int i = 0; i < arr.length; i++) {         // loop
			for (int j = i + 1; j < arr.length; j++) { // iteration
				if (arr[i] == arr[j])
					//System.out.println(arr[j]);     // 2, 3, 8  OR
				    System.out.println(arr[i]);       // 2, 3, 8
			}
		}
		// 2nd option using set and compare their length and size()
		Set<Integer> set = new HashSet<>();
		for(int s:arr) {  // change array to set
			set.add(s);
		}
		System.out.println(set); // [1, 2, 3, 4, 6, 7, 8]
		System.out.println("size of set is " + set.size());     // 7
		System.out.println("lenght of array is " + arr.length); // 10 
	}

}
