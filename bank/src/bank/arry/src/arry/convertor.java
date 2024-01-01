package arry;

import java.util.Scanner;

public class convertor {
	public static void main(String[] args) {

		float x, C;
		System.out.println("Enter the money in Million : ");
		Scanner sc = new Scanner(System.in);   // Scanner (System.in) is used to take inpute from 
//		                                      user and value from keyboard which is in row form 
//		                                      to convert it into  mc you scanner provide its own
//		                                      methods (i.e= sc.nextInt(),sc.nextFloat())etc. 
		x = sc.nextFloat();
		

		C = x / 10;
		System.out.println(x + " Million is : " + C + " crore");

		System.out.println("Enter the money in Billion");
		x = sc.nextFloat();

		C = x * 100;
		System.out.println(x + "Billion is: " + C + " crore");

		System.out.println("Million convert into billion");
		x = sc.nextFloat();
		double c = x / 1000;
		System.out.println(x + " million is: " + c + " billion");
	}

}
