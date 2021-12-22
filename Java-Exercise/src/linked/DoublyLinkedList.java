package linked;

public class DoublyLinkedList {
	Node header;
	DoublyLinkedList(){
		header = new Node(null,null, null);
	}
	//adds to the front of the list
	public void add(String item){
		Node n = new Node(header.next, header, item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
	}
	
	public String toString() { 
		StringBuffer sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		String result = sb.toString();
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;	
	}
	
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Harry");
		list.add("Steve");
		System.out.println(list);
	}

}
