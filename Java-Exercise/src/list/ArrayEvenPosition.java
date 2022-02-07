package list;

public class ArrayEvenPosition {
	
	int [] ar;       //= new int[] {2,5,7,8,9,12,13,16,19};// sorted array
	 int num;        // int num = 8, 17, 23
    public int findIndex(int[] ar, int num) {// method
    	for(int i = 0; i < ar.length; i ++) {
    		if(num == ar[i]) {
    			return i;
    		}else if (num < ar[i]) {
    			return i;			
    		}
    	}
    	return ar.length;
    }
	
	public static void main(String[] args) {  
		  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        } 
    } 
}
