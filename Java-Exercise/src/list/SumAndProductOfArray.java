package list;

import java.util.Arrays;

// Write a program to find the sum and product of all elements of an array.
public class SumAndProductOfArray {
	
	public static void main(String[] args) {  
        //Initialize array  / given array
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        int product = 1;
        //Loop through the array to calculate sum and product of elements  
        for (int i = 0; i < arr.length; i++) {                                   
           sum += arr[i];        // sum = sum + arr[i];             
           product *= arr[i];    // product = product * arr[i]; 
        }  
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Sum of all the elements of an array: " + sum);
        System.out.println("Product of all the elements of an array: " + product);
    }  

}
