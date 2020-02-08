package org.dailycodebuffer;

import io.quarkus.panache.common.Sort;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController

public class ExampleResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @PostMapping("/person")
    @Transactional
    public void addPerson(Person person)
    {
        Person.persist(person);
    }

    @GetMapping("/person")
    public List<Person> getPeople()
    {
        return Person.listAll(Sort.by("firstName").and("lastName").ascending());
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id") long id)
    {
        return Person.findById(id);
    }

    @DeleteMapping("/person/{id}")
    @Transactional
    public void deletePerson(@PathVariable("id") long id)
    {
        Person.delete("id",id);
    }

    @GetMapping("/person/name/{name}")
    public List<Person> getPersonWithFirstName(@PathVariable("name") String name)
    {
        return Person.getPersonByFirstName(name);
    }

    @GetMapping("/person/name/{name}/{lname}")
    public List<Person> getPersonWithFirstNameandLastName(@PathVariable("name") String name, @PathVariable("lname") String lname)
    {
        return Person.getPersonByFirstNameandLastName(name,lname);
    }

}