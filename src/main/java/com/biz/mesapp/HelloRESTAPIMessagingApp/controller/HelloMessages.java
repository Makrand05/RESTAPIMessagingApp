package com.biz.mesapp.HelloRESTAPIMessagingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessages {
    @RequestMapping(value = {"hello","\n","/"})
    public String printHello(){
        return "Hello from Bridgelabz";
    }
}
