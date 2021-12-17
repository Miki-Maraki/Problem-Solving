package ch_7SingleArray;

// Searching Arrays using Linear search and Binary search

public class ArraySearch {
	
	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key) {
	  for (int i = 0; i < list.length; i++)
	    if (key == list[i])
	      return i;   // if the value of 'key' is find, return i
	  return -1;       // no find the value of 'key' return -1
	}
   
	
	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
	  int low = 0;
	  int high = list.length - 1;
	
	  while (high >= low) {
	    int mid = (low + high) / 2;
	    if (key < list[mid])
	      high = mid - 1;
	    else if (key == list[mid])
	      return mid;
	    else                  // key > list[mid]
	      low = mid + 1;  
	  }
	  return -1 - low;
	}
}
