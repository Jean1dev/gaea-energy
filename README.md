# Projeto Acadêmico — Multi-módulo Java

Projeto desenvolvido para a disciplina de Tópicos 1, composto por quatro aplicações independentes que demonstram diferentes arquiteturas e tecnologias Java.

---

## Módulos

### 1. Backend API (`/backend`)
API RESTful de gerenciamento de produtos, construída com Spring Boot.

- **Tecnologias:** Spring Boot 2.1.5, Spring Data JPA, MySQL
- **Porta padrão:** `8090`
- **Endpoints:**
  - `GET /produtos` — Lista produtos com paginação
  - `GET /produtos/{id}` — Busca produto por ID
  - `POST /produtos` — Cadastra novo produto

### 2. WebRestaurante (`/WebRestaurante`)
Aplicação web para gerenciamento de restaurante.

- **Tecnologias:** JSF, PrimeFaces 8.0, EclipseLink (JPA), HSQLDB
- **Funcionalidades:** Cadastro de clientes, produtos, mesas, usuários e contas de clientes

### 3. WebPedidosMaven (`/WebPedidosMaven`)
Aplicação web de pedidos que consome a Backend API.

- **Tecnologias:** JSF, PrimeFaces, Maven, Apache HttpClient, Jackson
- **Funcionalidades:** Listagem e consulta de produtos via REST
- **Depende de:** Backend API rodando em `localhost:8090`

### 4. GaeaEnergy (`/GaeaEnergy`)
Aplicação desktop para gerenciamento de contas de energia.

- **Tecnologias:** Java Swing, HSQLDB
- **Funcionalidades:** Login de usuários, gerenciamento de faturas, controle de pagamentos, visualização de gráficos de consumo, cadastro de conta bancária e cartão de crédito

---

## Como executar

### Backend API
> Requer MySQL rodando em `localhost:3306` com banco de dados `mydb`.

```bash
cd backend
./mvnw spring-boot:run
```

Configuração em `src/main/resources/application.properties`:
```properties
server.port=8090
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=create
```

### WebPedidosMaven
> Requer a Backend API em execução.

```bash
cd WebPedidosMaven/WebPedidosMaven
mvn clean install
mvn tomcat7:run
```

### WebRestaurante e GaeaEnergy
Abrir no NetBeans e executar via `Clean and Build` → `Run`.
Ambos utilizam HSQLDB embutido — nenhuma configuração de banco de dados externa é necessária.

---

## Estrutura do repositório

```
├── backend/          # Spring Boot REST API
├── WebRestaurante/   # JSF — sistema de restaurante
├── WebPedidosMaven/  # JSF — sistema de pedidos (cliente da API)
└── GaeaEnergy/       # Swing — sistema de energia elétrica
```

---

## Requisitos

- Java 8+
- Maven 3+
- MySQL 5.7+ (apenas para o módulo Backend)
- NetBeans (recomendado para WebRestaurante e GaeaEnergy)
