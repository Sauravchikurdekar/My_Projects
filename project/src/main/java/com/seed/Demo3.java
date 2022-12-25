package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo3
 */
public class Demo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Demo3() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();


		try 
		{
			String nm   = request.getParameter("id");
			String pass = request.getParameter("password");
			
			/*ServletContext sc = getServletContext();
			String dbdriver= sc.getInitParameter("driver"); */
			
			String dbdriver= getServletContext().getInitParameter("driver");
    		String dburl   = getServletContext().getInitParameter("url");
			String dbuid = getServletConfig().getInitParameter("dbid");
			String dbpass= getServletConfig().getInitParameter("dbpassword");

			Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(dburl,  dbuid ,dbpass);

			System.out.println("connected successfully .... ");

			PreparedStatement pst=con.prepareStatement("select * from login where id=? and password=?");
			pst.setString(1, nm);
			pst.setString(2, pass);
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next())
			{
				out.println("<i>Login successful </i>");				
			}
			else
			{
				out.println("Login failed ");
			}
			



		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}


	}


