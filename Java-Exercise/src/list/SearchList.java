package list;

      //Programming Assignment 8-1
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
	  SearchList s = new SearchList(new int[] {3, 6, 7, 9, 13, 18, 25, 31, 39});
	  System.out.println( s.search(5)); 
	  System.out.println( s.search(7)); 
	  System.out.println( s.search(17)); 
  }
}