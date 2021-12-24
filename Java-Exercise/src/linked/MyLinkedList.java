package linked;

// implement of LinkedList
public class MyLinkedList {
	Node header;
	MyLinkedList(){
		header = new Node(null,null, null);
	}
	public void add(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		
	}
	class Node {
		String data;
		Node next;
		Node previous;
		Node(Node next, Node previous, String data){
			this.next = next;
			this.previous = previous;
			this.data = data;
		}
	}


}
