package net.tp3.etudiantcontrole.mapper;

import net.tp3.etudiantcontrole.dao.entities.Student;
import net.tp3.etudiantcontrole.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }
}
