package pro9_1;

public class ExpressionDemo {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			String expr1 = "(a*b(a-b)]";
			Expression ob1 = new Expression(expr1);
			
			System.out.println("expression: " + expr1);
			if (ob1.isExpressionValid())
				System.out.println("expression1 is valid");
			else
				System.out.println("expression1 is not valid");
			String expr2 = "[A+25*(Y*(B+C-X-K/D)*(E+13))]+M";
			Expression ob2 = new Expression(expr2);
			System.out.println(expr2 + " : " + ob2.isExpressionValid());

		}


}
