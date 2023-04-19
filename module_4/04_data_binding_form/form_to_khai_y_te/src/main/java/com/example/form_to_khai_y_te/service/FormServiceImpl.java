package com.example.form_to_khai_y_te.service;

import com.example.form_to_khai_y_te.model.Form;
import com.example.form_to_khai_y_te.model.Person;
import com.example.form_to_khai_y_te.repository.FormRepository;
import com.example.form_to_khai_y_te.repository.FormRepositoryImpl;

import java.util.List;

public class FormServiceImpl implements FormService {
    private FormRepository formRepository = new FormRepositoryImpl();
    @Override
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Override
    public Form findById(int id) {
        return formRepository.findById(id);
    }

    @Override
    public List<Form> findByPersonInfo(Person person) {
        return formRepository.findByPersonInfo(person);
    }

    @Override
    public void add(Form form) {
        formRepository.add(form);
    }

    @Override
    public void update(Form form) {
        formRepository.update(form);
    }
}
