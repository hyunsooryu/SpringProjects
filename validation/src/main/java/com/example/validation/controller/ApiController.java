package com.example.validation.controller;

import com.example.validation.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("user")
    public Object user(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }
}
