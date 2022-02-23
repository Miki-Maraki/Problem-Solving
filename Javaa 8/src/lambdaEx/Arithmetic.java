package lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic {
	String name;
	int age;
	@Override
	public String toString() {
		return name;
	}
/*	 public boolean test(Maths p) {
	        return p.gender == Maths.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25;
	    }
*/	    
	public static void main(String[] args) {
		 // Multiple parameters in lambda expression 
		//Maths m = new Arithmetic();
		//System.out.println(m.add(3,4));
		Maths m = (a, b) -> a + b; // LambdaEx is anonymous method
		System.out.println("sum of two numbers " + m.add(3,4));  // provide implement 
		
        // Multiple parameters with data type in lambda expression  
        Maths m1=(int a, int b)->(a+b);  
        System.out.println("sum of two numbers " + m1.add(10,20));      
        // Lambda expression with return keyword.    
        Maths m2 = (int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println("sum of two numbers " + m2.add(25,25));  
 
        // Lambda Expression : forEach Loop
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai"); 
        
        list.forEach(n->System.out.println(n));  // print all list using lambda .... option 1

        for (String ls:list) {                  // by using forEach loop ...        option 2
        	System.out.println(ls);
        }
        String[] stringArray1 = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" }; 
				Arrays.sort(stringArray1, (a, b) -> a.compareToIgnoreCase(b));  // lambda express ....option 1
				 System.out.println("list of name : " + stringArray1.toString());
				 for(String str:stringArray1) {                                                    //  option 2
					 System.out.println(str);
				 }			
		String[] stringArray2 = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" }; 
                Arrays.sort(stringArray2, String::compareToIgnoreCase); 	// method reference	..... option 3
                System.out.println("list of name : " + stringArray2);
                                         
                                Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 }; // given
              List<Integer> integersList1 = new ArrayList<Integer>(Arrays.asList(intArray)); // option 1
                            Integer sum = 0;
                           for(Integer i : integersList1)
                                  sum += i;
                         System.out.println("Sum of integers: " + sum);
             List<Integer> integersList2 = new ArrayList<Integer>(Arrays.asList(intArray)); 
                         integersList2.stream().reduce(Integer::sum).get(); // method reference
             System.out.println("Sum of integers: " + integersList2.stream().reduce(Integer::sum).get()); // option 2
	}
}