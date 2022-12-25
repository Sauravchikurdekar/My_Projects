<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- declear the EL Exception varial  to catch the exeption -->>
<c:catch var="e">
<%int x=10/0; %>
<c:catch>
<c:if test="${e!=null}">
<p>The type of exception is:${e}<br>
There is an exception:${e.massage}</p>
</c:if>

<br>
<c:cartch var="e1">
<%int []arr={10,20} ;
out.write(arr[5]);
%>
</c:cartch>
<c:if test="${e1!=null}">
<p>The type of exception is:${ e1}</br>
<c:if>

</body>
</html>