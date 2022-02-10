package pro8_3_Comparable;

/*  Sorting Custom object by implementing Comparable interface
    Comparable interface has unimplemented method 
    public abstract int compareTo(T obj)  unimplemented method ...  T.is a class name
    Comparable is important to sort only by one field
*/
public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private double salary;

	public Customer(int id, String name, double salary) {  // constructor
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
/*	// sorting customer by using name
	public int compareTo(Customer c) {        // implemented method
		return this.name.compareTo(c.name);
	}*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	  // OR we can use Override toString method
	public String toString() {
		return "[id =" + id + ", name =" + name + ", salary =" + salary + "]";
	}

	// sorting customer by id
	public int compareTo(Customer c){  
			   if(this.id == c.id)  
			      return 0;  
			   else if(this.id > c.id)  
			      return 1;  
			   else  
			      return -1;  
			}
		
	        //  OR     sorting customer by id
//			public int compareTo(Customer c){  
//			return this.id > c.id ? 1 : this.id < c.id ? -1 : 0;
//			}


}
