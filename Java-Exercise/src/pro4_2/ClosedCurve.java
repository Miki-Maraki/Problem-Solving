package pro4_2;

public abstract class ClosedCurve {
	
	// The keyword abstract on a method means the method is unimplemented
	abstract double computeArea();
	
/*   Interfaces in the Java Library: Comparable 
     In the Java library, Comparable is defined generically, for any  possible type, like this:
   public interface Comparable<T> {
     public int compareTo(T s);       // method 
      }
      
     String, Integer, Double, etc implements Java's Comparable interface. For Strings, the interface looks like this:
   public interface Comparable<String> {
        public int compareTo(String s);
          }
 
  	Functional Interfaces
	 Whenever an interface has just one abstract method, the interface is called a functional interface. The 
	reason for the terminology is that, since there is just one abstract method, implementations of a functional 
	interface behave like a function.
	-->>> Comparable is an example of a functional interface
	 Functional interfaces have become an important aspect of Java since Java SE 8 because implementations 
	can be represented using lambda expressions.
*/

}
