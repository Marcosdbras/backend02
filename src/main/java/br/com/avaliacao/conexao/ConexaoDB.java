package br.com.avaliacao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	public static Connection getConexao() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// return DriverManager.getConnection("jdbc:mysql://node148542-marcosbras.jelasticlw.com.br/dbteste", "root","UTSETaoiom"); 
			
			// return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbteste", "root","UTSETaoiom")
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbteste", "root","UTSETaoiom");
			
		} catch (SQLException e) {			
			
			throw new RuntimeException(e);
			
		} catch (ClassNotFoundException e) {
			
			throw new RuntimeException(e);
		}
	}

}
