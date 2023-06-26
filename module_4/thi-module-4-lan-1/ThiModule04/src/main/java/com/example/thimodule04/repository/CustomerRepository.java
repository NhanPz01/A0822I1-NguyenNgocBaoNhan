package com.example.thimodule04.repository;

import com.example.thimodule04.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Pattern;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select * from khach_hang where name like :name", nativeQuery = true)
    public List<Customer> findByName(@Param("name") String name);

}
