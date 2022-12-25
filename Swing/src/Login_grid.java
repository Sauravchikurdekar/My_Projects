import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// JFrame - container
public class Login_grid extends JFrame implements ActionListener
{
	//components 
	JLabel l1,l2;
	JTextField t1;
	JPasswordField ps1;
	JButton b1,b2,b3;
	JPanel p1,p2,p3;

	public Login_grid() {

		setLayout(new FlowLayout());

		// initialize component objects using new keyword
		l1=new JLabel("Enter username");
		l2=new JLabel("Enter password");
		t1=new JTextField(10);
		ps1=new JPasswordField(10);
		b1=new JButton("Login");
		b2=new JButton("Clear");
		b3=new JButton("Cancel");
		p1=new JPanel(new GridLayout(2,2));
		p2=new JPanel(new GridLayout(1,3));
		p3=new JPanel(new GridLayout(2,1));
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(ps1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		p3.add(p1);
		p3.add(p2);
		add(p3);
		
		//Add Listener
		b1.addActionListener(Login_grid.this);
		b2.addActionListener(Login_grid.this);
	}

	//event handler code - response code

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			String passText = new String(ps1.getPassword());
			if(t1.getText().equals("sonali") &&  passText.equals("soham"))
				JOptionPane.showMessageDialog(Login_grid.this, "Login successful","Login Satus",3);
			else                                                                          //0-3
				JOptionPane.showMessageDialog(Login_grid.this, "Login failed","Login Satus",3);
		}

		if(e.getSource()==b2)
		{
			t1.setText("");
			ps1.setText("");
		}
	}


	public static void main(String[] args) {

		Login_grid l=new Login_grid();
		l.setVisible(true); //compulsory
		l.setSize(400,400);
		l.setLocation(200, 50);
		l.setTitle("Login");
	l.setDefaultCloseOperation(EXIT_ON_CLOSE);      //end task or operation terminated perform implicitly
	}


}