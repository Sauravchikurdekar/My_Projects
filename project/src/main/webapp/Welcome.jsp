<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink">



<% 	
	String username = request.getParameter("username");
	out.println("<p>Dear " + username +" Welcome to Online Shopping</p> "); 
%>

<p><%=request.getParameter("book1") %> </p>
<p><%=request.getParameter("book2") %> </p>


</body>

</body>
</html>