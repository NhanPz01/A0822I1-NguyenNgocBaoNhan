package com.example.furama_resort_management.controller;

import com.example.furama_resort_management.repository.customer.CustomerRepository;
import com.example.furama_resort_management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    public CustomerService customerService;
    @PostMapping("/delete")
    public
}
