package designpattern;

//Singleton Eager Initialization
public class Singlton {

	private static final Singlton INSTANCE = new Singlton();

	private Singlton() { // make constructor private
	}

	public static Singlton getInstance() { // method
		return INSTANCE;
	}
}
