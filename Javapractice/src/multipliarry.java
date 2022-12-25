import java.util.Scanner;

public class multipliarry {

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
			System.out.println(a[i]);
		}

		for (int i = 0; i < n; i++)

		{
			b[i] = sc.nextInt();
			System.out.println(b[i]);
		}

		for (int i = 0; i < n; i++) {
			c[i] = a[i] * b[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
	}

}
