package com.example.blog_update.repository;

import com.example.blog_update.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
