package model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.model.Usuario;

public class UsuarioTest {
	private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario(1L, "usuario1", "usuario1@example.com", "senha123", "123456789", LocalDate.now(), 'A', Collections.emptyList());
    }

    @Test
    @DisplayName("Teste para verificar criação da instância")
    void testDefaultUsuarioConstrutor() {
        Usuario usuarioDefault = new Usuario();
        Assertions.assertNull(usuarioDefault.getId());
        Assertions.assertNull(usuarioDefault.getNomeUsuario());
        Assertions.assertNull(usuarioDefault.getEmailUsuario());
        Assertions.assertNull(usuarioDefault.getSenhaUsuario());
        Assertions.assertNull(usuarioDefault.getTelefone());
        Assertions.assertNull(usuarioDefault.getDataCriacao());
        Assertions.assertEquals('\u0000', usuarioDefault.getStatusAtivo());
        Assertions.assertNull(usuarioDefault.getCredenciais());
    }
    
    @Test
    @DisplayName("Teste para o construtor com argumentos")
    void testUsuarioConstrutor() {
        Long id = 1L;
        String nomeUsuario = "usuario1";
        String emailUsuario = "usuario1@example.com";
        String senhaUsuario = "senha123";
        String telefone = "123456789";
        LocalDate dataCriacao = LocalDate.now();
        char statusAtivo = 'A';
        List<Credencial> credenciais = Collections.emptyList();

        Usuario usuario = new Usuario(id, nomeUsuario, emailUsuario, senhaUsuario, telefone, dataCriacao, statusAtivo, credenciais);

        Assertions.assertEquals(id, usuario.getId());
        Assertions.assertEquals(nomeUsuario, usuario.getNomeUsuario());
        Assertions.assertEquals(emailUsuario, usuario.getEmailUsuario());
        Assertions.assertEquals(senhaUsuario, usuario.getSenhaUsuario());
        Assertions.assertEquals(telefone, usuario.getTelefone());
        Assertions.assertEquals(dataCriacao, usuario.getDataCriacao());
        Assertions.assertEquals(statusAtivo, usuario.getStatusAtivo());
        Assertions.assertEquals(credenciais, usuario.getCredenciais());
    }
    
    @Test
    @DisplayName("Testando Setters e Gettersda classe Usuario")
    void testSettersEGetters() {
    	LocalDate dataCriacao = LocalDate.now();
    	 
    	usuario.setId(1L);
        usuario.setNomeUsuario("usuario1");
        usuario.setEmailUsuario("usuario1@example.com");
        usuario.setSenhaUsuario("senha123");
        usuario.setTelefone("123456789");
        usuario.setDataCriacao(dataCriacao);
        usuario.setStatusAtivo('A');
        usuario.setCredenciais(Collections.emptyList());
        
        Assertions.assertEquals(1L, usuario.getId());        
        Assertions.assertEquals("usuario1", usuario.getNomeUsuario());        
        Assertions.assertEquals("usuario1@example.com", usuario.getEmailUsuario());        
        Assertions.assertEquals("senha123", usuario.getSenhaUsuario());       
        Assertions.assertEquals("123456789", usuario.getTelefone());        
        Assertions.assertEquals(dataCriacao, usuario.getDataCriacao());        
        Assertions.assertEquals('A', usuario.getStatusAtivo());
        Assertions.assertEquals(Collections.emptyList(), usuario.getCredenciais());
    }
    
    @Test
    @DisplayName("Testando equals e hashCode da classe Usuario")
    void testEqualsHashCode() {
    	 Usuario usuario1 = new Usuario(1L, "usuario1", "usuario1@example.com", "senha123", "123456789", LocalDate.now(), 'A', Collections.emptyList());
    	 Usuario usuario2 = new Usuario(1L, "usuario1", "usuario1@example.com", "senha123", "123456789", LocalDate.now(), 'A', Collections.emptyList());
    	 Usuario usuario3 = new Usuario(2L, "usuario2", "usuario2@example.com", "senha456", "987654321", LocalDate.now(), 'I', Collections.emptyList());
    	 
    	 Assertions.assertEquals(usuario1, usuario2);        
    	 Assertions.assertNotEquals(usuario1, usuario3);
    	 Assertions.assertEquals(usuario1.hashCode(), usuario2.hashCode());         
    	 Assertions.assertNotEquals(usuario1.hashCode(), usuario3.hashCode());
    }
}
