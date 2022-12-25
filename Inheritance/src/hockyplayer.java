
public class hockyplayer extends players{
	private int age;
	private double height;
	hockyplayer(String name, String country, int age,double height )
	{
	super(name,country);
	this.age=age;
	this.height=height;
	}
	public void print()
	{
		super.print();
		System.out.println("hockyplayer details="+"age::"+""+age+"height::"+height);
	}

}
