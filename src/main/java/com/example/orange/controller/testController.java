package com.example.orange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/test")
    public String testMethod(){
        return "this is test";
    }
}
