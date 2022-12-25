
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
	 JButton b,b1;
	 JTextField t1,t2;
	 JLabel l1,l2;
       public Login() {
    	   setLayout(new FlowLayout());
    	   l1=new JLabel("Enter User Name");
    	   l2=new JLabel("Enter Password");
    		  b=new JButton("Click me");  //component
    		  b1=new JButton("Clear data");  //component
    	       t1=new JTextField(20);
    	       t2=new JPasswordField(20);
    	       
    	       add(l1);
    	       add(t1);
    	       add(l2);
    	       add(t2);
    	       add(b);
    	       add(b1);
    	       b.addActionListener(this);
    	       b1.addActionListener(this);
//    	       b1.addActionListeneer(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//			})
       }
   	@Override
   	public void actionPerformed(ActionEvent e) {
   		
   		if(e.getSource()==b)
   		{
   			if(t1.getText().equals("saurav") && t2.getText().equals("chiku"))
   				JOptionPane.showMessageDialog(this, "Login successful","Login Satus",0);
   			else
   				JOptionPane.showMessageDialog(this, "Try again","Login satus",0);
   				
   		
   		}
   		
   		if(e.getSource()==b1)
   		{
   			t1.setText(""); 			
   			t2.setText(""); 	
   	
   		}
   		
   	}
       
       
	public static void main(String[] args) {
	Login l =new Login();
	l.setVisible(true);
   l.setSize(400,400);
   l.setTitle("Login");
   l.setLocation(300,50);
   l.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
	}


}