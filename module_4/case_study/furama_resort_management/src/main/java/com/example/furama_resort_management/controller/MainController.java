package com.example.furama_resort_management.controller;

import com.example.furama_resort_management.model.facility.Facility;
import com.example.furama_resort_management.model.facility.FacilityType;
import com.example.furama_resort_management.model.facility.RentType;
import com.example.furama_resort_management.service.FacilityService;
import com.example.furama_resort_management.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private FacilityService facility;
    @Autowired
    private RentTypeService rentType;
    @GetMapping("/")
    public String showHome() {
        return "home/home";
    }
    @GetMapping("/service")
    public String showService(Model model, @RequestParam(defaultValue = "0") int page) {
        int pageSize = 5;
        Facility villa = new Facility();
        villa.setFacilityType(new FacilityType(1, "Villa"));
        Facility house = new Facility();
        house.setFacilityType(new FacilityType(2, "House"));
        Facility room = new Facility();
        room.setFacilityType(new FacilityType(3, "Room"));
        model.addAttribute("facilityList", facility.findAll(page, pageSize));
        model.addAttribute("rentTypes", rentType.findAll());
        model.addAttribute("villa", villa);
        model.addAttribute("house", house);
        model.addAttribute("room", room);
        model.addAttribute("alert", null);
        return "home/service";
    }
}
