package com.teste.gerenciadortarefas.controller;

import com.teste.gerenciadortarefas.model.Comentario;
import com.teste.gerenciadortarefas.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> getAllComentarios() {
        return comentarioService.findAll();
    }

    @GetMapping("/{id}")
    public Comentario getComentarioById(@PathVariable Long id) {
        return comentarioService.findById(id);
    }

    @PostMapping
    public Comentario createComentario(@RequestBody Comentario comentario) {
        return comentarioService.save(comentario);
    }

    @PutMapping("/{id}")
    public Comentario updateComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        Comentario existingComentario = comentarioService.findById(id);
        if (existingComentario != null) {
            existingComentario.setConteudo(comentario.getConteudo());
            return comentarioService.save(existingComentario);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteComentario(@PathVariable Long id) {
        comentarioService.deleteById(id);
    }
}
