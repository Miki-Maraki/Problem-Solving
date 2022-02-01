package list;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 6, 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		System.out.println("Duplicate elements in a given array: ");
		
		// Searches for duplicate element
		// The first loop will select an element and the second loop will iteration through the array by
		// comparing the selected element with other elements. If a match is found, print the duplicate element.
		for (int i = 0; i < arr.length; i++) {         // loop
			for (int j = i + 1; j < arr.length; j++) { // iteration
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
