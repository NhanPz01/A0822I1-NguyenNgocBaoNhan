package com.example.form_to_khai_y_te.repository;


import com.example.form_to_khai_y_te.model.Form;
import com.example.form_to_khai_y_te.model.Person;

import java.util.ArrayList;
import java.util.List;

public class FormRepositoryImpl implements FormRepository {
    private List<Form> forms;

    public FormRepositoryImpl() {
        forms = new ArrayList<>();
        forms.add(new Form(1, new Person()));
    }

    @Override
    public List<Form> findAll() {
        return null;
    }

    @Override
    public Form findById(int id) {
        return null;
    }

    @Override
    public List<Form> findByPersonInfo(Person person) {
        return null;
    }


    @Override
    public void add(Form form) {

    }

    @Override
    public void update(Form form) {

    }
}
