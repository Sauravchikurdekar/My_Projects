package arry;

import java.util.Scanner;

public class New1 {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a series of strings (type 'exit' to finish input):");

	        String input;
	        String longestString = null;
	        int maxLength = 0;

	        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
	            if (input.length() > maxLength) {
	                maxLength = input.length();
	                longestString = input;
	            } else if (input.length() == maxLength && longestString == null) {
	                longestString = input;
	            }
	        }

	        if (longestString != null) {
	            System.out.println("Longest string: " + longestString);
	        } else {
	            System.out.println("No strings entered.");
	        }

	        scanner.close();
	    }
	}


