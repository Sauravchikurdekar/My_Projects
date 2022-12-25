

public class Developer extends Employee
{
    private   int no_pro,exp;
    Developer()
    {
        no_pro=10;
        exp=15;
    }
     public String toString()
        {
            return  super.toString() + " "+no_pro + " " + exp ;
        }
     public static void main(String[] args) {
         Developer d1=new Developer();
         System.out.println(d1);
     }
}

