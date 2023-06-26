package com.example.furama_resort_management.service.impl;

import com.example.furama_resort_management.model.user.AppRole;

import java.util.List;

public interface RoleService {
    List<AppRole> findAll();
    AppRole findByRoleName(String roleName);
}
