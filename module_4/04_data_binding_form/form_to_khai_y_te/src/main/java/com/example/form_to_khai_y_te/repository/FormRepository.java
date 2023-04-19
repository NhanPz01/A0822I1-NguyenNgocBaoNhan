package com.example.form_to_khai_y_te.repository;

import com.example.form_to_khai_y_te.model.Form;
import com.example.form_to_khai_y_te.model.Person;

import java.util.List;

public interface FormRepository {
    List<Form> findAll();
    Form findById(int id);
    List<Form> findByPersonInfo(Person person);
    void add(Form form);
    void update(Form form);
}
