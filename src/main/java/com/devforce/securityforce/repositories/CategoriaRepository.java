package com.devforce.securityforce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devforce.securityforce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
