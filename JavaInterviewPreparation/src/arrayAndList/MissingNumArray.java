package arrayAndList;

// given sorted count number and find missing number
public class MissingNumArray {

	public static int missingNumber(int[] arr) { // method
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];              // restSum = restSum + arr[i]
		}
		int missingNumber = sum - restSum;
		return missingNumber;
	}

	public static void main(String[] args) {

		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("Missing number from array arr1: " + missingNumber(arr1));
		int[] arr2 = { 5, 3, 1, 2, 6 };
		System.out.println("Missing number from array arr2: " + missingNumber(arr2));
	}
	// n = 6 + 1 = 7
	// sum = 7 * (7+1)/2 = 7 * 8/2 = 7*4 = 28 - 25 = 3

}
