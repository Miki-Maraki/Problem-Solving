package linked;

//build a linkedlist using Node data structure.

public class Node {
	String data;
	Node next;
	private Node startNode;
	
	public boolean search(String s) {
		if (s == null) return false;
		Node temp = startNode;
		while (temp != null) {
			String t = temp.data;
			if (s.equals(t)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
	}
	
	// remove Node
	void removeNode(String s) {
		if(s == null) return;
		if(startNode != null && startNode.data.equals(s)) {
			startNode = startNode.next;
			return;
		}
		Node previous = startNode;
		Node temp = startNode.next;
		while(temp != null) {
			if(s.equals(temp.data)) {
				previous.next = temp.next;
				return;
			}
			previous = temp;
			temp = temp.next;
		}
	}
}

     
