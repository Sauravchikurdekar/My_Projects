package polymorphisum;

public class B extends A {
    /*
     * 1.compile time checking
     * first checking that method is present  in parent /super class or not
     *    a)no->compile time error
     *    b)yes->proceed for execution
     *
     * 2.run time execution
     * first check method in a class whose object is created
     *   a)yes-then call method from that class means class B
     *   b)no-then call method from class whose ref is created
     */
   
       public void show()
    {
    	  // super.show();                    //if you want to call parents same mrthod from child t
    	                                           // then use super key for that 
        System.out.println("in child class" +a);
    }
   
    public void show1()
    {
        System.out.println("in child class show1");
    }
}
