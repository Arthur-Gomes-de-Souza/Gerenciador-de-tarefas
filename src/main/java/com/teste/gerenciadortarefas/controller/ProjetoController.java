package com.teste.gerenciadortarefas.controller;

import com.teste.gerenciadortarefas.model.Projeto;
import com.teste.gerenciadortarefas.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> getAllProjetos() {
        return projetoService.findAll();
    }

    @GetMapping("/{id}")
    public Projeto getProjetoById(@PathVariable Long id) {
        return projetoService.findById(id);
    }

    @PostMapping
    public Projeto createProjeto(@RequestBody Projeto projeto) {
        return projetoService.save(projeto);
    }

    @PutMapping("/{id}")
    public Projeto updateProjeto(@PathVariable Long id, @RequestBody Projeto projeto) {
        Projeto existingProjeto = projetoService.findById(id);
        if (existingProjeto != null) {
            existingProjeto.setNome(projeto.getNome());
            existingProjeto.setDescricao(projeto.getDescricao());
            return projetoService.save(existingProjeto);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProjeto(@PathVariable Long id) {
        projetoService.deleteById(id);
    }
}
