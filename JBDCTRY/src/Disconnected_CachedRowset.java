
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

//cached rowset 
public class Disconnected_CachedRowset {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded... ");
	    String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";

		
		Connection con=DriverManager.getConnection(url,"hr","hr");
		Statement st=con.createStatement();
		//step1 : create ResultSet
		ResultSet rs=st.executeQuery("select * from emp");
		
		//step2 : create CachedRowSet 
		CachedRowSet crowset=RowSetProvider.newFactory().createCachedRowSet();
		
		//step 3:  copy data into cached rowset from rs
		crowset.populate(rs); // copy data into cachedrowset from rs
		// 10am
		
		rs.close();
		st.close();
		con.close();
		
		// 10.10am ---- 
		
		while(crowset.next())
		{
			System.out.println(crowset.getInt(1)+" "+crowset.getString(2)+" "+crowset.getInt(3));
		}
		

	
		
	}
}
