package br.com.bankpe.ui;

import java.sql.SQLException;
import java.util.List;

import br.com.bankpe.facade.BancoFacade;
import br.com.bankpe.negocios.Conta;
import br.com.bankpe.negocios.ContaService;

public class Principal {
		
	public static void main(String[] args) {		
		new TelaInicialLogins("BankPÊ");
		//T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//setBounds(X, Y, LARGURA, ALTURA); // DEFINIR TAMANHO DA TELA
		//T.setSize(530, 260);
		//setExtendedState(MAXIMIZED_BOTH); // ABRIR COM TELA CHEIA
		
		
//Listar Informações da Conta
		BancoFacade bancoFacade = new BancoFacade(new ContaService());
		
		List<Conta> contas = null;
		try {
			contas = bancoFacade.listarContas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}	
