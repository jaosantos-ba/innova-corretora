package br.net.innovaseguros.model;

public class Usuario {
	private long id;

	private String login;
	private String nome;
	private String senha;
	private Boolean ativo;
	private Boolean perfil;

	public Usuario() {
		super();
	}
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Usuario(long id, String login, String nome, String senha, Boolean ativo, Boolean perfil) {
		super();
		this.id = id;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.ativo = ativo;
		this.perfil = perfil;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getPerfil() {
		return perfil;
	}

	public void setPerfil(Boolean perfil) {
		this.perfil = perfil;
	}
}