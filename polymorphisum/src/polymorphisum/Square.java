package polymorphisum;

public class Square extends Shape{

	double side;

	public Square() {
		side=1;
	}
	public Square(double s,String col)
	{
		super(col);
		side=s;
	}
	public void draw()
	{
		System.out.println("drawing a Square ");
		//	super.fillColor();
	}

	public void calculateArea()
	{
		double area=side*side;
		System.out.println("Area of square = "+area);
	}

}
