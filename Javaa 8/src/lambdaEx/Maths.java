package lambdaEx;

//(argument-list) -> {body}  Syntax
// lambda expression helps to iterate, filter and extract data from collection.
// Why use Lambda Expression
// 1. To provide the implementation of Functional interface.
// 2. Less coding.

  @FunctionalInterface
  public interface Maths {
	  
	 int add(int a, int b); 
}
/*
  public class Arithmetic  {
	
	public int add(int a, int b){
		return a+b;
	}
	
	Maths m = (a, b)->{a + b};
    m.add(12 + 7);
    System.out.println(m.add(12 + 7));
    
*/