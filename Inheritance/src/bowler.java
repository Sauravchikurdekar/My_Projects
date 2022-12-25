
public class bowler extends cricketer {
	private String arm_type;
	private String bowling_type;
	
	bowler(String name,String country,String city, String arm_type,String bowling_type)
	{
		super(name,country,city);
		this.arm_type=arm_type;
		this.bowling_type=bowling_type;
	}
	void print()
	{
		super.print();
		System.out.println("bowler details="+""+"arm_type::"+arm_type+"bowling_type::"+bowling_type);
	}

}
