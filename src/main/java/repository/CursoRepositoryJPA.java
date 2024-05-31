package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.Curso;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CursoRepositoryJPA {

    @PersistenceContext
    private EntityManager entityManager;

    public CursoRepositoryJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Curso curso) {
        entityManager.persist(curso);
    }

    public Curso findById(long id) {
        return entityManager.find(Curso.class, id);
    }

    public void deleteById(long id) {
        Curso curso = entityManager.find(Curso.class, id);
        if (curso != null) {
            entityManager.remove(curso);
        }
    }
}
