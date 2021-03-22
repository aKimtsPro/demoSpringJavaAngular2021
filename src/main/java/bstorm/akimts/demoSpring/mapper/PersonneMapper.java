package bstorm.akimts.demoSpring.mapper;

import bstorm.akimts.demoSpring.entities.Personne;
import bstorm.akimts.demoSpring.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("impl2")
public class PersonneMapper implements Mapper<PersonneDTO, Personne> {
    @Override
    public PersonneDTO toDTO(Personne personne) {
        return PersonneDTO.builder()
                .nom(personne.getNom())
                .age(personne.getAge())
                .id(personne.getId())
                .build();
    }

    @Override
    public Personne toEntity(PersonneDTO dto) {
        return Personne.builder()
                .nom(dto.getNom())
                .age(dto.getAge())
                .id(dto.getId())
                .build();
    }
}
