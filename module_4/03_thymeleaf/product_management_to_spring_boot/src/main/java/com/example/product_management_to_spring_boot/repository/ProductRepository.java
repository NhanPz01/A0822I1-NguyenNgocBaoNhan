package com.example.product_management_to_spring_boot.repository;

import com.example.product_management_to_spring_boot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product where name like :name", nativeQuery = true)
    List<Product> findByName(@Param(value = "name") String name);
}
