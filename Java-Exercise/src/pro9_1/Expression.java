package pro9_1;

public class Expression {
	private String expression;

	Expression(String str) // constructor
	{
		expression = str;
	}

	public boolean isExpressionValid() {
		int n = expression.length(); // get max size (chars) of expression
		ArrayStack stk = new ArrayStack(n); // create stack
		char ch, chx; // ch: char scanned and chx: char popped
		boolean valid = false;
		for (int i = 0; i < n; i++) // get a char until ‘n’ chars are scanned
		{
			ch = expression.charAt(i); // get char
			if (ch == '[' || ch == '{' || ch == '(')
				stk.push(ch);
				if (ch == ']' || ch == '}' || ch == ')') {
				if (stk.isEmpty())
					valid = false;
				else {
					chx = (Character) stk.pop(); // pop a char from stack
					if (chx == '[' && ch == ']')
						valid = true;
					else if (chx == '{' && ch == '}')
						valid = true;
					else if (chx == '(' && ch == ')')
						valid = true;
					else
						valid = false;
				
			}
		}
		}
		if (!stk.isEmpty()) // stack not empty
			valid = false;
		return valid;
	}
}



