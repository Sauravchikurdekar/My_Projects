import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Thread1 extends Frame implements ActionListener{
	Button b1,b2;
	
	public Thread1(){
		b1=new Button("fibo");
	b2=new Button("reverse");
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

