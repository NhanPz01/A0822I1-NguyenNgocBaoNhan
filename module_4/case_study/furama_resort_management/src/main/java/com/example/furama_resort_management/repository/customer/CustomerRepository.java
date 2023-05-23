package com.example.furama_resort_management.repository.customer;

import com.example.furama_resort_management.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select customer.id, customer.name, date_of_birth, gender, id_card, phone_number, email, address from customer join customer_type on customer.id = customer_type.id where customer.name like :name", nativeQuery = true)
    List<Customer> findByCustomerName(@Param(value = "name") String name);
}
