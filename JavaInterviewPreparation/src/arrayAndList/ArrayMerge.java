package arrayAndList;

import java.util.Arrays;

public class ArrayMerge {

	// given two Array
	static int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
	static int arr2[] = new int[] { 2, 3, 8, 13 };

	static void merge(int m, int n) {   // merge method, m and n are index
		
		// Iterate through all elements of arr2[] starting from the last element
		for (int i = n - 1; i >= 0; i--) {
			 // Find the smallest element greater than arr2[i]. Move all elements one position
			 // ahead till the smallest greater element is not found		
			int j;
			int last = arr1[m - 1];
			for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--)
				arr1[j + 1] = arr1[j];

			// If there was a greater element
			if (j != m - 2 || last > arr2[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}
		}
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		
		merge(arr1.length, arr2.length);
		System.out.println("    After Merging");
		System.out.print("First Array: ");
		
		System.out.println(Arrays.toString(arr1));
		System.out.print("Second Array:  ");
		System.out.println(Arrays.toString(arr2));
	}

}
