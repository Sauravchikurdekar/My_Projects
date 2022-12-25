

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableRSDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		Connection con = DriverManager.getConnection(url, "hr","hr");
		System.out.println("connected successfully .... ");
		
		//step1
Statement st=con.createStatement(
		ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 		  
		
		//step2
    	ResultSet rs = st.executeQuery("select * from emp");
		/*while(rs.next())
		{	  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		 */
		//System.out.println("-----------------------------------------------------");
			
		
		// access third record
		rs.absolute(3);
    	System.out.println("3rd  "+rs.getInt(1)+"  "+rs.getString(2));
    	
    /*	rs.first();
    	System.out.println("first   "+rs.getInt(1)+"  "+rs.getString(2));
    	rs.next();
    	System.out.println("2nd     "+rs.getInt(1)+"  "+rs.getString(2));
    	
    	rs.last();
		//System.out.println("Third record is :: ");
		System.out.println("last "+rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
		System.out.println("-----------------------------------------------------");
		
		rs.previous();
		
		System.out.println("2ndlast   "+rs.getInt(1)+"  "+rs.getString(2));*/
    	
    	
		// move by 2 records  in forward direction from current position
		rs.relative(2);
		System.out.println(" record after  relative(2):: ");
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	/*	//rs.previous();
		
		// Note:: rs.relative(1) is similar to rs.next()
		*/
		System.out.println("-----------------------------------------------------");
		// move by 1 record in backward direction from current position
		rs.relative(-1);
		System.out.println(" record after  relative(-1):: ");
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				
				
		con.close();	
		
	}
	
}
