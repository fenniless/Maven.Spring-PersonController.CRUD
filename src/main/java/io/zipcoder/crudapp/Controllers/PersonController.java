package io.zipcoder.crudapp.Controllers;

import io.zipcoder.crudapp.Models.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @PostMapping("/people")
    public Person createPerson(Person p){
        return new Person();
    }
    @GetMapping("/people/{id}")
    public Person getPerson(int id){
        return null;
    }
    @GetMapping("/people")
    public List<Person> getPersonList(){
        return null;
    }
    @PutMapping("/people/{id}")
    public Person updatePerson(Person p){
        return null;
    }
    @DeleteMapping("/people/{id}")
    public void deletePerson(int id){

    }

}
