package polymorphisum;

public class WageEmployee extends employee {
    private int hours;
    protected float rate;
    WageEmployee()
    {
        hours=10;
        rate=1.5f;
    }
    WageEmployee(int id,String name,double sal,int hours,float rate)
    {
        super(id,name,sal);
        this.hours=hours;
        this.rate=rate;
       
    }
    public String toString()
    {
        return super.toString() + "hours=" + hours + " " + rate ;
    }
    public double calculateSalary()
    {
    System.out.println("Method called from WageEmployee ...");
    return (float)sal+(hours*rate);
    }

}

