package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @GetMapping
    public String bye(){
        return "Bye, everyone !";
    }
}
