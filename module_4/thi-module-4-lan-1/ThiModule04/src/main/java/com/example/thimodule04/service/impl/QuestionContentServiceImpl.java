package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.QuestionContent;
import com.example.thimodule04.repository.QuestionContentRepository;
import com.example.thimodule04.service.QuestionContentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionContentServiceImpl implements QuestionContentService {
    @Autowired
    private QuestionContentRepository questionContentRepository;
    @Override
    public Page<QuestionContent> findAll(int page, int pageSize) {
        return questionContentRepository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public QuestionContent findById(int id) {
        return questionContentRepository.findById(id).orElse(null);
    }

    @Override
    public Page<QuestionContent> findByKeyWord(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public QuestionContent add(QuestionContent content) {
        if (content.getTitle() == null || content.getTitle().isEmpty())
            return null;
        if (content.getContent() == null || content.getContent().isEmpty())
            return null;
        return questionContentRepository.save(content);
    }

    @Override
    public QuestionContent update(int id, QuestionContent questionContent) {
        QuestionContent fromDB = questionContentRepository.findById(id).orElse(null);
        if (fromDB == null)
            return null;
        BeanUtils.copyProperties(questionContent, fromDB);
        return questionContentRepository.save(fromDB);
    }

    @Override
    public void deleteById(int id) {
        questionContentRepository.deleteById(id);
    }
}
