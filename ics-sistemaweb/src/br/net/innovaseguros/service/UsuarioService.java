package br.net.innovaseguros.service;

import java.util.ArrayList;
import java.util.List;

import br.net.innovaseguros.dao.UsuarioDAO;
import br.net.innovaseguros.model.Usuario;

public class UsuarioService {
	
	private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void save (String login, String nome, String senha, String ativo, String perfil) {
		
		Usuario usuarioSave = new Usuario();
		usuarioSave.setLogin(login);
		usuarioSave.setNome(nome);
		usuarioSave.setSenha(senha);
		usuarioSave.setAtivo(ativo!=null?true:false);
		usuarioSave.setPerfil(perfil!=null?true:false);
        
        usuarioDAO.save(usuarioSave);
	}
	
	public void update(String idUpd, String loginUpd, String nomeUpd, String senhaUpd, String ativoUpd, String perfilUpd) {
        
		Usuario usuarioUpd = new Usuario();
		Long id = Long.parseLong(idUpd);
		usuarioUpd.setId(id);
		usuarioUpd.setLogin(loginUpd);
		usuarioUpd.setNome(nomeUpd);
		usuarioUpd.setSenha(senhaUpd);
		usuarioUpd.setAtivo(ativoUpd!=null?true:false);
		usuarioUpd.setPerfil(perfilUpd!=null?true:false);
		
		usuarioDAO.update(usuarioUpd);
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