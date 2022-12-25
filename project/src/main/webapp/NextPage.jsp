<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Displaying content of Employee</p>
<jsp:useBean id="obj1" class="com.seed.Employee" scope="session"/>
Employee No:    <%= obj1.getEno()%> <br>
Employee Name:  <%= obj1.getEname()%> <br>
Employee Salary:<%= obj1.getEsal()%> <br>
</body>
</html>