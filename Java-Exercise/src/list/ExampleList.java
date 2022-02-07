package list;

public class ExampleList {
	// Q. if we have 3 list of array, how many times of looping? 2 times n
	// Q. write a method that find index, return an index 
		// given sorted array and target number 
		//int[] sortedList = { 2, 4, 7, 8, 9, 14, 17, 25 };
		int[] sortedArrayList;
		int targetNumber;
		
		public int findArrayIndex(int[] sortedArrayList, int targetNumber) { // method
			for (int i = 0; i < sortedArrayList.length; i++) {
				if (sortedArrayList[i] == targetNumber) {     // where it get
					return i;                                    
				}else if(targetNumber < sortedArrayList[i]) { // where to put(index)
					return i;
				}
			}
			return sortedArrayList.length;  
		}	
		public static void main(String[] args) {
			ExampleList ml = new ExampleList();
			System.out.println(ml.findArrayIndex( new int[] {2, 4, 7, 8, 9, 14, 17, 25}, 7)); // get index 2
			System.out.println(ml.findArrayIndex( new int[] {2, 4, 7, 8, 9, 14, 17, 25}, 15)); //put index 6
			System.out.println(ml.findArrayIndex( new int[] {2, 4, 7, 8, 9, 14, 17, 25}, 30));  // put at sortedArrayList.length~~~ index 8
			
			//System.out.println(findArrayIndex(new int[] {2, 4, 7, 8, 9, 14, 17}, 4));
			//System.out.println(findArrayIndex(new int[] {2, 4, 7, 8, 9, 14, 17}, 6));
			//System.out.println(findArrayIndex(new int[] {2, 4, 7, 8, 9, 14, 17}, 20));
		}

}  

