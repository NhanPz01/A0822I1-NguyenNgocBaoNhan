package com.example.thimodule04.service;

import com.example.thimodule04.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
    public Page<Project> findAll(int page, int pageSize);
    public Project findById(String id);
    public Project add(Project project);
}
