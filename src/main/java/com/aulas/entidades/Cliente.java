package com.aulas.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
	private int id;
	
	@Column(length = 40, nullable = false)
	private String razaosocial;
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	List<Vendas> vendas;
	
	
	public Cliente(String razaosocial, String cpf) {
		this.razaosocial = razaosocial;
		this.cpf = cpf;
	}

	public Cliente() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}