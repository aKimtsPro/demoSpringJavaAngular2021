package bstorm.akimts.demoSpring.metier;

import bstorm.akimts.demoSpring.dto.PersonneDTO;

import java.util.List;

public interface PersonneService {

    void add(PersonneDTO toAdd);
    List<PersonneDTO> getAll();

}
