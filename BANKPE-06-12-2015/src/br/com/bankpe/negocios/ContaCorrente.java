package br.com.bankpe.negocios;


public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, String nome, String cpf, String telefone, double limite, int pontuacao, double ra, double tarifa, String senha, boolean ativa){
		super(numero, nome, cpf, telefone, limite, pontuacao, ra, tarifa, senha, ativa);
	}
	
	@Override
	public String toString(){
		return String.format("Número: %s Nome: %s CPF: %s Telefone: %s Limite: %.2f Pontuação: %d RA %.2f Tarifa: %.2f Senha %s Ativa %b", this.numero, this.nome, this.cpf, this.telefone, this.limite, this.pontuacao, this.ra, this.tarifa, this.senha, this.ativa);
	}
}
