package br.com.bankpe.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection abrirConexao(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bankpe";
			String login = "root";
			String senha = "";

				Connection con = DriverManager.getConnection(url, login, senha);
				System.out.println("abriu conexão");
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

}