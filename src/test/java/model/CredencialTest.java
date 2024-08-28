package model;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.devforce.securityforce.model.Categoria;
import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.model.Usuario;

public class CredencialTest {
	@Test
	@DisplayName("Teste para verificar criação da instância")
	void testDefaultCredencialConstrutor() {
		Credencial credencial = new Credencial();
		Assertions.assertEquals(null, credencial.getId());
		Assertions.assertNull(credencial.getNome());
		Assertions.assertNull(credencial.getUsuarioCredencial());
		Assertions.assertNull(credencial.getSenhaUsuario());
		Assertions.assertNull(credencial.getNotas());
		Assertions.assertNull(credencial.getUrl());
		Assertions.assertNull(credencial.getCategoria());
		Assertions.assertNull(credencial.getUsuario());
		Assertions.assertNull(credencial.getDataCriacao());				
	}
	
	@Test
	@DisplayName("Teste para o construtor com argumentos")
    void testCredencialConstrutor() {
        Categoria categoria = new Categoria(1L, "Admin", null);
        Usuario usuario = new Usuario(1L, "user1", "user1@example.com", "senha1", "123456789", LocalDate.now(), 'A', null);
        LocalDate dataCriacao = LocalDate.now();
        
        Credencial credencial = new Credencial(1L, "Credencial 1", "usuario1", "senha1", "Notas", "http://example.com", categoria, usuario, dataCriacao);
        
        Assertions.assertEquals(1L, credencial.getId());
        Assertions.assertEquals("Credencial 1", credencial.getNome());
        Assertions.assertEquals("usuario1", credencial.getUsuarioCredencial());
        Assertions.assertEquals("senha1", credencial.getSenhaUsuario());
        Assertions.assertEquals("Notas", credencial.getNotas());
        Assertions.assertEquals("http://example.com", credencial.getUrl());
        Assertions.assertEquals(categoria, credencial.getCategoria());
        Assertions.assertEquals(usuario, credencial.getUsuario());
        Assertions.assertEquals(dataCriacao, credencial.getDataCriacao());
    }
	
	@Test
	@DisplayName("Testando Setters e Getters da classe Credencial")
	void testSettersGetters() {
		Credencial credencial = new Credencial();
        credencial.setId(1L);
        credencial.setNome("Credencial Teste");
        credencial.setUsuarioCredencial("usuarioTeste");
        credencial.setSenhaUsuario("senhaTeste");
        credencial.setNotas("Notas Teste");
        credencial.setUrl("http://test.com");
        credencial.setCategoria(new Categoria());
        credencial.setUsuario(new Usuario());
        credencial.setDataCriacao(LocalDate.now());

        Assertions.assertEquals(1L, credencial.getId());
        Assertions.assertEquals("Credencial Teste", credencial.getNome());
        Assertions.assertEquals("usuarioTeste", credencial.getUsuarioCredencial());
        Assertions.assertEquals("senhaTeste", credencial.getSenhaUsuario());
        Assertions.assertEquals("Notas Teste", credencial.getNotas());
        Assertions.assertEquals("http://test.com", credencial.getUrl());
        Assertions.assertNotNull(credencial.getCategoria());
        Assertions.assertNotNull(credencial.getUsuario());
        Assertions.assertNotNull(credencial.getDataCriacao());
	}
	
	@Test
	@DisplayName("Testando equals e hashCode da classe Credencial")
	void testEqualsHashCode() {
		Categoria categoria = new Categoria(1L, "Admin", null);
		Categoria categoria2 = new Categoria(3L, "Admin", null);
		 
	    Usuario usuario = new Usuario(1L, "user1", "user1@example.com", "senha1", "123456789", LocalDate.now(), 'A', null);
	    Usuario usuario2 = new Usuario(1L, "user1", "user1@example.com", "senha1", "123456789", LocalDate.now(), 'A', null);
	     
	    LocalDate dataCriacao = LocalDate.now();
	        
		Credencial credencial1 = new Credencial(1L, "Credencial 1", "usuario1", "senha1", "Notas", "http://example.com", categoria2, usuario2, dataCriacao);
        Credencial credencial2 = new Credencial(1L, "Credencial 1", "usuario1", "senha1", "Notas", "http://example.com", categoria, usuario, dataCriacao);
        Credencial credencial3 = new Credencial(2L, "Credencial 2", "usuario2", "senha2", "Notas2", "http://example2.com", categoria, usuario2, dataCriacao);

        Assertions.assertEquals(credencial1, credencial2);
        Assertions.assertNotEquals(credencial1, credencial3);
        Assertions.assertEquals(credencial1.hashCode(), credencial2.hashCode());
        Assertions.assertNotEquals(credencial1.hashCode(), credencial3.hashCode());
	}
}
