# 📚 Demo DAO JDBC

Projeto CRUD desenvolvido em Java utilizando JDBC puro, aplicando o padrão DAO (Data Access Object) para acesso ao banco de dados MySQL.

---

## 🚀 Objetivo

O objetivo deste projeto é demonstrar o funcionamento do JDBC na prática, aplicando:

- Conexão com banco de dados
- PreparedStatement
- ResultSet
- Tratamento de exceções
- Uso de RETURN_GENERATED_KEYS
- Integridade referencial (Foreign Key)
- Padrão DAO
- Separação em camadas

---

## 🛠 Tecnologias Utilizadas

- Java 17+
- JDBC
- MySQL
- Eclipse IDE

---

## 🗂 Estrutura do Projeto

```
src/
├── application
│   └── Program.java
│
├── model
│   ├── entities
│   │   ├── Department.java
│   │   └── Seller.java
│   │
│   └── dao
│       ├── DepartmentDao.java
│       ├── SellerDao.java
│       └── impl
│           ├── DepartmentDaoJDBC.java
│           └── SellerDaoJDBC.java
│
└── db
    ├── DB.java
    ├── DbException.java
    └── DbIntegrityException.java
```

---

## 🗄 Banco de Dados

É necessário criar o banco de dados antes de executar o projeto.

### Criar banco:

```sql
CREATE DATABASE coursejdbc;
USE coursejdbc;
```

### Tabela Department

```sql
CREATE TABLE department (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(60) NOT NULL
);
```

### Tabela Seller

```sql
CREATE TABLE seller (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(60) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    BirthDate DATE,
    BaseSalary DOUBLE,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```

---

## 🔎 Funcionalidades Implementadas

### Department

- ✔ findById
- ✔ findAll
- ✔ insert (com RETURN_GENERATED_KEYS)
- ✔ update
- ✔ deleteById

### Seller

- ✔ findById
- ✔ findByDepartment
- ✔ findAll
- ✔ insert
- ✔ update
- ✔ deleteById

---

## 🧠 Conceitos Praticados

- Padrão DAO
- Injeção de dependência manual via Factory
- Tratamento de exceções customizadas
- Integridade referencial no MySQL
- Boas práticas no fechamento de recursos JDBC

---

## ⚠️ Observação Importante

Ao tentar deletar um Department que possui Sellers associados, o banco impedirá a exclusão devido à restrição de chave estrangeira (Foreign Key).
Isso demonstra a aplicação da integridade referencial no banco de dados.

---

## ▶️ Como Executar

1. Configure o arquivo `db.properties` com suas credenciais do MySQL.
2. Execute a classe `Program.java`.
3. Utilize os métodos CRUD disponíveis para teste.

---

## 👨‍💻 Autor

Vinicios Pereira  
Estudante de Desenvolvimento de Software Multiplataforma
