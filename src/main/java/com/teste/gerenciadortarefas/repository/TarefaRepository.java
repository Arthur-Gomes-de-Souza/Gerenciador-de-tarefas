package com.teste.gerenciadortarefas.repository;

import com.teste.gerenciadortarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}