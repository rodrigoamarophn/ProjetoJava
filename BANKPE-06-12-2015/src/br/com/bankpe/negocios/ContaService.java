package br.com.bankpe.negocios;

import java.sql.SQLException;
import java.util.List;

import br.com.bankpe.persistencia.IConta;
import br.com.bankpe.persistencia.SqlConta;

public class ContaService {
	
	private IConta serviceConta;
	
	public ContaService() {
		this.serviceConta = new SqlConta();
	}
	
	public void inativarAConta(Conta conta) {
//		serviceConta.deletar(conta.getNumero());
//		serviceConta.atualizar(conta.getNumero());
	}
	
	public boolean adicionarContas(Conta conta) throws SQLException {
		return serviceConta.adicionar(conta);
	}
	
	public List<Conta> listarContas() throws SQLException {
		return serviceConta.listar();
	}
}
