package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.Livro;
import com.biblioteca.biblioteca.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroRepository repository;

    public LivroController(LivroRepository repository) {
        this.repository = repository;
    }

    // salvar livro
    @PostMapping
    public Livro salvar(@RequestBody Livro livro) {
        return repository.save(livro);
    }

    // listar todos
    @GetMapping
    public List<Livro> listar() {
        return repository.findAll();
    }

    // busca título exato
    @GetMapping("/titulo")
    public List<Livro> buscarPorTitulo(@RequestParam String titulo) {
        return repository.findByTitulo(titulo);
    }

    // busca parcial
    @GetMapping("/titulo-parcial")
    public List<Livro> buscarParcial(@RequestParam String titulo) {
        return repository.findByTituloContainingIgnoreCase(titulo);
    }

    // busca por categoria
    @GetMapping("/categoria")
    public List<Livro> buscarPorCategoria(@RequestParam String nome) {
        return repository.findByCategoriaNome(nome);
    }
}