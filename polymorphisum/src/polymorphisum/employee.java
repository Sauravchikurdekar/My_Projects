package polymorphisum;

public class employee {
	 private int eno;
	    private String enm;
	    protected double sal;
	    private double hra,foodall,pt,tallow;
	    employee()
	    {
	        eno=101;
	        enm="sonali";
	        sal=5000;
	    }
	    employee(int id,String name,double sal)
	    {
	        eno=id;
	        enm=name;
	        this.sal=sal;
	        hra=    this.sal*.5;
	        foodall=2000;
	        pt=200;
	        tallow=1500;
	       
	    }
	    public String toString()
	    {
	        return "Details=" + eno + " " + enm + " "+ sal;
	    }
	    public double calculateSalary()
	    {
	    System.out.println("Method called from Employee ...");
	    //code to calculate net salary
	    return sal+hra+tallow+foodall-pt;
	    }
	    //public double calculateCommission() {return 0;}

	}


