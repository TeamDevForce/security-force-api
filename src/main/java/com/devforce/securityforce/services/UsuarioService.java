package com.devforce.securityforce.services;

import com.devforce.securityforce.model.Usuario;
import com.devforce.securityforce.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        }
        throw new RuntimeException("Usuário não encontrado");
    }

    public void delete(Long id) {
        Usuario usuarioEncontrado = findById(id);
        usuarioRepository.delete(usuarioEncontrado);
    }

    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
