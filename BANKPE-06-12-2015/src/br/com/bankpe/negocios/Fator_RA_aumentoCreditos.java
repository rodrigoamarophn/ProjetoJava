package br.com.bankpe.negocios;

public class Fator_RA_aumentoCreditos {

	Conta conta = new ContaCorrente(0,"","","",0.0,0,0.0,0.0, null, false);
	double ra = conta.getRa();
	
	//Gera o Fator que será utilizado para o cálculo do limite cheque especial
	//RA é equivalente ao atual CRE
	//Exemplo limite = 300.00 e RA = 8.45 aplica-se 20% de acréscimo, limite = 360.00
	public double getFator_RA_AumentarCreditos(){
		if(ra <= 7.0){return 1.0;}
		else if((ra > 7.0) && (ra <= 7.5)){return 1.05;}
		else if((ra > 7.5) && (ra <= 8.0)){return 1.10;}
		else if((ra > 8.0) && (ra <= 8.5)){return 1.20;}
		else if((ra > 8.5) && (ra <= 9.0)){return 1.30;}
		else if((ra > 9.0) && (ra <= 9.5)){return 1.50;}
		else if((ra > 9.5) && (ra <= 8.0)){return 2.00;}
		else return 1.0;
	}
}