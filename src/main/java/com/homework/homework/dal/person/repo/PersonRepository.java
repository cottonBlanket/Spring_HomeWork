package com.homework.homework.dal.person.repo;

import com.homework.homework.dal.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByUsername(String username);
}
