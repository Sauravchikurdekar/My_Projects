package polymorphisum;

public class Demo_interface {
     public static void main(String[] args) {
            demo d1=new DEMO1();
            d1.f3();
            d1.f4();
            DEMO1 D1=new DEMO1();
            D1= (DEMO1) d1;
            D1.f5();
           
        }

}