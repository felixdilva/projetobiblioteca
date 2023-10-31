package ifrn.pi.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

 import ifrn.pi.biblioteca.models.livro;

public interface livroRepository extends JpaRepository<livro, Long> {

}
