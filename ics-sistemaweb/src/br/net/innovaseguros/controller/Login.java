package br.net.innovaseguros.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.net.innovaseguros.model.Usuario;
import br.net.innovaseguros.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private LoginService service = new LoginService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		String login = request.getParameter("user");
		String senha = request.getParameter("pass");
		
		Usuario usuario = service.login(login, senha);
		
		if (usuario != null) {
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("./private/dashboard.jsp");
		} else {
			//throw new ServletException("Usuário ou senha inválido");
			//response.sendRedirect("./login.jsp");
			response.sendRedirect("/ics-sistemaweb/");
		}
	}
}