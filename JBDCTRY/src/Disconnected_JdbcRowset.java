

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Disconnected_JdbcRowset {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded... ");
	    String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";

	//	JdbcRowSet rowset=RowSetProvider.newFactory().createJdbcRowSet();
	    
	    RowSetFactory rf  =  RowSetProvider.newFactory();
	    JdbcRowSet rowset =  rf.createJdbcRowSet();
	    
		rowset.setUrl(url);
		rowset.setUsername("hr");
		rowset.setPassword("hr");
		
		rowset.setCommand("select * from emp");
		rowset.execute();
		
		while(rowset.next())
		{
			System.out.println(rowset.getInt(1)+" "+rowset.getString(2));
		}
		
		

	}
}