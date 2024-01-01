package arry;

public class ReverseString {

	public static void main(String[] args) {

	String str="MADAM";
	String rev=" ";
	char arr[]=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		rev+=arr[i];                    
	}
	System.out.println("Original String :"+str);
	System.out.println("Reverse String :"+rev);

//	  Boolean k= str.equalsIgnoreCase(rev);
	if(!str.equalsIgnoreCase(rev)) {
		System.out.println("The String is palidrome.."  + str);
	}
	else {
		System.out.println("String is not palidrome.."  +str);
	}
	
	}

//		String inpute = "MADAM";
//		StringBuilder br = new StringBuilder();
//		StringBuilder rev = new StringBuilder(inpute).reverse();
//		
//		System.out.println(" original :"+inpute);
//		System.out.println("rev :"+rev);
//		if (inpute.equals(rev)) {
//			System.out.println("String is palidrom...");
//		} else {
//			System.out.println("String is not palidrom");
//		}

	}

