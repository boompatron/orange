package com.example.orange.controller;

import com.example.orange.dto.TestResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/test")
    public String testMethod(){
        return "test";
    }

    @GetMapping("/test/dto")
    public TestResponseDto responseDto(@RequestParam("email") String email, @RequestParam("idNum") int idNum){
        return new TestResponseDto(email, idNum);
    }
}
