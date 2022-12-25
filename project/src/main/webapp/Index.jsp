<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean  class="com.seed.Employee"  id="obj1" scope="session"/>
<%
  obj1.setEno(101);
  obj1.setEname("Amit");
  obj1.setEsal(10000);s	
  response.sendRedirect("NextPage.jsp");
 %>
</html>