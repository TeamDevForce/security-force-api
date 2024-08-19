package com.devforce.securityforce.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany (mappedBy = "categoria")
	private List<Credencial> credenciais;
	
	public Categoria() {

	}

	public Categoria(Long id, String nome, List<Credencial> credenciais) {
		this.id = id;
		this.nome = nome;
		this.credenciais = credenciais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Credencial> getCredenciais() {
		return credenciais;
	}

	public void setCredenciais(List<Credencial> credenciais) {
		this.credenciais = credenciais;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
}
