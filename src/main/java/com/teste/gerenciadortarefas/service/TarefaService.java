package com.teste.gerenciadortarefas.service;

import com.teste.gerenciadortarefas.model.Tarefa;
import com.teste.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa save(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public Tarefa findById(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        tarefaRepository.deleteById(id);
    }
}
