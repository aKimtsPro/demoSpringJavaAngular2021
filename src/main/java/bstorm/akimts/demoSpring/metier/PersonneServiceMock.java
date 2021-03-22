package bstorm.akimts.demoSpring.metier;

import bstorm.akimts.demoSpring.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Profile("mock")
public class PersonneServiceMock implements PersonneService{
    @Override
    public void add(PersonneDTO toAdd) {

    }

    @Override
    public List<PersonneDTO> getAll() {
        return Arrays.asList(
                PersonneDTO.builder()
                        .nom("luc")
                        .age(58)
                        .build(),
                PersonneDTO.builder()
                        .nom("marie")
                        .age(24)
                        .build()
        );
    }
}
