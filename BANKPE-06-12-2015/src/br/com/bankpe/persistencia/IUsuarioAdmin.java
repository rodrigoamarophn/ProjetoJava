package br.com.bankpe.persistencia;

import java.sql.SQLException;

import br.com.bankpe.negocios.UsuarioAdmin;

public interface IUsuarioAdmin {
	
	public UsuarioAdmin buscarUsuario(UsuarioAdmin u) throws SQLException;
}
