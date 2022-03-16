package arrayAndList;

public class ProductArrayMethod {

	public int findProduct(int arr[]) {
		int multi = 1;
		for (int i = 0; i < arr.length; i++) {
			multi = multi * arr[i];
		}
		return multi;
	}
	public static void main(String[] args) {
		ProductArrayMethod p = new ProductArrayMethod();
		System.out.println("product of array is : " + p.findProduct(new int[] { 3, 6, 2, 7 }));
	}
	
	/* public class A {  Eager singleton
	   private static final A INSTANCE = new A();
	   
	   private A(){
	   }
	   
	   public static A getInstance(){
	     return A;
	   } 
	  }
	  Lezy singleton
	  public class B{
	  private static B INSTANCE;
	  private B(){
	  }
	  
	  public static B getInstance(){
	  if (INSTANCE == null){
	  INSTANCE = new B();
	  }
	  return B;
	  }
	  }
	  
	 */
	
	
	
	
	
	
}