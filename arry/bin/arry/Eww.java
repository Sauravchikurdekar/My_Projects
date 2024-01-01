package arry;

import java.util.Scanner;

public class Eww {
	public static void main(String[] args) {
		int i,j,k,r;
		
		System.out.println("Enter the number you want to do diamond");
		Scanner sc = new Scanner(System.in);
		r=sc.nextInt();
		
		for(i=1;i<=r;i++) {
			for(j=r-1;j>=i;j--) {
				System.out.print(" ");
		}
			for(k=1;k<=i;k++) {
				System.out.print("* ");
			}
		
		
		
		System.out.println();

	}
	for(i=r-1;i>=1;i--) {
		for(j=r-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
