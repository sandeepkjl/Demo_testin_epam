package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "/demo", produces = "application/xml")

    public String demo() throws ArithmeticException
    {
        return "checking demo app !";
    }
}
