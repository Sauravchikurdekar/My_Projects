import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Demo_RadioButton extends JFrame 
{
	
	
	JRadioButton B1,B2;
     ButtonGroup G1;
     JButton b1;
     JLabel l1;
	Demo_RadioButton()
	{
		//setLayout(new FlowLayout());
		setLayout(null);
		B1=new JRadioButton("Under-Graduate");
		B2=new JRadioButton("Graduate");
		b1=new JButton("click");
		G1=new ButtonGroup();
		l1=new JLabel("Qualification");
		
		B1.setBounds(120,30,120,50);
		B2.setBounds(250,30,80,50);
		l1.setBounds(20,30,150,50);
		b1.setBounds(125,90,80,30);
		b1.setBackground(Color.green);
		
		
		add(l1);
          add(B1);
	      add(B2);
			G1.add(B1);
			G1.add(B2);
			add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String lbl=" ";
				if(B1.isSelected())
				{
					lbl="ur under graduate";
					
				}
				else if(B2.isSelected())
				{
					lbl="ur graduate";
				}
				else
				{
					lbl="please select at least one option";
				}
				JOptionPane.showMessageDialog(Demo_RadioButton.this,lbl);
				
			}
			
			
		});
		
	}
	

	public static void main(String[] args) {
		Demo_RadioButton f=new Demo_RadioButton();
		f.setSize(600,300);
		f.setVisible(true);
	}

	

}
