package com.devforce.securityforce.services;

import com.devforce.securityforce.model.Categoria;
import com.devforce.securityforce.model.Usuario;
import com.devforce.securityforce.repositories.CategoriaRepository;
import com.devforce.securityforce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Long id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()) {
            return categoriaOptional.get();
        }
        throw new RuntimeException("Categoria não encontrado");
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void delete(Long id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()) {
            categoriaRepository.delete(categoriaOptional.get());
        } else {
            throw new ResourceNotFoundException("Categoria não encontrada com o id: " + id);
        }
    }
}
