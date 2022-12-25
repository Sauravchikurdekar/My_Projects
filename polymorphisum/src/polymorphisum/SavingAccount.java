package polymorphisum;

public class SavingAccount extends Account {
	 int balance;
	   
	    SavingAccount(int ano,String nm,int bal)
	    {
	        super(ano,nm);
	        balance=bal;
	    }
	    void print()
	    {
	        super.print();
	        System.out.println("Balance="+balance);
	    }
	}




