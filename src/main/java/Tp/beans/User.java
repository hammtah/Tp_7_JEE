package Tp.beans;

public class User {
	private String nom;
	private String prenom;
	private String login;
	private String pass;
	
	public User() {
		this.nom = null;
		this.prenom = null;
		this.login = null;
		this.pass = null;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
