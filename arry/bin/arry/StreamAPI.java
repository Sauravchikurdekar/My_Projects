package arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> arr= Arrays.asList(12,22,34,45,54);
		
		List<Integer>q=arr.stream()
				.sorted()
				.filter(n->n%2==0)
//				.mapToInt(Integer::intValue)
//				.sum()
				.collect(Collectors.toList());
		System.out.println(q);
		
//		Set<Integer>s=arr.stream()
//				    .filter(n->n%2==0)
//				    .sorted()
//				    .collect(Collectors.toSet());
//		System.out.println(s);
				    
	}
}
