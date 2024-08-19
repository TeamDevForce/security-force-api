package com.devforce.securityforce.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String telefone;
	private LocalDate dataCriacao;
	private char statusAtivo;
	@OneToMany(mappedBy = "usuario")
	private List<Credencial> credenciais;
	
	public Usuario() {
		
	}

	public Usuario(Long id, String nomeUsuario, String emailUsuario, String senhaUsuario, String telefone, LocalDate dataCriacao, char statusAtivo, List<Credencial> credenciais) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.telefone = telefone;
		this.dataCriacao = dataCriacao;
		this.statusAtivo = statusAtivo;
		this.credenciais = credenciais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public char getStatusAtivo() {
		return statusAtivo;
	}

	public void setStatusAtivo(char statusAtivo) {
		this.statusAtivo = statusAtivo;
	}

	public List<Credencial> getCredenciais() {
		return credenciais;
	}

	public void setCredenciais(List<Credencial> credenciais) {
		this.credenciais = credenciais;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", emailUsuario=" + emailUsuario
				+ ", senhaUsuario=" + senhaUsuario + ", telefone=" + telefone + ", dataCriacao=" + dataCriacao
				+ ", statusAtivo=" + statusAtivo + ", credenciais=" + credenciais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(credenciais, dataCriacao, emailUsuario, id, nomeUsuario, senhaUsuario, statusAtivo,
				telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(credenciais, other.credenciais) && Objects.equals(dataCriacao, other.dataCriacao)
				&& Objects.equals(emailUsuario, other.emailUsuario) && Objects.equals(id, other.id)
				&& Objects.equals(nomeUsuario, other.nomeUsuario) && Objects.equals(senhaUsuario, other.senhaUsuario)
				&& statusAtivo == other.statusAtivo && Objects.equals(telefone, other.telefone);
	}

}
