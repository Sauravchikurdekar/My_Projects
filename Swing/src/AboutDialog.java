
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class AboutDialog extends JDialog
{
    JLabel l1;
    JButton ok;
    
    public AboutDialog()
    {
    	this.setModal(true);
    	l1=new JLabel("Microsoft windows version 10 Copyright @2022 All Rights Reserved");
    	
    	l1.setIcon(new ImageIcon("d:\\images.jpg"));
    	ok=new JButton("ok");
    	this.add(l1);
    	this.add(ok);
    	ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AboutDialog.this.dispose();
				
			}
		});
    	this.setLayout(new FlowLayout());
    	this.setLocation(100,100);
    	this.setSize(500,300);
    	this.setVisible(true);
    }
}
