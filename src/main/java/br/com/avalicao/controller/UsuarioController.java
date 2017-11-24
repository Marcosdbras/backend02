package br.com.avalicao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.avaliacao.entidades.Usuario;
import br.com.avaliacao.entidadades.dao.UsuarioDAO;

/**
 * 
 * @author marcosbras
 *
 *         QueryString:
 *
 *         http://localhost:8080/Avaliacao/UsuarioController.do
 *
 *
 */

@WebServlet("/UsuarioController.do")
public class UsuarioController extends HttpServlet {

	/**
	 * Ao iniciar o servlet
	 */
	public UsuarioController() {
		System.out.println("Construtor...");
	}

	/**
	 * O Init é chamado apos a construção do objeto
	 */

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		System.out.println("init...");
	}

	
	/**
	 * Aqui a requisição post é utilizada para cadastrar ou alterar usuário,
	 * se o cliente envia id será feita uma alteração caso contratário 
	 * será realizada um inserção no banco
	 * 
	 */
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Usuario usuario = new Usuario();

		if (req.getParameter("id")!=null){
		  
			usuario.setId(Integer.parseInt(req.getParameter("id")));
			
		}
		

		if (req.getParameter("cfun")!=null){
			  
			usuario.setId(Integer.parseInt(req.getParameter("cfun")));
			
		}
		
		usuario.setLogin(req.getParameter("login"));
		usuario.setEmail(req.getParameter("email"));
		usuario.setSenha(req.getParameter("senha"));
		
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.salvar(usuario);
		
		resp.getWriter().print("Salvo com sucesso!");

		

	}

	/**
	 * doGet é chamado toda vez que ocorre alguma requisição requisita dados do
	 * tomcat
	 * 
	 * Aqui a requisição Get é utililizada para excluir um registro
	 * 
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		if(req.getParameter("id")!=null){
		
			Usuario usuario = new Usuario();
			
			usuario.setId(Integer.parseInt(req.getParameter("id")));
			
			UsuarioDAO usuarioDao = new UsuarioDAO();
			
			if (usuarioDao.BuscaUsuarioPorId(usuario.getId())!= null){
				
				usuarioDao.excluir(usuario);
				
				resp.getWriter().print("Exclusão realizada com sucesso!");	
				
			}else{
				
				resp.getWriter().print("Id do usuário não existe na base de dados");
				
			}
			
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
