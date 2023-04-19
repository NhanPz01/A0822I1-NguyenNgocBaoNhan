package com.example.form_to_khai_y_te.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("")
    public String showForm() {
        return "form";
    }

//    @PostMapping("")
//    public String getForm() {}
}
