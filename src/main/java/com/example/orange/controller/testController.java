package com.example.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class testController {
    @GetMapping(value = "/ex01")
    public String test01(Model model){
        model.addAttribute("data", "first test");
        return "test/test01";
    }
}
