class ThreadJoin extends Thread  
{  
	// overriding the run method  
	public void run()  
	{  
		for (int j = 0; j < 2; j++)  
		{  
			try  
			{  
				// sleeping the thread for 300 milli seconds  
				Thread.sleep(300);  
				System.out.println("The current thread name is: " + Thread.currentThread().getName());  
			}  
			catch(Exception e)  
			{  
				e.printStackTrace();
			}  
			//System.out.println( j );  
		}  
	}  
}  

public class ThreadJoinExample  
{  
	// main method  
	public static void main (String argvs[])  
	{  

		// creating 3 threads  
		ThreadJoin th1 = new ThreadJoin();  
		ThreadJoin th2 = new ThreadJoin();  
		ThreadJoin th3 = new ThreadJoin();  

		// thread th1 starts  
		th1.start();  

		// starting the second thread after when  
		// the first thread th1 has ended or died.  
		try  
		{  
		   	// invoking the join() method  
		//	th1.join();  

			th2.start(); 
					
			th3.start();  
		}   
		catch(Exception e)  
		{  
			e.printStackTrace();
		}  

	}  
} 
