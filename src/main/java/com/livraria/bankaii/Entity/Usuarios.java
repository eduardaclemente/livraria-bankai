package com.livraria.bankaii.Entity;

public class Usuarios {

	
	public Usuarios(int login, String senha, String nome) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	
	public Usuarios() {
		
	}
	
	
	private int login;
	private String senha;
	private String nome;
	
	
	public int getLogin() {
		return login;
	}


	public void setLogin(int login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
