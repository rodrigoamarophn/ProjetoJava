package br.com.bankpe.negocios;

public class UsuarioAdmin {
	private int matricula;
	private String nome;
	private int cargo;
	private String dataAdmissao;
	private String senha;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public UsuarioAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioAdmin(int matricula, String nome, int cargo, String dataAdmissao, String senha) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.senha = senha;
	}

}