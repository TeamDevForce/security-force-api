package com.devforce.securityforce.model;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
	
	private long id;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String telefone;
	private LocalDate dataCriacao;
	private char statusAtivo;
	
	public Usuario() {
		
	}

	public Usuario(long id, String nomeUsuario, String emailUsuario, String senhaUsuario, String telefone, LocalDate dataCriacao, char statusAtivo) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.telefone = telefone;
		this.dataCriacao = dataCriacao;
		this.statusAtivo = statusAtivo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nomeUsuario=" + nomeUsuario + ", emailUsuario=" + emailUsuario
				+ ", senhaUsuario=" + senhaUsuario + ", telefone=" + telefone + ", dataCriacao=" + dataCriacao
				+ ", statusAtivo=" + statusAtivo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataCriacao, emailUsuario, id, nomeUsuario, senhaUsuario, statusAtivo, telefone);
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
		return Objects.equals(dataCriacao, other.dataCriacao) && Objects.equals(emailUsuario, other.emailUsuario)
				&& id == other.id && Objects.equals(nomeUsuario, other.nomeUsuario)
				&& Objects.equals(senhaUsuario, other.senhaUsuario) && statusAtivo == other.statusAtivo
				&& Objects.equals(telefone, other.telefone);
	}

}
