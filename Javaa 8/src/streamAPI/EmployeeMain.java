package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class EmployeeMain {
	
	public static void main(String [] args) {
		Employee emp = new Employee(100, "George", 5600);
		Employee emp1 = new Employee(101, "Bob", 4000);
		Employee emp2 = new Employee(102, "Mike", 5000);
		Employee emp3 = new Employee(103, "King", 5000);
		Employee emp4 = new Employee(104, "Bolton", 4500);
		Employee emp5 = new Employee(105, "Hani", 5500);
		
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(emp);
		ls.add(emp1);
		ls.add(emp2);
		ls.add(emp5);
		ls.add(emp4);
		ls.add(emp3);
		//System.out.println(ls);
		
		List<Double> salgrthan5000 = ls.stream().filter(s->s.getSalary() > 5000).map(s->s.getSalary()).collect(Collectors.toList());
		System.out.println("salary > 5000 " + salgrthan5000);	
		List<String> salagrthan5000 = ls.stream().filter(s->s.getSalary() > 5000).map(e->e.getName()).collect(Collectors.toList());
			System.out.println("salary > 5000 " + salagrthan5000);	
		
		long salgrthan5000Count = ls.stream().filter(s->s.getSalary() > 5000).count();
		System.out.println(salgrthan5000Count);
		
		List<Employee> dstnctSala = ls.stream().filter(s-> s.getSalary() > 4500) .distinct().collect(Collectors.toList());
		System.out.println("distinct salary > 4500 :" + dstnctSala);
		
		//List<Employee> dstnctName = ls.stream().filter(s-> s.getName()).distinct().collect(Collectors.toList());
		//System.out.println(dstnctName);
		
		List<Employee> startWithB = ls.stream().filter(n->n.getName().startsWith("B")).collect(Collectors.toList());
		System.out.println("name start with B " + startWithB);
		
		OptionalInt max = ls.stream().mapToInt(Employee::getId).max();
		System.out.println(max);
	}

}
