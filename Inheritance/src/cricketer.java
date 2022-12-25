
public class cricketer extends players {
	private String city;
	cricketer(String name,String country,String city)
	{
		super(name, country);
		this.city=city;
	  }
	void print()
	{
     super.print();
		System.out.println("cricketer="+"city::"+city);
	}

}
