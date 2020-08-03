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
    private static final String SELECT_ALL = "SELECT id_usuario, login, nome, senha, ativo, perfil from usuarios";
    private static final String SELECT_BY_ID = "SELECT id_usuario, login, nome, senha, ativo, perfil from usuarios WHERE id_usuario=?";
    private static final String INSERT = "INSERT INTO usuarios ( login, nome, senha, ativo, perfil ) VALUES ( ?,?,?,?,? )";
    private static final String DELETE = "DELETE FROM usuarios where id_usuario=?";
    private static final String UPDATE = "UPDATE usuarios SET login=?, nome=?, senha=?, ativo=?, perfil=? where id_usuario=?";
    
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
    
    public void open() throws Exception {
        //ctx = new InitialContext();
        //ds = (DataSource) ctx.lookup("jdbc/tarefasDS");
        //con = ds.getConnection();
        conn = getInstance();
    }

    private void close(Statement stmt) {
        close(stmt, null);
    }
    
    private void close(Statement stmt, ResultSet rs) {
        try {
            if(rs!=null) rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
            //if(ctx!=null)ctx.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } /*catch (NamingException e) {
            e.printStackTrace();
        }*/
    }
    
    public Usuario autenticate(String login, String senha) {
    	Usuario usuario = null; 
		PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
        	open();
        	//conn = getInstance();
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
            close(stmt, rs);
        }
        return usuario;
    }
    
    public List<Usuario> listAll() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            this.open();
        	//conn = getInstance();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_ALL);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id_usuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAtivo(rs.getBoolean("ativo"));
                usuario.setPerfil(rs.getBoolean("perfil"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close(stmt, rs);
        }
        return usuarios;
    }
    
    public Usuario findById(Long id) {
        Usuario usuario = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            this.open();
            stmt = conn.prepareStatement(SELECT_BY_ID);
            stmt.setLong(1, id);
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
            this.close(stmt, rs);
        }
        return usuario;
    }
    
    public void save(Usuario usuario) {
        PreparedStatement stmt = null;
        try {
            this.open();
        	//conn = getInstance();
        	stmt = conn.prepareStatement(INSERT);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getNome());
            //String pass = Criptografia.criptografar(usuario.getSenha());
            stmt.setString(3, usuario.getSenha());
            stmt.setBoolean(4, usuario.getAtivo());
            stmt.setBoolean(5, usuario.getPerfil());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close(stmt);
        }
    }
    
    public void delete(Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        this.delete(usuario);
    }

    public void delete(Usuario usuario) {
        PreparedStatement stmt = null;
        try {
            this.open();
        	//conn = getInstance();
        	stmt = conn.prepareStatement(DELETE);
            stmt.setLong(1, usuario.getId());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close(stmt);
        }
    }
    
    public void update(Usuario usuario) {
        PreparedStatement stmt = null;
        try {
            this.open();
            stmt = conn.prepareStatement(UPDATE);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getNome());
            //String pass = Criptografia.criptografar(usuario.getSenha());
            stmt.setString(3, usuario.getSenha());
            stmt.setBoolean(4, usuario.getAtivo());
            stmt.setBoolean(5, usuario.getPerfil());
            stmt.setLong(6, usuario.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close(stmt);
        }
    }
}