

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad2 extends JFrame implements ActionListener{

	JMenuBar mbar;
	JMenu  filemenu,editmenu,helpmenu,colormenu;
	JMenuItem newmitem,openmitem,savemitem,exitmitem,cutmitem,copymitem,pastemitem,fcolor,bcolor,aboutmitem,helpmitem;
	JTextArea jt;
	JScrollPane jp;
	JPopupMenu pmenu;
	JMenuItem cutpmenuitem,copypmenuitem,pastepmenuitem;
	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		if(e.getSource()==cutmitem)
			jt.cut();
		if(e.getSource()==copymitem)
			jt.copy();
		if(e.getSource()==pastemitem)
			jt.paste();
		if(e.getSource()==cutpmenuitem)
			jt.cut();
		if(e.getSource()==copypmenuitem)
			jt.copy();
		if(e.getSource()==pastepmenuitem)
			jt.paste();
		if(e.getSource()==fcolor)
		{
			Color c=JColorChooser.showDialog(Notepad2.this,"Select fore Color ", Color.magenta);
			jt.setForeground(c);
			
		}
		if(e.getSource()==bcolor)
		{
			Color c=JColorChooser.showDialog(Notepad2.this,"Select background Color ", Color.GREEN);
			jt.setBackground(c);
			
		}
	}
	
	public Notepad2() {
	
		initialize();
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cutmitem.addActionListener(this);
		copymitem.addActionListener(this);		
		pastemitem.addActionListener(this);
		cutpmenuitem.addActionListener(this);		
		copypmenuitem.addActionListener(this);
		pastepmenuitem.addActionListener(this);
		fcolor.addActionListener(this);
		bcolor.addActionListener(this);
		
		
	}	
	
	public void initialize()
	{
		mbar=new JMenuBar();
		
		filemenu=new JMenu("File");
		editmenu=new JMenu("Edit");
		colormenu=new JMenu("Color");
		helpmenu=new JMenu("Help");
		
		
		newmitem=new JMenuItem("New");
		openmitem=new JMenuItem("Open");
		savemitem=new JMenuItem("Save");
		exitmitem=new JMenuItem("Exit");
		filemenu.add(newmitem);
		filemenu.addSeparator();
		filemenu.add(openmitem);
		filemenu.addSeparator();
		filemenu.add(savemitem);
		filemenu.addSeparator();
		filemenu.add(exitmitem);
		
		
		
		cutmitem=new JMenuItem("Cut");
		copymitem=new JMenuItem("Copy");
		pastemitem=new JMenuItem("Paste");
		editmenu.add(cutmitem);
		editmenu.addSeparator();
		editmenu.add(copymitem);
		editmenu.addSeparator();
		editmenu.add(pastemitem);
		
		
		
		fcolor=new JMenuItem("ForeColor");
		bcolor=new JMenuItem("BackColor");
		colormenu.add(fcolor);
		colormenu.add(bcolor);
		
		helpmitem=new JMenuItem("Help");
		aboutmitem=new JMenuItem("About");
		helpmenu.add(helpmitem);
		helpmenu.add(aboutmitem);
		
		mbar.add(filemenu);
		mbar.add(editmenu);
		mbar.add(colormenu);
		mbar.add(helpmenu);
		
		
		this.setJMenuBar(mbar); // menubar has to be added on root pane
		jt=new JTextArea();		
		jp=new JScrollPane(jt);		
		this.add(jp);
		
		
		pmenu=new JPopupMenu();
		cutpmenuitem=new JMenuItem("Cut");
		copypmenuitem=new JMenuItem("Copy");
		pastepmenuitem=new JMenuItem("Paste");
		pmenu.add(cutpmenuitem);
		pmenu.add(copypmenuitem);
		pmenu.add(pastepmenuitem);
		
		
		//Note: do not add popup menu in frame
		
	}
	public static void main(String[] args) {
		
		new Notepad2(); 
		
	}
	
	
	
	
}
