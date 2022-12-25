package method_overloading;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
	
           //sum of array
//		float[] array = { 20.3f, 44.4f, 90.4f, 37.9f, 67.9f, 88.3f };
//		float sum = 0;
//		for (float element : array) {
//			sum = sum + element;
//		}
//
//		System.out.println(sum);
//		
//	}
                          //find the elemenet preset in array
		/*                  
		 * float[] array = { 20.3f, 44.4f, 90.4f, 37.9f, 67.9f, 88.3f }; float num = 0;
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the element do you want to find"); num =
		 * sc.nextFloat(); boolean isInArray; for (float element : array) { if (num ==
		 * element) { isInArray = false; break; }
		 * 
		 * } if (isInArray = true) {
		 * System.out.println("The element is present in Array"); } else
		 * 
		 * System.out.println("The element is not present");
		 * 
		 * }
		 * 
		 * }
		 */

		
		//adiition of array
//		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
//		int[][] mat2 = { { 7, 8, 9 }, { 5, 4, 3 } };
//		int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
//		for (int i = 0; i < mat1.length; i++) {
//			for (int j = 0; j < mat1[i].length; j++) {
//				result[i][j] = mat1[i][j] + mat2[i][j];
//				System.out.println(result[i][j]+"");
//			}
//			System.out.print("");
//		}
//
//	}
//} 
		           //reverse the array
		
	/*	int [] arr= {1,2,3,4,5,6,7,8,9,0};
		int l=arr.length;
		//int n=Math.floorDiv(l, 2);
		int n=(arr.length/2);
		int temp;
		for(int i=0;i<n;i++) {
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;			
		}
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}
}*/
		//find the maximum number in array  
		
//		int []arr= {1,2,3,4,99,5,55,6,67,88,9,96};
//		int max=0;
//		
//		for(int e:arr) {
//			if(e>max)
//			max=e;
//			}
//		System.out.println("The maximum element in array: "+max);
//	}
//}
		
//	for(int i=0;i<arr[i];i++) {
//		
//		if(arr[i]>max) {
//			max=arr[i];
//			
//		}
//		
//	}
//	System.out.println("The maximum element in array: "+max);
//	}
//}
  
		  //min value in array
		
		
//	     int [] num1 = {-88,1,2,34,343,6,4,76,3,48,65,43,4,98,87,3,};
//	        int min=Integer.MAX_VALUE;
//	       for (int i:num1){
//	            if (min>i){
//	                min=i;
//	            }
//	        }
//	        System.out.println("The Minimum Element inside the array is: "+min);
//	}
//}
		
		 //shorting or not
			/*
			 * boolean isSorted=true; int []arr= {1,89,9,67,7,8,4,2,99}; //int []arr=
			 * {1,2,3,4,5,6,7,8,9}; for(int i=0;i<arr.length;i++) { if(i>arr[i]) {
			 * isSorted=false; break; }
			 * 
			 * } if(isSorted) { System.out.println("The Array is sorted"); } else {
			 * System.out.println("The Array not sorted"); }
			 */
		
		  //sorting in order
		int arr[]= {1,2,3,7,8,9,4,5,6,10,65,77,38};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


		
