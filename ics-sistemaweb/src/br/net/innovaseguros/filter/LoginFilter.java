package br.net.innovaseguros.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.net.innovaseguros.model.Usuario;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter(urlPatterns = {"/private/*"})
@WebFilter("/private/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		Object object = httpServletRequest.getSession().getAttribute("usuario");
		
		if(object != null) {
			Usuario usuario = (Usuario) object;
			System.out.println("Filtrou o acesso!");
			chain.doFilter(request, response);
		} else {
			request.setAttribute("erro", "É preciso estar logado!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ics-sistemaweb/");
			dispatcher.forward(request, response);
		}	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}