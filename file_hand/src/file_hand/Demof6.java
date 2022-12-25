package file_hand;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demof6 {

	public static void main(String[] args) {
	String str=" son ali shinde sonsoosono sosososo"; //source string
	
	//Pattern p=Pattern.compile("son"); //exact match
	//OR
     Pattern p=Pattern.compile("son.?"); // match anywhere (even as substring)
	//System.out.println("original string="+p);
	Matcher m=p.matcher(str);
	//System.out.println("original string="+m);
	System.out.println("original string="+str);
	str=m.replaceAll("abc");
	System.out.println("after replacement string is="+str);
	
	String input="foo foo sonali shinde foo foo";
	Pattern p1=Pattern.compile("foo foo");
	Matcher m1=p1.matcher(input);
	System.out.println("current input is="+ input);
	
	System.out.println("looking at()"+m1.lookingAt());
	System.out.println("matches()"+m1.matches());
	}

}
