package br.com.bankpe.ui;

public class Usuario {

	private String nome;
	private String endere�o;
	private String telefone;
	private String cpf;
	private String agencia;
	private String conta;
	private String senha;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String nome, String endere�o, String telefone, String cpf, String agencia, String conta, String senha) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.senha = senha;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}