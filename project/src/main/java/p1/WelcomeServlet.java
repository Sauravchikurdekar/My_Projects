package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String txtname;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	String username = request.getParameter("txtname");
    	Cookie c1 = new Cookie("sid", "SI3333");
    	Cookie c2 = new Cookie("uname", username);
    	response.addCookie(c1);
		response.addCookie(c2);
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor=cyan><p>Dear " + username + " Welcome to Online Shopping</p>");
		out.println("<p><a href='ProductServlet'>View Products</a></p></body>");
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//PrintWriter out=response.getWriter();
//		String str=request.getParameter("id"); // value is Joy
//		out.print("<br>Welcome ::"+str+"<br>");
//		out.print("<form action='InsertData' method='POST'>");
//		out.print("Enter Employee Id   :<input type='text' name='eid'><br>");
//		out.print("Enter Employee Name :<input type='text' name='ename'><br>");
//		out.print("Enter Employee Salary:<input type='text' name='esal'><br>");
//     	out.print("<input type='hidden' name='hfield' value='"+str+"'><br>");  // hidden form field
//		out.print("<input type='submit' value='InsertDetails'><br>");
//		out.print("</form>");
		
		 doGet(request,response);
		
	}

}
