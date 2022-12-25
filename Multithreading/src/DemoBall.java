import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
                    //container class
public class DemoBall extends Frame implements Runnable {
      int x1=100, y1=50, x2=700,y2=200;
     
      Thread t1,t2;    ///contained object
      public DemoBall() {
              t1=new Thread(this,"First");
              t2=new Thread(this,"Second");
              t1.start();
              t2.start();
      }
   
      public void paint(Graphics g)
      {
          g.setColor(Color.RED);
          g.fillOval(x1, y1,40,40);
         
          g.setColor(Color.GREEN);
          g.fillOval(x2, y2,40, 40);
      }
      public void run() {
       int x3=100;
       
       try {
           while(x3<=700)
           {
               if(Thread.currentThread()==t1)
               {
                   x1++;
                    Thread.sleep(20);
                }
               if(Thread.currentThread()==t2)
               {
                   x2--;
                    Thread.sleep(20);
                }
               x3++;
               repaint();
           }// end of while
       }//end of try
     catch (InterruptedException e) {
        e.printStackTrace();
    }
}// end of run
   
public static void main(String[] args) {
        DemoBall d=new DemoBall();
        d.setVisible(true);
        d.setSize(800,300);
   }
}