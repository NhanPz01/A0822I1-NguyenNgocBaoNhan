package com.example.bucanhcuangay.service.impl;

import com.example.bucanhcuangay.dto.CommentCreateDTO;
import com.example.bucanhcuangay.model.Comment;
import com.example.bucanhcuangay.repository.CommentRepository;
import com.example.bucanhcuangay.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository repository;
    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public Comment findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Comment add(CommentCreateDTO commentDto) {
        if (commentDto.getContent().isEmpty()) {
            return null;
        }
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDto, comment);
        comment.setCommentedDate(new Date());
        return repository.save(comment);
    }
}
