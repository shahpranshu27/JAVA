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
	String name1 = request.getParameter("name1");
	out.println(name1);
	%>
	<%= name1 %>
	
	<%
	String myName = (String) session.getAttribute("name");
	out.println(myName);
	%>
</body>
</html>