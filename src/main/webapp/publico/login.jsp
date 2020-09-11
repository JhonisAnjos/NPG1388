<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>Login de Usuário</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

<!-- Bootstrap core CSS -->

<meta name="theme-color" content="#563d7c">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="..\resource\css\signin.css" rel="stylesheet">

<script src="..\resource\js/function.js"></script>

</head>

<body class="text-center">
	<form class="form-signin" method="post"
		enctype="application/x-www-form-urlencoded" action="../entrar">

		<c:if test="${!empty param.error}">
			<div class="alert alert-danger" role="alert">Credenciais
				inválidas!</div>
		</c:if>

		<img class="mb-4" src="..\resource\img\login.png" alt="" width="72"
			height="72" style="border-radius: 34px;">
		<h1 class="h3 mb-3 font-weight-normal">Login</h1>

		<label for="inputEmail" class="sr-only">Email address</label> <input
			type="email" id="inputEmail" name="email" class="form-control"
			placeholder="Email " required autofocus> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" id="inputPassword" name="senha" class="form-control"
			placeholder="Senha" required>
		<div class="checkbox mb-3">
			<label> </label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
		<button class="btn btn-lg btn-primary btn-block" type="button"
			onclick="openFormCadastro()">Cadastre-se</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2020</p>

		<div class="modal" tabindex="-1" role="dialog" id="modal">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Sucesso!</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Seu cadastro foi concluido, faça o login para continuar.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">OK</button>
					</div>
				</div>
			</div>
		</div>

	</form>


</body>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
	integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
	integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
	crossorigin="anonymous"></script>
<c:if test="${!empty param.hello}">

	<script type="text/javascript">
		$('#modal').modal(open);
	</script>
</c:if>

</html>