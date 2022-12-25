import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static class Demo1 {

		 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded ");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		    Connection con=DriverManager.getConnection(url,"hr","hr");
		    System.out.println("connection sucessfully...");
		    Statement st = (Statement) con.createStatement();
	     
		    PreparedStatement pst=con.prepareStatement("select esal,ename from emp where esal>?");
		    pst.setInt(1,20000);
		    ResultSet rs = pst.executeQuery();
	         while(rs.next ())
	         {
	        	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
	         }
	         PreparedStatement pst1 =con.prepareStatement("insert into emp values(?,?,?,?)");
	         pst1.setInt(1,401);
	         pst1.setString(2,"jagruti");
	         pst1.setInt(3,40000);
	         pst1.setInt(4,40);
	         int n=pst1.executeUpdate();
	         System.out.println(n+"row inserted");
	         
	         
		}
	}
}