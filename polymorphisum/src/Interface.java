

interface printable
{
    void print();
    void show();
}
 class emp implements printable
{

   public void print() {
       System.out.println("im employee print");
    }
     public void show() {
         System.out.println("im employee show method");
     }
   
}
 class animal implements printable
{

   public void print() {
       System.out.println("im animal print");
    }
     public void show() {
         System.out.println("im animal show method");
     }
   
}
 
//class manager extends emp
//{
//    
//}

public class Interface {
   
    public static void main(String[] args) {
        emp e1=new emp();
                e1.print();
                e1.show();
               
            animal e2=new animal();
                e2.print();
                e2.show();
    }
}