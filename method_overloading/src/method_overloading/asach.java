package method_overloading;

public class asach {

	void multi(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static int SumRec(int n) {
		if(n==1) {
			return 1;
		}
		
		return n+SumRec(n-1);

	}

	public static void main(String[] args) {
		asach m = new asach();
		m.multi(7);
		
		int c=SumRec(4);
		System.out.println(c);
	}

}
