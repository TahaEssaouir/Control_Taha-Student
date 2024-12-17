package net.tp3.etudiantcontrole.web;

import lombok.AllArgsConstructor;
import net.tp3.etudiantcontrole.dto.StudentDto;
import net.tp3.etudiantcontrole.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQlController {

private StudentService studentService;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student){
        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument String dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }


}
