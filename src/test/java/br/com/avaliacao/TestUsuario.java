package br.com.avaliacao;

import br.com.avaliacao.entidadades.dao.UsuarioDAO;
import br.com.avaliacao.entidades.Usuario;

public class TestUsuario {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setsEmail("marcosbras@yahoo.com.br");
		usuario.setsLogin("marcosbras");
		usuario.setsSenha("123456");
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.inserir(usuario);
		
		System.out.print("Usuário cadastrado com sucesso");
		

	}

}
