package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.user.AppRole;
import com.example.furama_resort_management.repository.user.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository repository;
    @Override
    public List<AppRole> findAll() {
        return repository.findAll();
    }

    @Override
    public AppRole findByRoleName(String roleName) {
        return repository.findByRoleName(roleName);
    }
}
