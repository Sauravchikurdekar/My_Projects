<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String ns= request.getParameter("n");
double r=Double.parseDouble(request.getParameter("radius"));
int n=Integer.parseInt(request.getParameter("a1"));
double pi=3.14;
if(n==1)
{
	double area=pi*(r*r);
	 out.println("area of circle="+area);
	 
}
else
{
	double cc=2*pi*r;
	out.println("area of circumference="+cc);
}
%>

</body>
</html>