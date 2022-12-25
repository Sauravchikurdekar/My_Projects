package practice;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of a=");
		int a=in.nextInt();	
		
		System.out.println("enter the value of b=");
		int b=in.nextInt();
		System.out.println("enter the value of c=");
		int c=in.nextInt();
		
		if(a>b)
			if(a>c)
			
				System.out.println("a is greater");
		if(b>a)
			if(b>c)
				System.out.println("b is greater ");
		if(c>a)
			if(c>b)
				System.out.println("c id]s greater");
			

	}

}
	
//	public static void main(String[] args) {
//		System.out.println("enter the 10 natural no");
//		
//		int i;
//		for(i=1;i<=10;i++)
//		{
//			System.out.println("natural number="+i);
//		}
//	}
//		
//	}
