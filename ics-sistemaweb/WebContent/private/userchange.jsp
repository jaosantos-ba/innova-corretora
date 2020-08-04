<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ICS · Alterar Usuário</title>
</head>
<body>
	<c:import url="/private/navbar.jsp" />
	
	<div class="container-fluid">
	  <div class="row">
	    <c:import url="/private/leftmenu.jsp" />
	    
		<div class="col-md-8 order-md-1">
		  
	      <h1 class="h2">Alterar Usuário</h1>
	      <hr class="mb-4">
	      <form class="needs-validation" novalidate action="/ics-sistemaweb/usuarios/alterar" method="post">
	        
	        <input type="hidden" name="idUpd" value="${usuario.id}" >
	        <div class="mb-3">
	          <label for="username">Login</label>
	          <div class="input-group">
	            <input type="text" class="form-control" id="username" name="loginUpd" placeholder="Digite o seu login" required value="${usuario.login}">
	            <div class="invalid-feedback" style="width: 100%;">
	              Your login is required.
	            </div>
	          </div>
	        </div>
	                
	        <div class="mb-3">
	          <label for="fullname">Nome completo</label>
	          <div class="input-group">
	            <input type="text" class="form-control" id="fullname" name="nameUpd" placeholder="Digite seu nome completo" required value="${usuario.nome}">
	            <div class="invalid-feedback" style="width: 100%;">
	              Your name is required.
	            </div>
	          </div>
	        </div>
	
	        <div class="row">
	          <div class="col-md-6 mb-3">
	            <label for="pass">Senha</label>
	            <input type="password" class="form-control" id="pass" name="passUpd" placeholder="Digite sua senha" required value="${usuario.senha}">
	            <div class="invalid-feedback">
	              Your pass is required.
	            </div>
	          </div>
	          <div class="col-md-6 mb-3">
	            <label for="confirmPass">Confirmar Senha</label>
	            <input type="password" class="form-control" id="confirmPass" name="cPassUpd" placeholder="Confirme sua senha" required value="${usuario.senha}">
	            <div class="invalid-feedback">
	              Valid pass is required.
	            </div>
	          </div>
	         </div>
	         
	         <div class="row">
	          <div class="col-md-6 mb-3">
	          <div class="form-group form-check">
		       <input type="checkbox" class="form-check-input" <c:if test="${usuario.ativo}">checked="checked"</c:if> id="ativo" name="ativeUpd">
		       <label class="form-check-label" for="ativo">Ativo?</label>
			  </div>
	          </div>
	          <div class="col-md-6 mb-3">
	          <div class="form-group form-check">
		       <input type="checkbox" class="form-check-input" <c:if test="${usuario.perfil}">checked="checked"</c:if> id="ativo" name="profileUpd">
		       <label class="form-check-label" for="perfil">Admin?</label>
			  </div>
	          </div>
	         </div>
			<button type="submit" class="btn btn-primary">Alterar</button>
			<button type="button" class="btn btn-primary" value="Voltar" onclick="history.go(-1)">Voltar</button>
	      </form>
	    </div>
	  </div>
	 </div>	
</body>
</html>