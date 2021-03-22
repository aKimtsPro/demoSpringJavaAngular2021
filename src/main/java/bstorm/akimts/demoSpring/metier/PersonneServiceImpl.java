package bstorm.akimts.demoSpring.metier;

import bstorm.akimts.demoSpring.dto.PersonneDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("impl")
public class PersonneServiceImpl implements PersonneService {

    private final List<PersonneDTO> personneList = new ArrayList<>();

    @Override
    public void add(PersonneDTO toAdd) {
        personneList.add(toAdd);
    }

    @Override
    public List<PersonneDTO> getAll() {
        return new ArrayList<>(personneList);
    }
}
