package repository;


import model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoSpringDataJPARepository extends JpaRepository<Curso, Long> {

    List<Curso> findByAutor(String autor);
    List<Curso> findByNome(String nome);
}
