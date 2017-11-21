package br.com.avaliacao.entidadades.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.avaliacao.conexao.ConexaoDB;
import br.com.avaliacao.entidades.Usuario;

public class UsuarioDAO {

	private Connection conn = ConexaoDB.getConexao();
	
	public void inserir(Usuario usuario) {
		
		
		
		String sql = "insert into usuario(login, email, senha) values (?,?,?)";
		
		try {
			
			PreparedStatement preparador =  conn.prepareStatement(sql);
			
			preparador.setString(1, usuario.getsLogin() );
			preparador.setString(2, usuario.getsEmail());
			preparador.setString(3, usuario.getsSenha());
			
			preparador.execute();
			preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		
	}

}
