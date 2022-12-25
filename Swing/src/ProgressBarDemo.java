
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class ProgressBarDemo extends JFrame {

	JProgressBar jbar;
	JButton but;
	JTextField txtfield;
	public ProgressBarDemo()
	{
		jbar=new JProgressBar(0,2000);
		this.add(jbar);
		but=new JButton("Please click");
		txtfield=new JTextField(20);
		txtfield.setToolTipText("Please enter email ID");
		this.add(but);
		this.add(txtfield);
		
		jbar.setStringPainted(true);
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setVisible(true);
	}
	public void showProgress()
	{
		int i=0;
		while(i<=2000)
		{
			i=i+20;
			jbar.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgressBarDemo p=new ProgressBarDemo();
		p.showProgress();

	}

}