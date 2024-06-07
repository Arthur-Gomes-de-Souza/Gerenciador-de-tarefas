package com.teste.gerenciadortarefas.repository;

import com.teste.gerenciadortarefas.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}