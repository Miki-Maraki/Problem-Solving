package list;

public class MyTestList {
	
	private String[] arr;
	private int arraySize = 5;
	private int index;

	public MyTestList() {
		arr = new String[arraySize];
		index = 0;
	}

	public void add(String s) {
//		if(index==arraySize) {   // if(size = arraySize.length )
//			resize();
//		}
		arr[index++] = s;
	}

	public boolean findElement(String s) {
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(s)) {            // s.equals(arr[i]) , if(arr[i] = s)
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sr = new StringBuilder();
		for (int i = 0; i < index; i++) {
			sr.append(arr[i] + ", ");
		}
		return "{ " + sr + " }";
	}

	public static void main(String[] args) {
		MyTestList l = new MyTestList();

		l.add("Nigus");
		l.add("Mike");
		l.add("Joel");
		l.add("Tommy");
		l.add("JJ");
		// l.add("GG");
		System.out.println(l); // add
		
		System.out.println(l.findElement("Tommy"));   // findElement, true
		System.out.println(l.findElement("hh"));      //     "      , false

	}


}
