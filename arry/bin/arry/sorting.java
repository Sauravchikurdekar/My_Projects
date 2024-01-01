package arry;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sorting {

	public static void main(String[] args) {
		
		List<Integer>a= Arrays.asList(12,3,4,6,1,89,56,90);
		
		List<Integer> q=a.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("The sorted elements are :"+q);
		
	}
}
