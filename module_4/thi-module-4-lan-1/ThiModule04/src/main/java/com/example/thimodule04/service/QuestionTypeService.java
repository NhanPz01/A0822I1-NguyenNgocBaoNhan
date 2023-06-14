package com.example.thimodule04.service;

import com.example.thimodule04.model.QuestionType;

import java.util.List;

public interface QuestionTypeService {
    List<QuestionType> findAll();
    QuestionType findById(int id);
}
