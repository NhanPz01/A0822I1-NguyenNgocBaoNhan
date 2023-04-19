package com.example.form_to_khai_y_te.service;

import com.example.form_to_khai_y_te.model.Form;
import com.example.form_to_khai_y_te.model.Person;

import java.util.List;

public interface FormService {
    List<Form> findAll();

    Form findById(int id);
    List<Form> findByPersonInfo(Person person);
    void add(Form form);
    void update(Form form);
}
