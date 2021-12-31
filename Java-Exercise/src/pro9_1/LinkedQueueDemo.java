package pro9_1;

public class LinkedQueueDemo {
	public static void main(String[] args) {
		 LinkedQueue q = new LinkedQueue();
		 q.display();
		 q.insert('A');
		 q.insert('B');
		 q.insert('C');
		 q.insert('D');
		 q.display();
		 System.out.println("Remove(): " + q.remove());
		 q.display();
		 System.out.println("peek(): " + q.peek());
		 q.insert('E');
		 q.insert('F'); 
		 System.out.println("Remove(): " + q.remove());
		 q.display();
		 System.out.println("size(): " + q.size()); 
		 System.out.println("isEmpty(): " + q.isEmpty());
		 LinkedQueue q1 = new LinkedQueue();
		 System.out.println("isEmpty(): " + q1.isEmpty());
}

}
