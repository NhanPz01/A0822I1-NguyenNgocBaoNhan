package com.example.ungdungmuonsach.repository;

import com.example.ungdungmuonsach.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
