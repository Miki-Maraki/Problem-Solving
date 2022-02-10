package arrayAndList;

public class TargetArray {

	// given sorted array
	// int [] arr = {3, 4, 6, 6, 6, 7, 7, 9, 10};

	public static void findIndex(int[] arr, int target) {
		int firstIndex = -1;
		int lastIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (target != arr[i])
                continue;
			if (firstIndex == -1) 
				firstIndex = i;
				lastIndex = i;
			}
			if (firstIndex != -1) {
				System.out.println(firstIndex);
				System.out.println(lastIndex);
			} else
			System.out.println("target num not found");
	}

	public static void main(String[] args) {

		int[] arr = { 3, 3, 4, 6, 6, 6, 6, 7, 7, 9, 9, 10 };
		int target = 6;
		findIndex(arr, target);
		

	}

}
