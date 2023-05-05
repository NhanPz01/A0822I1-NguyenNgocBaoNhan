package com.example.hom_thu_dien_tu.controller;

import com.example.hom_thu_dien_tu.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {
    @Autowired
    private SettingService service;
    @GetMapping("/")
    public String showSetting(Model model) {
        model.addAttribute("setting", service.findAll());
        return "show";
    }
}
