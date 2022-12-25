<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="lgobj" class="com.seed.LoginBean" scope="request"/>
<jsp:setProperty property="username" name="lgobj"/>
<jsp:setProperty property="password" name="lgobj"/>
<%
if(lgobj.isValid())
{ %>
	<jsp:forward page="Welcome.jsp">
		<jsp:param name="book1" value="Core Java"/>
		<jsp:param name="book2" value="Advance Java"/>
	</jsp:forward>
<% }
else
{ %>
	<p>Invalid Login
	<jsp:include page="Login.jsp"/>
<%}

%>

</body>
</html>