package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.QuestionType;
import com.example.thimodule04.repository.QuestionTypeRepository;
import com.example.thimodule04.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    private QuestionTypeRepository repository;
    @Override
    public List<QuestionType> findAll() {
        return repository.findAll();
    }

    @Override
    public QuestionType findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
