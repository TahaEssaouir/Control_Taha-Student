package net.tp3.etudiantcontrole.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor @NoArgsConstructor @ToString @Setter @Getter @Builder

public class Student {
    @Id
    @GeneratedValue
    private int id_Student;
    private String name;
    private String email;
    private String dateNaissance;
}
