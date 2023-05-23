package com.example.furama_resort_management.repository.customer;

import com.example.furama_resort_management.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
    @Query(value = "select * from customer_type where name like :name;", nativeQuery = true)
    CustomerType findByName(@Param(value = "name") String name);
}
