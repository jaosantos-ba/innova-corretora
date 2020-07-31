package br.net.innovaseguros.dao;

//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;

import br.net.innovaseguros.model.Usuario;

//import java.sql.*;

public class UsuarioDAO {
	
	private Usuario usuario;
	//private Usuario usuario = new Usuario ("jaosantos", "123456");
	
	//private Context ctx = null;
    //private DataSource ds = null;
    //private Connection con = null;

    //private static final String AUTENTICATE = "SELECT usuario_id, login, nome, senha, ativo, perfil from usuarios where login=? and senha=?";
    
    /*public void open() throws Exception {
        ctx = new InitialContext();
        ds = (DataSource) ctx.lookup("jdbc/tarefasDS");
        con = ds.getConnection();
    }

    private void close(Statement stmt) {
        close(stmt,null);
    }
    
    private void close(Statement stmt, ResultSet rs ) {
        try {
            if(rs!=null) rs.close();
            if(stmt!=null)stmt.close();
            if(con!=null)con.close();
            if(ctx!=null)ctx.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }*/
    
    public Usuario autenticate(String login, String senha) {
    	usuario = null;
    	System.out.println(login);
		System.out.println(senha);
		if (login.equals("jaosantos") && senha.equals("123456")) {
			usuario.setLogin(login);
			usuario.setSenha(senha);
		}
		return usuario;
		
		/* Usuario usuario = null; 
		PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            open();
            stmt = con.prepareStatement(AUTENTICATE);
            stmt.setString(1, login);
            String pass = Criptografia.criptografar(senha);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("usuario_id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAtivo(rs.getBoolean("ativo"));
                usuario.setPerfil(rs.getBoolean("perfil"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, rs);
        }
        return usuario;*/
	}
}