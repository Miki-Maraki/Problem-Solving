package arrayAndList;

public class ArrayReverse {

	public void revArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {

		ArrayReverse ra = new ArrayReverse();
		// int [] arr = new int [] {4, 6, 2, 8, 12, 5, 9};
		ra.revArray(new int[] { 4, 6, 2, 8, 12, 5, 9 });

	}
}
