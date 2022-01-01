package lambdaEx;

//(argument-list) -> {body}  Syntax

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
    m.add();
*/