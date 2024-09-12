package com.devforce.securityforce.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Credencial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String usuarioCredencial;
	private String senhaUsuario;
	private String notas;
	private String url;
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	private LocalDate dataCriacao;


	public Credencial() {

	}

	public Credencial(Long id, String nome, String usuarioCredencial, String senhaUsuario, String notas, String url, Categoria categoria, Usuario usuario, LocalDate dataCriacao) {
		this.id = id;
		this.nome = nome;
		this.usuarioCredencial = usuarioCredencial;
		this.senhaUsuario = senhaUsuario;
		this.notas = notas;
		this.url = url;
		this.categoria = categoria;
		this.usuario = usuario;
		this.dataCriacao = dataCriacao;
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

	public String getUsuarioCredencial() {
		return usuarioCredencial;
	}

	public void setUsuarioCredencial(String usuarioCredencial) {
		this.usuarioCredencial = usuarioCredencial;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Credencial that = (Credencial) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "Credencial{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", usuarioCredencial='" + usuarioCredencial + '\'' +
				", senhaUsuario='" + senhaUsuario + '\'' +
				", notas='" + notas + '\'' +
				", url='" + url + '\'' +
				", categoria=" + categoria +
				", usuario=" + usuario +
				", dataCriacao=" + dataCriacao +
				'}';
	}
}
