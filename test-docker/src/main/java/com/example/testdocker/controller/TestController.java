package com.example.testdocker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class TestController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Workd";
    }
}
