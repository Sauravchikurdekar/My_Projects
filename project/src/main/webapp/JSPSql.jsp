<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver" 
url="jdbc:oracle:thin:@localhost:1521/ORCLPDB" user="hr"  password="hr"/>

  
<sql:query dataSource="${db}" var="rs">  
SELECT * from emp 
</sql:query>  

<table border="2" width="100%">  
<tr>  
<th>Employee ID</th>  
<th>Employee Name</th>  
<th>Employee Salary</th>  
</tr>  
<c:forEach var="r" items="${rs.rows}">  
<tr>  
<td><c:out value="${r.empid}"/></td>  
<td><c:out value="${r.ename}"/></td>  
<td><c:out value="${r.esal}"/></td>  
</tr>  
</c:forEach>  
</table>  
</body>
</html>