
package com.henoc.tp_devops.services;
import com.henoc.tp_devops.dao.PersonDAO;
import com.henoc.tp_devops.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO dao;

    @Override
    public List<Person> getAllPersons() {
        return dao.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Person getPersonByTel(String tel) {
        return dao.findByTel(tel);
    }

    @Override
    public Person createPerson(Person p) {
        return dao.save(p);
    }

    @Override
    public void deletePerson(Long id) {
        dao.deleteById(id);
    }
}
