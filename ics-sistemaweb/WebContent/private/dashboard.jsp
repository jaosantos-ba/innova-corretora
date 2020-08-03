<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ICS · Painel</title>
</head>
<body>
	<c:import url="/private/navbar.jsp" />
	
	<div class="container-fluid">
	  <div class="row">
	    <c:import url="/private/leftmenu.jsp" />
	
	    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
	      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	        <h1 class="h2">Visão Geral</h1>
	        <div class="btn-toolbar mb-2 mb-md-0">
	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
	            <span data-feather="calendar"></span>
	            Criar
	          </button>
	          &nbsp
	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
	            <span data-feather="calendar"></span>
	            Listar
	          </button>
	        </div>
	      </div>
	      
	      <!-- <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas> -->
	      
	    </main>
	  </div>
	</div>
</body>
</html>