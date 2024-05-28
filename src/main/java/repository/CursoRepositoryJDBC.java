package repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CursoRepositoryJDBC {
    private JdbcTemplate springJdbcTemplate;
}
