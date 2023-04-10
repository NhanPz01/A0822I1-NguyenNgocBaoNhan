package com.example.chuyen_doi_tien_te.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/exchange")
    private String show() {
        return "exchange";
    }
    @PostMapping("/exchange")
    private String exchange(Model model,
                            @RequestParam("usd")String usd,
                            RedirectAttributes redirect) {
        double usdDouble = Double.parseDouble(usd);
        double vnd = 23.447 * usdDouble;
        redirect.addFlashAttribute("vnd", vnd);
        return "redirect:/exchange";
    }
}
