package com.example.orange.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class mainController {
    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("data", "this is data");
        return "index";
    }
}
