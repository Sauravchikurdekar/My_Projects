
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame {

	JToolBar tbar;
	JTextArea txtarea;
	JButton b1,b2,b3;
	public ToolBarDemo()
	{
		b1=new JButton("cut");
		b2=new JButton("new");
		b3=new JButton("save");
		txtarea=new JTextArea();
		tbar=new JToolBar("mytool");
		tbar.add(b1);
		tbar.add(b2);
		tbar.add(b3);
		this.add(tbar,BorderLayout.NORTH);
		this.add(txtarea);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarDemo();
	}

}
