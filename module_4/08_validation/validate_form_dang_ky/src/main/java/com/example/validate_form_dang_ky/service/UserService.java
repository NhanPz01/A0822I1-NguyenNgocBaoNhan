package com.example.validate_form_dang_ky.service;

import com.example.validate_form_dang_ky.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    User add(User user);
}
