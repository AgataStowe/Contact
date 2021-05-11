<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container mt-4 w-50">
		<h1>Cadastre-se</h1>
		<div class="card">
			<div class="card-body">
				<form name="cadastro" action="" method="post">
				<div class="form-group">
						<label for="exampleInputEmail1">Nome Completo</label> 
						<input type="text" class="form-control" id="fullName" placeholder="Digite seu nome completo">
					</div>
					<div class="form-group">
						<label for="email">Email</label> 
						<input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Digite seu email">
					</div>
					<div class="form-group">
						<label for="password">Senha</label> 
						<input type="password" class="form-control" id="password "placeholder="Senha">
					</div>
					<div class="form-group">
						<label for="senha2">Digite a senha novamente</label> <input
							type="password" class="form-control" id="senha2" placeholder="Senha">
					</div>
					<button type="submit" class="btn btn-primary">Salvar</button>
					<button type="submit"  onclick="cadastro.action='login.jsp';" 
					class="btn btn-primary position-relative float-right">Acessar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>