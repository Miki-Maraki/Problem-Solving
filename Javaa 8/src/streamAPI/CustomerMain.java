package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerMain {
	
public static void main(String[] args) {
		
		List<Customer> cl = new ArrayList<>();
		cl.add(new Customer("Dani", 39, 6200));
		cl.add(new Customer("Maru", 30, 4200));
		cl.add(new Customer("Bob", 25, 5200));
		cl.add(new Customer("Xavi", 45, 6000));
		cl.add(new Customer("Miki", 35, 5000));
		cl.add(new Customer("Dani", 33, 3500));
		cl.add(new Customer("Abe", 40, 5500));
		cl.add(new Customer("Nani", 20, 2200));
		cl.add(new Customer("Bob", 25, 5700));
		cl.add(new Customer("Xavi", 30, 5200));
		cl.add(new Customer("David", 27, 4000));
		cl.add(new Customer("Abe", 21, 5200));
		cl.add(new Customer("Dave", 43, 7200));
		cl.add(new Customer("Azeb", 37, 3800));
		List<Customer> nameStartWithd= cl.stream().filter(c->c.getName().startsWith("D")).collect(Collectors.toList());
		    System.out.println(nameStartWithd);
		List<Customer> nameStartWithdd = cl.stream().filter(c->c.getName().startsWith("D")).distinct().collect(Collectors.toList());
		    System.out.println(nameStartWithdd);    
		// counting list by using stream
		Long noOfElementsList = cl.stream() .collect(Collectors.counting());  
        System.out.println("Total elements as List : "+ noOfElementsList);  // 14 
        
 //  List<Integer> sortAge = cl.stream().collect(Collections.sort(sortAge, (p1, p2) -> p1.getAge() - p2.getAge()));
        for (Customer p : cl) {
            if (30 <= p.getAge() && p.getAge() < 35) {  // print age bn (30, 35)
                System.out.println("Age range : " +p);
            }
        }
       
/*		// To print all customer list 
		System.out.println("----Iterating by using enhanced for loop----");      // option 1
		for(Customer custList:cl) {                                            
			System.out.println(custList);
		}      // OR
		System.out.println("---Iterating by passing lambda expression------");  // option 2
        cl.forEach(customers -> System.out.println(customers)); 
                //OR
        System.out.println("----Iterating by passing method reference------");  // option 3
        cl.forEach(System.out::println);  
		       // OR by using forEachOrdered
		System.out.println("------------Iterating by passing lambda expression---------------");  
        cl.stream().forEachOrdered(customers -> System.out.println(customers));  
        System.out.println("------------Iterating by passing method reference---------------");  
        cl.stream().forEachOrdered(System.out::println);  
*/
		// using Collectors: Fetching data as a List
//        List<String> custN = cl.stream() .map(n->n.name).collect(Collectors.toList));      ???
        
        // Converting customer List into a Map 
        // Map has not duplicate key! ----------------------------->>>No print
/*        Map<String, Integer> custNameAgeMap = cl.stream() .collect(Collectors.toMap(c->c.name, c->c.age));               
                      System.out.println(" Name and age" + custNameAgeMap);  // print only name and age
        Map<String, Double> custNameSalaryMap = cl.stream() .collect(Collectors.toMap(c->c.name, c->c.salary));               
                      System.out.println(" Name and salary" + custNameSalaryMap);  // print only name and salary
 */       
		  List<Double> custSlry =  cl.stream() .map(x->x.salary)         // fetching salary  
	                            .collect(Collectors.toList());           // collecting as list  
	                    System.out.println("customer salary as list " + custSlry);                                // to print only salary
	      Long noOfElementSalary = cl.stream() .collect(Collectors.counting()); //long count() returns the count of elements & special case of a reduction.
                         System.out.println("Total elements as List : "+noOfElementSalary);  // 14        
	      Set<Double> custSlry1 =  cl.stream() .map(x->x.salary)         // fetching salary  
                    .collect(Collectors.toSet());           // collecting as set (remove duplicate elements)  
                 System.out.println("customer salary as set " + custSlry1);                          // 12  
	        
	    // Collectors : Converting Data as a Set  
		Double sumSalaries = cl.stream() .collect(Collectors.summingDouble(x->x.salary));           // Using Collectors's method  
                    System.out.println("Sum of salaries : "+ sumSalaries);        // option 1
        Double totSlry1 = cl.stream() .map(ts->ts.salary) .reduce(0.0d,(sum, salary)->sum+salary);   // using reduce() method
                    System.out.println("Total salary is : " + totSlry1);           // option 2
        Double totSlry2 = cl.stream() .map(ts->ts.salary) .reduce(0.0d,Double::sum);                 // by using method reference
                    System.out.println("Total salary is : " + totSlry2);           // option 3  
        Integer sumAge = cl.stream().collect(Collectors.summingInt(a->a.age));                      // collecting sum age
                    System.out.println("Sum of age's: "+sumAge); 
        Double avgSlry = cl.stream() .collect(Collectors.averagingDouble(c->c.salary)); // by using averagingDouble() method
           System.out.println("Average salary is: "+ avgSlry);
                    
                 // max() method to get max customer salary    
         Customer custA = cl.stream().max((s1, s2)->s1.salary > s2.salary ? 1: -1)  .get();    
                    System.out.println("max customer salary is : " + custA.salary);    
                 // min() method to get min customer salary    
         Customer custB = cl.stream().min((s1, s2)->s1.salary > s2.salary ? 1: -1)  .get();    
                    System.out.println("min customer salary is : " + custB.salary);  
                    
         List<Customer> sortSlry = cl.stream() .sorted(Comparator.comparing((Customer c) -> c.getSalary())).collect(Collectors.toList());
                    System.out.println("sort by salary " + sortSlry);
        			
        List<Customer> 	sortName = cl.stream() .sorted(Comparator.comparing((Customer c) -> c.getName())).collect(Collectors.toList());
                    System.out.println("sort by Name " + sortName);
                    
        List<Customer> 	sortNameSalary = cl.stream() .sorted(Comparator.comparing((Customer c) -> c.getName())
        				.reversed())
        			.sorted(Comparator.comparing((Customer c) -> c.getSalary()))
        			.collect(Collectors.toList()); 
                 System.out.println("sort by Name and salary " + sortNameSalary);
                    
		// filtering data of list  
		List<Double> custSlry5 = new ArrayList<Double>();
		for(Customer cust:cl)                     // select salary < 4000 by using enhanced for loop 
			if (cust.salary < 4000) {
				custSlry5.add(cust.salary);
			}
		System.out.println("salary less than 4000 " + custSlry5);
		
		// filtering data using stream   ...      //print all salary > 4000	by using stream
		List<Double> custSlry6 = cl.stream().filter(c->c.salary > 4000).map(c ->c.salary).collect(Collectors.toList());
    	              System.out.println("salary > 4000 "+ custSlry6);
    	List<Double> custSlry7 = cl.stream().filter(c->c.salary > 4000).map(Customer::getSalary) .collect(Collectors.toList());   
                      System.out.println(custSlry7); 
    	
    	List<Double> custSlry3 = cl.stream().filter(c->c.salary == 5200).map(c ->c.salary).collect(Collectors.toList());
    	System.out.println("customer salary equal to 5200 "+ custSlry3);                             //print salary itself that has salary = 5200
        cl.stream().filter(c->c.salary == 5200).forEach(c->System.out.println("name : " + c.name)); //print customer name who has salary = 5200
		
		// Stream: count() Method in Collection to collect with duplicate elements
		long countSlry = cl.stream().filter(c -> c.salary > 4000).count(); //by count() method
		System.out.println(countSlry); // count all salary > 4000
		
		// stream by using " Set " to filter and remove duplicate elements , Set doesn't hold duplicate elements 
		Set<Double> custSlry2 = cl.stream().filter(c-> c.salary > 4000).map(c->c.salary).collect(Collectors.toSet());
		System.out.println("Set of salary > 4000" + custSlry2);
		
		// filter using stream
		List<Integer> custAge = cl.stream().filter(c->c.age > 29).map(c->c.age).collect(Collectors.toList());
		System.out.println(custAge);

        	// filter using stream
		List<String> custName = new ArrayList<>();
		for (String sr : custName) {      
			if (sr.startsWith("D")) {            // 
				System.out.println("Names start with 'D' : ");
			}
        }
	    //	cl.stream().filter(n-> n.startsWith("B")).forEach(name->System.out.print(name+", "));
		custName.stream().filter(c-> c.startsWith("M")).collect(Collectors.toList());                     // ???
		System.out.println("Names start with M : " + custName);
		custName.stream().filter(n-> n.startsWith("M")).distinct().collect(Collectors.toList());          // ???
		System.out.println("Names start with M, with no repeat : " + custName);
		
		
		
/*		 for (Customer cr : cl) {      
				if (cr.equals("Dani")) {            // 
					System.out.println("Dani : " + cr);
					break;
				}
	        }
		 for (String sr : custName) {      
				if (sr.startsWith("D")) {            // 
					System.out.println("Names start with 'D' : " + sr);
				}
	        }
		 
	*/	

    }

}
