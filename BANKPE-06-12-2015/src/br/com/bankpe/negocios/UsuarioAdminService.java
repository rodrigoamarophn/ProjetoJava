package br.com.bankpe.negocios;

import java.sql.SQLException;

import br.com.bankpe.persistencia.IUsuarioAdmin;
import br.com.bankpe.persistencia.SqlUsuarioAdmin;

public class UsuarioAdminService {
	
	private IUsuarioAdmin serviceUsuarioAdmin;
	
	public UsuarioAdminService() {
		this.serviceUsuarioAdmin = new SqlUsuarioAdmin();
	}
	
	public UsuarioAdmin buscarUsuario (UsuarioAdmin u) throws SQLException{
		return serviceUsuarioAdmin.buscarUsuario(u);
	}
	
}
