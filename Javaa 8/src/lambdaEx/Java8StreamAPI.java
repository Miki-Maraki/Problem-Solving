package lambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
// 3 types of for loop: for loop, enhanced for loop, forEach
public class Java8StreamAPI {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Nigus");
		l.add("Mike");
		l.add("Bob");
		l.add("Joel");
		l.add("Baro");
		l.add("Seli");
		l.add("Baro");
						
		for (String s : l) {       // using enhanced for loop
				System.out.print( s + ", " ); // to print all list
		}
		for (String st : l) {      
			if (st.equals("Bob")) {            // to print/to check if Bob there
				System.out.println("\nYes, " + st + " is found");
			}
		}		
/*   // forEach  uses --> Consumer(accept method with void)
	 public interface Consumer<T> {
            void accept(T t);
     e.g      forEach (p-> System.out.println(p))
     
   //filter uses --> Predicate(test method with boolean) 
     public interface Predicate<T> {
              boolean test(T t);
      e.g.    filter (p->p.getGender() == Gender.MALE)
*/			
	Predicate<String> p = new Predicate<String>() {    
			@Override
			public boolean test(String t) {
				if(t.startsWith("B")) {
					return true;
				}
				return false;
			}	
		};

		List<String> bNames = new ArrayList<>();
		List<String> bNamesOne = new ArrayList<>();
		//Using Lambda Expression                         // ... option 1
		l.stream().filter(n-> n.startsWith("B")).forEach(name->System.out.print( name+", "));   
		bNames = l.stream().filter(a -> a.startsWith("B")).collect(Collectors.toList());
		System.out.println("\nName start with B : " + bNames);
		bNamesOne = l.stream().filter(a -> a.startsWith("B")).distinct().collect(Collectors.toList());
		System.out.println("Name start with B with no repeat : " + bNamesOne);

		//using Anonymous class                // ... option 2
		l.stream().filter(a -> p.test(a)).forEach(System.out::print);
		
		// startsWith() method
		  String str = "Customer"; 
		  String st = new String("Welcome to Java");
		  System.out.println("--starts with : " + str.startsWith("C")); // true  
		  System.out.println(str.startsWith("u")); // false
		  System.out.println(str.startsWith("Cus")); // true
		  System.out.println("--starts with : " + str.startsWith("u",1)); // True   
		  System.out.println(st.startsWith("Welcome")); // t
		  System.out.println("ends with : " + st.endsWith("Java")); // t
		  if(st.endsWith("va")) {                 // by using if method
	            System.out.println("String ends with va");  
	        }else System.out.println("It does not end with va");  

	}

}


