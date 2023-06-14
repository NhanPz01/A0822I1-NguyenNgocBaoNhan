package com.example.thimodule04.controller;

import com.example.thimodule04.dto.CreateDTO;
import com.example.thimodule04.model.QuestionContent;
import com.example.thimodule04.service.QuestionContentService;
import com.example.thimodule04.service.QuestionTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;

@Controller
public class MainController {
    @Autowired
    private QuestionContentService contentService;
    @Autowired
    private QuestionTypeService typeService;

    @GetMapping("/")
    public String showHome(Model model, @RequestParam(defaultValue = "0") int page) {
        int pageSize = 5;
        model.addAttribute("message", null);
        model.addAttribute("questionTypeList", typeService.findAll());
        model.addAttribute("questionList", contentService.findAll(page, pageSize));
        return "home/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("questionTypeList", typeService.findAll());
        model.addAttribute("question", new CreateDTO());
        return "home/create";
    }
    @GetMapping("/{id}/delete")
    public String showDelete(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("question", contentService.findById(id));
        return "home/delete";
    }
    @GetMapping("/{id}/detail")
    public String showDetail(Model model, @PathVariable("id") Integer id) {
        model.addAttribute("question", contentService.findById(id));

        return "home/detail";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("question") CreateDTO questionDTO, BindingResult bindingResult, Model model, RedirectAttributes redirect, @RequestParam(defaultValue = "0") int page) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("questionTypeList", typeService.findAll());
            return "home/create";
        }
        int pageSize = 5;
        QuestionContent questionContent = new QuestionContent();
        BeanUtils.copyProperties(questionDTO, questionContent);
        questionContent.setDateCreate(Date.valueOf(LocalDate.now()));
        questionContent.setStatus("Chờ phản hồi");
        contentService.add(questionContent);
        model.addAttribute("questionTypeList", typeService.findAll());
        model.addAttribute("message", "Add success");
        model.addAttribute("questionList", contentService.findAll(page, pageSize));
        return "redirect:/";
    }
    @PostMapping("/{id}/delete")
    public String delete(@RequestParam("id") Integer id, Model model, RedirectAttributes redirect) {
        model.addAttribute("message", "Delete success");
        contentService.deleteById(id);
        return "redirect:/";
    }
}
