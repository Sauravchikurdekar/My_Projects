import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
		{


			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
			Connection con = DriverManager.getConnection(url, "hr","hr");
			System.out.println("connected successfully .... ");

			Statement st=con.createStatement();
			
			st.addBatch("insert into emp values(312,'priya',60000,50)");
			st.addBatch("insert into emp values(313,'priyal',20000,50)");
			st.addBatch("insert into emp values(314,'ketan',40000,50)");
			st.addBatch("insert into emp values(315,'sumit',70000,50)");
			st.addBatch("insert into emp values(316,'soha',80000,50)");
			st.addBatch("insert into emp values(317,'deepa',90000,50)");
			st.addBatch("insert into emp values(318,'ridima',70000,50)");
			st.addBatch("update emp set esal=50000 where empid=401");
			st.addBatch("delete from emp where empid >405 ");
			
			int [] count=st.executeBatch();
			
			System.out.println(count.length+ " rows affected ");
		}
			
			

	
}
