public class Demo extends Thread
{
		public void run() //to run or execute  thread
		{
			if(Thread.currentThread().getName().equals("Varad"))
			System.out.println("Welcome by="+Thread.currentThread().getName() );
			if(Thread.currentThread().getName().equals("Komal"))
				System.out.println("Thank You by="+Thread.currentThread().getName() );
			
		}
	public static void main(String[] args) {
		Demo t1=new Demo();  //created object of thread class
		 t1.start(); // to start thread
		 t1.setName("Varad");
		 
		 Demo t2=new Demo();  //created object of thread class
		 t2.start(); // to start thread
		 t2.setName("Komal");
		 
		
	}

}