import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {

//		int n1,n2;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the n1  ");
//		n1=sc.nextInt();
//		
//		System.out.println("Enter the n2");
//		n2=sc.nextInt();
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
//		System.out.println("result of swapping  : " +"n1="+n1+ ", n2="+n2);
//	}
//
//}
		
		int num1, num2, temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping:");
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
	}
}




