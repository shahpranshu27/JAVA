<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: DodgerBlue;">

			<div>
				<a href="www.youtube.com" class="navbar-brand">User Management
					App</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>

		</nav>
	</header>
	<br />

	<div class="row">

		<div class="container">
			<h3 class="text-center">List of Users</h3>
			<hr>

			<div class="container text-left">
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					new User</a>
			</div>
			<br>

			<table class="table table-bordered">

				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Country</th>
						<th>Actions</th>
					</tr>
				</thead>

				<tbody>

					<!-- for (Todo todo:todos){ -->
					<c:forEach var="user" item="${listUser}">
						<tr>
							<td><c:out value="${user.id}" /></td>

							<td><c:out value="${user.name}" /></td>

							<td><c:out value="${user.email}" /></td>

							<td><c:out value="${user.country}" /></td>

							<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>

	</div>
</body>
</html>