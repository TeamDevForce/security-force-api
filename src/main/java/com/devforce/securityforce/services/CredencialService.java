package com.devforce.securityforce.services;

import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.repositories.CredencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CredencialService {

    @Autowired
    private CredencialRepository credencialRepository;

    public Credencial create(Credencial credencial) {
        credencial.setDataCriacao(LocalDate.now());
        return credencialRepository.save(credencial);
    }
}
