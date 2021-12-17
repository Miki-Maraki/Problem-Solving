package ch_7SingleArray;

public class TestPassArraySwap {
	
	/** Main method */
	  public static void main(String[] args) {
	    int[] a = {1, 2};

	    // Swap elements using the swap method
	    System.out.println("Before invoking swap");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    
	    swap(a[0], a[1]); // 
	    
	    System.out.println("After invoking swap");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

	    // Swap elements using the swapFirstTwoInArray method
	    System.out.println("Before invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	    
	    swapFirstTwoInArray(a);
	    
	    System.out.println("After invoking swapFirstTwoInArray");
	    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	  }

	  /** Swap two variables */
	  public static void swap(int n1, int n2) {
	    int temp = n1;                              // temp = 1
	    n1 = n2;                                    // n1 = 2   
	    n2 = temp;                                   // n2 = 1  it come from line 30
	  }

	  /** Swap the first two elements in the array */
	  public static void swapFirstTwoInArray(int[] array) {
	    int temp = array[0];
	    array[0] = array[1];
	    array[1] = temp;
	  }

}
