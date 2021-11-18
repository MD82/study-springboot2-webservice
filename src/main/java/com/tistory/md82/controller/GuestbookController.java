package com.tistory.md82.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestbookController {
    @GetMapping("/")
    public String index() {
        //return "Greetings from Spring Boot!";
        return "index";
    }
}
