Bem-vindo ao repositório do projeto de Pedido de Compras desenvolvido em Java utilizando Spring Boot e JPA com banco de dados H2! Este projeto exemplifica a criação de uma aplicação web para gerenciamento de pedidos de compras, incluindo funcionalidades de CRUD (Create, Read, Update, Delete).

Descrição do Projeto
Este projeto visa demonstrar como construir uma aplicação web robusta usando Spring Boot e JPA. As principais funcionalidades incluem:

Spring Boot: Framework para simplificar a configuração e o desenvolvimento de aplicações Java.
JPA (Java Persistence API): Abstração para o mapeamento objeto-relacional.
Hibernate: Implementação do JPA.
H2 Database: Banco de dados em memória para facilitar o desenvolvimento e testes.
RESTful API: Criação de endpoints para operações CRUD.
Validação de Dados: Validação de dados de entrada usando anotações.
Tratamento de Exceções: Gerenciamento de erros de forma centralizada.
Documentação com Swagger: Geração automática da documentação da API.
Estrutura do Repositório
O repositório está organizado da seguinte maneira:

css
Copiar código
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── projeto
│   │   │           ├── controller
│   │   │           ├── exception
│   │   │           ├── model/entity
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── ProjetoApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── projeto
├── .gitignore
├── README.md
└── pom.xml

src/main/java/com/projeto: Contém o código-fonte da aplicação.

controller: Controladores REST que expõem os endpoints da API.

exception: Classes para tratamento de exceções personalizadas.

model: Entidades JPA que representam os modelos de dados.

repository: Interfaces de repositório para acesso aos dados.

service: Lógica de negócios e manipulação dos dados.

ProjetoApplication.java: Classe principal que inicia a aplicação Spring Boot.

src/main/resources: Arquivos de configuração e scripts SQL.

application.properties: Configurações da aplicação, incluindo as configurações do banco de dados H2.

data.sql: Script para popular o banco de dados com dados iniciais.

src/test/java/com/projeto: Testes unitários e de integração.

.gitignore: Arquivo para especificar quais arquivos devem ser ignorados pelo Git.

README.md: Documentação do projeto.

pom.xml: Arquivo de configuração do Maven.
