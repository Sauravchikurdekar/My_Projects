package arry;

public class trail {
	public static void main(String[] args) {
		String str1 = "245";
		String str2 = "100A";

		int num1 = Integer.parseInt(str1);
		int num2 = 0;

		try {
			num2 = Integer.parseInt(str2);
		} catch (NumberFormatException e) {
			System.out.println("String cannot be parsed to integer");
		}

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
