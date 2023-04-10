package com.example.tu_dien_en_vn.controller;

import com.example.tu_dien_en_vn.model.Word;
import com.example.tu_dien_en_vn.service.WordService;
import com.example.tu_dien_en_vn.service.WordServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class WordController {
    private WordService wordService = new WordServiceImpl();

    @GetMapping("/dictionary")
    private String show() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    private String translate(Model model, @RequestParam String en, @RequestParam String vn) {
        if (en.isEmpty()) {
            if (vn.isEmpty()) {
                model.addAttribute("en", "Enter something...");
            } else {
                model.addAttribute("en", wordService.findByVn(vn));
                model.addAttribute("vn", vn);
            }
        } else {
            model.addAttribute("en", en);
            model.addAttribute("vn", wordService.findByEn(en));
        }
        return "result";
    }
}
