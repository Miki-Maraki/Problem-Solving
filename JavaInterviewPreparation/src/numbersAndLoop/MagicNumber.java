package numbersAndLoop;

// A number which leaves 1 as a result after a sequence of steps and in each 
// step number is replaced by the sum of its digits. 163 => 10 => 1 true

public class MagicNumber {
	
	public static void checkMagic(int num) {
		if(num % 9 == 1) {  // 
			System.out.println(num + " is a magic number");
		}else {
			System.out.println(num + " is not a magic number");
		}
	}
	
	public static void main(String[] args) { 
        MagicNumber.checkMagic(64);
        MagicNumber.checkMagic(89);
        MagicNumber.checkMagic(100);
        MagicNumber.checkMagic(140);
   }
	
}
