
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class firstswing extends JFrame
{
	
	public static void main(String[] args) {
		JFrame f=new JFrame(); //creating containter instance of frame
		 JButton b=new JButton("Click me");  //component
		 JTextField t1=new JTextField(20);
		// t1.setBounds(50,50,150,20);
		 JTextField t2=new JTextField(20);
		// t1.setBounds(50,50,150,20);
		// b.setBounds(60,100,100,40); // x axis, y axis, width,height
	    f.add(b);
	    f.add(t1);
	    f.add(t2);
		f.setSize(400,500);   //400 as width and 500 as heigth
		f.setLayout(new FlowLayout());
		f.setVisible(true);   //making the frame visible
   	}

}