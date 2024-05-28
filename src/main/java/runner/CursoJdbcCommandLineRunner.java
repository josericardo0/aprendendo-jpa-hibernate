package runner;

import model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.CursoRepositoryJDBC;

@Component
public class CursoJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CursoRepositoryJDBC repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Curso(1, "Filosofia", "Mário Sérgio Cortella"));
        repository.insert(new Curso(2, "Matemática", "Ledo Vaccaro"));
        repository.insert(new Curso(3, "Biologia", "Paulo Jubilu"));

        repository.deleteById(1);

    }
}
