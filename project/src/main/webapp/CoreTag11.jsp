<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="n" value="8" scope="request"/>  
  <c:if test="${n<=1}">  
     <c:redirect url="first.html"/>  
  </c:if>  
  <c:if test="${n>1}">  
     <c:redirect url="https://www.w3schools.com"/>  
  </c:if>  
</body>
</html>