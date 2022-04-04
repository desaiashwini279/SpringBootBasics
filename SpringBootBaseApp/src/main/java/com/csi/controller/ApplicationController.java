package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome to fintech Pune.";
    }
    @GetMapping("/services")
    public String sayServices()
    {
        return "Software developer";
    }
}
