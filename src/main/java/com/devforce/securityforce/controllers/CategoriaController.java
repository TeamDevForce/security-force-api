package com.devforce.securityforce.controllers;

import com.devforce.securityforce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

}
