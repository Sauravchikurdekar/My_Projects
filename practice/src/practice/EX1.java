package practice;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no");
		int a=in.nextInt();
		if(a > 0)
		{
			System.out.println("no is positive");
			
		}
		else if (a<0)
		{
			System.out.println("no is negavite");
			
		}
		else
		{
			System.out.println("no is zero");
		}
	}
}
