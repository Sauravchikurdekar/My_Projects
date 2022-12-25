public class Account {

	private int balance;
	public Account() {
	 balance=5000;
	}
	public Account(int bal)
	{
		balance=bal;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String toString() {
		
		return "Balance  = "+balance;
	}
}
          //container class
class Transaction extends Thread
{
	Account aob;   //contained object
	
	Transaction(String name, Account a)
	{
		super(name); //to assign name to thread
		aob=a;
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("abc"))
			withdraw(1000);
		if(Thread.currentThread().getName().equals("xyz"))
			deposit(2000);
	}

	public void deposit(int amount) {
	 synchronized(aob)
	 {
                 int b=aob.getBalance();
                 System.out.println("---Balance befor deposit"+ b);
                 b=b+amount;
                 aob.setBalance(b);
                 System.out.println("---Balance after deposit"+ b);
}       
		
	}

	public void withdraw(int amount) {
		synchronized(aob)
		 {
        int b=aob.getBalance();
        System.out.println("---Balance befor withdraw"+ b);
        b=b-amount;
        aob.setBalance(b);
        System.out.println("---Balance after withdraw"+ b);
	}
	}
}