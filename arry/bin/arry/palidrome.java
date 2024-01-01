 package arry;

import java.util.Scanner;

public class palidrome {

	// write a program for palidrome in java

	public static void main(String args[]) {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");

	}
}
//	   public static void main(String[] args) {
//		   
//	        int x, y;
//	        x = 10;
//	        y = 20;
//	 
////	        x = x + y;
////	        y = x - y;
////	        x = x - y;
//          y=(x+y)-(x=y);
//
//	 
//	        System.out.println("After swaping:"
//	                          + " x = " + x + ", y = " + y);
//	    }
//	}
