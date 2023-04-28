package com.example.hom_thu_dien_tu.controller;

import com.example.hom_thu_dien_tu.model.Setting;
import com.example.hom_thu_dien_tu.repository.SettingRepository;
import com.example.hom_thu_dien_tu.repository.SettingRepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SettingController {
    SettingRepository repo = new SettingRepositoryImpl();
    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("settings", repo.findAll());
        return "list";
    }

    @PostMapping("/")
    public void addSetting() {

    }
    @PostMapping("/{id}")
    public void updateSetting() {

    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("settings", repo.findAll());
        return "list";
    }

    @GetMapping("/update")
    public String showForm(Model model) {
        model.addAttribute("setting", new Setting());
        model.addAttribute("language", new String[]{"Vietnamese", "English"});
        model.addAttribute("pageSize", new Integer[]{5, 10, 15, 25, 50, 100});
        return "index";
    }

    @PostMapping("/email/update")
    public String updateEmail(@ModelAttribute("email") Setting setting, Model model, RedirectAttributes redirect) {
        model.addAttribute("languages", new String[]{"Vietnamese", "English", "Japanese", "Chinese"});
        model.addAttribute("pageSize", new Integer[]{5, 10, 15, 25, 50, 100});
        repo.update(setting);
        redirect.addFlashAttribute("msg", "update thành công");
        return "index";
    }
}
