package com.loorinho.pastpepsbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HomeController {

    @GetMapping("/hello")
    public String home(){
            return "Hello World";
    }
}