USE gerenciador_tarefas;

CREATE TABLE Projeto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Projeto (nome, descricao) VALUES
('Projeto A', 'Descrição do Projeto A'),
('Projeto B', 'Descrição do Projeto B');

SELECT * FROM Projeto;