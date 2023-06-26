package com.example.furama_resort_management.service;

import com.example.furama_resort_management.dto.UserDTO;
import com.example.furama_resort_management.model.user.AppUser;

import java.util.List;

public interface UserService {
    List<AppUser> findAll();
    AppUser findByUsername(String username);
    AppUser add(UserDTO userDTO);
}
