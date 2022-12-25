package method_overloading;

public class Practic_Methods {
	
//	static void multiplication(int n) {
//		for(int i=1;i<=10;i++) {
//			System.out.format("%d X %d=%d\n",n,i,n*i);
//			
//		}
//	}
	
	
	
//	static void pattern(int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	
//	static int sumRec(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n+sumRec(n-1);
//	}
	
//	
//	static int fibo(int n) {
//		/*
//		 * if(n==0) { return 0; } else if(n==1) { return 1; }
//		 */
//		if(n==1 || n==2) {
//			return n-1;
//		}
//		else {
//			return fibo(n-1)+fibo(n-2);  //  fibonachi series 0,1,1,2,3,5,8,13,21,34
//		}
//	}
	
	
	static void pattern_Rec(int n) {
		if(n>0) {
			pattern_Rec(n-1);
			for(int i=0;i<n;i++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	/*
	 * patter_Rec(3) patter_Rec(2)+3 time star and new line patter_Rec(1)+2 time
	 * star and new line +3 time star and new line patter_Rec(0)+1 time satr and new
	 * line+2 time star and new line +3 time star and new line
	 */
	public static void main(String[] args) {
		
		//multiplication table of n
		
//		multiplication(7);
		
		
//		pattern(4);
		
//		int c=sumRec(4);
//		System.out.println(c);
		
//		int result=fibo(5);
//		System.out.println(result);
		
		 pattern_Rec(4);
		
//		float a=7/4.0f*9/2.0f;
//		System.out.println(a);
		
		
	}

}
