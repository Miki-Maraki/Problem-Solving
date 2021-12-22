package linked;

// search method in LinkedList

public class SearchLinkedList {
	
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
}
