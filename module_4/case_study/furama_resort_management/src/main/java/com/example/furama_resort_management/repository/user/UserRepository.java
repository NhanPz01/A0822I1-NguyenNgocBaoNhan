package com.example.furama_resort_management.repository.user;

import com.example.furama_resort_management.model.user.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
    AppUser findByUsername(String username);
}
