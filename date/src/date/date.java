package date;
class date
{
	//data member / instance field
    private int d,m,y;
   
    public date()
    {
        d=1;
        m=7;
        y=2022;
    }
    public date(int d1,int m1,int y1)
    {
        d=d1;
        m=m1;
        y=y1;
    }
    public String toString()
    {
       return"Date = "+d+"/"+m+"/"+y;
    }
    public boolean equals( Object d2)
    {
        //d2 is ref of Object(Super) class
        //d1->this   //both are type of Date class
        date dd2=(date)d2;
        if(this.d==dd2.d ||this.m==dd2.m ||this.y==dd2.d )
            return true;
        else
        return false;
    }
    public static  void main(String args[])
    {
       date d1=new date(9,7,2022);
       System.out.println(d1);
       date d2=new date(9,7,2022);
      
       if(d1.equals(d2))
           System.out.println("date are same");
       else
           System.out.println("date are not same");
      
       //comparing reference
       if(d1==d2)
           System.out.println("date are same");
       else
           System.out.println("date are not same");
      
      
    }
}

   

//private int d,month,year;    //variables declaration or data memebrs
//public void init()       //method
//{
//   d=27;
//   month=6;
//   year=2022;
//}
// void show()
// {
//      System.out.println("date= " + d + "month = "+ month + "year =" +year);
// }
//
//
//
//	public static void main(String[] args) {
//		date d1=new date();
//        d1.init();
//        d1.show();
//		// TODO Auto-generated method stub
//System.out.println("hello");
//	}
//
//}
//public class Date {
//
//    //data member / instance field
//    private int d,m,y;
//   
//    public Date()
//    {
//        d=1;
//        m=7;
//        y=2022;
//    }
//    public Date(int d1,int m1,int y1)
//    {
//        d=d1;
//        m=m1;
//        y=y1;
//    }
//   
//    public String toString()
//     {
//        return"Date = "+d+"/"+m+"/"+y;
//     }
//   
//}

//public static void swap(date d1,date d2)
//{
//date temp;
//temp=d1;
//d1=d2;
//d2=temp;
//
//}
//
//public static void main(String[] args) {
//
//date d1=new date();
//date d2=new date(29,6,96);
//System.out.println("Before swap");
//System.out.println(d1);
//System.out.println(d2);        
//
//swap(d1,d2);   //actual arg passing parmeter to method as object
////pass by value-only reference is passed-only photocopy  of ref is
////created
//System.out.println("After swap");
//System.out.println(d1);
//System.out.println(d2);    
//}
//}