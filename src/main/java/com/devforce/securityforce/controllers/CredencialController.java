package com.devforce.securityforce.controllers;

import com.devforce.securityforce.model.Credencial;
import com.devforce.securityforce.services.CredencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/credenciais")
public class CredencialController {

    @Autowired
    private CredencialService credencialService;

    @PostMapping
    public Credencial insert(@RequestBody Credencial credencial) {
        return credencialService.save(credencial);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Credencial> findById(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Credencial> update(@PathVariable Long id, @RequestBody Credencial dadosCredencial) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        credencialService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
