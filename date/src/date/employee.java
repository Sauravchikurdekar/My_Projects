package date;

public class employee {
	private int employee_id;
	private String name;
	private int employee_sal;
	
	
	public void init()
	{
		employee_id=1;
				name= "saurav";
				employee_sal=70000;
	}
	public void show()
	{
		System.out.println("employee_id="+employee_id+"name="+name+"employee_sal=" +employee_sal);
	}
	public static void main(String[] arg)
	{
		employee e1=new employee();
		e1.init();
		e1.show();
	}

}
