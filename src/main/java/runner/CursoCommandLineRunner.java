package runner;

import model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.CursoRepositoryJPA;
import repository.CursoSpringDataJPARepository;

@Component
public class CursoCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CursoRepositoryJPA repository;

    @Autowired
    private CursoSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Curso("Filosofia", "Mário Sérgio Cortella"));
        repository.save(new Curso("Matemática", "Ledo Vaccaro"));
        repository.save(new Curso("Biologia", "Paulo Jubilu"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAutor("Ledo Vaccaro"));
        System.out.println(repository.findByNome("Biologia"));



    }
}
