package com.example.thimodule04.repository;

import com.example.thimodule04.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    public Project findProjectById(String id);
}
