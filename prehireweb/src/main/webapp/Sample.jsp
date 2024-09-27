<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>This is sample jsp page</h2>
	<%--thi is comment line --%>
	<%! int x=100; %>
	<%=x++ %>
	<h2>X = <%=x%></h2>
	<h3>This is another HTML tag</h3>
</body>
</html>