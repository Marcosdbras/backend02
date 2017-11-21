package br.com.avaliacao.entidades;

public class Usuario {
private int iId;
private int iCfun;
private String sLogin;
private String sSenha;
private String sEmail;


public int getiId() {
	return iId;
}
public void setiId(int iId) {
	this.iId = iId;
}
public int getiCfun() {
	return iCfun;
}
public void setiCfun(int iCfun) {
	this.iCfun = iCfun;
}
public String getsLogin() {
	return sLogin;
}
public void setsLogin(String sLogin) {
	this.sLogin = sLogin;
}
public String getsSenha() {
	return sSenha;
}
public void setsSenha(String sSenha) {
	this.sSenha = sSenha;
}
public String getsEmail() {
	return sEmail;
}
public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}



}
