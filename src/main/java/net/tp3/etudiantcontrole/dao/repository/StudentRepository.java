package net.tp3.etudiantcontrole.dao.repository;

import net.tp3.etudiantcontrole.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    public List<Student> getStudentByDateNaissance(String dateNaissance);
}
