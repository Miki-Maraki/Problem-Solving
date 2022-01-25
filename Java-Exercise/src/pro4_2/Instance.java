package pro4_2;

public class Instance {
	public static void main(String[] args) {
		
		// Triangle , Square , Circle are independent classes inherited from the main object class
		// Declaring, creating, initializing in one step
		Object[] obj = { new Triangle(5, 5, 5), new Square(3), new Circle(3) };     // option 1
		ClosedCurve cct = new Triangle(6, 6);
		ClosedCurve ccs = new Square(3);
		ClosedCurve ccc = new Circle(3); 
		ClosedCurve [] arrCurve = {cct, ccs, ccc};                                   // option 2
		
		// compute areas  option one
		for (Object ob : obj) {
			if (ob instanceof Triangle) {                // double num = 10.0;
				Triangle t = (Triangle) ob;              // int  num2 = (int) num;     // 10
				System.out.println("The area of triangle is " + t.computeArea());
			}
		   if (ob instanceof Square) {
				Square s = (Square) ob;
				System.out.println("The area of square is " + s.computeArea());
			}
			if (ob instanceof Circle) {
				Circle c = (Circle) ob;
				System.out.println("The area of circle is " + c.computeArea());
			}
		}
		// compute areas  option two
		for(ClosedCurve arrCC: arrCurve ) {
			System.out.println("The Area of this " + arrCC.getClass().getSimpleName() + " is " + arrCC.computeArea());
		}
		
	}

}
