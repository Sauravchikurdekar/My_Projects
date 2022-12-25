

public class salesPerson extends Employee
{
    private    double comm;
    private int saleamt;
    salesPerson()
    {
        comm=10.5;
        saleamt=15000;
    }

    salesPerson(int id,String nm,double sal ,double commi,int amt)
    {
        super(id,nm,sal);    //call parent parameterized constructor
    //    super();                    //call parent default constructor
        comm=10.5;
        saleamt=15000;
    }
     public String toString()
        {
            return  super.toString() + " "+comm + " " + saleamt ;
        }
     public static void main(String[] args) {
         salesPerson s1=new salesPerson();
         System.out.println(s1);
     }
}