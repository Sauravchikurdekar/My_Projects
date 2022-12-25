
public class batsman extends cricketer {
	private String arm_type;
	
	batsman(String name,String country,String city,String arm_type)
	{
		super(name,country,city);
		this.arm_type=arm_type;
	}
	void print()
	{
		super.print();
		System.out.println("batsman details="+"arm_type::"+""+arm_type);
	}

}


