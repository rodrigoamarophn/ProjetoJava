package br.com.bankpe.negocios;

public class TarifaDeServicos {

	Conta conta = new ContaCorrente(0,"","","",0.0,0,0.0,0.0, null, false);
	double tarifa = conta.getTarifa();
	Fator_RA_descontos fator_ra_tarifa = new Fator_RA_descontos();
	double fator = fator_ra_tarifa.getFator_RA_Descontos();
	
	//Calcula a Tarifa de Serviços com base no valor inicial da tarifa, multiplicado pelo
	//fator calculado considerando o RA (CRE) do aluno.
	double getTarifaCalculada = tarifa * fator;
}
