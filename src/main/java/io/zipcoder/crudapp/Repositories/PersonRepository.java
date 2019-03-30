package io.zipcoder.crudapp.Repositories;

import io.zipcoder.crudapp.Models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    List<Person> findAll();
    Person findById(Integer id);
    Person save(Person p);
    Person deleteById(Integer id);
}
