package br.com.bankpe.facade;

import java.sql.SQLException;

import br.com.bankpe.negocios.UsuarioAdmin;
import br.com.bankpe.negocios.UsuarioAdminService;

public class UsuarioAdminFacade {
	private UsuarioAdminService serviceUsuarioAdmin;
	
	public UsuarioAdminFacade(UsuarioAdminService serviceUsuarioAdmin){
		this.serviceUsuarioAdmin = serviceUsuarioAdmin;
	}
	
	public UsuarioAdmin buscarUsuario(UsuarioAdmin u) throws SQLException{
		return serviceUsuarioAdmin.buscarUsuario(u);
	}
	
}
