package arry;

public class Stringpractice {

	public static void main(String[] args) {

		String s = "CloudTech#@!";
		int count = 0;
		String specialCharacterRemoved = "";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i)))
				;

			else

				specialCharacterRemoved = specialCharacterRemoved + s.charAt(i);

		}
		if (count == 0) {
			System.out.println("there are no special character in the string ");
		} else {
			System.out.println("special character is found " + count);
		}
		System.err.println("special character removed " + specialCharacterRemoved);
	}
}
