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
}
