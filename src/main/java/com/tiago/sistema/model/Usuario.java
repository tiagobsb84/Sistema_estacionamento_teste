package com.tiago.sistema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome = "admin";
	private String usuario = "admin";
	private Integer senha = 123456;
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public Integer getSenha() {
		return senha;
	}
	
}
