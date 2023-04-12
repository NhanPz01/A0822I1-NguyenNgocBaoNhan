package com.example.demo_pbl3.repository;

import com.example.demo_pbl3.model.UserManager;
import org.springframework.context.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserManager, String>{
	@Query("SELECT u FROM UserManager u WHERE u.username = ?1")
	UserManager findByUsername(String username);
}
