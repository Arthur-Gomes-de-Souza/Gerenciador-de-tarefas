USE gerenciador_tarefas;

CREATE TABLE Comentario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    conteudo TEXT NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    tarefa_id INT,
    usuario_id INT,
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

INSERT INTO Comentario (conteudo, tarefa_id, usuario_id) VALUES
('Comentário sobre Tarefa 1', 1, 1),
('Outro comentário sobre Tarefa 1', 1, 2),
('Comentário sobre Tarefa 2', 2, 3);

SELECT * FROM comentario;