package io.zipcoder.crudapp.Controllers;
import io.zipcoder.crudapp.Models.Person;
import io.zipcoder.crudapp.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/people")
    public Person createPerson(Person p){
        return personRepository.save(p);
    }
    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable int id){
        return personRepository.findById(id);
    }
    @GetMapping("/people")
    public List<Person> getPersonList(){
        return personRepository.findAll();
    }
    @PutMapping("/people/{id}")
    public Person updatePerson(@PathVariable Person p, @PathVariable int id){
        return personRepository.save(p);
    }
    @DeleteMapping("/people/{id}")
    public void deletePerson(@PathVariable int id){
        personRepository.deleteById(id);
    }

}
