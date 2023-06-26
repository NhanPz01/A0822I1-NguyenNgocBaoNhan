package com.example.thimodule04.controller;

import com.example.thimodule04.dto.CreateDTO;
import com.example.thimodule04.model.Customer;
import com.example.thimodule04.model.Deal;
import com.example.thimodule04.service.CustomerService;
import com.example.thimodule04.service.DealService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private CustomerService customer;
    @Autowired
    private DealService deal;

    @GetMapping("/")
    public String showMain(Model model) {
        model.addAttribute("message", null);
        model.addAttribute("dealList", deal.findAll());
        return "home/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("customerList", customer.findAll());
        model.addAttribute("typeList", deal.findAll());
        model.addAttribute("deal", new CreateDTO());
        return "home/create";
    }

    @GetMapping("/{id}/detail")
    public String getDetail(@PathVariable("id") String id, Model model) {
        model.addAttribute("deal", deal.findById(id));
        return "home/detail";
    }

    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable("id") String id, Model model) {
        model.addAttribute("deal", deal.findById(id));
        return "home/delete";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String name, @RequestParam("type") String type, Model model) {
        if (type == null) {
            model.addAttribute("dealList", deal.findByOne(name));
        } else if (name == null) {
            model.addAttribute("dealList", deal.findByType(type));
        } else {
            model.addAttribute("dealList", deal.findByTwo(name, type));
        }
        return "redirect:/";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("deal") CreateDTO dto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customerList", customer.findAll());
            model.addAttribute("typeList", deal.findAll());
            return "home/create";
        }
        Deal newDeal = new Deal();
        BeanUtils.copyProperties(dto, newDeal);
        List<Customer> customers = customer.findByName(dto.getName());
        newDeal.setCustomer(customers.get(0));
        deal.add(newDeal);
        model.addAttribute("message", "Thêm thành công");
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") String id, Model model) {
        deal.deleteById(deal.findById(id));
        model.addAttribute("message", "Xóa thành công");
        return "redirect:/";
    }
}
