package polymorphisum;

public class testA_B {

    public static void main(String[] args) {
    	
    	
    	
    	//a1.show();
        A a1=new A();    
       a1.show();
     
        //superclass is holding class of sub
        //ref of super class=object of subclass
        //a1.show();
       
       
       
       B b1=new B();   //Method overriding
       b1.show();       //child class show /early binding
    }
       
}


