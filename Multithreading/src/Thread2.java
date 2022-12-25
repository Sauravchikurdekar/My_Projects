import java.awt.*;
import java.awt.event.*;
public class Thread2{
    public static void main(String args[]){
        Thread1 my=new Thread1();
    }
}
class Thread1 extends Frame implements ActionListener{
    Button b1,b2;
   
    public Thread1(){
        b1=new Button("1");
    b2=new Button("1");
    add(b1);
    add(b2);
    setLayout(new FlowLayout());
    b1.addActionListener(this);
    b2.addActionListener(this);
   
    setSize(400,400);
    setVisible(true);

    }
public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
        MyThread m1=new MyThread(b1);
        m1.start();
        }
   
        if(e.getSource()==b2){
        MyThread m2=new MyThread(b2);
        m2.start();
        }
    }
}

class MyThread extends Thread{
    Button temp;
    public MyThread(){
    }
   
    public MyThread(Button temp){
        this.temp=temp;
    }
public void run()
{
    for(int i=0; ;i++)
    {
        String str=temp.getLabel();
        System.out.println(str);
        int t=Integer.parseInt(str);
        temp.setLabel(""+(t+1));
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException ie)
        {
        }
    }
}
}
