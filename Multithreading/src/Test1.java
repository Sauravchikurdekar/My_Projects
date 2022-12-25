public class Test1 
{
	public static void main(String[] args) {
	Account obj=new Account(10000);
	
		 Transaction t1=new Transaction("abc",obj);  //created object of thread class
			 
		 Transaction t2=new Transaction("xyz",obj);  //created object of thread class
			t2.start(); // to start thread
		 t1.start(); // to start thread

		 
		}

}