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

	public void alterar(Usuario usuario) {
		
		String sql = "update usuario set login = ?, email = ?, senha = ? where id = ?";
		
		try {
			
			PreparedStatement preparador =  conn.prepareStatement(sql);
			
			preparador.setString(1, usuario.getsLogin() );
			preparador.setString(2, usuario.getsEmail());
			preparador.setString(3, usuario.getsSenha());
			preparador.setInt(4, usuario.getiId());
			
			preparador.execute();
			preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		
		
	}

	public void Excluir(Usuario usuario) {
		
		String sql = "delete from usuario where id = ?";
		
		try {
			
			PreparedStatement preparador =  conn.prepareStatement(sql);
			
			
			preparador.setInt(1, usuario.getiId());
			
			preparador.execute();
			preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		

		
	}

}
