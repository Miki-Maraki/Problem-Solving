package pro8_1_listExercise;

public class MyStringList {
	private final int arrSize = 3;
	private String[] arr; 
	private int size;
	
	public MyStringList() {
		arr = new String[arrSize];
		size = 0;
	}
	public void add(String s){
		if(size == arr.length) resize();
		arr[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return arr[i];
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
		if(index == -1) return false;
		String[] temp = new String[arr.length];
		System.arraycopy(arr,0,temp,0,index);
		System.arraycopy(arr,index+1,temp,index,arr.length-(index+1));
		arr = temp;
		--size;
		return true;
	}
	
	private void resize(){
		System.out.println("resizing");
		int len = arr.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(arr,0,temp,0,len);
		arr = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(arr[i]+", ");
		}
		sb.append(arr[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	public void sort() {
		if(arr == null || arr.length <=1) return;
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
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
	
	boolean search(String val) {
		boolean b = recurse(0,arr.length-1, val);
		return b;
	}
	
	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(arr[mid].equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(arr[mid]) > 0 ) return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	
	//public static 
	

}
