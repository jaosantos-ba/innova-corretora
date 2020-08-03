<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="/header.jsp" ></jsp:include>
<meta charset="UTF-8">
</head>
<body>
	<nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="sidebar-sticky pt-3">
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link active" href="/ics-sistemaweb/private/dashboard.jsp">
              <span data-feather="home"></span>
              Visão Geral <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/ics-sistemaweb/private/commission.jsp">
              <span data-feather="comis"></span>
              Comissionamento
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="pagto"></span>
              Pagamentos
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="client"></span>
              Clientes
            </a>
          </li>
        </ul>
		<hr class="mb-4">
        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
          <span>Relatórios</span>
          <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
            <span data-feather="relatorios"></span>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="rel-comis"></span>
              Comissões
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="rel-clientes"></span>
              Clientes
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="rel-pag"></span>
              Pagamentos
            </a>
          </li>
        </ul>
        <hr class="mb-4">
        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
          <span>Cadastros</span>
          <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
            <span data-feather="cadastro"></span>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
        <li class="nav-item">
          <a class="nav-link" href="/ics-sistemaweb/usuarios">
            <span data-feather="usuarios"></span>
            Usuários
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <span data-feather="colab"></span>
            Colaboradores
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <span data-feather="clientes"></span>
            Clientes
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <span data-feather="segur"></span>
            Seguradoras
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <span data-feather="aliq"></span>
            Alíquotas
          </a>
        </li>  
     	</ul>
      </div>
    </nav>
<jsp:include page="/scripts.jsp" ></jsp:include>
</body>
</html>