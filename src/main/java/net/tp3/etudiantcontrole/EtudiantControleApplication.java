package net.tp3.etudiantcontrole;

import net.tp3.etudiantcontrole.dao.entities.Student;
import net.tp3.etudiantcontrole.dao.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EtudiantControleApplication {
@Autowired
private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(EtudiantControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start() {
        return args -> {
            List<Student> students = List.of(
                    Student.builder()
                            .name("Taha")
                            .email("taha@gmail.com")
                            .dateNaissance("23-09-2002")
                            .build(),
                    Student.builder()
                            .name("Fk")
                            .email("fk@gmail.com")
                            .dateNaissance("12-06-2002")
                            .build(),
                    Student.builder()
                            .name("AB")
                            .email("Ab@gmail.com")
                            .dateNaissance("23-09-2000")
                            .build(),
                    Student.builder()
                            .name("JB")
                            .email("JB@gmail.com")
                            .dateNaissance("10-08-2002")
                            .build()
            );
            studentRepository.saveAll(students);
        };
    }
}
