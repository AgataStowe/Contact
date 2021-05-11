<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js">
	
</script>
</head>
<body>
	<div class="container mt-4 w-50">
		<div class="card">
			<h5 class="card-header">Agenda</h5>
			<div class="card-body">
				<div class="position-relative float-right form-group ">
					<button type="button" class="btn btn-light">Voltar</button>
				</div>
				
				<h5 class="card-title">Adicionar Contato</h5>
				<hr>
				<form name="contato" action="${pageContext.request.contextPath}/ServletController.do?logic=ContactController&action=1" method="post">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="fullName">Nome</label> 
							<input type="text" class="form-control" name="fullName" placeholder="Digite o nome">
						</div>
						<div class="form-group col-md-6">
							<label for="alias">Apelido</label> 
							<input type="text" class="form-control" name="alias" placeholder="Digite o apelido">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="phoneNumber">Nº Telefone</label> 
							<input type="text" class="form-control" name="phoneNumber" placeholder="Digite o numero">
						</div>
						<div class="form-group col-md-6">
							<label for="email">Email</label> 
							<input type="email" class="form-control" name="email" placeholder="Digite o email">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="place">Lugar</label> 
							<input type="text" class="form-control" name="place" placeholder="Digite o lugar">
						</div>
						<div class="form-group col-md-6">
							<label for="relation">Relacionamento</label> 
							<input type="text" class="form-control" name="relation" placeholder="Digite o relacionamento">
						</div>
					</div>
						<button type="submit" class="btn btn-primary">Salvar</button>
				</form>

			</div>
		</div>
	</div>
</body>
</html>