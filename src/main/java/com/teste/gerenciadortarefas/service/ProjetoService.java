package com.teste.gerenciadortarefas.service;

import com.teste.gerenciadortarefas.model.Projeto;
import com.teste.gerenciadortarefas.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    public Projeto save(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public Projeto findById(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        projetoRepository.deleteById(id);
    }
}
