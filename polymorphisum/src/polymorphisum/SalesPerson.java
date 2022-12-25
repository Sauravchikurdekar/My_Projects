package polymorphisum;

public class SalesPerson extends WageEmployee  {
    private int sales;
    protected float commission;
    SalesPerson()
    {
        sales=100;
        commission=1.8f;
    }
    SalesPerson(int id,String name,double sal,int hours,float rate,int sales,float commission)
    {
        super(id,name,sal,hours,rate);
        this.sales=sales;
        this.commission=commission;
       
    }
    public String toString()
    {
        return super.toString() + "sales=" + sales + " " + commission ;
    }
    public double calculateSalary()
    {
    System.out.println("Method called from SalesPerson ...");
    return (float)sal+(sales*commission);
    }
}
