package net.tp3.etudiantcontrole.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentDto {
    private String name;
    private String email;
    private String dateNaissance;

}
