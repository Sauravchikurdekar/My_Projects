import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Demo4{
	
	 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded ");
			String url="jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		    Connection con=DriverManager.getConnection(url,"hr","hr");
		    System.out.println("connection sucessfully...");
		    Statement st = (Statement) con.createStatement();
		
		
		PreparedStatement pst= con.prepareStatement("update emp set esal= esal+? , edeptno=?  where empid=?");
		pst.setInt( 1 , 2000);
		pst.setInt( 2 , 80);
		pst.setInt( 3 , 201);
		int p=pst.executeUpdate();		
		System.out.println(p+" row updated ");
//		
//		PreparedStatement pst= con.prepareStatement("delete emp where esal>?");
//		pst.setInt(1,25000);
//		int p=pst.executeUpdate();		
//		System.out.println(p+" row deleted ");
		
		/*PreparedStatement pst= con.prepareStatement("insert into emp values(?,?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id ");
		int eid=sc.nextInt();
		pst.setInt(1, eid);
		pst.setString(2, "Farhan");
		pst.setInt(3, 19000);
		pst.setInt(4, 20);
		
		int p=pst.executeUpdate();		
		System.out.println(p+" row inserted ");*/
	
		

		
		
		/*PreparedStatement pst= con.prepareStatement("update emp set esal=? where empid=?");
		
		pst.setInt(1, 44400);
		pst.setInt(2, 301);
				
		int p=pst.executeUpdate();
		System.out.println(p+" row updated ");
		*/
		
	/*	PreparedStatement pst= con.prepareStatement("delete from emp where empid>?");
		
		pst.setInt(1, 200);					
		int p=pst.executeUpdate();
		System.out.println(p+" row deleted ");*/
	}

}