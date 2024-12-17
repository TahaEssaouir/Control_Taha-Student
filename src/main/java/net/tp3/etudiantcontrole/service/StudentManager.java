package net.tp3.etudiantcontrole.service;

import lombok.AllArgsConstructor;
import net.tp3.etudiantcontrole.dao.entities.Student;
import net.tp3.etudiantcontrole.dao.repository.StudentRepository;
import net.tp3.etudiantcontrole.dto.StudentDto;
import net.tp3.etudiantcontrole.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class StudentManager implements StudentService{

 private StudentRepository studentRepository;
 private StudentMapper studentMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto = studentMapper.fromStudentToStudentDto(student);
        return studentDto;

    }

    @Override
    public List<StudentDto> getStudentByDateNaissance(String dateNaissance) {
        List<Student> students = studentRepository.getStudentByDateNaissance(dateNaissance);
        List<StudentDto> StudentDto = new ArrayList<>();
        for (Student student : students) {
            StudentDto.add(studentMapper.fromStudentToStudentDto(student));
        }
        return StudentDto;
    }
}
