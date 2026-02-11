package Teste_sistema_cadastro.demo.service;

import Teste_sistema_cadastro.demo.model.Aluno;
import Teste_sistema_cadastro.demo.repository.AlunoRepository;

@org.springframework.stereotype.Service
public class Service {
    public void validarECadastrar(String nome, String email, String senha, String faculdade) {
        // 1. Validação simples: campos vazios
        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || faculdade.isEmpty()) {
            throw new IllegalArgumentException("Todos os campos são obrigatórios!");
        }

        // 2. Validação de formato de e-mail (básica)
        if (!email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }

        // 3. Simulação de salvamento
        System.out.println("Aluno cadastrado: " + nome + " da faculdade " + faculdade);


    }

    public boolean validarLogin(String email, String senha) {
        return email.equals("admin@email.com") && senha.equals("12345");
    }

    private final AlunoRepository repository;

    // Construtor para o Spring injetar o Repository
    public Service(AlunoRepository repository) {
        this.repository = repository;
    }

    public void salvarAluno(String nome, String email, String senha, String faculdade) {
        if (repository.findByEmail(email).isPresent()) {
            throw new RuntimeException("Este e-mail já está cadastrado!");
        }
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setSenha(senha);
        aluno.setFaculdade(faculdade);
        repository.save(aluno);
    }

}