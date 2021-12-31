package pro9_1;

// lecture code stack
public interface Stack1 {
	public void push(Object ob);
	public Object pop();
	public Object peek();
	public boolean isEmpty();
	public int size();
	}

	class ArrayStack implements Stack1 {
	private Object a[];
	private int top; // stack top
	
	public ArrayStack(int n) // constructor
	{ a = new Object[n]; // create stack array
	top = -1; // no items in the stack
	}
	
	public void push(Object item) // add an item on top of stack
	{
	if(top == a.length-1)
	{ 
		System.out.println("Stack is full");
		return;
	}
	top++; // increment top
	a[top] = item; // insert an item

	}
	public Object pop() // remove an item from top of stack
	{
	if( isEmpty() )
	{ System.out.println("Stack is empty");
	return null;
	}
	Object item = a[top]; // access top item
	top--; // decrement top
	return item;
	}
	public Object peek() // get top item of stack
	{ if( isEmpty() ) return null;
	return a[top];
	}
	public boolean isEmpty() // true if stack is empty
	{ return (top == -1); }
	public int size() // returns number of items in the stack
	{ return top+1; }
	}

	
