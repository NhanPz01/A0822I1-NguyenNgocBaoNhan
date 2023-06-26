package com.example.validate_form_dang_ky.service.impl;

import com.example.validate_form_dang_ky.model.User;
import com.example.validate_form_dang_ky.repository.UserRepository;
import com.example.validate_form_dang_ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User add(User user) {
        return repository.save(user);
    }
}
