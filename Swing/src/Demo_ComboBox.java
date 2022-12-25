import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo_ComboBox extends JFrame {
	JComboBox <String> cb;
	JTextField jt;
	Demo_ComboBox()
	{
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		cb=new JComboBox();
		jt=new JTextField(30);
		cb.addItem("Mango");
		cb.addItem("Apple");
		cb.addItem("chikku");
		cb.addItem("Banana");
		add(cb);
		add(jt);
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED)
				jt.setText(e.getItem().toString());
				
			}
		});
		
	}
	
	public static void main(String[] args) {
        new Demo_ComboBox();
	}

}