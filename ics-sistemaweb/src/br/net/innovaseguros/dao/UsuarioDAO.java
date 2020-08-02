package br.net.innovaseguros.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import br.net.innovaseguros.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://innovaseguros.app.br:3306/innovase_bd";
	
	// Database credentials
	static final String USER = "innovase_jaosantos";
	static final String PASS = "*2~lH9NgN$gb";
	private Connection conn = null;
	
	/*private Context ctx = null;
    private DataSource ds = null;
    private Connection con = null;*/

    private static final String AUTENTICATE = "SELECT id_usuario, login, nome, senha, ativo, perfil from usuarios where login=? and senha=?";
    
    public Connection getInstance() {
    	
    	try {
    		if (conn == null || conn.isClosed()) {
    			Class.forName(JDBC_DRIVER);
    			System.out.println("Conectou ao BD!");
    			conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		}
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	return conn;
    }
    
    
    /*public void open() throws Exception {
        ctx = new InitialContext();
        ds = (DataSource) ctx.lookup("jdbc/tarefasDS");
        con = ds.getConnection();
    }

    private void close(Statement stmt) {
        close(stmt, null);
    }
    
    private void close(Statement stmt, ResultSet rs) {
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
    }
    
    public Usuario autenticate(String login, String senha) {
    	Usuario usuario = null; 
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
        return usuario;
	}*/
    
    public Usuario autenticate(String login, String senha) {
    	Usuario usuario = null; 
		PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = getInstance();
            stmt = conn.prepareStatement(AUTENTICATE);
            stmt.setString(1, login);
            //String pass = Criptografia.criptografar(senha);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("id_usuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAtivo(rs.getBoolean("ativo"));
                usuario.setPerfil(rs.getBoolean("perfil"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //close(stmt, rs);
        }
        return usuario;
    }   
}