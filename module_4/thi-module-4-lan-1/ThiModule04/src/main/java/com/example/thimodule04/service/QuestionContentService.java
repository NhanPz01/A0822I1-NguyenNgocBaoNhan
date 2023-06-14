package com.example.thimodule04.service;

import com.example.thimodule04.model.QuestionContent;
import com.example.thimodule04.repository.QuestionTypeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionContentService {
    Page<QuestionContent> findAll(int page, int pageSize);

    QuestionContent findById(int id);
    Page<QuestionContent> findByKeyWord(String keyword, Pageable pageable);

    QuestionContent add(QuestionContent content);

    QuestionContent update(int id, QuestionContent questionContent);

    void deleteById(int id);
}