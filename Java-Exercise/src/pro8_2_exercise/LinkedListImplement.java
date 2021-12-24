package pro8_2_exercise;

public class LinkedListImplement {
	Node header;

	LinkedListImplement() { // constructor
		header = new Node(null, null, null);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node() {
		}

		Node(Node previous, Node next, String value) {
			this.previous = previous;
			this.next = next;
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

	public Node add(String item) {
		Node n = new Node(header, header.next, item);
		if (header.next != null) {
			header.next = n;
		}
		header.next = n; // header.next ~ loop
		return n;
	}

	public void printNodes() {
		Node next = header.next;
		StringBuilder printedNodes = new StringBuilder();
		while (next != null) {
			printedNodes.append(next.value + ", ");
			next = next.next;
		}
		System.out.println(printedNodes.toString());
	}

//	public void printNodes() {
//		Node next = header.next;
//		if (next == null)
//			System.out.println("");
//		else {
//			String s = next.toString();
//			System.out.println(s);
//		}
//	}
	public Node getNode(int pos) {
		if (pos >= size())
			throw new IndexOutOfBoundsException();
		Node next = header;
		for (int i = 0; i <= pos; i++) {
			next = next.next;
		}
		return next; // next is the node we are seeking
	}

	public String get(int pos) { /// 6
		Node node = getNode(pos);
		return (node != null) ? node.value : null;
	} // returns the index of the String s, if found; -1 otherwise

	public int size() {
		int count = 0;
		Node next = header.next;
		while (next != null) {
			++count;
			next = next.next; // make loop
		}
		return count;
	}

	public int find(String s) {
		if (s == null)
			return -1;
		Node currentNode = header;
		int i = -1;
		while (currentNode.next != null) {
			++i;
			currentNode = currentNode.next;
			if (s.equals(currentNode.value))
				return i;
		}
		return -1;
	}

	public void insert(String s, int pos) {
		if (pos > size()) {
			throw new IndexOutOfBoundsException("pos = " + pos + " but size = " + size());
		}
		Node next = header;
		Node previous = null;
		for (int i = 0; i <= pos; ++i) {
			if (i == pos) {
				previous = next;
			}
			next = next.next;
		}
		Node insertNode = new Node(next, previous, s);
		if (next != null) {
			next.previous = insertNode;
		}
		previous.next = insertNode;
	}

	public boolean remove(int index) { // remove object at specified index
		Node toBeRemoved = getNode(index);
		if (toBeRemoved == null)
			return false;
		Node previous = toBeRemoved.previous;
		Node next = toBeRemoved.next;
		previous.next = toBeRemoved.next;
		if (next != null) {
			next.previous = toBeRemoved.previous;
		}
		toBeRemoved = null;
		return true;
	}

	public boolean remove(String s) { // remove by specifying object -- removes first occurrence of s
		int pos = find(s);
		if (pos == -1)
			return false;
		return remove(pos);
	}

	public String toString() {
		Node next = header.next;
		String output = next.toString();
		return ("[" + output + "]");
	}

	// sort
	private void swap(Node s, Node t) {
		String temp = s.value;
		s.value = t.value;
		t.value = temp;
	}

	public void sort() {
		int size = size();
		if (size <= 1)
			return;
		Node curr = header;
		while (curr.next != null) {
			curr = curr.next;
			Node min = minNode(curr);
			// this places the min val in curr, so we do not need to reset value of curr
			// here
			swap(min, curr);
		}
	}

	// find the Node having min value nested inside theNode
	public Node minNode(Node theNode) {
		if (theNode == null || theNode.next == null)
			return theNode;
		String minVal = theNode.value;
		Node minNode = theNode;
		Node currentNode = theNode;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
			if (currentNode.value.compareTo(minVal) < 0) {
				minVal = currentNode.value;
				minNode = currentNode;
			}
		}
		return minNode;
	}
	// search a sorted array
	// Note: because locating the middle value in the list takes linear time each
	// time it's performed,
	// binary search for linked lists is no more efficient than the usual find
	// method

	boolean binSearch(String val) {
		boolean b = recurse(0, size() - 1, val);
		return b;
	}

	boolean recurse(int lower, int upper, String val) {
		int mid = (lower + upper) / 2;
		if (get(mid).equals(val))
			return true;
		if (lower > upper)
			return false;
		if (val.compareTo(get(mid)) > 0)
			return recurse(mid + 1, upper, val);
		return recurse(lower, mid - 1, val);
	}

	public static void main(String[] args) {
		LinkedListImplement lli = new LinkedListImplement();
		lli.add("King");
		lli.add("Dave");

		lli.printNodes();
//		lli.add("Mike");
//		lli.add("Joel");
//		lli.add("Xavi");
//		lli.add("Abe");
//		lli.add("Sami");
//		lli.add("Heran");
//		lli.add("Kassa");
//		
//		lli.printNodes();
		/*
		 * lli.getNode(6); System.out.println("what get the node at 6 : " +
		 * lli.getNode(6)); lli.get(3); System.out.println("get the value at 3 : " +
		 * lli.get(3)); // Abe lli.size();
		 * System.out.println("Size of the linked list is : " + lli.size());
		 * lli.find("Dave"); System.out.println("where Dave found in the linkedlist : "
		 * + lli.find("Dave"));
		 * System.out.println("where Zaki found in the linkedlist : " +
		 * lli.find("Zaki")); // -1 lli.insert("Bob", 4);
		 * System.out.println("insert \"Bob\" at index 4 : " + lli ); lli.insert("Sara",
		 * 7); System.out.println("insert \"Sara\" at index 7 : " + lli ); lli.size();
		 * System.out.println("Size of the linked list is : " + lli.size()); /*
		 * lli.remove(2); System.out.println("remove the node at index 2 : " +
		 * lli.remove(2)); lli.remove("Xavi");
		 * System.out.println("remove Xavi from Node : " + lli.remove("Xavi"));
		 */
		/*
		 * System.out.println("Unsorted linkedlist are : " + lli); lli.sort();
		 * System.out.println("Sorted linkedlist are  :  " + lli);
		 * lli.binSearch("King");
		 * System.out.println("Does linked list contain \"King\"  : " +
		 * lli.binSearch("King"));
		 * System.out.println("Does linked list contain \"George\"  : " +
		 * lli.binSearch("George"));
		 */
	}
}
