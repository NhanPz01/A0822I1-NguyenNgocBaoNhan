package com.example.ung_dung_muon_sach.repository;

import com.example.ung_dung_muon_sach.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}