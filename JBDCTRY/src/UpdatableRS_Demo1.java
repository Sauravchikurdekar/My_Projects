import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatableRS_Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded ");
		String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		Connection con = DriverManager.getConnection(url, "hr","hr");	
		System.out.println("connection sucessfully...");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE); 		  
		
		 
    	ResultSet rs = st.executeQuery("select empid,ename,esal,edeptno from emp");
    	
    	rs.moveToInsertRow();// allocates buffer and adjust cursor to add new row
       	rs.updateInt(1,309);
		rs.updateString(2,"Radha"); 
		rs.updateInt(3,18000);
		rs.updateInt(4, 70);		
		rs.insertRow();		
		System.out.println("rows inserted ....");
    	
    	/*rs.absolute(-6);
    	rs.updateInt(3, 25000);
    	rs.updateRow();   */	
    	
    	rs.last();
    	rs.deleteRow();
    	
    	// code to update
    	/*rs.absolute(4); // moves cursor on 4th record
    	rs.updateInt(3, 20000);
    	rs.updateInt(4, 30);
    	rs.updateRow();
    	System.out.println("rows updated  ....");*/
    	
    	
    	
    	//code to delete row
    	// we want to delete last record
   /* 	rs.last();
    	rs.deleteRow();
    	System.out.println("row deleted  ....");*/
    	
   	}
}
