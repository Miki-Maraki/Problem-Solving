package pro8_2linkedlistAnswer;

//Programming Assignment 8-2
// Actual answer
public class MyStringLinkedListDouble {
	Node header;

	MyStringLinkedListDouble() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	public void addLast(String item) {
		if (isEmpty())
			header.next = new Node(null, header, item);
		else {
			Node newNode = new Node(null, null, item);
			Node temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.previous = temp;
		}
	}

	public void insert(String data, int pos) {

		if (pos > sizeOfList() || pos < 0)
			throw new IllegalStateException("Not allowed to put at this pos");
		if (isEmpty())
			header.next = new Node(null, header, data);
		if (pos == 0)
			addFirst(data);
		else {
			Node newNode = new Node(null, null, data);
			int m = 0;
			Node temp = header.next;
			while (m < pos) {
				temp = temp.next;
				m++;
			}
			if (pos == sizeOfList())
				addLast(data);
			else {
				newNode.next = temp;
				newNode.previous = temp.previous;
				temp.previous.next = newNode;
				temp.previous = newNode;
			}
		}
	}

	public boolean remove(String data) {
		if (isEmpty())
			return false;
		int count = 0;
		Node temp = header;
		boolean found = false;
		while (temp.next != null) {
			temp = temp.next;
			count++;
			if (data.equalsIgnoreCase(temp.value)) {
				found = true;
				break;
			}
		}
		if (count == sizeOfList()) {
			temp.previous.next = null;
		} else {
			temp.next.previous = temp.previous;
			temp.previous.next = temp.next;
		}
		return found;
	}

	public void minSort() {

		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
			Node temp2 = minNode(temp);
			swap(temp, temp2);
		}
	}

	public Node minNode(Node temp) {
		Node temp3 = temp;
		while (temp.next != null) {
			if ((temp3.value.compareTo(temp.next.value) > 0))
				temp3 = temp.next;
			temp = temp.next;
		}
		return temp3;
	}

	public void swap(Node temp, Node temp2) {
		String s = temp.value;
		temp.value = temp2.value;
		temp2.value = s;
	}

	public boolean binarySearch(String data) {
		if (isEmpty())
			return false;
		if (sizeOfList() == 1) {
			if (header.next.value.equalsIgnoreCase(data))
				return true;
			else
				return false;
		}
		boolean result = recSearch(0, sizeOfList() - 1, header, data);
		return result;
	}

	public boolean recSearch(int lower, int uper, Node header1, String data) {
		int mid = (lower + uper) / 2;
		int count = 0;
		Node temp = header1;
		while (count <= mid) {
			temp = temp.next;
			count++;
		}
		if (temp.value.equalsIgnoreCase(data))
			return true;
		if (lower < uper) {
			if ((temp.value.compareToIgnoreCase(data)) > 0) {
				lower = lower;
				uper = mid - 1;
				return recSearch(lower, uper, header1, data);
			}
			if ((temp.value.compareToIgnoreCase(data)) < 0) {
				lower = mid + 1;
				uper = uper;
				return recSearch(lower, uper, header1, data);
			}
		}
		return false;
	}

	public boolean isEmpty() {
		if (header.next == null)
			return true;
		return false;
	}

	public int sizeOfList() {
		if (header.next == null)
			return 0;
		int size = 1;
		Node temp = header.next;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		return size;
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

	class Node {
		String value;
		Node next;
		Node previous;
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
		MyStringLinkedListDouble list = new MyStringLinkedListDouble();
		String[] strArray = { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		for (int i = 0; i < strArray.length; i++) {
			list.addLast(strArray[i]);
		}

		list.addLast("AddLastItem");
		list.addFirst("AddFirsItem");
		//list.insert("InsertAtPos5", 5);

		System.out.println("Unsorted List:");
		list.printNodes();

		list.minSort();
		System.out.println();

		System.out.println("Sorted List:");
		list.printNodes();

		System.out.println("Search Items On The List:");
		System.out.println("Is the word 'number' found in the list? " + list.binarySearch("number"));
		System.out.println("Is the word 'tiny' found in the list? " + list.binarySearch("tiny"));
	
	}

}
