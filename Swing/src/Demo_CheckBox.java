import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo_CheckBox extends JFrame implements ItemListener
{
	JLabel l1,l2;
	JCheckBox c1,c2;
	public Demo_CheckBox()
	{
		setLayout(new FlowLayout());
		
		c1=new JCheckBox("Singing"); //true means checkbx is by default selected
		c2=new JCheckBox("Dancing"); 
		
		l1=new JLabel("Singing selected");
		l2=new JLabel("Dancing selected");
		
		//set color
		l1.setForeground(Color.red);
		l2.setForeground(Color.green);
		
		//creating a new panel
		JPanel p=new JPanel();
		p.add(c1);
		p.add(c2);
		p.add(l1);
		p.add(l2);
		add(p);
		setSize(600,300);
		setVisible(true);
		c1.addItemListener(Demo_CheckBox.this);
		c2.addItemListener(Demo_CheckBox.this);
		
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==c1)
		{
			if(e.getStateChange()==1)
				l1.setText("singing selected");
			else
			  l1.setText("singingn not  selected");
		}
		else
		{
			if(e.getStateChange()==1)
				l2.setText("Dancing selected");
			else
			  l2.setText("Dancing  not  selected");
		}
		
	}
	
	public static void main(String[] args) {
	   
           new Demo_CheckBox();
	}


}