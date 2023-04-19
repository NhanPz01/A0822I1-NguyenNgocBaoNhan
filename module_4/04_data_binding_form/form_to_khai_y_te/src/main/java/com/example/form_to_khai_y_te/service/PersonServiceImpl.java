package com.example.form_to_khai_y_te.service;

import com.example.form_to_khai_y_te.model.Person;
import com.example.form_to_khai_y_te.repository.PersonRepository;
import com.example.form_to_khai_y_te.repository.PersonRepositoryImpl;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository = new PersonRepositoryImpl();

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(int id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public void add(Person person) {
        personRepository.add(person);
    }

    @Override
    public void update(Person person) {
        personRepository.update(person);
    }
}
