package com.devforce.securityforce.config;

import com.devforce.securityforce.model.Categoria;
import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.model.Usuario;
import com.devforce.securityforce.repositories.CategoriaRepository;
import com.devforce.securityforce.repositories.CredencialRepository;
import com.devforce.securityforce.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CredencialRepository credencialRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria categoria1 = new Categoria(null, "Redes Sociais", null);
        Categoria categoria2 = new Categoria(null, "E-mails", null);
        Categoria categoria3 = new Categoria(null, "Serviços de Streaming", null);

        categoriaRepository.saveAll(List.of(categoria1, categoria2, categoria3));

        Usuario usuario1 = new Usuario(null, "Carlos Silva", "carlos.silva@email.com", "senha123", "11987654321", LocalDate.now(), 'A', null);
        Usuario usuario2 = new Usuario(null, "Maria Souza", "maria.souza@email.com", "senha456", "11987654322", LocalDate.now(), 'A', null);

        usuarioRepository.saveAll(List.of(usuario1, usuario2));

        // Criando Credenciais e associando com Categoria e Usuário
        Credencial credencial1 = new Credencial(null, "Facebook", "carlos123", "fbpassword", "Minha conta pessoal", "https://facebook.com", categoria1, usuario1, LocalDate.now());
        Credencial credencial2 = new Credencial(null, "Gmail", "carlos.silva", "gmailpassword", "E-mail principal", "https://gmail.com", categoria2, usuario1, LocalDate.now());
        Credencial credencial3 = new Credencial(null, "Netflix", "maria123", "netflixpassword", "Minha conta de filmes", "https://netflix.com", categoria3, usuario2, LocalDate.now());
        Credencial credencial4 = new Credencial(null, "Instagram", "maria.souza", "instapassword", "Conta de fotos", "https://instagram.com", categoria1, usuario2, LocalDate.now());
        Credencial credencial5 = new Credencial(null, "Yahoo Mail", "maria.yahoo", "yahoomailpassword", "E-mail alternativo", "https://yahoo.com", categoria2, usuario2, LocalDate.now());

        credencialRepository.saveAll(List.of(credencial1, credencial2, credencial3, credencial4, credencial5));
    }


}

