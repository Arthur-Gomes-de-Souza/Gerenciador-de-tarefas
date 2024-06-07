CREATE DATABASE gerenciador_tarefas;
USE gerenciador_tarefas;

CREATE TABLE Usuario (
    id 	INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(100) NOT NULL
);

INSERT INTO Usuario (nome, email, senha) VALUES
('Alice', 'alice@example.com', 'senha123'),
('Bob', 'bob@example.com', 'senha123'),
('Carol', 'carol@example.com', 'senha123');

SELECT * FROM Usuario;