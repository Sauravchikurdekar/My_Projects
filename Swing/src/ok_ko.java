import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ok_ko extends JFrame implements ActionListener
{
	 JButton b,b1;

       public ok_ko() {
    	   setLayout(new FlowLayout());
    		  b=new JButton("ok");  //component
    	       add(b);
    	       b.addActionListener(this);
    	   
       }
   	@Override
   	public void actionPerformed(ActionEvent e) {
   		
   		if(e.getSource()==b)
   		{
   			if(b.getText()=="ok")
   			  b.setText("ko");
   			else
   	   			b.setText("ok");
   			
   		}
   	
   			
   	
   		
   	}
       
       
	public static void main(String[] args) {
	ok_ko l =new ok_ko();
	l.setVisible(true);
   l.setSize(400,400);
   l.setTitle("Login");
   l.setLocation(300,50);
   l.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
	}


}