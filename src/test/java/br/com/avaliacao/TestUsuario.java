package br.com.avaliacao;

import java.util.ArrayList;
import java.util.List;

import br.com.avaliacao.entidadades.dao.UsuarioDAO;
import br.com.avaliacao.entidades.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		
		//testAutenticar();
		
		
	
		
		
		
	}

	private static void testAutenticar() {
		
		Usuario usuario = new Usuario();
		
		
		usuario.setLogin("marcosbras");
		usuario.setSenha("123456");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		if (usuarioDao.autenticaUsuario(usuario)!=null){
			
			System.out.println(usuario);
			
		}else{
			
			System.out.println("Usuário não encontrado!");
			
		}

		
	}

	private static void testBuscarTodos() {
		UsuarioDAO usuarioDao  = new UsuarioDAO();
		List<Usuario> lista = usuarioDao.BuscaTodosUsuarios();
		
		for (Usuario usuario: lista){
			System.out.println(usuario);
			
		}
		
	}

	private static void testBuscarPorId() {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		Usuario usuario = usuarioDao.BuscaUsuarioPorId(4);
		
		System.out.println(usuario);
		
	}

	public static void testCadastrar() {
		Usuario usuario = new Usuario();

		usuario.setEmail("marcosbras@yahoo.com.br");
		usuario.setLogin("marcosbras");
		usuario.setSenha("12345");

		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.inserir(usuario);

		System.out.print("Usuário cadastrado com sucesso");

	}
	
	public static void testAlterar() {
		Usuario usuario = new Usuario();

		usuario.setId(4);
		usuario.setEmail("marcosbras@yahoo.com.br");
		usuario.setLogin("marcosbras");
		usuario.setSenha("1234567890123");

		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.alterar(usuario);

		System.out.print("Usuário alterado com sucesso");

	}
	
	
	public static void testExcluir() {
		Usuario usuario = new Usuario();

		usuario.setId(4);


		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.excluir(usuario);

		System.out.print("Usuário excluido com sucesso");

	}
	
	
	public static void testSalvar(){
		Usuario usuario = new Usuario();
		
		//usuario.setId(4);
		usuario.setLogin("marcosbras");
		usuario.setEmail("marcosbras@hotmail.com");
		usuario.setSenha("123456");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.salvar(usuario);
		
		
	}
	

}
