<%@ page language="java" import="com.demo.Employee,java.util.List" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- ${empList} --%>

<% List<Employee> empList=(List)session.getAttribute("list"); %>
<% for(Employee emp:empList){
	out.println(emp.getEmpId()+"<br>");
	out.println(emp.getEname()+"<br>");
	out.println(emp.getEsalary()+"<br>");
	out.println(emp.getEdeptno()+"<br>");
}
	%>
</body>
</html>