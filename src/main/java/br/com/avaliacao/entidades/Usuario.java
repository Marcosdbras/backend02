package br.com.avaliacao.entidades;

public class Usuario {
private Integer id;
private Integer cfun;
private String login;
private String senha;
private String email;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getCfun() {
	return cfun;
}
public void setCfun(Integer cfun) {
	this.cfun = cfun;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Usuario [id=" + id + ", cfun=" + cfun + ", login=" + login + ", senha=" + senha + ", email=" + email + "]";
}





}
