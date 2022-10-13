package com.example.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Macie
 * @date 2021/11/14
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "hello world 11.30.16.49";
    }
}
