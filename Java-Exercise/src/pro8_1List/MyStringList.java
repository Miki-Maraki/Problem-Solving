package pro8_1List;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;	
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	
	// Sort codes -- start here
	public void sort() {
		if(strArray == null || strArray.length <=1) return;
		int len = strArray.length;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
		
	}
	void swap(int i, int j){
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String m = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i].compareTo(m) < 0){ 
				m = strArray[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	// Sort code -- ends here
	// Search code -- start here
	boolean search(String val) {
		boolean b = recurse(0,strArray.length-1, val);
		return b;
	}
	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(strArray[mid].equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(strArray[mid]) > 0 ) return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	
	// search code -- ends here
	
	public static void main(String[] args){
		MyStringList l = new MyStringList();

        l.add("big");
		l.add("small");
		l.add("tall");
		l.add("short");
		l.add("round");
		l.add("square");
		l.add("enormous");
		l.add("tiny");
		l.add("gargantuan");
		l.add("lilliputian");
		l.add("numberless");
		l.add("none");
		l.add("vast");
		l.add("miniscule");
		l.add("Moke");
		l.add("Beki");
		/*l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		//System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		//System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		//System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		//System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
		
		l.add("Moke");
		l.add("Ahmed");
		l.add("Beki");
		l.add("Sunil");
		l.add("Arthur");*/	
		System.out.println("Unsorted List: "+ Arrays.toString(l.strArray));	
		l.sort();
		System.out.println("Sorted List: "+ Arrays.toString(l.strArray));		
		System.out.println("Is \"number\" on the list: "+ l.search("number"));	
		System.out.println("Is \"tiny\" on the list: "+ l.search("tiny"));					
	}
}
