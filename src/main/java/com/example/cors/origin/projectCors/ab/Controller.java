package com.example.cors.origin.projectCors.ab;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "**")
public class Controller {
    @GetMapping("/api/welcome")
    public String welcome()
    {
        return "Hii, Welcome to backend...";
    }
    @GetMapping("/api/hii")
    public String sayHello()
    {
        return "index";
    }


}
