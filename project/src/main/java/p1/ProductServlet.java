package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ProductServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		{

			Cookie cArr[] = request.getCookies();// returns two Cookie objects

			/*
			 * for(int i=0;i<cArr.length;i++) { String str = cArr[i].getValue(); }
			 */

			String sessionId = cArr[0].getValue();
			String username = cArr[1].getValue();
			
			PrintWriter out = response.getWriter();

			out.println("<html><body bgcolor=cyan><p>Dear: " + username + "" + "Welcome to Product Page</p>");
			out.println("<p>Your session id is " + sessionId + "</p></body>");
			out.println("<br><a href='login.html'>Log Out</body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}