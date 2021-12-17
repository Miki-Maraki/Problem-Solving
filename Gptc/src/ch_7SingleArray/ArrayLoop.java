package ch_7SingleArray;

public class ArrayLoop {
	
/* 	   The array elements are accessed through the index. 
         double [] myList = new double[];   
	--->> also can declare Array   double [] myList; .... but has no value
	--->> aslo can create Array    myList = new double[10];
	--->> find its size using by   myList.length;
  	---->> myList is Array reference variable
  	// Default value of Array is 
  	 0 for the numeric primitive data types, 
     '\u0000' for char types, and 
     false for boolean types. 
     
     Declaring, creating, initializing in one step: Array initializers
	double[] myList = {1.9, 2.9, 3.4, 3.5};
	
	public static void main(String[] args) {
	    int[] values = new int[5];
    for (int i = 1; i < 5; i++) {
      values[i] = i + values[i-1];          //  0	1	2	3	4   .... i integers 
        }     after the forth iteration    //  11	1	3	6	10  ....  i values
    values[0] = values[1] + values[4];     //  11 =  values[1] = 1 + values[4] = 10
  }
     index 2 =index 2+index 3
     index 3 =index 3+ index 4
     int [] num = {4,6,7,9,10}
     for(int i = 2;i < num.length; i++){
      num[i] = num[i] + num[i+1];
      }
       return num;


*/	
	public static void main(String[] args) {
	    printMax(34, 3, 3, 2, 56.5, 28);
	    printMax(new double[]{4,1, 5, 9, 2, 3});
	  }

	  public static void printMax(double... numbers) {
	    if (numbers.length == 0) {
	      System.out.println("No argument passed");
	      return;
	    }

	    double result = numbers[0];
	    for (int i = 1; i < numbers.length; i++)
	      if (numbers[i] > result)
	        result = numbers[i];

	    System.out.println("The max value is " + result);
	  }

}
