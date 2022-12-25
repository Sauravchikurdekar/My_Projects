package method_overloading;

public class overloading {

	static void foo() {
		System.out.println("good morning bro..!");
	}

	static void foo(int a) {
		System.out.println("good morning " + a + " bro...!");
	}

	static void foo(int a,int b) {
		System.out.println("good morning "+a +" "+ b+ " bro ");
	}
	public static void main(String[] args) {
		// overloading o=new overloading();
		foo();
		foo(1000);
		foo(200 ,100);
	}

}
