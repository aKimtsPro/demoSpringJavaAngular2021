package bstorm.akimts.demoSpring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class PersonneDTO {

    private Long id;
    private String nom;
    private int age;

}
