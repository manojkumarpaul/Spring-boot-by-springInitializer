package com.spring.boot.online.initializer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustAController {
    @RequestMapping ("/")
    public String homePage(){
        return "Welcome to the site";
    }
}
