package com.devforce.securityforce.services.exceptions;

import com.devforce.securityforce.repositories.CredencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredencialService {

    @Autowired
    private CredencialRepository credencialRepository;

}
