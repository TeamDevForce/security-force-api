package model;

import com.devforce.securityforce.model.Categoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CategoriaTest {

    @Test
    @DisplayName("Teste para o construtor com argumentos")
    void testCategoriaConstrutor() {
        Categoria categoria = new Categoria(2l, "Google", null);

        Assertions.assertEquals(2l, categoria.getId());
        Assertions.assertEquals("Google", categoria.getNome());
        Assertions.assertNull(categoria.getCredenciais());
    }

    @Test
    @DisplayName("Testando Setters e Getters da classe Categoria")
    void testSettersGetters() {
        Categoria categoria = new Categoria();

        categoria.setId(12l);
        categoria.setNome("Facebook");
        categoria.setCredenciais(null);

        Assertions.assertEquals(12l, categoria.getId());
        Assertions.assertEquals("Facebook", categoria.getNome());
        Assertions.assertNull(categoria.getCredenciais());
    }
    
    @Test
    @DisplayName("Verificando se a representação em string da classe é gerada corretamente")
    void testToString() {
    	Categoria categoria = new Categoria(2l, "Twitter", null);
    	Assertions.assertEquals("Categoria [id=2, nome=Twitter]", categoria.toString());
    }
    
    @Test
    @DisplayName("Testando equals e hashCode da classe Categoria")
    void testEqualsHashCode() {
    	Categoria categoria1 = new Categoria(9L, "Tesla", null);
        Categoria categoria2 = new Categoria(9L, "Tesla", null);
        Categoria categoria3 = new Categoria(2L, "BYD", null);

        Assertions.assertEquals(categoria1, categoria2);
        Assertions.assertNotEquals(categoria1, categoria3);
        Assertions.assertEquals(categoria1.hashCode(), categoria2.hashCode());
        Assertions.assertNotEquals(categoria1.hashCode(), categoria3.hashCode());
    }
}
