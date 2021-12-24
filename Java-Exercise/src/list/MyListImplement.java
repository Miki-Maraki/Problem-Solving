package list;

public class MyListImplement {
	private final int arraySize = 2;
	private String[] arr; 
	private int size;
	
	public MyListImplement() {
		arr = new String [arraySize];
		size = 0;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(arr[i]+", ");
		}
		sb.append(arr[size-1]+"]");
		return sb.toString();
	}
	public void add(String s){
		if(size == arr.length) {
			resize();
		}
		arr[size++] = s;
	}
	public void resize() {
		int len = arr.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen]; // create new array 'temp'
		System.arraycopy(arr,0,temp,0,len); // copy arr, 0 to arr=0 and 0=len, put them on new array 'temp'
		arr = temp;                         // new array is temp
	}
	public String get(int i) {
		if(i < 0 || i >= size){
			return null;
		}
		return arr[i]; // what is the value on 'i index'
		}
	public boolean find(String s){
		for(String test : arr){
			if(test.equals(s)) return true;
		}
		return false;
	}
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= arr.length||size+1 > arr.length) {
			resize();
		}
		String[] temp = new String[arr.length+1];
		System.arraycopy(arr,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(arr,pos,temp,pos+1, arr.length - pos);
		arr = temp;
		++size;	
	}
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(arr[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[arr.length];
		System.arraycopy(arr,0,temp,0,index);
		System.arraycopy(arr,index+1,temp,index,arr.length-(index+1));
		arr = temp;
		--size;
		return true;
	}
	public int size() {
		return size;
	}
	public void sort() {
		if(arr == null || arr.length <= 1) return;
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i, len-1);
			swap(i,nextMinPos); 
		}	
	}
	void swap(int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String m = arr[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(arr[i].compareTo(m) < 0){ 
				m = arr[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}

	
public static void main(String [] args) {
	MyListImplement ml = new MyListImplement();
	ml.add("King");
	ml.add("Dani");
	ml.add("George");  ///"My arrayList after \"Joel\" inserting : " +
	ml.add("Xavi");
	System.out.println("Mylist from adding : " + ml);
	ml.add("Mike");
	ml.add("Bob");
	System.out.println("My arrayList after resizing : " + ml);
	ml.get(3);
	System.out.println("what is the value at index 3 : " + ml.get(3));
	ml.find("Mike");
	System.out.println("Is \"Mike\" found in the list : " + ml.find("Mike"));
	ml.insert("Joel", 4);
	System.out.println("My arrayList after \"Joel\" inserting is : " + ml);
	//ml.remove("George");
	//System.out.println( "My arrayList after remove \"George\" is : " + ml);
    ml.sort();
    System.out.println("Mylist after sorted is : " + ml);
}	
}