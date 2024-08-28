package com.devforce.securityforce.controllers;

import com.devforce.securityforce.model.Credencial;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/credenciais")
public class CredencialController {


    @PostMapping
    public ResponseEntity<Credencial> create(@RequestBody Credencial credencial) {
        return null;
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
        return null;
    }

}
