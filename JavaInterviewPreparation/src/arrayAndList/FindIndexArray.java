package arrayAndList;

// find the index of a number from a given array

public class FindIndexArray {

	int[] ar; // = new int[] {2, 5, 7, 8, 9, 12, 13, 16, 19};// sorted array
	int num; // int num = 8, 17, 23

	public int findIndex(int[] ar, int num) {        // method
		for (int i = 0; i < ar.length; i++){
			if (num == ar[i]) {
				return i;               // i is index
			} else if (num < ar[i]) {
				return i;               // i is index
			}
		}
		return ar.length;  // the index of the num is ar.length
	}

}
