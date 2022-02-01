package javaInterview;

public class FizzBuzzTest {
	
	public static void main(String args[]){ 
		for(int i = 1; i <= 50; i++) { 
			if(i % (3*5) == 0) System.out.println("FizzBuzz"); 
			else if(i % 5 == 0) System.out.println("Buzz"); 
			else if(i % 3 == 0) System.out.println("Fizz"); 
			else System.out.println(i); 
			} 
		
	String s1 = "javatpoint is a very good website";  
	String replaceString = s1.replace('a','d');//replaces all occurrences of a to e  
	//System.out.println(replaceString);  
	//replacing character in this String
	String word = "Java"; // literal string , save in constant pool 
	String replaced = word.replace("J", "K"); 
	System.out.println("Replaced String : " + replaced); // Kava 
	
	//replacing substring on String in Java 
	String str = "Scala is good programming language"; 
	String replacedd = str.replaceAll("Scala", "Java");  // Java is good programming language
	System.out.println("String after replace : " + replacedd); 
	replaced = str.replaceFirst("\\s", "#"); //replacing first space in String with # using regular expression 
	System.out.println("First space String : " + replaced); 
	replaced = str.replaceAll("\\s", "#"); //replacing all space in String with # using regular expression 
	System.out.println("ReplaceAll string : " + replaced);
	
	// How to check if a Key Object Exists in HashMap Java? containsKey()
/*
	if(map.get(key) !=  null){
	   System.out.println("key exits in Map");	
	}*/
 }
}
