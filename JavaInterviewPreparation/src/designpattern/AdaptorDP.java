package designpattern;
/*
 * An Adapter pattern acts as a connector between two incompatible interfaces that otherwise 
 * cannot be connected directly. An Adapter wraps an existing class with a new interface 
 * so that it becomes compatible with the client's interface.
 * It allows the interface of an existing class to be used as another interface.
 */
public class AdaptorDP {
/*	
	public interface Bird {
	    // birds implement Bird interface that allows them to fly and make sounds adaptee interface
	    public void fly();
	    public void makeSound();
	}
	  
	public class Sparrow implements Bird {
	    // a concrete implementation of bird
	    public void fly() {
	        System.out.println("Flying");
	    }
	    public void makeSound() {
	        System.out.println("Chirp Chirp");
	    }
	}
	  
	public interface ToyDuck {
	    // target interface toyducks don't fly they just make squeaking sound
	    public void squeak();
	}
	  
	class PlasticToyDuck implements ToyDuck {
	    public void squeak() {
	        System.out.println("Squeak");
	    }
	}
	  
	class BirdAdapter implements ToyDuck {
	    // You need to implement the interface your client expects to use.
	    Bird bird;
	    public BirdAdapter(Bird bird) {
	        // we need reference to the object we are adapting
	        this.bird = bird;
	    }
	  
	    public void squeak()  {
	        bird.makeSound();// translate the methods appropriately
	    }
	}
	  
	public class Main {
	    public static void main(String args []) {
	        Sparrow sparrow = new Sparrow();
	        ToyDuck toyDuck = new PlasticToyDuck();
	  
	        // Wrap a bird in a birdAdapter so that it behaves like toy duck
	        ToyDuck birdAdapter = new BirdAdapter(sparrow);
	  
	        System.out.println("Sparrow...");
	        sparrow.fly();
	        sparrow.makeSound();
	  
	        System.out.println("ToyDuck...");
	        toyDuck.squeak();
	  
	        // toy duck behaving like a bird 
	        System.out.println("BirdAdapter...");
	        birdAdapter.squeak();
	    }

	Explanation :
Suppose we have a bird that can makeSound(), and we have a plastic toy duck that can squeak(). 
Now suppose our client changes the requirement and he wants the toyDuck to makeSound than ?
Simple solution is that we will just change the implementation class to the new adapter class and 
tell the client to pass the instance of the bird(which wants to squeak()) to that class.

Before : ToyDuck toyDuck = new PlasticToyDuck();
After : ToyDuck toyDuck = new BirdAdapter(sparrow);
You can see that by changing just one line the toyDuck can now do Chirp Chirp !!
	
	*/
}