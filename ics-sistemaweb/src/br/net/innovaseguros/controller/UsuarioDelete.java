package br.net.innovaseguros.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.net.innovaseguros.dao.UsuarioDAO;
import br.net.innovaseguros.model.Usuario;
import br.net.innovaseguros.service.UsuarioService;

/**
 * Servlet implementation class UsuarioDelete
 */
//@WebServlet(urlPatterns = { "/usuarios/salvar" })
@WebServlet("/usuarios/excluir")
public class UsuarioDelete extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private UsuarioService usuarioService = new UsuarioService();
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
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
		if (index != null) {
			long id = Long.parseLong(index);
			Usuario usuario = usuarioDAO.findById(id);
			request.setAttribute("usuario", usuario);
		}
		request.getRequestDispatcher("/private/userdelete.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String index = request.getParameter("idDel");
		usuarioService.delete(index);
		
		response.sendRedirect("/ics-sistemaweb/usuarios");
	}
}