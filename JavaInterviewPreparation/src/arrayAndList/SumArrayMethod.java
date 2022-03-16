package arrayAndList;

public class SumArrayMethod {

	public int findSum(int array[]) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		return result;
	}

	public static void main(String[] args) {
	
		SumArrayMethod s = new SumArrayMethod();
		//s.findSum(new int [] {3, 6, 2, 7});
		
		System.out.println("sum of array is : " + s.findSum(new int [] {3, 6, 9, 7}));//25
	}
}
