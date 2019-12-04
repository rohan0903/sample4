package com.howtodoinjava.rest.controller;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/sample")
@EnableAutoConfiguration
public class ExampleController {

   @RequestMapping("/home")
   public String home() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleController.class, args);
    }
}

