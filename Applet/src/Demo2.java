

	import java.applet.Applet;
	import java.awt.Font;
	import java.awt.Graphics;

	public class Demo2 extends Applet{	
	      String str;
	       int size;
	      Font f;
	  	public void init()
		{
		str= getParameter("fontName");
		size=Integer.parseInt(getParameter("size"));
		f=new Font(str,Font.ITALIC,size);
		}
	  	 public void paint(Graphics g)
	  	{
	  	   g.setFont(f);
		    g.drawString("welcome to java applet",50,50);
	  	}
	      }
	/*
	<applet code="Demo1.class" width="400" height="200">
	<param name="fontName" value="Times New Roman">
	<param name="size" value="24">
	</applet>
	*/