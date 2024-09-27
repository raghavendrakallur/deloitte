<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Using if statement</h2>
	<%! int x=-10; %>
	<% if(x>0){ %>
		<h3>X is positive number</h3>
	<%} else { %>
		<h3>X is negative number</h3>
		<%} %>
</body>
</html>