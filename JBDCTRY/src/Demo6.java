import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
/*
 * 
 * 
create or replace function addnumber(p1 number,p2 number) return number
IS
  psum number;
Begin
  psum:= p1+p2;
 return psum;
end;
/
 */

public class Demo6{

	public static void main(String[] args)throws ClassNotFoundException, SQLException
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded ");
		String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
	    Connection con=DriverManager.getConnection(url,"hr","hr");
		System.out.println("connected successfully .... ");
		
		CallableStatement stmt=con.prepareCall("{ ? = call addnumber(?,?)}");  
		stmt.setInt(2,100);  
		stmt.setInt(3,30);  
		stmt.registerOutParameter(1,Types.INTEGER);  
		stmt.execute();  
		  
		System.out.println("Sum Of Numbers "+stmt.getInt(1)); 
		
	}
}
