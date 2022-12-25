import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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


public class Notepad extends JFrame implements ActionListener
{
	JMenuBar mbar;
	JMenu filemenu,editmenu,colormenu,helpmenu;
	JMenuItem newmitem,openmitem,savemitem,exitmitem,cutmitem,copymitem,pastemitem,fcolor,bcolor,helpmitem,aboutmitem;
	JTextArea jt;
	JPopupMenu pmenu;
	JMenuItem cutpmenuitem,copypmenuitem,pastepmenuitem;
	JScrollPane jp;
	
	public Notepad()
	{
		initialize();
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cutmitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==cutmitem)
					jt.cut();
				
			}
		});
		copymitem.addActionListener(this);
		pastemitem.addActionListener(this);
        fcolor.addActionListener(this);
		bcolor.addActionListener(this);
		cutpmenuitem.addActionListener(this);
		copypmenuitem.addActionListener(this);
		pastepmenuitem.addActionListener(this);
		
		 savemitem.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					JFileChooser jf=new JFileChooser(".");
					int n=jf.showSaveDialog(Notepad.this);

					if(n==0)
					{
						saveFile(jf);
					}			
				}
			});
		 openmitem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 if(!jt.getText().equals(""))     //     0  or  1
				    {
				    	int n1=JOptionPane.showConfirmDialog(Notepad.this, "Do you want to save changes?");
				    	if(n1==0)     //to save file before creating new
				    	{
				    		JFileChooser jf=new JFileChooser("d:");
			                 int n=jf.showSaveDialog(Notepad.this);
			                 if(n==0)
			                 {
				    	    	saveFile(jf);
				    		    jt.setText(""); 
			                 }
				    	}
				    	else if(n1==1)
				    	{
				    		openFile();
				    	}
				    }
			}//close of actionPerformed

		
				    	
		});
		 openmitem.addActionListener(new ActionListener() {
	           
	            public void actionPerformed(ActionEvent arg0) {
	                 if(!jt.getText().equals(""))     //     0  or  1
	                    {
	                        int n1=JOptionPane.showConfirmDialog(Notepad.this, "Do you want to save changes?");
	                        if(n1==0)     //to save file before creating new
	                        {
	                            JFileChooser jf=new JFileChooser("d:");
	                             int n=jf.showSaveDialog(Notepad.this);
	                             if(n==0)
	                             {
	                                saveFile(jf);
	                                openFile();
	                             }
	                        }
	                        else if(n1==1)
	                        {
	                            openFile();
	                        }
	                    }
	                 else
	                     openFile();
	                 
	            }//close of actionPerformed
	      });
		 
		newmitem.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
			    if(!jt.getText().equals(""))     //     0  or  1
			    {
			    	int n1=JOptionPane.showConfirmDialog(Notepad.this, "Do you want to save changes?");
			    	if(n1==0)     //to save file before creating new
			    	{
			    		JFileChooser jf=new JFileChooser("d:");
		                 int n=jf.showSaveDialog(Notepad.this);
		                 if(n==0)
		                 {
			    	    	saveFile(jf);
			    		    jt.setText(""); 
		                 }
			    	}
			    	else if(n1==1)  //code for dont save and create new file
			    	{
			    		 jt.setText("");
			    	}
			    }
				
			}
		});
		
		 jt.addMouseListener(new MouseAdapter() {
			 
				public void mouseReleased(MouseEvent e) {

					if(e.isPopupTrigger())
					{
						pmenu.show(e.getComponent(), e.getX(), e.getY());
					}
				}			
		});
	}
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
			Color c=JColorChooser.showDialog(Notepad.this,"select any color",Color.RED);
		     jt.setForeground(c);
		}
		if(e.getSource()==bcolor)
		{
			Color c=JColorChooser.showDialog(Notepad.this,"select any color",Color.RED);
		     jt.setBackground(c);
		}
		
	}// ActionPerformed end
	public void saveFile(JFileChooser jf)
	{
		File f=jf.getSelectedFile();   //create file suppose sonali.txt
		System.out.println(f);
		try {
			  //to perform write operation on file
			FileOutputStream fout=new FileOutputStream(f);
			
			//read from textarea
			String text=jt.getText();
			
			//write that text in file
			fout.write(text.getBytes());
			System.out.println("write successfully");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}// end of saveFile method 
	public void openFile() {
		JFileChooser j=new JFileChooser(".");
		int val=j.showOpenDialog(Notepad.this);
		if(val==0)
		{
			File f=j.getSelectedFile();
			StringBuffer str=new StringBuffer();
			String s;
			BufferedReader br;
			try {
				br=new BufferedReader(new FileReader(f.getAbsolutePath()));
				while((s=br.readLine())!=null)
				{
					str.append(s);
					str.append("\n");
				}
				jt.setText(str.toString());
				br.close();
			}
			catch(IOException e2)
			{
				
			}
			
			
		}
		
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
		editmenu.add(copymitem);
		editmenu.add(pastemitem);
		
		
		fcolor=new JMenuItem("ForeColor");
		bcolor=new JMenuItem("BackColor");
		colormenu.add(fcolor);
		colormenu.add(bcolor);
		
		helpmitem=new JMenuItem("Help");
		aboutmitem=new JMenuItem("About");
		helpmenu.add(helpmitem);
		helpmenu.add(aboutmitem);
		
		mbar.add(filemenu);        //adding contents to menubar
		mbar.add(editmenu);
		mbar.add(colormenu);
		mbar.add(helpmenu);
		
		this.setJMenuBar(mbar);  //menubar has to be added on root pane
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
		
	}
	
	public static void main(String[] args) {
		Notepad n=new Notepad();
	}
	

}