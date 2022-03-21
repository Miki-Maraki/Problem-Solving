package streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// how can change array to ArrayList : 3 ways 
public class Fruit {
	/*
	 public List<Employee> getAllEmployeeStartsWithB() {
		List<Employee> employee = employeeRepository.getAllEmployee();
		List<Employee> employeeStartsWithB = employee.stream().filter(n -> n.getName().startsWith("B"))
				.collect(Collectors.toList());
		return employeeStartsWithB;
	}
	 */
	
	public static void main(String[] args) {
		String [] arr = {"orange", "apple", "banana", "pineapple", "lemon", "mango", "banana", "berry"};
		
		List<String> fl1 = new ArrayList<String>(); // method 1
		Collections.addAll(fl1, arr);
		System.out.println("fruit list is : " + fl1);
		
		List<String> fl2 = Arrays.asList(arr);      // method 2
		System.out.println("List fruit : " + fl2);
		
		List<String> fl3 = new ArrayList<String>(); // method 3
		for(String fruit:arr) {
			fl3.add(fruit);
		}
	   //System.out.println(fl3);
		
	   long unique = fl2.stream().distinct().count();
	   System.out.println(unique); // 7
	     
	   List<String> unq = fl2.stream().filter(n->n.startsWith("b")).collect(Collectors.toList());
	   System.out.println(unq);
	   
	   List<String> uniq = fl2.stream().filter(n->n.startsWith("b")).distinct().collect(Collectors.toList());
	   System.out.println(uniq);  // no repeat
     } 
}




