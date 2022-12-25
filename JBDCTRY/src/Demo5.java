import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
  create or replace procedure updatesalary(pid number,psalary number)
Is
Begin
    update emp set esal=psalary where empid=pid;
end;
/
 
 create or replace procedure remove_emp(eno  number)
Is
Begin
   delete from emp where empid=eno;
end;
/
 
 create or replace procedure addrow( eid  number,enm varchar2, esal number,did number)  
     AS
     Begin
      insert into emp values( eid,enm,esal,did);
    END;
   /

 */
import java.sql.Statement;

public class Demo5 {
	
	 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded ");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		    Connection con=DriverManager.getConnection(url,"hr","hr");
		    System.out.println("connection sucessfully...");
		    Statement st = (Statement) con.createStatement();
		
		CallableStatement stmt=con.prepareCall("{call addrow(?,?,?,?)}");  
		stmt.setInt(1,502);
		stmt.setString(2, "Tarun");
		stmt.setInt(3,27000); 
		stmt.setInt(4,70); 
		stmt.execute();  
		System.out.println("Done ");
		
		
	/*	CallableStatement stmt= con.prepareCall("{call remove_emp(?)}");  
		stmt.setInt(1,401);  
		stmt.execute();  
		System.out.println("Done ");*/
		
		/*CallableStatement stmt=con.prepareCall("{call updatesalary(?,?)}");  
		stmt.setInt(1,200);  
		stmt.setInt(2,27000); 		 
		stmt.execute();  
		System.out.println("Done ");*/
		  
	}

}
