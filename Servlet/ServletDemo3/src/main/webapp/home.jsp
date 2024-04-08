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
	String myName = (String) request.getAttribute("name_key");
	String myName1 = (String) session.getAttribute("name_key");
	String myGen = (String) session.getAttribute("gender");
	%>
	<h3> Welcome!! <%= myName1 %> </h3>
	<h3> Gender: <%= myGen %></h3>
	
	<a href="profile.jsp">Profile</a> &nbsp; &nbsp;
	<a href="about-us.jsp">About us</a> &nbsp; &nbsp;

</body>
</html>