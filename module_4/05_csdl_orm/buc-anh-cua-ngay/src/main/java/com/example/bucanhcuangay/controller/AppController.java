package com.example.bucanhcuangay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("comment", null);
        return "home";
    }
}
