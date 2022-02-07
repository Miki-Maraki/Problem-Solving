package list;

import java.util.ArrayList;

//Difference between length of array and size() of ArrayList in Java

public class LengthVsSize {
	
	public static void main(String[] args) {  
	    //creating array of 10 elements  
	    int arr[] = new int[10];                    // Array use length()
	    //storing 2 elements  
	    arr[0]=10;  
	    arr[1]=12;  
	    //printing length of array  
	    System.out.println(arr.length);//10  
	      
	    //Creating ArrayList  
	    ArrayList<String> list = new ArrayList<String>();  // ArrayList use size()
	    //storing 2 elements  
	    list.add("ankit");  
	    list.add("nippun");  
	    //printing size of ArrayList  
	    System.out.println(list.size());//2  
	}  

}
