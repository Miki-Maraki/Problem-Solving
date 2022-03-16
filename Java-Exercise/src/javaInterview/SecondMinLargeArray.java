package javaInterview;

// To find the second minimum element of the given array, first of all, given sort the array.
public class SecondMinLargeArray {

	public int findSecdMin(int[] arr) { // method to find 2nd minimum
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length - 2]; // -2 means the second minimum
	}

	public static int getSecondLargest(int[] a) { // method to find 2nd largest
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - 2]; // return second largest element
		// return a[a.length - 1]  a method to find the largest number in Array.
	}

	public static void main(String[] args) {
		int[] arr = { 34, 21, 89, 45, 19, 40, 29, 57, 61, 43 }; // no duplicate allowed
		SecondMinLargeArray sa = new SecondMinLargeArray();
		System.out.println("second minimum is : " + sa.findSecdMin(arr)); // 2nd minimum 21
		System.out.println("minimum number is : " + arr[arr.length - 1]); // minimum 19
		System.out.println("second minimum is : " + arr[arr.length - 2]); // 2nd minimum 21
		System.out.println("third minimum is : " + arr[arr.length - 3]); // 3rd minimum 29
		System.out.println("fourth minimum is : " + arr[arr.length - 4]); // 4th minimum 34

		int a[] = { 9, 11, 10, 4, 15, 16, 13, 2, 19 };
		System.out.println("Second Largest: " + getSecondLargest(a));
	}
}
