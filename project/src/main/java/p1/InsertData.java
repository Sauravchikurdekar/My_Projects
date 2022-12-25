package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("hfield");// Joy
		PrintWriter out=response.getWriter();
		out.print("<html>Hello:"+username+"  This is insert Data Page...");



		// retrieve data from request object
		int eno=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		int esal=Integer.parseInt(request.getParameter("esal"));
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
			Connection con = DriverManager.getConnection(url, "hr", "hr");

/*  create table in database 
 *  create table emptb(eid number,ename varchar2(20),esalary number);
 */
			PreparedStatement ps;
			ps=con.prepareStatement("insert into emptb values(?,?,?)");
			ps.setInt(1,eno);           
			ps.setString(2,ename);
			ps.setInt(3,esal);
			int i=ps.executeUpdate();
			if(i>=1)
			{
				out.print("<br>Data Inserted Sucessfully......");  

			}
			else
			{
				out.print("<br>Data not added");
			}
			out.println("<br><p><a href='hiddendemo.html'>LogOut</p></body></html>");
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}