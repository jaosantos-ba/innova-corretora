package br.net.innovaseguros.service;

import br.net.innovaseguros.dao.UsuarioDAO;
import br.net.innovaseguros.model.Usuario;

public class LoginService {
	
	private UsuarioDAO dao = new UsuarioDAO();
	
	public Usuario login (String login, String senha) {
		Usuario usuario = null;
		if (login != null) {
			usuario = dao.autenticate(login, senha);
		}
		return usuario;
	}
}