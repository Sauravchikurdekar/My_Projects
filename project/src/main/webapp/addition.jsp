<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	

	<%="<h1> The sum is "
		+ (Integer.parseInt(request.getParameter("no 1")) + Integer.parseInt(request.getParameter("no 2"))) + "</h1>"%>
	
</body>
</html>