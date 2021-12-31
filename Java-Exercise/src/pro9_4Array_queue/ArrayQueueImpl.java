package pro9_4Array_queue;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean enqueue(int val) {
		if (rear == arr.length) {
			resize();
		}
		arr[rear] = val;	
		rear++;
		size++;
		return true;
	}

	public int dequeue() {
		/*if(isEmpty() || front >= arr.length) throw new IllegalStateException("Empty Queue!");
		int item = arr[front];
		//arr[front] = 0;
		front++;
		return true;*/
		
		if(isEmpty() || front >= arr.length) throw new IllegalStateException("Empty Queue!");
		int item = arr[front];
		//arr[front] = 0;
		front++;
		size--;
		return item;
	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		else return arr[front];
	}

	private void resize() {
		System.out.println("Resizing...");
		int [] tempStrArray = new int[2 * size];
		System.arraycopy(arr, front, tempStrArray, front, size());
		arr = tempStrArray;
		
	/*	arr = null;
		arr = new int[2 * size];
		System.arraycopy(tempStrArray, 0, arr, 0, size);
		tempStrArray = null;*/

	}
	public int size() { // returns current number of items in the queue
		return size;//return rear - front;
	}
	
	public void printQueue() {
		 for(int i = front; i < rear; i ++)
			 System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		 //uncomment when ready
		 for(int i = 0; i < 15; i ++) {
		 q.enqueue(i);}
		 for(int i = 0; i < 14; i ++) {
		 q.dequeue();}
		 
		 q.printQueue();
		 System.out.println("Front: " +q.front);
		 System.out.println("Rear: " +q.rear);
		 System.out.println("Size: " +q.size());
		 
		 q.enqueue(100);
		 q.enqueue(200);
		 q.enqueue(300);
		 
		 System.out.println("Peek output: " + q.peek());
		 System.out.println("Removed Val: " +q.dequeue());

		 q.printQueue();
		 System.out.println("Size: " +q.size());
		 System.out.println("Peek output: " + q.peek());
		 
	}

}
