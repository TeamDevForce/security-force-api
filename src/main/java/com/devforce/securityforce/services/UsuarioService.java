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

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = findById(id);
        usuario.setNomeUsuario(usuarioAtualizado.getNomeUsuario());
        usuario.setEmailUsuario(usuarioAtualizado.getEmailUsuario());
        usuario.setSenhaUsuario(usuarioAtualizado.getSenhaUsuario());
        usuario.setTelefone(usuarioAtualizado.getTelefone());
        usuario.setDataCriacao(usuarioAtualizado.getDataCriacao());
        usuario.setStatusAtivo(usuarioAtualizado.getStatusAtivo());
        usuario.setCredenciais(usuarioAtualizado.getCredenciais());
        return usuarioRepository.save(usuario);
    }


}
