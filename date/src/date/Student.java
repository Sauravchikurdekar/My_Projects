package date;

public class Student{
	private int roll_no;
	private String stud_name;
	private float percen;
	
	public void initStudent()
	{
		roll_no=101;
		stud_name="Jyoti";
		percen=70f;
	}
	
	public void printDetails()
	{
		System.out.println("RollNo="+roll_no +"Stud_Name=" +stud_name+ "Percentage=" +percen);
	}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.initStudent();
		s.printDetails();
	}
}
