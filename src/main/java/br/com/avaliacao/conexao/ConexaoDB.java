package br.com.avaliacao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	public static Connection getConexao() {
		
		try {
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbteste", "root","");
			
		} catch (SQLException e) {
			
			
			throw new RuntimeException(e);
		}
	}

}
