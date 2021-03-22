package bstorm.akimts.demoSpring.metier;

import bstorm.akimts.demoSpring.data_access.repository.PersonneRepository;
import bstorm.akimts.demoSpring.dto.PersonneDTO;
import bstorm.akimts.demoSpring.entities.Personne;
import bstorm.akimts.demoSpring.mapper.Mapper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Profile("impl2")
public class PersonneServiceImpl2 implements PersonneService{

    private final PersonneRepository repo;
    private final Mapper<PersonneDTO, Personne> mapper;

    public PersonneServiceImpl2(PersonneRepository repo, Mapper<PersonneDTO, Personne> mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public void add(PersonneDTO toAdd) {
        repo.save(mapper.toEntity(toAdd));
    }

    @Override
    public List<PersonneDTO> getAll() {
        return repo.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
