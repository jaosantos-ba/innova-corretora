package br.net.innovaseguros.service;

import java.util.ArrayList;
import java.util.List;

import br.net.innovaseguros.dao.UsuarioDAO;
import br.net.innovaseguros.model.Usuario;

public class UsuarioService {
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void save (String login, String nome, String senha, String ativo, String perfil) {
		
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setNome(nome);
		usuario.setSenha(senha);
        usuario.setAtivo(ativo!=null?true:false);
        usuario.setPerfil(perfil!=null?true:false);
        
        usuarioDAO.save(usuario);
	}
	
	public void delete (String index) {
		
		if (index != null) {
			try {
				long id = Long.parseLong(index);
				usuarioDAO.delete(id);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Usuario> listarUsuarios() {
		
		List<Usuario> usuarioBD = new ArrayList<Usuario>();
		usuarioBD = usuarioDAO.listAll();
		
		return usuarioBD;
	}
}