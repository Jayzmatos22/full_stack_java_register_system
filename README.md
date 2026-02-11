# <p align="center">🚀 Sistema Full Stack de Cadastro de Alunos</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="JPA">
  <img src="https://img.shields.io/badge/H2_Database-004B8D?style=for-the-badge&logo=databricks&logoColor=white" alt="H2">
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5">
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3">
</p>

---

## 📝 Sobre o Projeto
Este é um sistema **Full Stack** robusto desenvolvido para gerenciar o cadastro de alunos. O projeto utiliza o padrão de arquitetura **MVC (Model-View-Controller)** para separar as responsabilidades e garantir uma manutenção facilitada.


## 🛠️ Tecnologias e Ferramentas

### **Back-end (O Motor)**
* **Java 21**: Utilização das versões mais recentes para alta performance.
* **Spring Boot 4.0.2**: Base do ecossistema para configuração automática e servidor embutido.
* **Spring Data JPA**: Abstração da camada de persistência para manipulação eficiente do banco de dados.
* **Lombok**: Utilizado no `Model` para automação de Getters, Setters e Construtores, mantendo o código limpo.

### **Front-end (A Interface)**
* **Thymeleaf**: Motor de templates para renderização dinâmica de dados no HTML.
* **HTML5/CSS3**: Estrutura e estilização das páginas de cadastro e sucesso.

### **Persistência**
* **H2 Database**: Banco de dados em memória para agilidade no desenvolvimento.

---

## 🏗️ Estrutura de Pastas
A organização segue o padrão recomendado pela comunidade Spring:
* `controller/`: Gerenciamento de rotas e requisições HTTP.
* `model/`: Entidades mapeadas com JPA e Lombok.
* `repository/`: Interfaces que estendem `JpaRepository` para acesso ao banco.
* `service/`: Camada de lógica de negócio (ex: validação de e-mail único).


---

## 🚀 Como Executar
1. Certifique-se de ter o **JDK 21** e o **Maven** instalados.
2. Clone o repositório.
3. No IntelliJ, clique com o botão direito no `pom.xml` e selecione **"Add as Maven Project"** para baixar as dependências.
4. Execute a classe `CadastroFsApplication.java`.
5. Acesse `http://localhost:8080`.

---

## 🌟 Diferenciais
* **Validação de E-mail**: O sistema consulta o `AlunoRepository` antes de salvar para evitar duplicidade.
* **Clean Code**: Uso de injeção de dependência via construtor e código sem "boilerplate" graças ao Lombok.
* **Arquitetura Escalável**: Pronto para migrar de H2 para MySQL/PostgreSQL apenas alterando o `application.properties`.

---
## 🖼️ Interface do Sistema

![visual_teste.png](demo/src/main/resources/static/img/visual_teste.png)

---
### 👤 Autor
Desenvolvido por **Jailton Santos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](http://www.linkedin.com/in/jailton-santos-b149752a0)


## 🏗️ Estrutura do Projeto

### 📂 Hierarquia de Pastas
```text
demo/
├── .mvn/wrapper/
│   └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── Teste_sistema_cadastro/demo/
│   │   │       ├── controller/
│   │   │       │   └── Controller.java      <-- Gestão de rotas HTTP
│   │   │       ├── model/
│   │   │       │   └── Aluno.java           <-- Entidade mapeada com JPA/Lombok
│   │   │       ├── repository/
│   │   │       │   └── AlunoRepository.java <-- Interface de persistência (JPA)
│   │   │       ├── service/
│   │   │       │   └── Service.java         <-- Regras de negócio e validação
│   │   │       └── CadastroFsApplication.java <-- Ponto de entrada da aplicação
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── styles.css           <-- Estilização do frontend
│   │       │   └── img/
│   │       │       └── academy.jpeg         <-- Assets visuais
│   │       ├── templates/
│   │       │   ├── index.html               <-- Formulário de cadastro
│   │       │   └── login_sucesso.html       <-- Página de confirmação
│   │       └── application.properties       <-- Configurações do sistema/banco
└── test/                                    <-- Testes automatizados