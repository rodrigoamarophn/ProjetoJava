package br.com.bankpe.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bankpe.negocios.Conta;
import br.com.bankpe.negocios.ContaCorrente;
import br.com.bankpe.negocios.UsuarioAdmin;

public class SqlConta implements IConta {

	@Override
	public boolean adicionar(Conta conta) throws SQLException {
		String sql = "INSERT INTO Conta VALUES(22222,'José Italo','12345678922','83988885566',650.00,330,8.63,29.90,'555555',true);";
		PreparedStatement pre = (PreparedStatement) Conexao.abrirConexao().prepareStatement(sql);
		//pre.setInt(1, u.getMatricula());
		//pre.setString(2, u.getSenha());
		return pre.execute();
		
	}

	@Override
	public void deletar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitar(double saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditar(double saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conta> listar() throws SQLException {
		
		List<Conta> contas = new ArrayList<Conta>();
		
		String sql = "SELECT * FROM conta;";
		PreparedStatement pre = (PreparedStatement) Conexao.abrirConexao().prepareStatement(sql);
		//pre.setInt(1, u.getMatricula());
		//pre.setString(2, u.getSenha());
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()){
			Conta cc = new ContaCorrente(0,"","","", 0.0,0,0.0,0.0,"",true);
			cc.setNumero(rs.getInt("cc"));
			cc.setNome(rs.getString("nome"));
			cc.setCpf(rs.getString("cpf"));
			cc.setTelefone(rs.getString("telefone"));
			cc.setLimite(rs.getDouble("limite"));
			cc.setPontuacao(rs.getInt("pontuacao"));
			cc.setRa(rs.getDouble("ra"));
			cc.setTarifa(rs.getDouble("tarifa"));
			cc.setSenha(rs.getString("senha"));
			cc.setAtiva(rs.getBoolean("ativa"));
			contas.add(cc);
		}
		return contas;
	}
	
	public UsuarioAdmin buscarUsuario(UsuarioAdmin u) throws SQLException{
		
		String sql = "select * from funcionarios where matricula = ?";
		PreparedStatement pre = (PreparedStatement) Conexao.abrirConexao().prepareStatement(sql);
		pre.setInt(1, u.getMatricula());
		//pre.setString(2, u.getSenha());
		ResultSet rs = pre.executeQuery();
		
		while(rs.next()){
			UsuarioAdmin usuarioAdmin = new UsuarioAdmin();	
			usuarioAdmin.setMatricula(rs.getInt("matricula"));
			usuarioAdmin.setSenha(rs.getString("senha"));
			return usuarioAdmin;
		}
		return null;
	}

}
