package polymorphisum;

public class Circle extends Shape{

	double radius;
	
	public Circle() {
	 radius=1;
	}
	public Circle(double r,String col)
	{
		super(col);
		radius=r;
	}
	public void draw()
	{
		System.out.println("drawing a circle ");
		super.fillColor();
	}
	
	public void calculateArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of cirlce = "+area);
	}
	
}