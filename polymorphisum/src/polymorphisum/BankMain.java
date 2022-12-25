package polymorphisum;

public class BankMain {
	  public static void main(String[] args)
	    {
	        Account a=new Account(123,"Nayana");
	        SavingAccount sa=new SavingAccount(100,"Smita",20000);
	        FixedDeposite fd=new FixedDeposite(101,"Viju",25000);
	        a.print();
	        System.out.println(" ");
	        sa.print();
	        System.out.println(" ");
	        fd.print();
	    }
}
