package com.sangvaleap.lab7.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/users"})
public class UserController {

    @PostMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addUser(){

    }
}
