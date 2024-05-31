package repository;

import model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepositoryJDBC {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                INSERT INTO CURSO (id, nome, autor) VALUES (?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
               DELETE FROM CURSO WHERE ID = ?;
            """;

    private static String SELECT_QUERY =
            """
               SELECT * FROM CURSO WHERE ID = ?;
            """;

    public void insert(Curso curso) {
        springJdbcTemplate.update(INSERT_QUERY, curso.getId(), curso.getNome(), curso.getAutor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Curso findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Curso.class), id);
    }

}
