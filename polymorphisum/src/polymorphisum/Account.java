package polymorphisum;

public class Account {
	
	    int accno;
	    String name;
	   
	    Account(int ano,String nm)
	    {
	        accno=ano;
	        name=nm;
	    }
	    void print()
	    {
	        System.out.println("Account Number="+accno+","+"Name="+name);
	    }
	}



