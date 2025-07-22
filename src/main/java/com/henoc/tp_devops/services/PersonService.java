package com.henoc.tp_devops.services;

import com.henoc.tp_devops.models.Person;
import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();
    Person getPersonById(Long id);
    Person getPersonByTel(String tel);
    Person createPerson(Person p);
    void deletePerson(Long id);
}
