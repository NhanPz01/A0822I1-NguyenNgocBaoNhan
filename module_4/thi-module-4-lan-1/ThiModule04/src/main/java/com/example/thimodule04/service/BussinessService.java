package com.example.thimodule04.service;

import com.example.thimodule04.model.Bussiness;
import com.example.thimodule04.repository.BussinessRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BussinessService {
    public List<Bussiness> findAll();
    public Bussiness findById(Integer id);
    public List<Bussiness> findByName(String name);
}
