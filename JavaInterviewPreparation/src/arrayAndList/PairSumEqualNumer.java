package arrayAndList;

// Java program to find all pairs whose sum is equal to given number
// e.g., the pair whose sum is equal to 15 using brute force method

public class PairSumEqualNumer {
	
	public static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
	    if (arr.length < 2)
	        return;
	    
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tempSum = arr[i] + arr[j];
	 
	            if (tempSum == X) {
	                System.out.println(arr[i] + " " + arr[j]);
	            }
	        }
	    }
	}
	public static void main(String [] args) {
		
		int arr[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
	 System.out.println("The pair whose sum is equal to 15 using brute force method: ");
  }
}