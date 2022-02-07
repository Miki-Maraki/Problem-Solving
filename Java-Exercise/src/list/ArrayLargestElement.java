package list;

public class ArrayLargestElement {
	
	public static void main(String[] args) {  
		  
        //Initialize array  
        int [] arr = new int [] {25, 11, 33, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  // Initially max is 25 then iterate
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}
/*
   int [] arr = new int [] {25, 11, 33,7, 25, 7, 75, 56};  
   int min = arr[ 0];
   for(int i =0; i <arr.length; i++){
     if (arr[i] < min)
     min = arr[i];
     
   }
   System.out.println(min);
   for (int i = arr.length-1; i >0; i--){   //reverse
         System.out.println(arr[i] + ", ");
   }
   
   for(int i = 0; i <arr.length; i++){  // find duplicate
       for(int j = i+1; j<arr.length; j++){
            if(arr[i] = arr[j])
            System.out.println(arr[j]);
            }
       }
       
       int sum = 0;
       for(int i = 0; i<arr.length; i++){
             sum = sum + arr[i];
             System.out.println(sum);
       }
   
   int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
   for(int i = 0; i <arr.length; i=i+2){  //even
        System.out.println(arr[i])
   }
   for(int i = 1; i <arr.length; i=i+2){  //odd
        System.out.println(arr[i])
   }


*/

















