package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			PrintWriter out = response.getWriter();
			out.println("drive loaded...");
			String url = "jdbc:oracle:thin:@localhost:1521/ORCLPDB";
			Connection con = DriverManager.getConnection(url, "hr", "hr");

			out.println("connected successfully .... ");

			String s1 = request.getParameter("txtname");// access data from html
			String s2 = request.getParameter("password");// access data from html

			// create table login(id varchar2(20),password varchar2(20));

			PreparedStatement pst = con.prepareStatement("select * from login where id=? and password=?");

			pst.setString(1, s1);
			pst.setString(2, s2);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				out.println("<i>Login successful </i>");

				RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
				rd.forward(request, response);

			} else {
				out.println("InValid User");
				RequestDispatcher rd = request.getRequestDispatcher("hiddendemo.html");
				rd.include(request, response);

			}
		}

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}
}
