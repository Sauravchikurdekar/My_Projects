 import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class DemoTree extends JFrame {
   
    DefaultMutableTreeNode tt4;
 //create JTree  from DefaultMutableTreeNode->insert or remove elements
    //DefaultMutableTreeNode is an implementation of MutableTreeNOde
    //it inherits JComponent Class
    DemoTree()
    {
        //A generic Abstract Window Toolkit(AWT) container
        //object is a component that can contain other AWT components.
       
        Container cp=getContentPane();
        cp.setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);

        DefaultMutableTreeNode tp=new DefaultMutableTreeNode("Java options");
        DefaultMutableTreeNode t1=new DefaultMutableTreeNode("Core Java");
        tp.add(t1);
        DefaultMutableTreeNode tt1=new DefaultMutableTreeNode("Inheritance");
        t1.add(tt1);
        DefaultMutableTreeNode ttt1=new DefaultMutableTreeNode("Single Inheritance");
        DefaultMutableTreeNode ttt2=new DefaultMutableTreeNode("multilevel Inheritance");
        tt1.add(ttt1);
        tt1.add(ttt2);
       
        DefaultMutableTreeNode tt2=new DefaultMutableTreeNode("Polymorphism");
        t1.add(tt2);
        DefaultMutableTreeNode tt31=new DefaultMutableTreeNode("Swing");
        t1.add(tt31);
        DefaultMutableTreeNode t2=new DefaultMutableTreeNode("Advance Java");
        tp.add(t2);
        DefaultMutableTreeNode tt3=new DefaultMutableTreeNode("JSP");
        t2.add(tt3);
        tt4=new DefaultMutableTreeNode("EJB");
        t2.add(tt4);
        JTree t=new JTree(tp);
       
        cp.add(t);
       
    }
   
    public static void main(String[] args) {
    new DemoTree();

    }

}

