package method_overloading;



	class A {
		public void meth1() {
			System.out.println("i am method 1 of class A");
		}

		public void meth2() {
			System.out.println("i am method 2 of class A");
		}
	}

	class B extends A {
		public void meth2() {
			//super.meth2();
			System.out.println("i am method 2 of class B");
		}

		public void meth3() {
			System.out.println("i am method 3 of class B");
		}

	}
	public class overriding {

	public static void main(String[] args) {

		A a = new A();
		a.meth2();
		
		B b=new B();
		b.meth2();

	}
}
