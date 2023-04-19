package com.example.form_to_khai_y_te.service;

import com.example.form_to_khai_y_te.model.Person;
import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
    Person findById(int id);
    List<Person> findByName(String name);
    void add(Person person);
    void update(Person person);
}
