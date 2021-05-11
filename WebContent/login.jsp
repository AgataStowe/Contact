<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-4 w-50">
		<h1>Login</h1>
		<div class="card">
			<div class="card-body">
				<form name="login" action="home.jsp" method="POST">
					<div class="form-group">
						<label for="exampleInputEmail1">Email</label> <input
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Digite seu email">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Senha</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Senha">
					</div>
					<button type="submit" class="btn btn-primary">Entrar</button>
					<button type="submit" class="btn btn-primary position-relative float-right" onclick="login.action='registro.jsp';">Cadastrar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>