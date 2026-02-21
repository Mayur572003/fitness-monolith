package com.project.fitness.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "Fitness API is running 🚀 Visit /swagger-ui.html";
        }
    }


