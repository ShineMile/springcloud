package com.neil.servicehello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(String name) {
        return "hello " + name + " " + port;
    }
}
