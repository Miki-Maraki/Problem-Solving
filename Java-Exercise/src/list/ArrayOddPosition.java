package list;

//print number that are found in the Odd position of array

public class ArrayOddPosition {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Elements of given array present on odd position: ");

		// Loop through the array by incrementing value of i by 2
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
// *****************************************************
		int sum = 0; // sum of array
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max is " + max);

		for (int i = 0; i < arr.length; i++) {// check duplicate
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
