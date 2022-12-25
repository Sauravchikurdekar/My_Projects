import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7 {

	public static class Demo1 {

		 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded ");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		    Connection con=DriverManager.getConnection(url,"hr","hr");
		    System.out.println("connection sucessfully...");
		  DatabaseMetaData dm=con.getMetaData();
		    {
		    	System.out.println("name of the driver is "+dm.getDriverName());
		    	System.out.println("name of the version is "+dm.getDriverVersion());
		    	System.out.println("multiple resultset "+dm.supportsMultipleResultSets());
		    	System.out.println("multiple transaction "+dm.supportsMultipleTransactions());
		    }
		    
	     
		 
	       
	         
	         
		}
	}
}