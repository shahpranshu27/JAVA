<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management Application</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<%--<body> 

	<header>
	
		<nav class="navbar navbar-expand-md navbar-dark" style="background-color:DodgerBlue">
		
			<div>
				<a href="www.youtube.com" class="navbar-brand">User Management App</a>
			</div>
			
			<ul class="navbar-nav">
				<li> <a href="<%= request.getContextPath()%>/list" class="nav-link">Users</a> </li>
			</ul>
		
		</nav>
	
	</header>
	<br>
	
	<div class="container col-md-5">
		<div class="card">
			
			<div class="card-body">
				<c:if test="${user!=null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user==null}">
					<form action="insert" method="post">
				</c:if>
				
				<caption>
					<h2>
						<c:if test="${user!=null}">
							Edit User
						</c:if>
						<c:if test="${user==null}">
							Add New User
						</c:if>
					</h2>
				</caption>
				
				<c:if test="${user!=null}">
					<input type="hidden" name="id" value="<c:out value="${user.id }"/>" />
				</c:if>
				
				<fieldset class="form-group">
					<label>User Name</label> <input type="text" value="<c:out value="${user.name}"/>"/>
				</fieldset>
				
				<fieldset class="form-group">
					<label>User Email</label> <input type="text" value="<c:out value="${user.email}" />"/>
				</fieldset>
				
				<fieldset class="form-group">
					<label>User Country</label> <input type="text" value="<c:out value="${user.country}" />"/>
				</fieldset>
				
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		
		</div>
	</div>

</body> --%>
<%-- <body>

    <header>
    
        <nav class="navbar navbar-expand-md navbar-dark" style="background-color:DodgerBlue">
        
            <div>
                <a href="www.youtube.com" class="navbar-brand">User Management App</a>
            </div>
            
            <ul class="navbar-nav">
                <li><a href="<%= request.getContextPath()%>/list" class="nav-link">Users</a></li>
            </ul>
        
        </nav>
    
    </header>
    <br>
    
    <div class="container col-md-5">
        <div class="card">
            
            <div class="card-body">
                <c:if test="${user!=null}">
                    <form action="update" method="post">
                </c:if>
                <c:if test="${user==null}">
                    <form action="insert" method="post">
                </c:if>
                
                <caption>
                    <h2>
                        <c:if test="${user!=null}">
                            Edit User
                        </c:if>
                        <c:if test="${user==null}">
                            Add New User
                        </c:if>
                    </h2>
                </caption>
                
                <c:if test="${user!=null}">
                    <input type="hidden" name="id" value="<c:out value="${user.id}"/>">
                </c:if>
                
                <fieldset class="form-group">
                    <label>User Name</label> <input type="text" name="name" value="<c:out value="${user.name}"/>">
                </fieldset>
                
                <fieldset class="form-group">
                    <label>User Email</label> <input type="text" name="email" value="<c:out value="${user.email}"/>">
                </fieldset>
                
                <fieldset class="form-group">
                    <label>User Country</label> <input type="text" name="country" value="<c:out value="${user.country}"/>">
                </fieldset>
                
                <button type="submit" class="btn btn-success">Save</button>
                </form>
            </div>
        
        </div>
    </div>

</body> --%>

<body>

  <header>

    <nav class="navbar navbar-expand-md navbar-dark" style="background-color:DodgerBlue">

      <div class="navbar-brand">
        <a href="www.youtube.com">User Management App</a>
      </div>

      <ul class="navbar-nav">
        <li class="nav-link">
          <a href="<%= request.getContextPath()%>/list">Users</a>
        </li>
      </ul>

    </nav>

  </header>

  <br>

  <div class="container col-md-5">
    <div class="card">

      <div class="card-body">

        <c:if test="${user != null}">
          <form action="update" method="post">
        </c:if>
        <c:if test="${user == null}">
          <form action="insert" method="post">
        </c:if>

        <caption>
          <h2>
            <c:if test="${user != null}">
              Edit User
            </c:if>
            <c:if test="${user == null}">
              Add New User
            </c:if>
          </h2>
        </caption>

        <c:if test="${user != null}">
          <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
        </c:if>

        <fieldset class="form-group">
          <label>User Name</label>
          <input type="text" name="name" value=<c:out value='${user.name}' /> />
        </fieldset>

        <fieldset class="form-group">
          <label>User Email</label>
          <input type="text" name="email" value="<c:out value='${user.email}' />" />
        </fieldset>

        <fieldset class="form-group">
          <label>User Country</label>
          <input type="text" name="country" value="<c:out value='${user.email}' />" /> </fieldset>

        <button type="submit" class="btn btn-success">Save</button>
        </form>
      </div>

    </div>
  </div>

</body>


</html>