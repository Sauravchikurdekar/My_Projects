package arry;

import java.security.DomainCombiner;

public class Ewwww {
	// public static void main(String[] args) {
//
//		int n1 = 0, n2 = 1, n3, count=5;
//		
//		System.out.println(n1+"\n"+n2);
//		
//		for(int i=1;i<=count;i++) {
//		
//		n3=n2+n1;
//		System.out.println(n3);
//		n1=n2;
//		n2=n3;
//		}
//
//	}
//}

//	static int fibbo(int num) {
//		if (num == 1) {
//			return 0;
//		} else if (num == 2) {
//			return 1;
//		} else {
//			return fibbo(num - 1) + fibbo(num - 2);
//		}
//	}
//
//	public static void main(String[] args) {
//		int result = fibbo(8);
//		
//		System.out.println(result);
//	}
//}

//	 public static int fibbo(int num) {
//		 if(num==0) {
//			 return 0;
//		 }
//		 else if(num==1) {
//			 return 1;
//		 }else {
//			 return fibbo(num-1)+fibbo(num-2);
//		 }
//	 }
//	 public static void main(String[] args) {
//		int n=10;
//		for(int i=0;i<=n;i++) {
//			System.out.print(fibbo(i));
//			System.out.print(" ");
//		}
//	public static void main(String[] args) {
//
//		int n1 = 0, n2 = 1, n3, count = 5;
//
//		System.out.print(n1+" "+ n2);
//		for(int i =1;i<=count;i++) {
//			n3=n2+n1;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//			
//		}
//	}
	
 public static int fibbo(int a) {
	 if(a==0) {
	return 0;
	 }
	 else if (a==1) {
		 return 1;
	 }
	 else {
		 return fibbo(a-1)+fibbo(a-2);
	 }
 }
 public static void main(String[] args) {
	int a=10;
	for(int i=0;i<=a;i++) {
		System.out.print(" "+fibbo(i));
//		System.out.print(" ");
	}
}
}
