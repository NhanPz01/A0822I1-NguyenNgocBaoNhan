package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.ProductService;
import com.example.product_management.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.sound.sampled.Port;
import java.util.List;

@Controller
public class ProductController {
    ProductService service = new ProductServiceImpl();
    @GetMapping("/product")
    public String showList(Model model) {
        model.addAttribute("listProduct", service.findAll());
        return "list";
    }
    @GetMapping("/product/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }
    @GetMapping("/product/detail/{id}")
    public String showDetail(Model model, @PathVariable int id) {
        model.addAttribute("product", service.findById(id));
        return "detail";
    }
    @GetMapping("/product/delete/{id}")
    public String showDelete(Model model, @PathVariable("id")int id) {
        model.addAttribute("product", service.findById(id));
        return "delete";
    }
    @PostMapping("/product/create")
    public String createProduct(RedirectAttributes redirect,
                                @RequestParam("id")int id,
                                @RequestParam("name")String name,
                                @RequestParam("price")double price,
                                @RequestParam("color")String color) {
        Product product = new Product(id, name, price, color);
        service.add(product);
        redirect.addFlashAttribute("message", "Success!");
        return "redirect:/product/create";
    }
    @PostMapping("/product/detail/{id}")
    public String update(RedirectAttributes redirect,
                         @RequestParam("id")int id,
                         @RequestParam("name")String name,
                         @RequestParam("price")double price,
                         @RequestParam("color")String color) {
        service.update(new Product(id, name, price, color));
        redirect.addFlashAttribute("msg", "Updated !!!");
        return "redirect:/product/detail/{id}";
    }
    @PostMapping("/product/delete/{id}")
    public String delete(Model model, @PathVariable("id")int id) {
        service.delete(id);
        model.addAttribute("msg", "Deleted !!!");
        return "list";
    }
}
