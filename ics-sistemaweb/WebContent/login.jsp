<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
	<head>
		<jsp:include page="header.jsp" ></jsp:include>
		
		<title>Innova Corretora de Seguros · Sistema Web</title>
		
		<link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">
	  	
	  	<!-- Bootstrap core CSS -->
		<link href="/docs/4.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	
	   	<!-- Favicons -->
		
	
	   	<style>
	  	.bd-placeholder-img {
		    font-size: 1.125rem;
		    text-anchor: middle;
		    -webkit-user-select: none;
		    -moz-user-select: none;
		    -ms-user-select: none;
		    user-select: none;
		  }
	
		  @media (min-width: 768px) {
		    .bd-placeholder-img-lg {
		      font-size: 3.5rem;
		    }
		  }
		</style>
		<!-- Custom styles for this template -->
	  	<link href="static/css/login.css" rel="stylesheet">
	</head>
	<body class="text-center">
		<form class="form-signin" action="login" method="post">
			<img class="mb-4" src="static/img/logo.png" alt="" width="100%" height="100%">
			<h1 class="h3 mb-3 font-weight-normal">Acesso ao Sistema</h1>
			<label for="inputUser" class="sr-only">Usuário</label>
			<input type="text" id="inputUser" class="form-control" name="user" placeholder="Digite seu Usuário" required autofocus>
			<label for="inputPassword" class="sr-only">Senha</label>
			<input type="password" id="inputPassword" class="form-control" name="pass" placeholder="Digite sua Senha" required>
			<div class="checkbox mb-3">
			  <!-- <label>
			    <input type="checkbox" value="remember-me"> Lembrar-me
			  </label> -->
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
			<div><c:out value="${erro}"></c:out></div>
			<p class="mt-5 mb-3 text-muted">&copy;2020</p>
		</form>
	<jsp:include page="scripts.jsp" ></jsp:include>
	</body>
</html>