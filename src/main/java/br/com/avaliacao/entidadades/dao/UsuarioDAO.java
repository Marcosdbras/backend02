package br.com.avaliacao.entidadades.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.avaliacao.conexao.ConexaoDB;
import br.com.avaliacao.entidades.Usuario;

public class UsuarioDAO {

	private Connection conn = ConexaoDB.getConexao();
	
	public void inserir(Usuario usuario) {
		
		
		
		String sql = "insert into usuario(login, email, senha) values (?,?,?)";
		
		try (PreparedStatement preparador =  conn.prepareStatement(sql)){
			
			
			
			preparador.setString(1, usuario.getLogin() );
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usuario) {
		
		String sql = "update usuario set login = ?, email = ?, senha = ? where id = ?";
		
		try (PreparedStatement preparador =  conn.prepareStatement(sql)){
			
			
			
			preparador.setString(1, usuario.getLogin());
			preparador.setString(2, usuario.getEmail());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			
			preparador.execute();
			//preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		
		
	}

	public void excluir(Usuario usuario) {
		
		String sql = "delete from usuario where id = ?";
		
		try (PreparedStatement preparador =  conn.prepareStatement(sql)){
		
			
			
			preparador.setInt(1, usuario.getId());
			
			preparador.execute();
			preparador.close();
			
			
			
		} catch (SQLException e) {
			
			
			
			e.printStackTrace();
		}
		

		
	}
	
	public void salvar(Usuario usuario){
		
		if (usuario.getId() != null){
		  
			alterar(usuario);
				
			
		}else{
			
			inserir(usuario);
			
		}
		
		
	}
	
	/**
	 * Busca usuário por ID
	 * @param id : Informa qual número ID do usuário deve retornar
	 * @return : Caso encontre ID no banco então etorna um objeto usuário caso contratário retorna nulo
	 */
	public Usuario BuscaUsuarioPorId(Integer id){
		
		Usuario usuario = null;
		
		String sql = "Select *from usuario where id = ?";
			
		
		try (PreparedStatement preparador = conn.prepareStatement(sql)){
		
		preparador.setInt(1, id);	
			
		ResultSet resultado = preparador.executeQuery();
		
		if (resultado.next()){
			
			usuario = new Usuario();
			usuario.setId(resultado.getInt("id") );
			usuario.setLogin(resultado.getString("login"));
			usuario.setEmail(resultado.getString("email"));
			usuario.setSenha(resultado.getString("senha"));
			usuario.setCfun(resultado.getInt("cfun"));
			
			
		}
			
			
		}catch(SQLException e){
			
			throw new RuntimeException(e);
			
		}
		
		
		
		return usuario;
	}

	
	
	public List<Usuario> BuscaTodosUsuarios(){
		
		Usuario usuario = null;
		
		String sql = "Select * from usuario";
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		
		try (PreparedStatement preparador = conn.prepareStatement(sql)){
		
		ResultSet resultado = preparador.executeQuery();
		
		while(resultado.next()){
			
			
		}if (!resultado.next()){
			
			lista = null;
		}
			
			
		}catch(SQLException e){
			
			throw new RuntimeException(e);
			
		}
		
		
		return lista;
	} 
	
}
