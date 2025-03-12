# Gerenciador de Pedidos

## Descrição
Este projeto tem como objetivo demonstrar o uso de **Spring Data JPA** para persistência de dados em um banco de dados **PostgreSQL**. O sistema gerencia informações sobre **produtos**, **categorias** e **pedidos**, e permite a criação, leitura e armazenamento de dados no banco.

O projeto foi desenvolvido como parte do curso **Java: Persistência de dados e consultas com Spring Data JPA** da Alura, e abrange conceitos fundamentais de **JPA (Java Persistence API)**, como **entidades**, **repositórios**, e **estratégias de geração de IDs**.

## Funcionalidades
- Criação e manipulação de entidades `Produto`, `Categoria` e `Pedido`.
- Persistência de dados utilizando **Spring Data JPA** e **PostgreSQL**.
- Testes de diferentes tipos de geração de IDs utilizando a anotação `@GeneratedValue`.
- Personalização de colunas no banco com a anotação `@Column`.

## Tecnologias
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok** (para redução de boilerplate code)
- **Maven** (gerenciamento de dependências)

## Como Rodar o Projeto

### 1. Clonar o Repositório
Clone este repositório para a sua máquina local:

```bash
git clone https://github.com/ViniciuSaeSouza/gerenciador-pedidos.git
```

### 2. Configurar o Banco de Dados
Crie um banco de dados PostgreSQL chamado `gerenciador-pedidos` e configure as credenciais no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gerenciador-pedidos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
```

### 3. Rodar o Projeto
Execute o projeto com o comando:

```bash
mvn spring-boot:run
```

Isso irá iniciar o servidor e, ao rodar o projeto, o **Spring Boot** irá criar as tabelas no banco de dados conforme as entidades definidas.

## Estrutura do Projeto

- **`src/main/java/com/alura/gerenciador/gerenciador_pedidos`**
  - **`model`**: Contém as entidades `Produto`, `Categoria` e `Pedido`.
  - **`repository`**: Contém os repositórios para acesso aos dados.
  - **`GerenciadorPedidosApplication.java`**: Classe principal que executa o projeto.
  
## Tarefas Realizadas
- Criação das entidades `Produto`, `Categoria` e `Pedido`.
- Configuração dos repositórios e persistência dos dados.
- Anotações de JPA utilizadas, como `@Entity`, `@Id`, `@GeneratedValue`, `@Column`, entre outras.
- Execução de testes e ajustes no processo de persistência.

## Contribuições
Contribuições são bem-vindas! Se você encontrar um erro ou tiver alguma sugestão, fique à vontade para abrir uma issue ou fazer um pull request.
