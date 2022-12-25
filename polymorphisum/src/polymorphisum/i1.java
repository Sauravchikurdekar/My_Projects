package polymorphisum;

interface i1
{
   void f1();
}
interface i3
{
   void f3();
   void f4();

}
interface i2 extends i1,i3
{
   void f2();
}
 abstract class demo implements i1,i2,i3
{
   public void f1() {}
   public void f2() {}
   public void f4() {}

}
class DEMO1 extends demo implements i1
{
   // public void f3() {}
    public void f5() {}

   @Override
   public void f3() {
       // TODO Auto-generated method stub
      
   }
    

}
