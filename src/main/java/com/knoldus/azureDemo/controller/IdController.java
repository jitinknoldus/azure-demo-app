package com.knoldus.azureDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/api/{id}")
    public Integer displayId(@PathVariable Integer id){
        return id;
    }

    @GetMapping("/api/{name}")
    public String displayName(@PathVariable String name){
        return name;
    }



}

