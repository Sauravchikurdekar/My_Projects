package date;

public class greet {
    private int rollno;
    private String name;
    private int marks;
   
    public void initStud()
    {
        rollno=101;
        name="sonali";
        marks=65;
    }

  public void printStud()
  {
    System.out.println("details of stud= "+ rollno +" " + name + " " +marks);    
  }
  public void setName(String nm)    //mutator means changing content
  {
    name=nm;
    }
   public String getName() //accessor means access data
  {
    return name;
    }
    public static void main(String[] args) {
     
        greet g1=new greet();
        g1.initStud();
        g1.printStud();
        g1.setName("sonal");
        System.out.println("updated name= "+ g1.getName()); //inline function
  /*  String nm=g1.getName();
    System.out.println(nm);*/
        g1.printStud();
       
    }    
   
}