public class Test extends Thread
{
		public void run() //to run or execute  thread
		{
			System.out.println("thread name="+ Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		 Test t1=new Test();  //created object of thread class
		 t1.start(); // to start thread
		 t1.setName("Varad");
		 
		 Test t2=new Test();  //created object of thread class
		 t2.start(); // to start thread
		 t2.setName("Komal");
		 
		 Test t3=new Test();  //created object of thread class
		 t3.start(); // to start thread
		 t3.setName("Ajit");
	}

}