package repository;


import model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoSpringDataJPARepository extends JpaRepository<Curso, Long> {

    List<Curso> findByAutor(String autor);
    List<Curso> findByNome(String nome);
}
