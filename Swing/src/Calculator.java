import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
    JButton b,b1,b2,b3,b4,b5;
    JTextField t,t1,t2;
    JLabel l,l1,l2;
    JPanel p1,p2,p3;
    public Calculator() {
        setLayout(new FlowLayout());

    l=new JLabel("Enter First Number");
    add(l);
    t=new JTextField(20);
    add(t);
    l1=new JLabel("Enter Second Number");
    add(l1);
    t1=new JTextField(20);
    add(t1);
    l2=new JLabel("Result");
    add(l2);
    t2=new JTextField(20);
    add(t2);

    b=new JButton("+");
    add(b);
    // b.addActionListener(this);
        b1=new JButton("-");
    add(b1);
     //b1.addActionListener(this);
        b2=new JButton("*");
    add(b2);
     //b2.addActionListener(this);
        b3=new JButton("/");
    add(b3);
     //b3.addActionListener(this);
     b4=new JButton("Result");
        add(b4);
       //  b4.addActionListener(this);
        b5=new JButton("Clear");
    add(b5);
     //b5.addActionListener(this);
     p1=new JPanel(new GridLayout(3,2));
     p2=new JPanel (new GridLayout(1,6));
     p3=new JPanel(new GridLayout(2,1));
     add(p1);
     p1.add(l);
     p1.add(t);
     p1.add(l1);
     p1.add(t1);
     p1.add(l2);
     p1.add(t2);
     
     add(p2);
     p2.add(b);
     p2.add(b1);
     p2.add(b2);
     p2.add(b3);
     p2.add(b4);
     p2.add(b5);
     p3.add(p1,p2);
     add(p3);
     b.addActionListener(Calculator.this);
     b1.addActionListener(Calculator.this);
     b2.addActionListener(Calculator.this);
     b3.addActionListener(Calculator.this);
     b4.addActionListener(Calculator.this);
     b5.addActionListener(Calculator.this);
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setVisible(true);
        c.setSize(400,400);
        c.setTitle("Calculator");
        c.setLocation(300,50);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==b) {
            int n1=Integer.parseInt(t.getText());
            int n2=Integer.parseInt(t1.getText());
            int r=n1+n2;
            t2.setText(r+"");
        }
        else if(e.getSource()==b1) {
            int n1=Integer.parseInt(t.getText());
            int n2=Integer.parseInt(t1.getText());
            int r=n1-n2;
            t2.setText(r+"");
            }
        else if(e.getSource()==b2) {
            int n1=Integer.parseInt(t.getText());
            int n2=Integer.parseInt(t1.getText());
            int r=n1*n2;
            t2.setText(r+"");
        }
        else {
            int n1=Integer.parseInt(t.getText());
            int n2=Integer.parseInt(t1.getText());
            int r=n1/n2;
            t2.setText(r+"");
        }
       
        if(e.getSource()==b5) {
            t.setText("");
            t1.setText("");
            t2.setText("");
        }
    }

}