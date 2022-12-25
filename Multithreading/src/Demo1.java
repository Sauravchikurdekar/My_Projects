public class Demo1 extends Thread
{
	
	public Demo1(String name)
	{
		super(name);
	}
	public void run() //to run or execute  thread
	{
		for(int i=1;i<=30;i++)
		{
			System.out.println("thread name="+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		Demo1 t1=new Demo1("Varad");  //created object of thread class
	 t1.start(); // to start thread
	 
	 Demo1 t2=new Demo1("Komal");  //created object of thread class
	 t2.start(); // to start thread
	}

}