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
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" href="/ics-sistemaweb/private/dashboard.jsp">
              <span data-feather="home"></span>
              Visão Geral <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/ics-sistemaweb/private/commission.jsp">
              <span data-feather="file"></span>
              Comissionamento
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="shopping-cart"></span>
              Pagamentos
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="users"></span>
              Colaboradores
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/ics-sistemaweb/usuarios">
              <span data-feather="bar-chart-2"></span>
              Usuários
            </a>
          </li>
        </ul>

        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
          <span>Relatórios</span>
          <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
            <span data-feather="plus-circle"></span>
          </a>
        </h6>
        <ul class="nav flex-column mb-2">
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text"></span>
              Comissões
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">
              <span data-feather="file-text"></span>
              Pagamentos
            </a>
          </li>
        </ul>
      </div>
    </nav>
<jsp:include page="/scripts.jsp" ></jsp:include>
</body>
</html>