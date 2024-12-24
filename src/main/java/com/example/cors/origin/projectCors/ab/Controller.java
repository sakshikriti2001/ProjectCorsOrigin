package com.example.cors.origin.projectCors.ab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hii")
    public String sayHello()
    {
        return "index";
    }
}
