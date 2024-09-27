package com.devforce.securityforce.services;

import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.model.Usuario;
import com.devforce.securityforce.repositories.CredencialRepository;
import com.devforce.securityforce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CredencialService {

    @Autowired
    private CredencialRepository credencialRepository;

    public Credencial save(Credencial credencial) {
        credencial.setDataCriacao(LocalDate.now());
        return credencialRepository.save(credencial);
    }

    public Credencial findById(Long id) {
        Optional<Credencial> credencialOptional = credencialRepository.findById(id);
        if (credencialOptional.isPresent()) {
            return credencialOptional.get();
        }
        throw new ResourceNotFoundException("Credencial não encontrada com o id: " + id);
    }

    public Credencial uupdate(Long id,Credencial credencial) {
        credencial.setId(id);
        Credencial updateCredencial = findById(id);
        return credencialRepository.save(updateCredencial);
    }

    public Credencial update(Long id, Credencial novaCredencial) {
        Credencial credencialExistente = findById(id);
        atualizarDadosCredencial(credencialExistente, novaCredencial);
        return credencialRepository.save(credencialExistente);
    }
    
    private void atualizarDadosCredencial(Credencial credencialExistente, Credencial novaCredencial) {
        credencialExistente.setNome(novaCredencial.getNome());
        credencialExistente.setUsuarioCredencial(novaCredencial.getUsuarioCredencial());
        credencialExistente.setSenhaUsuario(novaCredencial.getSenhaUsuario());
        credencialExistente.setNotas(novaCredencial.getNotas());
        credencialExistente.setUrl(novaCredencial.getUrl());
        credencialExistente.setCategoria(novaCredencial.getCategoria());
        credencialExistente.setUsuario(novaCredencial.getUsuario());
        credencialExistente.setDataCriacao(novaCredencial.getDataCriacao());
    }

    public void delete(Long id) {
        Credencial credencialEncontrada = findById(id);
        credencialRepository.delete(credencialEncontrada);
    }

}
