package numbersAndLoop;

public class Count {	
		//int count=0;//will get memory each time when the instance is created 
	    static int count =0;//will get memory only once and retain its value 

	    public Count(){     //.....default constructor
		count++;
		System.out.println(count);
	    }

   public static void main(String [] args) {
/*	  for using int count = 0;
		Count c1 = new Count();// print 1
	    Count c2 = new Count();// print 1
		Count c3 = new Count();// print 1
//belongs to the instance object/actual object/call actual object every time
*/		
//for using static int count = 0;
		Count c1 = new Count();// print 1
		Count c2 = new Count();// print 2
		Count c3 = new Count();// print 3
	
//belongs to the class/loads with class/call Count class every time

//so static helps to initialize one time value and common for others
//A static method can access static data member and can change the value of it.   	
   }

}
