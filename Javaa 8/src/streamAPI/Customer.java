package streamAPI;

public class Customer {
	String name;
	int age;
	double salary;
	Customer(String name, int age, double salary){	
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	 public String getName() {  
	        return name;  
	    } 
	 public int getAge() {  
	        return age;  
	    }   
	    public double getSalary() {  
	        return salary;  
	    }  
	public String toString() {
		return "Name = " + name + " , Age =" + age + " , Salary= " + salary;
	}
/*	Do methods:Intermediate stream and terminate stream
    doing methods:	Distinct, filter, forEach, accept, test, sort, limit
	filter age>= 30, filter start "D", collect salary < 5000 by name , collect start "M", count salary = 5200, print	
*/
	
	
}
	
