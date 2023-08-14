package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.Project;
import com.example.thimodule04.repository.ProjectRepository;
import com.example.thimodule04.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    public ProjectRepository repository;
    @Override
    public Page<Project> findAll(int page, int pageSize) {
        return repository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Project findById(String id) {
        return repository.findProjectById(id);
    }

    @Override
    public Project add(Project project) {
        return repository.save(project);
    }
}
