package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi")
    public String hi(){
        return "Hi, everyone !";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello, everyone !";
    }
}
