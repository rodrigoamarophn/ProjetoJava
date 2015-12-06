package br.com.bankpe.persistencia;

import java.sql.SQLException;
import java.util.List;

import br.com.bankpe.negocios.Conta;

public interface IConta {
	
	public boolean adicionar(Conta conta) throws SQLException;
	public void deletar(String numero);
	public void atualizar(String numero);
	public void debitar(double saldo);
	public void creditar(double saldo);
	public List<Conta> listar() throws SQLException;
}
