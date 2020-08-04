package br.net.innovaseguros.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.net.innovaseguros.service.UsuarioService;

/**
 * Servlet implementation class UsuarioSaveOrUpdate
 */
//@WebServlet(urlPatterns = { "/usuarios/salvar" })
@WebServlet("/usuarios/salvar")
public class UsuarioSave extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private UsuarioService usuarioService = new UsuarioService();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String nome = request.getParameter("name");
		String senha = request.getParameter("pass");
		String senhaConf = request.getParameter("cPass");
		String ativo = request.getParameter("ative");
        String perfil = request.getParameter("profile");
        
        if (senha == senhaConf) {
        	usuarioService.save(login, nome, senha, ativo, perfil);
            response.sendRedirect("/ics-sistemaweb/usuarios");	
        } else {
        	response.sendRedirect("/ics-sistemaweb/usuarios");
        	
        	/*request.setAttribute("erroSenha", "As senhas não coincidem!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ics-sistemaweb/private/usernew.jsp");
			dispatcher.forward(request, response);*/
        }
	}
}