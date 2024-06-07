package com.teste.gerenciadortarefas.controller;

import com.teste.gerenciadortarefas.model.Tarefa;
import com.teste.gerenciadortarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> getAllTarefas() {
        return tarefaService.findAll();
    }

    @GetMapping("/{id}")
    public Tarefa getTarefaById(@PathVariable Long id) {
        return tarefaService.findById(id);
    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.save(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa updateTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa existingTarefa = tarefaService.findById(id);
        if (existingTarefa != null) {
            existingTarefa.setTitulo(tarefa.getTitulo());
            existingTarefa.setDescricao(tarefa.getDescricao());
            existingTarefa.setDataVencimento(tarefa.getDataVencimento());
            existingTarefa.setPrioridade(tarefa.getPrioridade());
            existingTarefa.setStatus(tarefa.getStatus());
            return tarefaService.save(existingTarefa);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteById(id);
    }
}
