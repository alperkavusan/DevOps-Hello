package com.kavusan.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping

public class DevOpsController {


    @GetMapping
    public String devopsHello() {

        return "Devopshello" + LocalDateTime.now();
    }


    @GetMapping("/info")
    public String devopsInfo() {

        return "DEVOPS Info" + LocalDateTime.now();
    }

}
