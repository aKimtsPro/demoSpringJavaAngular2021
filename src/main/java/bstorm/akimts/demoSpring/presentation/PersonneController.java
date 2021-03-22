package bstorm.akimts.demoSpring.presentation;

import bstorm.akimts.demoSpring.dto.PersonneDTO;
import bstorm.akimts.demoSpring.metier.PersonneService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pers")
@Profile("impl2")
public class PersonneController {

    private final PersonneService service;

    public PersonneController(PersonneService service) {
        this.service = service;
    }

    @PostMapping // POST - localhost:9001/pers
    public void insert(@RequestBody PersonneDTO personneDTO){
        service.add(personneDTO);
    }

    @GetMapping // GET - localhost:9001/pers
    public List<PersonneDTO> getAll(){
        return service.getAll();
    }
}
