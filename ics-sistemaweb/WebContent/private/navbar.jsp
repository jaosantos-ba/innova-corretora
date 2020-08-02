<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<jsp:include page="/header.jsp" ></jsp:include>
	<jsp:useBean id="usuario" class="br.net.innovaseguros.model.Usuario" scope="session"></jsp:useBean>
</head>
<body>
	<nav class="navbar navbar-dark sticky-top bg-success flex-md-nowrap p-0 shadow">
	  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="/ics-sistemaweb/private/dashboard.jsp"><strong>Innova Corretora</strong></a>
	  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <a class="navbar-brand col-md-0 col-lg-0 mr-0 px-0"><strong>Usuário: </strong><%=usuario.getNome()%></a>
	  <ul class="navbar-nav px-3">
	    <li class="nav-item text-nowrap">
	      <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="../logout">Sair</a>
	    </li>
	  </ul>
	</nav>
<jsp:include page="/scripts.jsp" ></jsp:include>
</body>
</html>