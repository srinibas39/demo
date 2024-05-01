package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Controller";
    }

    @GetMapping("/")
    public String getHome(){
        return "<b>My New Home</b>";
    }
}
