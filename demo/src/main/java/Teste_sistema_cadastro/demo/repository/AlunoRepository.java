package Teste_sistema_cadastro.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import Teste_sistema_cadastro.demo.model.Aluno;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findByEmail(String email);
}
