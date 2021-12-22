package linked;

public class SinglyLinkedListWithHeader {
Node header = null; //contains no data, cannot be removed
	
	public SinglyLinkedListWithHeader() {  // constructor
		//header should never be null
		header = new Node();
	}
	boolean search(String s) {
		if(s == null) return false;
		//start node for searches is header.node
		Node next = header.next;
		while(next != null) {
			String t = next.data;
			if(s.equals(t)) {
				return true;
			}
			next = next.next;
		}
		return false;
	}	
	void printNodes() {
		Node next = header.next;
		while(next != null) {
			System.out.print(next);
			next = next.next;
		}
		System.out.println();
	}	
	void addNode(String s) {
		Node newNode = new Node();
		newNode.data = s;	
		//link from newNode to current header.node
		newNode.next = header.next;	
		//link from header to newNode
		header.next = newNode;		
	}
	void removeNode(String s) {
		if(s == null) return;
		Node next = header.next;
		Node previous = header;	
		//No special case for removing first node
		while(next != null) {
			if(s.equals(next.data)) {
				previous.next = next.next;
				return;
			}
			previous = next;
			next = next.next;		
		}
	}
	/** Implement as inner class */
	private class Node {
		String data;
		Node next;
		
		@Override
		public String toString() {
			return data + " ";
		}
	}	
	
	public static void main(String[] args) {
		String[] stringData = {"Albert", "Billy", "Charles", "David", "Emma"};
		SinglyLinkedListWithHeader sll = new SinglyLinkedListWithHeader();
		//populate
		for(int i = stringData.length -1; i >= 0; i--) {
			sll.addNode(stringData[i]);
		}
		boolean foundCharles = sll.search("Charles");
		System.out.println("Found Charles? " + foundCharles);
		
		sll.printNodes();
		sll.addNode("Frank");
		sll.removeNode("David");
		sll.printNodes();
	}

}
