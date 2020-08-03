package br.net.innovaseguros.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.net.innovaseguros.service.UsuarioService;

/**
 * Servlet implementation class UsuarioDelete
 */
//@WebServlet(urlPatterns = { "/usuarios/salvar" })
@WebServlet("/usuarios/excluir")
public class UsuarioDelete extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private UsuarioService usuarioService = new UsuarioService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String index = request.getParameter("index");
		usuarioService.delete(index);
		
		response.sendRedirect("/ics-sistemaweb/usuarios");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}