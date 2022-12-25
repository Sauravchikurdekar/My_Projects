import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DemoTable extends JFrame{
DemoTable()
{
	String[]col= {"name","subject","batch","m1","m2","m3"};
	Object[][] data= {
			
				{"saurav","java","batch-1",99,99,99},
				{"A","RWD","batch-2",99,99,99},
				{"B","java","batch-3",99,99,99},
				{"C","SQL","batch-4",99,99,99},
				{"D","java","batch-5",99,99,99},
				{"E","C","batch-6",99,99,99},
				{"F","java","batch-3",99,99,99},
				{"G","C++","batch-3",99,99,99},
				{"H","java","batch-2",99,99,99},
			};
	JTable tb=new JTable(data,col);
	JScrollPane jp=new JScrollPane(tb);
	add(jp,BorderLayout.CENTER);
			}	

public static void main(String[] args) {
	DemoTable D1= new DemoTable();
	D1.setVisible(true);
	D1.setSize(400,400);
}
}
