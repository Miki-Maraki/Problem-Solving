package list;

public class ArraySmallestElement {
	
	public static void main(String[] args) {  
		  
        //Initialize array  
        int [] arr = new int [] {25, 11, 17, 75, 9, 56};  
        //Initialize min with first element of array.  
        int min = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with min  
           if(arr[i] < min)     // initially min is 25 then iterate
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  

}
