package com.example.hien_thi_gia_vi_sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@Controller
public class FlavorController {
    @GetMapping("/")
    public String showSave() {
        return "save";
    }
    @GetMapping("/save")
    public String saveChoice(Model model,
                             @RequestParam("condiment") String[] condiment) {
//        List<String> condiments = new ArrayList<>();
//        for (String str : condiment) {
//            condiments.add(str);
//        }
        model.addAttribute("condiment",  condiment);
        return "list";
    }
}
