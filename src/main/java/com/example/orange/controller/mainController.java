package com.example.orange.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class mainController {
    @GetMapping(value = "/")
    public String main(){
        return "aaa";
    }

    @GetMapping(value = "/abc")
    public String aaa(){
        return "abc/def";
    }

    @GetMapping(value = "/footer")
    public String footer(){
        return "fragments/footer";
    }

    @GetMapping(value = "/header")
    public String header(){
        return "fragments/header";
    }
}
