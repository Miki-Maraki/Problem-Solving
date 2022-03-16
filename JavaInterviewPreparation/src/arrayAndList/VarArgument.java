package arrayAndList;

/*What	are	Variable	Arguments	or	varargs?
Variable Arguments allow calling a method with different number of parameters. Consider the example 
method sum below. This sum method can be called with 1 int parameter or 2 int parameters or more int 
parameters.
 */
public class VarArgument {
	
	// int(type) followed ... (three dot's) is syntax of a variable argument.
	public int sum(int... numbers) {
		// inside the method a variable argument is similar to an array.
		// number can be treated as if it is declared as int[] numbers;
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static void main(String[] args)	{
		VarArgument	example	=	new VarArgument();
		
		//3	Arguments
		System.out.println(example.sum(1,	4,	5));//10
		
		//4	Arguments
		System.out.println(example.sum(1,	4,	5,	20));//30
		
		//0	Arguments
		System.out.println(example.sum());//0
		
		//7	Arguments
		System.out.println(example.sum(6, 8, 13, 9, 4, 37, 19));//96
}

}
