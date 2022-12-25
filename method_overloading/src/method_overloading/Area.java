package method_overloading;

public class Area {
	public  float Area(float r)
	{
		return 3.14f*r*r;
	}
	public float Area(float h,float b)
	{
		return (h*b)/2;
	}
	public int Area(int w,int l)
	{
		return w*l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a1=new Area();
		System.out.println("Area of Circle : "+a1.Area(20));
		System.out.println("Area of Triangle : "+a1.Area(10f,12f));
		System.out.println("Area of rectangle : "+a1.Area(20,45));
		

	}
}