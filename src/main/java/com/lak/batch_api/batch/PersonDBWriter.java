package com.lak.batch_api.batch;

import com.lak.batch_api.model.Person;
import com.lak.batch_api.repo.PersonRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonDBWriter implements ItemWriter<Person> {

    @Autowired
    private PersonRepository personRepository;


    @Override
    public void write(List<? extends Person> person) throws Exception {

        System.out.println("Data Saved for Persons: "+person);
        personRepository.saveAll(person);
    }
}
