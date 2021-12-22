package list;

public class MyListTest {
	private String[] arr;
	private final int arraySize = 5;
	private int index;

	public MyListTest() { // constructor
		arr = new String[arraySize];
		index = 0;
	}

	public void add(String s) {
		if (index == arr.length) { // if(size == arraySize.length ) if int size;
			resize();
		}
		arr[index++] = s;
	}

	public void resize() {
		System.out.println("resizing");
		int len = arr.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(arr, 0, temp, 0, len); // len = arr.length
		arr = temp; // temp is new arr 
	}

	public String get(int i) {
		if (i < 0 || i > arr.length) {
			return null;
		}
		return arr[i];
	}

	public boolean findElement(String s) {
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(s)) { // s.equals(arr[i]) , if(arr[i] == s)
				return true;
			}
		}
		return false;
	}

	public boolean find(String s) {
		for (String test : arr) {
			if (test.equals(s)) // if(test == s) return true;
				return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos > arr.length)
			return;
		if (pos >= arr.length || index + 1 > arr.length) {
			resize();
		}
		String[] temp = new String[arr.length + 1];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		temp[pos] = s;

		System.arraycopy(arr, pos, temp, pos + 1, arr.length - pos);
		arr = temp;
		index++;
		//++;
	}

	public boolean remove(String s) {
		if (index == 0)
			return false;
		int removedElementIndex = -1;//
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i].equals(s)) { // if(strArray[i] == s);
				removedElementIndex = i;
				break;
			}
		}
		if (removedElementIndex == -1) {
			return false;
		}
		String[] temp = new String[arr.length];
		System.arraycopy(arr, 0, temp, 0, removedElementIndex);
		System.arraycopy(arr, removedElementIndex + 1, temp, removedElementIndex,
				arr.length - (removedElementIndex + 1));
		arr = temp;
		//--arraySize;
		--index;
		return true;
	}
	
	// Sort codes -- start here
		public void sort() {
			if(arr == null || arr.length <=1) return;
			int len = arr.length;
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

//	public void sort() {
//		if (arr == null || arr.length <= 1)
//			return;
//		int len = arr.length;
//	
//		for (int i = 0; i < len; ++i) {
//			int nextMinPos = minpos(i, len - 1); // ????????????minpos is a method
//			swap(i, nextMinPos);
//		}
//	}
//
//	public void swap(int i, int j) {
//		String temp = arr[i];
//		arr[i] = arr[j];
//		arr[j] = temp;
//	}
//
//	// find minimum of arr between the indices bottom and top
//	private int minpos(int bottom, int top) {
//		String m = arr[bottom];
//		int minimumElementIndex = bottom;
//		for (int i = bottom + 1; i <= top; ++i) {
//			if (arr[i].compareTo(m)< 0) { // if arr[i] < m, it returns negative number // ????????????if(arr[i] < 0);
//				m = arr[i];
//				minimumElementIndex = i;
//			}
//		}
//		return minimumElementIndex; // return location of min, not the min itself
//	}

	@Override
	public String toString() {
		StringBuilder sr = new StringBuilder();
		for (int i = 0; i < index; i++) {
			sr.append(arr[i] + ", ");
		}
		return "{ " + sr + " }";
	}

	public static void main(String[] args) {
		MyListTest l = new MyListTest();

		l.add("Nigus");
		l.add("Mike");
		l.add("Joel");
		l.add("Tommy");
		l.add("Lewis");
		l.add("Dani");

		l.add("joy");
		l.add("bob");
		System.out.println("add bob after resizing : " + l);

		l.insert("Abe", 4);
		// System.out.println("array list after insert \"Abe\" : " + l);

		l.remove("Mike"); // { Nigus, Joel, Tommy, Abe, Lewis, Dani, joy, bob, }
		// System.out.println("array list after remove \"Mike\" : " +l);
		l.findElement("Tommy");
		System.out.println("Is \"Tommy\" found in the array list : " + l.findElement("Tommy"));
		l.find("Tommy"); // findElement = find
		System.out.println("Is \"Tommy\" found in the array list : " + l.find("Tommy"));
		System.out.println("All element : " + l);
		l.get(5); // null
		System.out.println("what is the value array list index 5: " + l.get(5)); // null
		l.get(3); // Abe
		System.out.println("what is the value array list index 3: " + l.get(3)); // Abe
		l.minpos(0, 6); // fixed 3
		System.out.println("minimum of array b/n indices bottom and top: " + l.minpos(0, 7));
		l.sort();
		// System.out.println("the array list after sorted : " + l.arr);

		// l.sort();
		// System.out.println("the array list after sorted : " + l.arr);
		// System.out.println(Arrays.toString(l.arr));
		// System.out.println("the array list after sorted : " + l.sort());

	}

}
