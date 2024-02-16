package org.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;

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
