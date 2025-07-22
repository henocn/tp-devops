package com.henoc.tp_devops.dao;

import com.henoc.tp_devops.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person, Long> {
    Person findByTel(String tel);
}
