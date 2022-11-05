package com.livraria.bankaii.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbcategorias")
public class Categorias {
		
	
	public Categorias(String categorias) {
		this.categorias = categorias;
	}
	
	public Categorias() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String categorias;

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
	
	
}
