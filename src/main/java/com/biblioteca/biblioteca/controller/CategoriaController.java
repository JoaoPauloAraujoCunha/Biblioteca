package com.biblioteca.biblioteca.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.biblioteca.biblioteca.entity.Categoria;
import com.biblioteca.biblioteca.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }

    @GetMapping
    public List<Categoria> listar() {
        return repository.findAll();
    }
}