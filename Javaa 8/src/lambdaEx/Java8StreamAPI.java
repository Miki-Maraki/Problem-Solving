package lambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8StreamAPI {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Nigus");
		l.add("Mike");
		l.add("Bob");
		l.add("Joel");
		l.add("Baro");
		l.add("Seli");

		for (String s : l) {       // enhanced for loop
			if (s.equals("Bob")) {
				System.out.println("--->> : " + s);
				break;
			}
		}
		// 3 types of for loop
		//for loop
		//enhanced for loop
		//forEach
		
		// .stream
		// intermidate operation stream-->>stream
		// terminal operation
		// Predicate
		//
		
		Predicate<String> p = new Predicate<String>() {    // option 1
			@Override
			public boolean test(String t) {
				if(t.startsWith("B")) {
					return true;
				}
				return false;
			}	
		};
		
		//Using Lambda Exp
		//filter --> Predicate(...boolean)   forEach --> Consumer(...accept)
		l.stream().filter(a -> a.startsWith("B")).forEach(System.out::print);   // ... option 2
		//using Anonymous class
		l.stream().filter(a -> p.test(a)).forEach(System.out::print);
		//using Method reference
		//MyPred myPred=new MyPred();
		//l.stream().filter(myPred::test).forEach(System.out::print);
	}

}

//class MyPred implements Predicate{   //  . . . option 3
//@Override
//public boolean test(String t) {
//	if(t.startsWith("B")) {
//		return true;
//	}
//	return false;
//}
//}
