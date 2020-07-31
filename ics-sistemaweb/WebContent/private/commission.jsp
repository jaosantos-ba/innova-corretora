<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Innova Corretora de Seguros · Painel</title>
</head>
<body>
	<c:import url="/private/navbar.jsp" />
	
	
	<div class="container-fluid">
	  <div class="row">
	    <c:import url="/private/leftmenu.jsp" />
	
	    <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
	      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
	        <h1 class="h2">Comissionamento</h1>
	        <div class="btn-toolbar mb-2 mb-md-0">
	          <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">Criar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Alterar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Excluir</button>
	          </div>
	          
	          <div class="btn-group mr-2">
	            <button type="button" class="btn btn-sm btn-outline-secondary">Compartilhar</button>
	            <button type="button" class="btn btn-sm btn-outline-secondary">Exportar</button>
	          </div>
	          <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle">
	            <span data-feather="calendar"></span>
	            Listar
	          </button>
	        </div>
	      </div>
	      
	      <div class="table-responsive">
	        <table class="table table-striped table-sm" >
	          <thead>
	            <tr>
	              <th>Ordem</th>
	              <th>Data</th>
	              <th>Seguradora</th>
	              <th>Obs</th>
	              <th>Vl Rec</th>
	              <th>Indicação</th>
	              <th>Perc Com</th>
	              <th>Perc Dev</th>
	              <th>ISS Ret?</th>
	              <th>Alíq</th>
	              <th>Cliente</th>
	              <th>Valor Bruto</th>
	              <th>ISS Retido</th>
	              <th>Valor a Receber</th>
	              <th>Diferença</th>
	            </tr>
	          </thead>
	          <tbody>
	            <tr>
	              <td>0001</td>
	              <td>24/06/2020</td>
	              <td>LIBERTY</td>
	              <td>454</td>
	              <td>493,33</td>
	              <td>SALVADOR</td>
	              <td>100%</td>
	              <td>100%</td>
	              <td>Sim</td>
	              <td>2%</td>
	              <td>TATIANA FERNANDES ROCHA LIMA</td>
	              <td>206,36</td>
	              <td>4,13</td>
	              <td>202,23</td>
	              <td>-291,10</td>
	            </tr>
	          </tbody>
	        </table>
	      </div>
	    </main>
	  </div>
	</div>
	
</body>
</html>