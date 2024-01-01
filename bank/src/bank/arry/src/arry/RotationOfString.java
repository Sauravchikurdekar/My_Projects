package arry;

public class RotationOfString {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		if (isRotation(str1, str2)) {
			System.out.println("Rotation of string is present");
		}
		else {
			System.out.println("rotation of string is not found");
		}

	}

//	private static boolean isRotation(String str1, String str2) {
//		// TODO Auto-generated method stub
//		return ()str1.length()==str2.length() && ((str1+str2).indexof(str2)!=-1);
//	}

	public static boolean isRotation(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}

}
