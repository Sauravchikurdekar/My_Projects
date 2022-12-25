package arry;

public class var_arg {

//	static int sum(int a, int b) {
//		return a + b;
//	}
//
//	static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
	
	static int sum(int...arr) {
		int result=0;
		for(int a:arr) {
			result +=a;
	}
		return result;
}

	public static void main(String[] args) {
		System.out.println("the sum of 4 and 5 is :" + sum(4, 5));
		System.out.println("the sum of 4,6 and 5 is :" + sum(4, 5, 6));

	}

}
