package com.example.furama_resort_management.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }
    @GetMapping("/user")
    public String user(Principal principal) {
        System.out.println(principal.getName());
        return "home/user";
    }
    @GetMapping("/admin")
    public String admin() {
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication().getName());
        return "home/admin";
    }
}
