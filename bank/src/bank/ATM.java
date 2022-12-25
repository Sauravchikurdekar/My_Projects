package bank;

public class ATM {
	private int no;
	private String ownerName;
	private double balance;
	public void init()
	{
		no=101;
		ownerName="saurav";
		balance=78000;
	}
	public void print()
	{
		System.out.println("Account number is="+ no +"Owner Name="+ ownerName +"Balance="+balance);
	}
	
}

