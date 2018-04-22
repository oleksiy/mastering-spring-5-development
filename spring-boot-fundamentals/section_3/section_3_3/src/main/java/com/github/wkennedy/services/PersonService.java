package com.github.wkennedy.services;

import com.github.wkennedy.dto.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");

        Person person2 = new Person();
        person2.setFirstName("Jane");
        person2.setLastName("Doe");

        Person person3 = new Person();
        person3.setFirstName("Alex");
        person3.setLastName("Alex");

        personList.add(person);
        personList.add(person2);
        personList.add(person3);

        return personList;
    }
}
