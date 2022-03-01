package ch_6Methods;

//White a method that return minimum between two numbers 
public class FindMinimun {
	
	public int findMinium(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}else
			return num2;
	}
	public static void main(String[] args) {
		FindMinimun fm = new FindMinimun();
		System.out.println(fm.findMinium(45, 23));
		System.out.println(fm.findMinium(19, 26));
		System.out.println(fm.findMinium(67, 61));
	}
}