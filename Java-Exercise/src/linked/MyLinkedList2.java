package linked;

public class MyLinkedList2 {
     Node startNode = null;
	
	public void print() {
		Node temp = startNode;
		while (temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	boolean search(String s) {
		
		if(s == null) return false;
		Node temp = startNode;
		while(temp != null) {
			String t = temp.data;  // where is the data come?? bc class Node has data and next
			if(s.equals(t)) {                                          // String data;
				return true;                                            // Node next;
			}
			temp = temp.next;    // temp.next means the loop like i++;
		}
		return false;
	}
	
	void removeNode(String s) {
		if(s == null) return;
		if(startNode == null) return;
		if(startNode.data.equals(s)){
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
/*	
	public void build(String[] arr){
		if(arr == null || arr.length == 0) return;
		startNode = new Node(arr[0]);
		Node current = startNode;
		for (int i = 1; i < arr.length; i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		}		
	}
	*/
	public static void main(String[] args) {
		String[] arr = {"mike", "andy", "joe", "anne"};
		MyLinkedList2 list = new MyLinkedList2();
		//list.build(arr);
		list.print();		
	}
}
