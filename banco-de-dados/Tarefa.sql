USE gerenciador_tarefas;

CREATE TABLE Tarefa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    data_vencimento TIMESTAMP,
    prioridade VARCHAR(50),
    status VARCHAR(50),
    usuario_id INT,
    projeto_id INT,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id),
    FOREIGN KEY (projeto_id) REFERENCES Projeto(id)
);

INSERT INTO Tarefa (titulo, descricao, data_vencimento, prioridade, status, usuario_id, projeto_id) VALUES
('Tarefa 1', 'Descrição da Tarefa 1', '2024-06-10 12:00:00', 'Alta', 'Pendente', 1, 1),
('Tarefa 2', 'Descrição da Tarefa 2', '2024-06-15 12:00:00', 'Média', 'Em Progresso', 2, 1),
('Tarefa 3', 'Descrição da Tarefa 3', '2024-06-20 12:00:00', 'Baixa', 'Concluída', 3, 2);

SELECT * FROM Tarefa;