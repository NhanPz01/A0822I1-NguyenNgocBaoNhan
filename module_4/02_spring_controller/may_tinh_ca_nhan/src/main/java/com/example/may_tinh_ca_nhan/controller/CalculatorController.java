package com.example.may_tinh_ca_nhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {
    @GetMapping("")
    public String show() {
        return "calculator";
    }
    @PostMapping("")
    public String calculate(@RequestParam("num1")double num1,
                            @RequestParam("num2")double num2,
                            @RequestParam("way")String way,
                            RedirectAttributes redirect) {

        double result = 0;
        switch (way) {
            case "Addition (+)":
                way = "Addtion";
                result = num1 + num2;
                break;
            case "Subtraction (-)":
                way = "Subtraction";
                result = num1 - num2;
                break;
            case "Multiplication (X)":
                way = "Multiplication";
                result = num1 * num2;
                break;
            case "Division (/)":
                way = "Division";
                result = num1 / num2;
                break;
        }
        redirect.addFlashAttribute("num1", num1);
        redirect.addFlashAttribute("num2", num2);
        redirect.addFlashAttribute("way", way);
        redirect.addFlashAttribute("result", result);
        return "redirect:/";
    }
}
