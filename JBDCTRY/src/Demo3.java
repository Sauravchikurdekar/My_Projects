import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static class Demo1 {

		 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded ");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		    Connection con=DriverManager.getConnection(url,"hr","hr");
		    System.out.println("connection sucessfully...");
		    Statement st = (Statement) con.createStatement();
		    ResultSet rs = st.executeQuery("select * from employees");
		    ResultSetMetaData rmd=rs.getMetaData();
		    int n=rmd.getColumnCount();
		    System.out.println("column count="+n);
		    for(int i = 1;i<=n;i++)
		    {
		    	System.out.println("coloum ");
		    }
		    
	     
		    PreparedStatement pst=con.prepareStatement("select esal,ename from emp where esal>?");
		    pst.setInt(1,20000);
		    ResultSet rs1 = pst.executeQuery();
	         while(rs1.next ())
	         {
	        	 System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
	         }
	       
	         
	         
		}
	}
}
