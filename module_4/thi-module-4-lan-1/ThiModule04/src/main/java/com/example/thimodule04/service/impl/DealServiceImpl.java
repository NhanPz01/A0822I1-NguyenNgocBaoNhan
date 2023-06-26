package com.example.thimodule04.service.impl;

import com.example.thimodule04.model.Deal;
import com.example.thimodule04.repository.DealRepository;
import com.example.thimodule04.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealServiceImpl implements DealService {
    @Autowired
    private DealRepository repository;
    @Override
    public List<Deal> findAll() {
        return repository.findAll();
    }

    @Override
    public Deal findById(String id) {
        return repository.findByDealId(id);
    }

    @Override
    public Deal add(Deal deal) {
        return repository.save(deal);
    }

    @Override
    public void deleteById(Deal deal) {
        repository.delete(deal);
    }

    @Override
    public List<Deal> findByOne(String name) {
        return repository.findByOne("%"+ name + "%");
    }

    @Override
    public List<Deal> findByTwo(String name, String type) {
        return repository.findByTwo("%"+ name + "%", type);
    }

    @Override
    public List<Deal> findByType(String type) {
        return repository.findByType(type);
    }
}
