package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Numbers {
	
	public void streamExample_Distinct()	{
		List<Integer>	numbers =	Arrays.asList(1,	1,	2,	6,	2,	3);
		numbers.stream().distinct().forEach(System.out::print);  // 1263
		}

	public void streamExample_Sorted()	{
		List<Integer>	numbers =	Arrays.asList(1,	1,	2,	6,	2,	3);
		numbers.stream().sorted().forEach(System.out::print);  // 112236
		}
	
	public void streamExample_Filter()	{
		List<Integer>	numbers =	Arrays.asList(1,	3,	4,	6,	2,	7);
		//numbers.stream().filter(Test123::isOdd).forEach(System.out::print);  //137
		}
}
