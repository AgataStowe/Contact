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
				<div class="position-relative float-right form-group">
					<button type="button" class="btn btn-light">Add</button>
				</div>
				<h5 class="card-title">Lista de Contatos</h5>
				<form action="<%=request.getContextPath()%>/register" method="post">

					<div class="form-group">
						<div class="input-group">
							<input class="form-control" type="search" placeholder="Pesquisar"
								aria-label="Search" style="border-right: none;">
							<div class="input-group-append">
								<div class="input-group-text" style="background-color: #FFF">
									<i class="fas fa-search"></i>
								</div>
							</div>
						</div>
					</div>
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nome</th>
								<th scope="col">Telefone</th>
								<th scope="col">Email</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>Jacob</td>
								<td>Thornton</td>
								<td>@fat</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>Larry</td>
								<td>the Bird</td>
								<td>@twitter</td>
							</tr>
						</tbody>
					</table>
				</form>

			</div>
		</div>
	</div>
</body>
</html>