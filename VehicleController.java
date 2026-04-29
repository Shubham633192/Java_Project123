package com.example.demo.controller;

import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        model.addAttribute("list", service.getAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Vehicle v) {
        service.save(v);
        return "redirect:/";
    }
}