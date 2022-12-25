<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="WEB-INF/Elfun.tld" prefix="n" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Info</title>
</head>
<body bgcolor="cyan">


<p>Your name in Upper Case is ${n:UPPER(param.personname) } </p>
<p>Your name in Lower Case is ${n:LOWER(param.personname) } </p>
<p>No of characters in your name are ${n:LENGTH(param.personname) } </p>


</body>
</html>