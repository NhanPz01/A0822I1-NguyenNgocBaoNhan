package com.example.furama_resort_management.repository.user;

import com.example.furama_resort_management.model.user.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<AppRole, Integer> {
    AppRole findByRoleName(String roleName);
}
