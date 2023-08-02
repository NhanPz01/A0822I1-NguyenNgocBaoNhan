package com.example.ungdungmuonsach.controller;

import com.example.ungdungmuonsach.dto.ContractCreateDTO;
import com.example.ungdungmuonsach.model.Contract;
import com.example.ungdungmuonsach.service.BookService;
import com.example.ungdungmuonsach.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ContractService contractService;
    @GetMapping("/")
    public String showBooks(Model model, @PageableDefault(size = 5) Pageable pageable) {
        model.addAttribute("bookPages", bookService.findAll(pageable));
        return "list";
    }
    @GetMapping("/{id}/detail")
    public String getDetail(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("contract", new ContractCreateDTO());
        return "detail";
    }

    @PostMapping("{id}/detail")
    public String borrow(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("contract", contractService.add());
    }
}
