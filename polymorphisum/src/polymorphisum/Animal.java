package polymorphisum;

//public class  Animal {
//	
//	protected void eat()
//	{
//		System.out.println("They eat");
//	}
//
//}

public abstract class Animal
{
    public abstract void eat();
 
}

public class Elephent extends Animal
{
     void eat()
    {
        System.out.println("Elephants eats");
    }
}

public class Tiger extends Animal
{
     void eat()
    {
        System.out.println("Tiger eats");
    }
}

public class LivingBeing
{
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        t.eat();
       
        Elephant e=new Elephant();
        e.eat();        
    }
}
//======================================================
//package exabstract;
//
//public abstract class Mobilephone
//{
//  public abstract void makecall();
//  public void call()
//  {
//      System.out.println("myself");
//  }
//}
//
//public class Simplephone extends Mobilephone
//{
//    public void makecall()
//      {
//          System.out.println("Audio Printing");
//      }
//}
//
//public class Smartphone extends Mobilephone
//{
//    public void makecall()
//    {
//        System.out.println("Video Calling");
//    }
//}
//
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Simplephone sp=new Simplephone();
//        sp.makecall();
//       
//        Smartphone stph=new Smartphone();
//        stph.makecall();    
//    }
//}