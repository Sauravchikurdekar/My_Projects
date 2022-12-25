
public class static_class {
    static int count=0;
    public void show()     //normal or non-static method
    {
        System.out.println("in show method");
    }
    static         //->static block
    {
        System.out.println("in static block");
    }
    static_class()
    {
       
        count++;
    }
    public static void demo()
    {
         System.out.println("in static demo method");
    }
    public static void showCount()
    {
         System.out.println("count="+ count);
        }
   
     public static void main(String[] args) {    
         showCount();
             static_class s1=new static_class();
    demo();     //calling static method from static without  instance or object
       //calling non-static method from static with  instance or object
             static_class s2=new static_class();
                static_class s3=new static_class();
       showCount();
     }
}