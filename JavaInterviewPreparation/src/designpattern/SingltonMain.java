package designpattern;

public class SingltonMain {
	
	public static void main(String[] args) {

		Singlton s1 = Singlton.getInstance();
		Singlton s2 = Singlton.getInstance();
		Singlton s3 = Singlton.getInstance();

		System.out.println(s1.equals(s2)); // t
		System.out.println(s2.equals(s3)); // t

		SingltonLezy s1Lezy = SingltonLezy.getInstance();
		SingltonLezy s2Lezy = SingltonLezy.getInstance();
		SingltonLezy s3Lezy = SingltonLezy.getInstance();

		System.out.println(s1Lezy.equals(s2Lezy)); // t
		System.out.println(s3Lezy.equals(s2Lezy)); // t
	}
}







