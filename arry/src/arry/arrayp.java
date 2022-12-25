package arry;

import java.util.Scanner;

public class arrayp {

	// write a program for addition of two arrays in java

		public static void main(String args[]) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] sum = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array 1 : ");
		for (int i = 0; i < 10; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.print("Enter Array 2 : ");
		for (int i = 0; i < 10; i++) {
			array2[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			sum[i] = array1[i] + array2[i];
			
			System.out.print(sum[i]);
		}

		
		
	
		 
		 

	}
}
