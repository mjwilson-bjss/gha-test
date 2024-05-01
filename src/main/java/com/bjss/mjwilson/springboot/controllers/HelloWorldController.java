package com.bjss.mjwilson.springboot.controllers;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String index(@RequestParam final String message) {
        return "Spring Boot hello world controller " + URLEncoder.encode(message, StandardCharsets.UTF_8);
    }

}
