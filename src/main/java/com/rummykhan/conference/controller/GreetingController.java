package com.rummykhan.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name, Map<String, Object> model){

        model.put("name", name);
        model.put("message", "Hey there, how are you?");


        return "greeting";
    }
}
