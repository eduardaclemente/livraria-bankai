package com.livraria.bankaii.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbusuarios")
public class Usuarios {

	
	public Usuarios(int login, String senha, String nome) {
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	
	public Usuarios() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int login;
	
	@Column(name = "senha", nullable = true)
	private String senha;
	
	@Column(name = "nome", nullable = true)
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
