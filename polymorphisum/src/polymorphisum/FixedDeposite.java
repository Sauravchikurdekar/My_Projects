package polymorphisum;

public class FixedDeposite extends Account {

	   int fdamount;
	   
	    FixedDeposite(int ano,String nm,int fdamt)
	    {
	        super(ano,nm);
	        fdamount=fdamt;
	    }
	    void print()
	    {
	      super.print();
	      System.out.println("FDAmount="+fdamount);
	    }
	}

