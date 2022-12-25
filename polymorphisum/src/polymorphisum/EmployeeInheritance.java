package polymorphisum;

public class EmployeeInheritance {

    public static void main(String[] args) {
    	
    	System.out.println(e.calculateSalary());
        //RTTI-Run Time Type Indetification
       //identify type present in EMployee reference
      
       if(e instanceof SalesPerson)
       {
           SalesPerson sp1;
               sp1=(SalesPerson) e;
               System.out.println("Salary = "+sp1.calculateCommission());
       }
//       if(e instanceof Developer)
//       {
//           Developer d1;
//               d1=(Developer) e;
//               System.out.println("Number of projects = "+d1.calculateProjectAmt());
//       }
    }
//        employee e=new employee();
//        System.out.println(e);
//        WageEmployee we=new WageEmployee();
//        System.out.println(we);
//        System.out.println(we.calculateSalary());
//        SalesPerson sp=new SalesPerson();
//        System.out.println(sp);
//        System.out.println(sp.calculateSalary());
//        employee e1=new employee(101,"komal",12000);
//        System.out.println(e1);
//        WageEmployee we1=new WageEmployee(101,"komal",12000,11,1.2f);
//        System.out.println(we1);
//        System.out.println(we1.calculateSalary());
//        SalesPerson sp1=new SalesPerson(101,"komal",12000,12,1.4f,120,1.5f);
//        System.out.println(sp1);
//        System.out.println(sp1.calculateSalary());
//    }
//}

//	    {
//	        System.out.println(e.calculateSalary());
//	    }
//	    public static void main(String[] args) {
//	        int ch=2;
//	        //switch case
//	        switch(ch)
//	        {
//	        case 1: calculate(new SalesPerson()); // is same Employee e1=new salesPerson();
//	        break;
////	        case 2: calculate(new Developer());       //is same Employee e1=new Developer();
////	        break;
//	       
//	        }

	   }
	//down casting
    //to call special method of child class
   
    //1. create reference of salesPerson
//    SalesPerson sp1;
//   
//    //2.assign Employee reference to salesPerson using down castig
//    sp1=(salesPerson) e1;
//   
//    System.out.println("Salary = "+sp1.calculateCommission());
//	}
//}


