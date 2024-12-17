package net.tp3.etudiantcontrole.service;

import net.tp3.etudiantcontrole.dto.StudentDto;

import java.util.List;


public interface StudentService {
    public StudentDto saveStudent(StudentDto studentDto);

    public List<StudentDto> getStudentByDateNaissance(String dateNaissance);
}
