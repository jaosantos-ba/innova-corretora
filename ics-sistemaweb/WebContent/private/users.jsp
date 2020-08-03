<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ICS · Usuários</title>
	<jsp:useBean id="usuarios" class="java.util.ArrayList" scope="request"/>
</head>
<body>
	<c:import url="/private/navbar.jsp" />
	
	<div class="container-fluid">
	  <div class="row">
	    <c:import url="/private/leftmenu.jsp" />
	
	    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
	      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	        <h1 class="h2">Usuários</h1>
	        <div class="btn-toolbar mb-2 mb-md-0">
	          <a type="button" class="btn btn-sm btn-outline-secondary" href="/ics-sistemaweb/private/usernew.jsp"><strong>Novo</strong></a>
	          <!-- <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">Criar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Alterar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Excluir</button>
	          </div>
	          
	          <!-- <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">Compartilhar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Exportar</button>
	          </div>
	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
	            <span data-feather="calendar"></span>
	            Listar
	          </button> -->
	        </div>
	      </div>
	      
	      <div class="table-responsive">
	        <table class="table table-striped table-sm" >
	          <thead>
	            <tr>
	              <th>Id</th>
	              <th>Login</th>
	              <th>Nome</th>
	              <th>Ativo</th>
	              <th>Perfil</th>
	              <th colspan="2">Quantidade de usuários: ${usuarios.size()} </th>
	            </tr>
	          </thead>
	          <tbody>
	            <c:forEach var="user" items="${usuarios}" >
		            <tr>
		              <td>${user.id}</td>
		              <td>${user.login}</td>
		              <td>${user.nome}</td>
		              <td>${user.ativo ? 'SIM' : 'NAO'}</td>
		              <td>${user.perfil ? 'ADMIN' : 'USER'}</td>
		              <td><a href="/ics-sistemaweb/usuarios/excluir?index=${user.id}">Excluir</a></td>
                      <td><a href="/ics-sistemaweb/usuarios/editar?index=${user.id}">Alterar</a></td>
		            </tr>
		          </c:forEach>
	          </tbody>
	        </table>
	      </div>
	    </main>
	  </div>
	</div>
</body>
</html>