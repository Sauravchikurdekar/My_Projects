import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded ");
		String url = "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("connection sucessfully...");
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
		}

		int k = st.executeUpdate("delete from  emp where empid>300");
		System.out.println(k + " row deleted  ");
		
		int a =st.executeUpdate("insert into emp values (211,'saurav',30000,100)");
		System.out.println("row inserted");
		

		int n = st.executeUpdate("insert into emp values(209,'jay',34000,90)");
		System.out.println(n + " row inserted ");
		
		int p=st.executeUpdate("update emp set esal=esal+500 where empid=209");
		System.out.println(p+" row updated  ");

	}

}

//PreparedStatement rs0=con.prepareStatement("UPDATE product SET name=? WHERE id =?");
//rs0.setString(1, "abc1");
//rs0.setInt(2,0);
//int n1=rs0.executeUpdate();
//System.out.println("1row updated");

//
//PreparedStatement rs0=con.prepareStatement("delete from product WHERE pid =?");
//rs0.setInt(1,1);
//int n1=rs0.executeUpdate();
//System.out.println("1row deleted");