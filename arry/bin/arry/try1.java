package arry;

import java.util.Scanner;

public class try1 {
//public static void main(String[] args) {
//	int i,j,r;
//	
//	System.out.println("Enter the half of the number you want to diamond");
//	Scanner sc=new Scanner(System.in);
//	r=sc.nextInt();
//	
//	for(i=0;i<=r;i++)
//	   {
//	     for(j=1;j<=r-i;j++)
//	     System.out.print(" ");
//	     for(j=1;j<=2*i-1;j++)
//	       System.out.print("*");
//	     System.out.print("\n");
//	   }
//	 
//	   for(i=r-1;i>=1;i--)
//	   {
//	     for(j=1;j<=r-i;j++)
//	     System.out.print(" ");
//	     for(j=1;j<=2*i-1;j++)
//	       System.out.print("*");
//	     System.out.print("\n");
//	   }
//}
//}
public static void main(String[] args) {
	String original,reverse="";
	
	System.out.println("Enter the string you want to palidrom :");
	Scanner sc=new Scanner(System.in);
	original=sc.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
	if(original.equals(reverse))
		System.out.println("The string is palidrom");
	else
		System.out.println("The String is not palidrom");
	
}	
}

