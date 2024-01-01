package arry;

import java.util.HashSet;
import java.util.Set;

public class x {
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5,6};
		int [] array2= {5,6,43,90,78};
		
		Set<Integer>com=new HashSet<>();
		Set<Integer>com2= new HashSet<>();
		
		
//		for(int a:array) {
//			com.add(a);
//		}
//		for(int a:array2) {
//			com.add(a);
//		}
//		
//		System.out.println("union :"+com);
//	}
	
		for(int a:array) {
			com.add(a);
		}
		for(int a:array2) {
			if(com.contains(a));
			System.out.println("comon numbers are:");
			System.out.print(a+" ");
		}
	
		
	}
}
