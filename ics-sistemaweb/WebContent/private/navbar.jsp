<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/header.jsp" ></jsp:include>
<meta charset="UTF-8">
</head>
<body>
	<nav class="navbar navbar-dark sticky-top bg-success flex-md-nowrap p-0 shadow">
	  <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="/ics-sistemaweb/private/dashboard.jsp"><strong>Innova Corretora</strong></a>
	  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse" data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <input class="form-control form-control-dark w-100" type="text" placeholder="Buscar" aria-label="Search">
	  <ul class="navbar-nav px-3">
	    <li class="nav-item text-nowrap">
	      <a class="nav-link" href="/ics-sistemaweb/private/dashboard.jsp">Sair</a>
	    </li>
	  </ul>
	</nav>
<jsp:include page="/scripts.jsp" ></jsp:include>
</body>
</html>