package com.lak.batch_api.repo;

import com.lak.batch_api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
