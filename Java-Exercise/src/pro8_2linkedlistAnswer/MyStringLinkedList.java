package pro8_2linkedlistAnswer;

// Programming Assignment 8-2
         // Use the class MyStringLinkedList in the source folder for this lab as a starting point 
         //for implementing a doubly linked list (with header) for use with String data. 

public class MyStringLinkedList {
	Node header;
	int listSize;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}
	boolean search(String searchStr) {
		if (header.next == null) {
			return false;
		} else {
			Node current = header.next;
			while (true) {
				if (current.value.equals(searchStr))
					return true;
				current = current.next;
				if (current == null)
					return false;
			}

		}
	}
	public String searchForMinSort(int index) {
		Node current = header.next;
		int count = 0;                 // local variable
		if (header.next == null) {
			return null;
		} else {
			while (current.next != null) {
				if (count == index)
					break;            // return current.value;
				current = current.next;
				count++;
			}
		}
		return current.value;
	}
	
	public boolean remove(String s) {
		if (header == null)
			return false;
		// Node current = new Node(null, null, null);
		Node current = header.next;
		while (true) {
			if (current.value.equals(s)) {
				current.previous.next = current.next;
				// if (current.next != null)
				current.next.previous = current.previous;
				listSize--;
				// current = header;
				break;
			}
			current = current.next;
			if (current == null)
				return false;
		}
		return true;
		// for (int i = 0; i < listSize; i++)
				/*
				  { String str = current.value; 
				  if (str.equals(s)) 
				  { current.previous.next = current.next; 
				  if (current.next !=null) current.next.previous = current.previous;				  
				  listSize--; 
				  break; 
				  } 
				  current = current.next; }
				 */
	}
	public void insert(String val, int pos) {
		if (pos < 0 || pos > listSize) {
			System.out.println("Invalid Position Value!");
			return;
		}
		if (isEmpty()) {
			header.next = new Node(null, header, val);
			return;
		}
		if (pos == listSize) {
			addLast(val);
			return;
		}
		if (pos == 0) {
			addFirst(val);
			return;
		}
		Node newNode = new Node(null, null, val);
		if (pos == 0) 
			addFirst(val);
		Node current = header.next;
		pos = pos - 1;
		for (int i = 0; i < listSize; i++) {
			if (i == pos) {
				newNode.next = current.next;
				newNode.previous = current;
				if (current.next != null) // check if this node is the last one -- Actually not used since addLast is called
					current.next.previous = newNode; 
				current.next = newNode;
				listSize++;
				break;
			}
			current = current.next;
		}
	}

	public void addLast(String item) {
		// Node n = new Node(null, null, item);
		Node n = new Node(header.next, header, item);
		n.value = item;
		n.next = null;

		if (header == null) {
			header = n;
		} else {
			Node current = header;
			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
			listSize++;
		}
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
		listSize++;
	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	public boolean isEmpty() {
		return listSize == 0;
	}

	// Sort codes -- start here
	public void sort() {
		if (isEmpty())
			return; // if(strArray == null || strArray.length <=1) return;
		// int len = strArray.length;
		int temp = 0;
		for (int i = 0; i < listSize; ++i) {
			int nextMinPos = minpos(i, listSize - 1);
			swap(i, nextMinPos);
		}
	}

	void swap(int i, int j) {
		// String temp = strArray[i];
		// strArray[i] = strArray[j];
		// strArray[j] = temp;
		/*
		 * Node temp = new Node(null, null, null); Node curr1 = new Node(null, null,
		 * null); Node curr2 = new Node(null, null, null);
		 */
		Node temp;
		Node curr1;
		Node curr2;
		curr1 = header.next;
		for (int k = 0; k < i; k++) {
			curr1 = curr1.next;
		}
		temp = curr1;
		/*
		 * temp.value = curr1.value; temp.next = curr1.next; temp.previous =
		 * curr1.previous;
		 */
		curr2 = header.next;
		for (int l = 0; l < j; l++) {
			if (curr2.next != null)
				curr2 = curr2.next;
		}
		curr1 = curr2;
		System.out.println(curr2);
		/*
		 * curr1.value = curr2.value; curr1.previous = curr2.previous; curr1.next =
		 * curr2.next;
		 */

		curr2 = temp;
		/*
		 * curr2.value = temp.value; curr2.next = temp.next; curr2.previous =
		 * temp.previous;
		 */

	}

	// find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top) {
		/*
		 * String m = strArray[bottom]; int index = bottom; for(int i = bottom+1; i <=
		 * top; ++i){ if(strArray[i].compareTo(m) < 0){ m = strArray[i]; index = i; } }
		 * //return location of min, not the min itself return index;
		 */

		// my implementation
		String m = searchForMinSort(bottom);
		int index = bottom;

		for (int i = bottom + 1; i <= top; ++i) {
			if (searchForMinSort(i).compareTo(m) < 0) {
				// System.out.println(searchForMinSort(i)); // just for tracing values
				m = searchForMinSort(i);
				index = i;
			}

		}
		return index; // location of min
	}
	// Sort code -- ends here

	class Node {
		String value;
		Node next;
		Node previous;

		// int listSize = 0;
		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addFirst("BA");
		list.addLast("CB");
		list.addLast("AD");
		list.addLast("AC");
		list.insert("NN", 4);
		list.printNodes();

		/*
		 * list.remove("AD"); list.printNodes();
		 */

		/*
		 * System.out.println("List before remove: "); list.printNodes();
		 * 
		 * list.remove("NN"); System.out.println("List after remove: ");
		 * list.printNodes(); list.printNodes();
		 * System.out.println("List before sort: ");
		 * 
		 * System.out.println("List item 0: " + list.searchForMinSort(0));
		 * System.out.println("List item 1: " + list.searchForMinSort(1));
		 * System.out.println("List item 2: " + list.searchForMinSort(2));
		 * System.out.println("List item 3: " + list.searchForMinSort(3));
		 * System.out.println("List item 3: " + list.searchForMinSort(4));
		 * 
		 * 
		 * 
		 * list.sort(); System.out.println("List after sort: "); list.printNodes();
		 * 
		 * 
		 * System.out.println("Search \"A\": " + list.search("A"));
		 * System.out.println("Search \"B\": " + list.search("B"));
		 * System.out.println("Search \"C\": " + list.search("C"));
		 * System.out.println("Current List Size: " + list.listSize);
		 */

	}
}
