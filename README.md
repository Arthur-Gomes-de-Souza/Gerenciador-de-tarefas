<h1>Gerenciador de Tarefas</h1>

## Descrição do Problema
Em ambientes corporativos e pessoais, a organização e gerenciamento de tarefas são essenciais para garantir a produtividade e eficiência. 
No entanto, a falta de uma ferramenta adequada para monitorar o progresso das tarefas, atribuí-las a indivíduos ou equipes específicas, 
definir prazos e prioridades, e comunicar-se eficazmente pode levar a confusão, atrasos e baixa produtividade.

## Solução Desenvolvida
Desenvolvemos um Sistema de Gerenciamento de Tarefas que atende às necessidades de organização e gerenciamento de atividades. Esta aplicação web permite:

- Gerenciar Usuários: Cadastro de usuários que podem ser responsáveis por tarefas.
- Gerenciar Projetos: Criação de projetos que agrupam tarefas relacionadas.
- Gerenciar Tarefas: Criação, atualização e exclusão de tarefas com informações detalhadas como título, descrição, datas de criação e vencimento, prioridade e status.
- Comentários: Adição de comentários nas tarefas para facilitar a comunicação e acompanhamento do progresso.

## Principais Funcionalidades

- Cadastro de Usuários: Permite a criação, atualização e exclusão de usuários no sistema.
- Cadastro de Projetos: Permite a criação, atualização e exclusão de projetos.
- Cadastro de Tarefas: Permite a criação, atualização e exclusão de tarefas, com a possibilidade de atribuí-las a usuários e projetos específicos.
- Comentários em Tarefas: Facilita a comunicação entre os membros da equipe, permitindo a adição de comentários nas tarefas.
- Acompanhamento do Progresso: Monitora o status das tarefas (por exemplo, pendente, em andamento, concluída).

## Tecnologias Utilizadas

- Back-end: Desenvolvido em Java utilizando o framework Spring Boot.
- Banco de Dados: MySQL para armazenamento persistente dos dados.
- JPA/Hibernate: Para mapeamento objeto-relacional e manipulação dos dados no banco de dados.
- REST API: Para comunicação entre o front-end e o back-end.

## Estrutura do Projeto

- Modelo (Model): Contém as entidades que representam as tabelas do banco de dados.
- Repositório (Repository): Interfaces que definem a comunicação com o banco de dados.
- Serviço (Service): Contém a lógica de negócios da aplicação.
- Controlador (Controller): Endpoints REST que expõem as funcionalidades da aplicação.

## Instruções para Configuração e Execução

1. Clone o Repositório: <br>
```
git clone https://github.com/seu-usuario/sistema-gerenciamento-tarefas.git 
cd sistema-gerenciamento-tarefas
```

2. Configure o banco de dados:
* Crie um banco de dados no MySQL.
* Atualize o arquivo "src/main/resources/application.properties" com as informações do seu banco de dados.

3. Execute a Aplicação:
 ```
 mvn spring-boot:run
 ```

4. Acesse a API:

   - A aplicação estará disponível em "http://localhost:8080".
  
## Autores

- Arthur Gomes de Souza.
- Arthur Reis da Silva.
- Gabriel da Silva Durães.
- Luiz Roberto Silva Cabral.
