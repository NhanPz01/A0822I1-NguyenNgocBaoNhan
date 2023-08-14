package com.example.thimodule04.repository;

import com.example.thimodule04.model.Bussiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BussinessRepository extends JpaRepository<Bussiness, Integer> {
    public List<Bussiness> findBussinessByName(String name);
}
