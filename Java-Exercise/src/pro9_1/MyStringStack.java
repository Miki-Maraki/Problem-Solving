package pro9_1;

// Programming Assignment 9-1
public class MyStringStack {
	private MyStringLinkedList list;
	private int stackSize = 0;

	public MyStringStack() {
		list = new MyStringLinkedList();
	}

	public String pop() {    //remove top
		// implement
		String removedItem = list.get(0);
		if (list.remove(0)) {
			stackSize--;
			return removedItem;			
		}
		return null;
	}

	public String peek() {     // view at the top of stack
		// implement
		String output = list.get(0);
		return output;
	}

	public void push(String s) {  // insert
		// implement
		list.add(s);
		stackSize++;
	}
	public String get(int i) {
		// implement
		String val = list.get(i);
		return val;
	}

	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack(); 
		stack.push("Bob"); 
		stack.push("Harry"); 
		stack.push("Alice");
	
		System.out.println("Popping… "+stack.pop()); 
		System.out.println("Peeking… "+stack.peek()); 
		System.out.println("Popping… "+stack.pop());
		
		for(int i = 0; i<stack.stackSize;i++) {
			System.out.print(stack.get(i) + " ");
		}
	}


}
