package list;

/*  One difficulty with our examples of Lists –MyStringList and MyStringLinkedList – is that they 
    don’t work if the objects we wish to store are not  Strings.
    
----->>>>    A Better Solution: Could create a List that stores elements of type Object.

public class MyObjectList {
	
	private final int INITIAL_LENGTH = 4;
	private Object[] objArray; 
	private int size;
	
	public MyObjectList() {
	     objArray = new Object[INITIAL_LENGTH];
	          size = 0;
	      }
	public void add(Object ob){
	      if(size == objArray.length) resize();
	         objArray[size++] = s;
	     }
	//USAGE
	MyObjectList list = new MyObjectList();
	list.add("Bob");
	list.add("Sally");
	String name = (String)list.get(1); //downcast necessary
}

 public class MyObjectLinkedList {
      Node header;
     MyObjectLinkedList (){
     header = new Node(null,null, null);
            }

public void add(Object item){
        Node n = new Node(header.next,header,item);
          if(header.next != null){
            header.next.previous = n;
          }
         header.next = n;
            }

     class Node {
          Object value;
           Node next;
           Node previous;
        Node(Node next, Node previous, Object value){
         this.next = next;
          this.previous = previous;
            this.value = value;
            }
        }
    }
*/