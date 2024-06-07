package com.teste.gerenciadortarefas.repository;

import com.teste.gerenciadortarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}