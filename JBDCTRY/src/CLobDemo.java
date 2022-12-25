
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//clob Demo
//create table info_clob(id number,text clob);

public class CLobDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
		Connection con = DriverManager.getConnection(url, "hr", "hr");

		// code to write clob into database
		PreparedStatement ps = con.prepareStatement("Insert into info_clob values(?,?)");

		Clob clob = ps.getConnection().createClob();
		clob.setString(1, "I am trying to store value in clob column ");

		ps.setInt(1, 1001);
		ps.setClob(2, clob);
		ps.executeUpdate();

		// code to read clob from database
		PreparedStatement ps1 = con.prepareStatement("select * from info_clob");
		ResultSet rs = ps1.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			Clob cb = rs.getClob(2);
			Reader b = cb.getCharacterStream();
			int n;
			while ((n = b.read()) != -1)
				System.out.print((char) n);
		}

	}
}