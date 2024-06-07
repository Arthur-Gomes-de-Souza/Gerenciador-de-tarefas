package com.teste.gerenciadortarefas.repository;

import com.teste.gerenciadortarefas.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}