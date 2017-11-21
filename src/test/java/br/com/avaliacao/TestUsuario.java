package br.com.avaliacao;

import br.com.avaliacao.entidadades.dao.UsuarioDAO;
import br.com.avaliacao.entidades.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		
		testAlterar();

	}

	public static void testCadastrar() {
		Usuario usuario = new Usuario();

		usuario.setsEmail("marcosbras@yahoo.com.br");
		usuario.setsLogin("marcosbras");
		usuario.setsSenha("123456");

		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.inserir(usuario);

		System.out.print("Usuário cadastrado com sucesso");

	}
	
	public static void testAlterar() {
		Usuario usuario = new Usuario();

		usuario.setiId(4);
		usuario.setsEmail("marcosbras@yahoo.com.br");
		usuario.setsLogin("marcosbras");
		usuario.setsSenha("1234567890123");

		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.alterar(usuario);

		System.out.print("Usuário alterado com sucesso");

	}
	
	
	public static void testExcluir() {
		Usuario usuario = new Usuario();

		usuario.setiId(4);


		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.Excluir(usuario);

		System.out.print("Usuário excluido com sucesso");

	}
	
	

}
