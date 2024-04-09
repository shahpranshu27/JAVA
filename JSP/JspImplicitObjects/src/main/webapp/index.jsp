<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- remember, in jsp, we don't need to create objects like out, session, req, resp and all. they are implicitly there in jsp -->
	<%
		String name = "pranshu";
		out.println(name);
	%>
	<%
	session.setAttribute("name", "Pranshu Shah!!");
	%>
	<form action="output.jsp" method="get">
	<input type="text" name="name1" placeholder="enter name"/>
	<input type="submit" value="click"/>
	</form>
</body>
</html>