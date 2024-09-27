package com.devforce.securityforce.controllers;

import com.devforce.securityforce.model.Categoria;
import com.devforce.securityforce.model.Usuario;
import com.devforce.securityforce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        List<Categoria> categoriaOptional = categoriaService.findAll();
        return ResponseEntity.ok(categoriaOptional);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id) {
        Categoria categoriaOptional = categoriaService.findById(id);
        return ResponseEntity.ok().body(categoriaOptional);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public Categoria insert(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> update(@PathVariable Long id, @RequestBody Categoria categoriaAtualizada) {
        Categoria categoria = categoriaService.update(id, categoriaAtualizada);
        return ResponseEntity.ok().body(categoria);
    }
}
