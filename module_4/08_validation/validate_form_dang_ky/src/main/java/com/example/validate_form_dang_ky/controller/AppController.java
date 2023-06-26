package com.example.validate_form_dang_ky.controller;

import com.example.validate_form_dang_ky.dto.UserCreateDto;
import com.example.validate_form_dang_ky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AppController {
    @Autowired
    private UserService service;
    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("user", new UserCreateDto());
        return "registration";
    }
    @PostMapping("/")
    public String registering(@Valid @ModelAttribute("user") UserCreateDto userDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        return "result";
    }
}
