package com.example.hien_thi_gia_vi_sandwich.controller;

import com.example.hien_thi_gia_vi_sandwich.service.FlavorService;
import com.example.hien_thi_gia_vi_sandwich.service.FlavorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FlavorController {
    @Autowired
    private FlavorServiceImpl service;
    @GetMapping("/save")
    public String showSave() {
        return "save";
    }
    @GetMapping("")
    public String showList() {
        return "list";
    }
    @PostMapping("/save")
    public String saveChoice(Model model,
                            @RequestParam("lettuce")String lettuce,
                             @RequestParam("tomato")String tomato,
                             @RequestParam("mustard")String mustard,
                             @RequestParam("sprouts")String sprouts) {
        List<String> choice = new ArrayList<>();
        if (!lettuce.isEmpty()) {
            choice.add(lettuce);
        }
        if (!tomato.isEmpty()) {
            choice.add(tomato);
        }
        if (!mustard.isEmpty()) {
            choice.add(mustard);
        }
        if (!sprouts.isEmpty()) {
            choice.add(sprouts);
        }
        service.save(choice);
        model.addAttribute("choices", choice);
        return "list";
    }
}
