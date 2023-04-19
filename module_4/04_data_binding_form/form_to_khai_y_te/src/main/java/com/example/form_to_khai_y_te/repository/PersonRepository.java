package com.example.form_to_khai_y_te.repository;

import com.example.form_to_khai_y_te.model.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> findAll();
    Person findById(int id);
    List<Person> findByName(String name);
    void add(Person person);
    void update(Person person);
}
