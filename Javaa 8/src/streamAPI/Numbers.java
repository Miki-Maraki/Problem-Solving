package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Numbers {
	
	public void streamDistinct() {
		List<Integer>	numbers =	Arrays.asList(1, 1,	2,	6,	2,	3);
		numbers.stream().distinct().forEach(System.out::print);  // 1263
		}

	public void streamSorted()	{
		List<Integer>	numbers =	Arrays.asList(1, 1,	2,	6,	2,	3);
		numbers.stream().sorted().forEach(System.out::print);  // 112236
		}
	
	public void streamFilter()	{
		List<Integer>	numbers =	Arrays.asList(1, 3,	4,	6,	2,	7);
		//numbers.stream().filter(Test123::isOdd).forEach(System.out::print);  //137
		}
}
