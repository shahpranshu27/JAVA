<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="regForm" method="post">
	Name : <input type="text" name="name1" placeholder="enter name"/> <br/><br/>
	Email : <input type="email" name="email1" placeholder="enter email"/> <br/><br/>
	Password : <input type="password" name="pass1" placeholder="enter password"/> <br/><br/>
	Gender : <input type="radio" name="gender1" value="male"/> Male <input type="radio" name="gender1" value="female"/> Female <br/><br/>
	City :  <select name="city1">
				<option> Select City </option>
				<option> Chicago </option>
				<option> New York</option>
				<option> Boston </option>
				<option> Washington </option>
				<option> New Jersey </option>
			</select> <br> <br>
		<input type="submit" value="register"/>
	</form>
</body>
</html>