package com.jsp.pa.person_aadhaar_springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService  personService;
	
    @PostMapping("/{aid}")
    public Person savePerson(@RequestBody Person person, @PathVariable int aid) {
        return personService.savePerson(person, aid);
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAllPersons();
    }

    @PutMapping("/{aid}")
    public Person update(@RequestBody Person person, @PathVariable int aid) {
        return personService.updatePerson(person, aid);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        personService.deletePerson(id);
    }
}


