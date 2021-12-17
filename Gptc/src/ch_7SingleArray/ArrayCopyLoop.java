package ch_7SingleArray;

public class ArrayCopyLoop {

	public static void min(int arr[]) {  // method
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)     
			if (min > arr[i])                  // if(arr[i] > max)
				min = arr[i];                  // max = arr[i]
		System.out.println("The minimum number is " + min + "\n");
	}

	public static void main(String args[]) {
		int num[]= {14, 67, 12, 34, 29, 45, 11, 66 };
		min(num);
		
		int arr[]= {41,49,18,73,89};
		for (int i:arr)
			System.out.println("the value of arr is : " + i);
		
		// copy Arrays
/*		Using a loop: use the assignment statement (=), as follows: list2 = list1;

			int[] sourceArray = {2, 3, 1, 5, 10};
			int[] targetArray = new int[sourceArray.length];

			for (int i = 0; i < sourceArrays.length; i++)
			   targetArray[i] = sourceArray[i];            // list2 = list1
*/
	}
}
