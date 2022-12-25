package polymorphisum;

interface Bounceable{
void bounce();
}
interface Movable{
void move();
}
class Ball implements Bounceable,Movable
{
public void bounce()
{
System.out.println(""&quot;The ball bounces whenever it hits the ground &quot");
}
public void moves()
{
System.out.println(&quot;The ball moves on the ground &quot;);
}
}
class Car implements Movable
{
public void moves()
{
System.out.println(""&quot;The car moves with a speed of 80km/hr&quot");
}
}
public class InterfaceMain {
public static void main(String[] args) {
// TODO Auto-generated method stub
s
Movable c=new Car();
c.move();
Movable b=new Ball();
b.move();
Bounceable b1=new Ball();
b1.bounce();
}
}