<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Log in</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="style1.css">
</head>
<!-- c:set var="errorclass" value="${mierror?"has-error":""}" / -->
<body>
	<!--Welcome Back-->
	<div class="containerlogin">
		<div class="row">
			<div class="col-md-offset-5 col-md-3">
				<div class="form-login">
					<h3>Welcome back.</h3>
					<form action="loginServlet" method="POST" id='form_login'>
						<label for="userName" class="control-label">User</label> <input
							type="email" name="email" id="userName"
							class="form-control input-sm chat-input ${errorclass}"
							placeholder="Email" value='markel@e.es' required /> </br>
							<label
							for="userPassword" class="control-label">Password</label> <input
							type="password" name="password" id="userPassword"
							class="form-control input-sm chat-input ${errorclass}"
							placeholder="Pass" required value="markel" /> </br>


						<div id='errores'></div>
						<button>Enviar</button>
						</span>
					</form>
				</div>
			</div>

		</div>
	</div>
	</div>


</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src='scripts/bananaguest.js'></script>

</html>