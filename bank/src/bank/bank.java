package bank;

public class bank {
	private int accno;
	private String name;
	private int bal;
	
	public void init()
	{
		accno=100001;
		name="ashwini";
		bal=50000;
	}
	
	public void show()
	{
		System.out.println("account number="+accno+", Name="+name+", Balance="+bal);
	}
	
	public static void main(String[] args)
	{
		bank b1=new bank();
		b1.init();
		b1.show();
	}
}
