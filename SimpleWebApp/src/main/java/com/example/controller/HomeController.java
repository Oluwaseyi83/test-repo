// src/main/java/com/example/controller/HomeController.java
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello Oluwaseyi, this is a simple web application!";
    }
}

