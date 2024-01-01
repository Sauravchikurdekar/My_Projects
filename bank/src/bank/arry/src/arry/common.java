package arry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class common {
	public static void main(String[] args) {
		
		
		int[] arr1= {11,12,23,33,45,55,46,7,8};
		int arr2[]= {21,14,67,3,55,95,7,8,90};
		Set<Integer> s1=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		for(int k:arr1) {
			s1.add(k);
		}
		for(int k:arr2) {
			s1.add(k);
		}
		System.out.println("union"+s1);
		
//		s1.retainAll(arr1);
		
		for(int com:arr1) {
			s2.add(com);
		}
		for(int com:arr2) {
			if(s2.contains(com)) {
				System.out.print( com+" ");
			}
			
		}
	
//	int arr[]= {1,22,3,22,34,13,67,99,90};
//	Set<Integer>uni=new HashSet<>();
//	Set<Integer>com=new HashSet<>();
//	
//	for(int set:arr) {
//	if(!uni.add(set)) {
//		com.add(set);
//	}
//	}
//	
//	System.out.println("uni :"+uni);
//	System.out.println("com :"+com);
		
	}
}
