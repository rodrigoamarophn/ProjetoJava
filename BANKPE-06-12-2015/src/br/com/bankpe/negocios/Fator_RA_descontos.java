package br.com.bankpe.negocios;

public class Fator_RA_descontos {

	Conta conta = new ContaCorrente(0,"","","",0.0,0,0.0,0.0, null, false);
	double ra = conta.getRa();
	
	//Gera o Fator que será utilizado para o cálculo da tarifa da cesta de serviços
	//RA é equivalente ao atual CRE
	//Exemplo tarifa = 29.90 e RA = 8.45 aplica-se 20% de desconto, tarifa = 23.92
	public double getFator_RA_Descontos(){
		if(ra <= 7.0){return 1.0;}
		else if((ra > 7.0) && (ra <= 7.5)){return 0.95;}
		else if((ra > 7.5) && (ra <= 8.0)){return 0.90;}
		else if((ra > 8.0) && (ra <= 8.5)){return 0.80;}
		else if((ra > 8.5) && (ra <= 9.0)){return 0.70;}
		else if((ra > 9.0) && (ra <= 9.5)){return 0.50;}
		else if((ra > 9.5) && (ra <= 8.0)){return 0.00;}
		else return 1.0;
	}
}
