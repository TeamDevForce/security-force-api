package com.devforce.securityforce.model;

import java.util.Objects;

public class Credencial {

	private long usuarioId;
	private String categoria;
	private String nome;
	private String usuario;
	private String senhaUsuario;
	private String notas;
	private String url;

	public Credencial() {

	}

	public Credencial(long usuarioId, String categoria, String nome, String usuario, String senhaUsuario, String notas,
			String url) {
		this.usuarioId = usuarioId;
		this.categoria = categoria;
		this.nome = nome;
		this.usuario = usuario;
		this.senhaUsuario = senhaUsuario;
		this.notas = notas;
		this.url = url;
	}

	public long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, nome, notas, senhaUsuario, url, usuario, usuarioId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credencial other = (Credencial) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(nome, other.nome)
				&& Objects.equals(notas, other.notas) && Objects.equals(senhaUsuario, other.senhaUsuario)
				&& Objects.equals(url, other.url) && Objects.equals(usuario, other.usuario)
				&& usuarioId == other.usuarioId;
	}

	@Override
	public String toString() {
		return "Credencial [usuarioId=" + usuarioId + ", categoria=" + categoria + ", nome=" + nome + ", usuario="
				+ usuario + ", senhaUsuario=" + senhaUsuario + ", notas=" + notas + ", url=" + url + "]";
	}

}
