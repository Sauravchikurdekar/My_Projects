
public class footballplayer extends players {
	private String team;
	footballplayer(String name,String country,String team)
	{
		super(name,country);
		this.team=team;
	}
	void print()
	{
		super.print();
		System.out.println("footbollplayer details="+"team::"+team);
	}

}
