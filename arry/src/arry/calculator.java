package arry;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		

			Scanner input = new Scanner(System.in);

			System.out.print("Enter two numbers: ");

			double num1 = input.nextDouble();

			double num2 = input.nextDouble();

			System.out.print("Enter an operator (+, -, *, /): ");

			char operator = input.next().charAt(0);

			double output;

			switch(operator)

			{

			case '+':

			output = num1 + num2;

			break;

			case '-':

			output = num1 - num2;

			break;

			case '*':

			output = num1 * num2;

			break;

			case '/':

			output = num1 / num2;

			break;

			default:

			System.out.printf("You have entered an invalid operator");

			return;

			}

			System.out.println(num1+" "+operator+" "+num2+": "+output);

			}

			

		
		
		
		
		
		
		
		
		
		
//		
//		float num1, num2;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		num1 = in.nextFloat();
//
//		System.out.println("Enter second number");
//		num2 = in.nextFloat();
//		
//		System.out.println("1.Addition");
//		System.out.println("2.substitution");
//		System.out.println("3.multiplication");
//		System.out.println("4.division");
//		int x=in.nextInt();
//		if(x==1)
//		{
//			System.out.println("addition of number:"+(num1+num2));
//		}
//		else if(x==2)
//		{
//			System.out.println("substraction of number:"+(num1-num2));
//		}
//		else if(x==3) {
//			System.out.println("multiplication of number:"+(num1*num2));
//			
//		}
//		else if(x==4)
//		{
//			System.out.println("didvion of number:"+(num1/num2));
//		}
//		else
//		{
//			System.out.println("invalid entry");
//		}
//	}
//		
		
		
		
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		num1 = in.nextFloat();
//
//		System.out.println("Enter second number");
//		num2 = in.nextFloat();
//		System.out.println("addition of number:"+(num1+num2));
//		System.out.println("substraction of number:"+(num1-num2));
//		System.out.println("multiplication of number:"+(num1*num2));
//		System.out.println("division of number:"+(num1%num2));
	}


