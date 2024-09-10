package com.devforce.securityforce.services.exceptions;

import com.devforce.securityforce.model.Categoria;
import com.devforce.securityforce.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void delete(Long id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()) {
            categoriaRepository.delete(categoriaOptional.get());
        } else {
            throw new ResourceNotFoundException("Categoria não encontrada com o id: " + id);
        }
    }
}
