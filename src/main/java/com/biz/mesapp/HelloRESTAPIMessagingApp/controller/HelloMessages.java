package com.biz.mesapp.HelloRESTAPIMessagingApp.controller;

import com.biz.mesapp.HelloRESTAPIMessagingApp.entity.User;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/hello")
public class HelloMessages {
    //UC 1
    @RequestMapping(value = {"hello", "\n", "/"})
    public String printHello() {
        return "Hello from Bridgelabz";
    }

    //UC 2
    @RequestMapping(value = {"query", "\n", "/"})
    public String printUsingQueryHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from Bridgelabz";
    }


    //UC 3 Request Method and pass name as path variable
    @GetMapping("/param/{name}")
    public String syaHello(@PathVariable Stroke name) {
        return "Hello " + name + " !";
    }

    //UC 4
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    //UC 5
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastname") String lastName) {
        return "Hello" + firstName + " " + lastName + " !";
    }


}
