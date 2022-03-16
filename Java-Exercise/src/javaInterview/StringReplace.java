package javaInterview;

public class StringReplace {
	
	public static void main(String args[]) {
	String text = "Lorem Ipsum is simply dummy text";
	String substring = text.substring(3); // start from index 3
	System.out.println(substring);              //em Ipsum is simply dummy text
	
	String s1 = "javatpoint is a very good website";  
	String replaceString = s1.replace('a','d'); //replaces all occurrences of a to d 
	System.out.println(replaceString); 
	
	//replacing character in this String
	String word = "Java"; // literal string , save in constant pool 
	String replaced = word.replace("J", "K"); 
	System.out.println("Replaced String : " + replaced); // Kava 
	
	//replacing substring on String in Java 
	String str = "Scala is good programming language"; 
	String replacedd = str.replaceAll("Scala", "Java");  // Java is good programming language
	System.out.println("String after replace : " + replacedd); 
	
	//replacing first space in String with # using regular expression
	replaced = str.replaceFirst("\\s", "#");  
	System.out.println("First space String : " + replaced); 
	//replacing all space in String with # using regular expression
	replaced = str.replaceAll("\\s", "#");  
	System.out.println("ReplaceAll string : " + replaced);

	}
}
