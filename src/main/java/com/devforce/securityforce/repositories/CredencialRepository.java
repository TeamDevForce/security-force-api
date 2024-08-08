package com.devforce.securityforce.repositories;

import com.devforce.securityforce.model.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredencialRepository extends JpaRepository<Credencial, Long> {

}
