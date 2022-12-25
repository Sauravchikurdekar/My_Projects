/* covraint retrun type work only for non-primitive rterun types*/
package polymorphisum;

//class Tester1{
//     public Number get()
//     {
//         System.out.println("super class");
//         return 12.5;
//     }
//}    
//class Tester extends Tester1{
//    public Integer get()
//    {
//        System.out.println("sub class");
//        return 12;
//    }
// 
//     public static void main(String args[])
//     {
//             Tester1 e1=new Tester();
//             e1.get();
//    }
//} 



class Tester1{
     Tester1 get()
     {
         System.out.println("super class");
         return this;
     }
}    
class Tester extends Tester1{
    Tester get()
    {
        System.out.println("sub class");
        return this;
    }
 
     public static void main(String args[])
     {
             Tester1 e1=new Tester();
             e1.get();
    }
}