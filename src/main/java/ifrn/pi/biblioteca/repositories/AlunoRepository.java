package ifrn.pi.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.biblioteca.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
