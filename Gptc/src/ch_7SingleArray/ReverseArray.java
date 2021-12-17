package ch_7SingleArray;

//Returning an Array from a Method
public class ReverseArray {

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {  // As result.length = 6, j(index) = result.length -1 = 5
			result[j] = list[i];                                             
		}                         
		return result;           
	}      
	
	// Trace the reverse Method
	int[] list1 = { 1, 2, 3, 4, 5, 6 };
	int[] list2 = reverse(list1);        //  result 6	5	4	3	2	1
     
	         //out put will be
/*	      i = 0 and j = 5 ----->> Assign list[0] to result[5].....the value for i index at 0 is 1 , which 'll be the value for j index at 5 is 1
          i = 4 and j = 1 ----->> Assign list[i] to result[j]------>>> at i index = 4 value is 5 , so put 5 at j index 1 
          i = 5 and j = 6 ----->> Assign list[i] to result [j]
          
            list 1	2	3	4	5	6
          result 6	5	4	3	2	1   // list2
*/	
}
