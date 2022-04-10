package com.biz.mesapp.HelloRESTAPIMessagingApp.controller;

import com.biz.mesapp.HelloRESTAPIMessagingApp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessages {
    @RequestMapping(value = {"hello","\n","/"})
    public String printHello(){
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"query","\n","/"})
    public String printUsingQueryHello(@RequestParam(value = "name") String name){
        return "Hello "+name+" from Bridgelabz";
    }

    @PutMapping( "/put/{firstName}")
    public String sayHello ( @PathVariable String firstName,
                             @RequestParam(value = "lastname") String lastName) {
        return "Hello" + firstName + " " + lastName+ " !";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "hello "+user.getFirstName()+" "+user.getLastName()+"!";
    }

}
