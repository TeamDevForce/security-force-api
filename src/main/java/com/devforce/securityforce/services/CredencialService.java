package com.devforce.securityforce.services;

import com.devforce.securityforce.model.Credencial;
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

    public Credencial create(Credencial credencial) {
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
}
