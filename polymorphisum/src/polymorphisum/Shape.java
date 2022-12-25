package polymorphisum;

public abstract class Shape {

	String scolor;
	
	public Shape()
	{
		scolor="black";
	}
	public Shape(String c)
	{
		scolor=c;
	}
	
	//non abstract method
	public void fillColor()
	{
		System.out.println("Filling shape with color ");
	}
	
	//abstract method
	abstract public void draw();
	abstract public void calculateArea();
	
	
	public String toString() {
		
		return "Color= "+scolor;
	}
	public String getScolor() {
		return scolor;
	}
	public void setScolor(String scolor) {
		this.scolor = scolor;
	}	
	
}