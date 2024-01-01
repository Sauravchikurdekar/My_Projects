package arry;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class practice {
	public static void main(String[] args) {
		int arr1[] = { 80, 10, 15, 2, 35, 60 };
		int arr2[] = { 35, 80, 60, 20, 75 };
		
		
		
		PrintUnion(arr1, arr2);
	}

	static void PrintUnion(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
		}
		System.out.println("Union");
		System.out.println(s);
	}
}

//	printIntersection(arr1,arr2);
//		
//	}
//
//	private static void printIntersection(int[] arr1, int[] arr2) {
//   Set<Integer> s =new HashSet<>();
//   for(int i=0;i<arr1.length;i++) {
//	s.add(arr1[i]);   
//   }
//   for(int i=0;i<arr2.length;i++) {
//	   if(s.contains(arr2[i])) {
//		   System.out.println(arr2[i]+"");
//	   }
//   }
//	}
//}

		
		
//		StringJoiner sj1=new StringJoiner(",","[","]");
//		sj1.add("A").add("B").add("C");
//		System.out.println(sj1);
//		
//		StringJoiner sj2=new StringJoiner(":");
//		sj2.add("P").add("Q");
//		System.out.println(sj2);
//		
//		sj1.merge(sj2);
//		System.out.println(sj1);
//
//	}
//
//}
