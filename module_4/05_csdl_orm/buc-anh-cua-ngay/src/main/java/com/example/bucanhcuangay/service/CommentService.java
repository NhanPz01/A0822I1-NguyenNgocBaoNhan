package com.example.bucanhcuangay.service;


import com.example.bucanhcuangay.dto.CommentCreateDTO;
import com.example.bucanhcuangay.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    Comment findById(int id);
    Comment add(CommentCreateDTO commentDto);
}
