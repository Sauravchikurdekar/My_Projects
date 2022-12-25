package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1= {
				1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
		String[] my_array2= {
				"Java",
				
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"};
		
		  System.out.println("Original numeric array : "+Arrays.toString(my_array1));
		    Arrays.sort(my_array1);
		    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
		    
		    System.out.println("Original string array : "+Arrays.toString(my_array2));
		    Arrays.sort(my_array2);
		    System.out.println("Sorted string array : "+Arrays.toString(my_array2));

}
}
//int [] my_array= { 2,3,4,5,6,7,8,9};
//int sum=0;
// 
//for(int i:my_array)
////	for(i=0;i<=lenght.my_array;i++)
//	sum+=i;
//System.out.println("sum of elements="+sum);
//
//	}
//}

