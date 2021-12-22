package list;

      //check the search method in a sorted arrayList
public class SearchList {
       int[] anArray; 
	
	SearchList(int[] anArray) {   // parameterized constructor
		this.anArray = anArray;
	}
	
	public boolean search(int val) {
		boolean b = recurse(0, anArray.length - 1, val);
		return b;
	}
	public boolean recurse(int a, int b, int val) {
		int mid = (a + b) / 2;
		if (anArray[mid] == val) return true;
		if (a > b) return false;
		if (val > anArray[mid]) return recurse(mid + 1, b, val);
		return recurse(a, mid - 1, val);
	}
  public static void main(String [] args) {
	  int[] arr = {3, 6, 7, 9, 13, 18, 25, 31, 39};
	  SearchList sr = new SearchList(arr); 
	  System.out.println( "Is \"5\" found in the array list : " + sr.search(5)); 
	  System.out.println( "Is \"7\" found in the array list : " + sr.search(7)); 
	  System.out.println( "Is \"17\" found in the array list : " + sr.search(17)); 
	  
/*	 
	  SearchList s = new SearchList(new int[] {3, 6, 7, 9, 13, 18, 25, 31, 39});  
	  System.out.println( "Is \"5\" found in the array list : " + s.search(5));    // false
	  System.out.println( "Is \"7\" found in the array list : " + s.search(7));     // true
	  System.out.println( "Is \"17\" found in the array list : " + s.search(17));   // false
*/
  }
}