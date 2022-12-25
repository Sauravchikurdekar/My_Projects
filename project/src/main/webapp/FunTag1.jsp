<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="S1" value="Hello World Welcome to JSP JSTL"/>  
  
<c:if test="${fn:contains(S1, 'Welcome')}">  
   <p>Found Welcome word in a String<p>  
</c:if>  
  
<c:if test="${fn:contains(S1, 'WELCOME')}">  
   <p>Found WELCOME word in a string<p>  
</c:if>  

<c:set var="str" value="Welcome to JSP Programming"/>  
To Lower case: ${fn:toLowerCase(str)}<br>  
To Upper case: ${fn:toUpperCase(str)}  


<c:set var="str" value="Welcome to JSP"/>  
Substring: ${fn:substring(str, 2, 5)}<br>  
Substring after: ${fn:substringAfter(str, "Welcome")}<br>  
Substring before:${fn:substringBefore(str, "JSP")}<br>  
String after replace JSP TO java: ${fn:replace(str, "JSP", "JAVA")}<br> 
${str} 


</body>
</html>