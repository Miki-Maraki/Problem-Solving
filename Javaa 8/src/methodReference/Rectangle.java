package methodReference;

// has interface polygon
public class Rectangle {
	
	public static void print(){   // implemented method
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  ... using method reference
        Polygon p = Rectangle::print;  // className::methodName
        
        // Calling interface method  
        p.say();  
    }  

}
