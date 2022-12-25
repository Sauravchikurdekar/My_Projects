package date;

public class account {
	  private int accno;
	    private String name;
	    private float bal;
	   
	    public void init()
	    {
	        accno= 123456;
	        name="sourav";
	        bal=20000;
	    }

	  public void show()
	  {
	    System.out.println("details of owner= "+ accno +" " + name + " " +bal);    
	  }
	  public void setName(String nm)    //mutator means changing content
	  {
	    name=nm;
	    }
	   public String getName() //accessor means access data
	  {
	    return name;
	    }
	   public void setbal(float Bal)
	   {
		   bal=Bal;
	   }
	   public float getbal()
	   {
		   return bal;
	   }
	    public static void main(String[] args) {
	     
	        account a=new account();
	        a.init();
	        a.show();
	        a.setName("saurav");
	        System.out.println("updated name= "+ a.getName()); 
	        a.setbal(30000);
	        System.out.println("updated bal="+a.getbal());
	        
	        a.show();
	       
	    }    
	   
	}
