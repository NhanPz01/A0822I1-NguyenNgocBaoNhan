package com.example.chuyen_doi_tien_te.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/exchange")
    private String show() {
        return "exchange";
    }
    @PostMapping("/exchange")
    private String exchange(Model model, @RequestParam String usd) {
        double usdDouble = Double.parseDouble(usd);
        double vnd = 23.447 * usdDouble;
        model.addAttribute("vnd", vnd);
        return "result";
    }
}
