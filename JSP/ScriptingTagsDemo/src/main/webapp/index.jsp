<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Declaration tag  --%>
	<%!
		int a = 10;
		String name = "Pranshu";
		int square(){
			return a*a;
		}
	%>
	
	<%-- Scriptlet tag --%>
	<%
		out.println("a: "+a);
		out.println("hello there!!"+name);
		out.println(square());
		
		int b = 12;
		if(b <100){
			out.println("b is smaller than 100");
		}
		else{
			out.println("b is greater than 100");
		}
		
		for(int i=0; i<5; i++){
			out.println(i+1);
		}
	%>
	
	<%-- Expression tag --%>
	<%= a %>
	<%= square() %>
	<%= b %>
	<%= LocalDate.now() %>
</body>
</html>