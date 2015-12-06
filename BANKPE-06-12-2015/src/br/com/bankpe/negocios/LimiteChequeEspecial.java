package br.com.bankpe.negocios;

public class LimiteChequeEspecial {

	Conta conta = new ContaCorrente(0,"","","",0.0,0,0.0,0.0, null, false);
	double limite = conta.getLimite();
	Fator_RA_aumentoCreditos fator_ra_aumentoCreditos = new Fator_RA_aumentoCreditos();
	double fator = fator_ra_aumentoCreditos.getFator_RA_AumentarCreditos();
	
	//Calcula o Limite do cheque especial com base no valor inicial de limite, multiplicado pelo
	//fator calculado considerando o RA (CRE) do aluno.
	double getLimiteCalculado = limite * fator;
}
