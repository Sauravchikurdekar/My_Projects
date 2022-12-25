import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {

		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string=");
		original = sc.nextLine();

		int lenght = original.length();
		for (int i = lenght - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("the string is palidrome");
		else
			System.out.println("the string is not palidrome");
	}

}
