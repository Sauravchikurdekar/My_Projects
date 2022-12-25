<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/mytags.tld" prefix="m" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body bgcolor="pink">

Cube of 4 is: <m:cube number="4"></m:cube>
<br>
<br>
<br>
Area  of circle is: <m:areac radius="3"></m:areac>
<br>
<br>
<br>

Current Date and Time is:

<m:today/>

<br>
<br>
<br>

<m:message name="deepa"><%=new java.util.Date() %></m:message>
<br>
<br>
<m:message name="Riya">welcome</m:message>

</body>
</html>