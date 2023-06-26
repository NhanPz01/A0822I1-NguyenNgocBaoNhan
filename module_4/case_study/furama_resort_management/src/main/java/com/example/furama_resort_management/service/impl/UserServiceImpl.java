package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.dto.UserDTO;
import com.example.furama_resort_management.model.user.AppRole;
import com.example.furama_resort_management.model.user.AppUser;
import com.example.furama_resort_management.repository.user.RoleRepository;
import com.example.furama_resort_management.repository.user.UserRepository;
import com.example.furama_resort_management.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;
    @Override
    public List<AppUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public AppUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public AppUser add(UserDTO userDTO) {
        AppUser user = new AppUser();
        BeanUtils.copyProperties(userDTO, user);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        AppRole role = roleRepository.findByRoleName("ADMIN");
        if (role == null) {
            role = checkRoleExist();
        }
        user.setAppRoles(Collections.singletonList(role));
        return userRepository.save(user);
    }

    private AppRole checkRoleExist(){
        AppRole role = new AppRole();
        role.setRoleName("ADMIN");
        return roleRepository.save(role);
    }
}
