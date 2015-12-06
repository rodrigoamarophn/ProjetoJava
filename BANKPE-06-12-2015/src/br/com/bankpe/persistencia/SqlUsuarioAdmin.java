package br.com.bankpe.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.bankpe.negocios.UsuarioAdmin;

public class SqlUsuarioAdmin implements IUsuarioAdmin {


	public UsuarioAdmin buscarUsuario(UsuarioAdmin u) throws SQLException{
		
		String sql = "select * from funcionarios where matricula = ?";
		PreparedStatement pre = (PreparedStatement) Conexao.abrirConexao().prepareStatement(sql);
		pre.setInt(1, u.getMatricula());
		//pre.setString(2, u.getSenha());
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()){
			UsuarioAdmin usuarioAdmin = new UsuarioAdmin();	
			usuarioAdmin.setMatricula(rs.getInt("matricula"));
			usuarioAdmin.setNome(rs.getString("nome"));
			usuarioAdmin.setCargo(rs.getInt("cargo"));
			usuarioAdmin.setDataAdmissao(rs.getString("dataadmissao"));
			usuarioAdmin.setSenha(rs.getString("senha"));
			return usuarioAdmin;
		}
		return null;
	}



}
