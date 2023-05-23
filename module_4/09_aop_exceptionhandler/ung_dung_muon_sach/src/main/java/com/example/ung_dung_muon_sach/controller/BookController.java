package com.example.ung_dung_muon_sach.controller;

import com.example.ung_dung_muon_sach.model.Customer;
import com.example.ung_dung_muon_sach.service.BookService;
import com.example.ung_dung_muon_sach.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        model.addAttribute("customerList", customerService.findAll());
        return "list";
    }

    @GetMapping("{id}/detail")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        model.addAttribute("book", bookService.findById(id));
        return "detail";
    }

    @GetMapping("/customer")
    public String showCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "create_customer";
    }

    @GetMapping("/{id}/borrow")
    public String showBorrow(Model model,
                             @PathVariable("id") int id) {
        model.addAttribute("book", bookService.findById(id));
        return "contract";
    }

    @PostMapping("/customer")
    public String createCustomer(RedirectAttributes redirect,
                                 @ModelAttribute("customer") Customer customer) {
        customerService.add(customer);
        redirect.addFlashAttribute("message", "Create Success !!!");
        redirect.addFlashAttribute("bookList", bookService.findAll());
        return "redirect:/";
    }
}
