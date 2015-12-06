package br.com.bankpe.facade;

import java.sql.SQLException;
import java.util.List;

import br.com.bankpe.negocios.Conta;
import br.com.bankpe.negocios.ContaService;

public class BancoFacade {
	private ContaService serviceConta;
	
	public BancoFacade(ContaService serviceConta){
		this.serviceConta = serviceConta;
	}
	
	public List<Conta> listarContas() throws SQLException {
		return serviceConta.listarContas();
	}
	

}
