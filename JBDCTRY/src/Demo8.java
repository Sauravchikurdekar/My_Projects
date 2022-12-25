import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Demo8 {

	private static Connection con1;

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		FileInputStream fin = new FileInputStream("db1.properties");
		Properties p = new Properties();
		p.load(fin);
		String dr = p.getProperty("driver");
		String url = p.getProperty("url");
		String uid = p.getProperty("username");
		String pwd = p.getProperty("userpassword");

		Class.forName(dr);
		Connection con = DriverManager.getConnection(url, uid, pwd);
		
		

		
		
		PreparedStatement pst=con1.prepareStatement("select * from emp");
		
		
		ResultSet rs= pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}

	}

}