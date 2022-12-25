package arry;

public class greater {
	public static void main(String[] args) {
		
	int [] a= {1,29,90,76,65,55,34,23};
	int max=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("Max:"+max);

}
}

