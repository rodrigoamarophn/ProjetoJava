package br.com.bankpe.negocios;


public abstract class Conta {
	protected int numero;
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected double limite = 300.00;
	protected int pontuacao = 0;
	protected double ra = 0;
	protected double tarifa = 29.90;
	protected String senha;
	protected boolean ativa = true;
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public double getRa() {
		return ra;
	}
	public void setRa(double ra) {
		this.ra = ra;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public Conta(int numero, String nome, String cpf, String telefone, double limite, int pontuacao, double ra, double tarifa, String senha, boolean ativa) {
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.limite = limite;
		this.pontuacao = pontuacao;
		this.ra = ra;
		this.tarifa = tarifa;
		this.senha = senha;
		this.ativa = ativa;

	}
}
