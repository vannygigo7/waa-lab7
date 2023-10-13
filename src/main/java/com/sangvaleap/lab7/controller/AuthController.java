package com.sangvaleap.lab7.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/auth"})
public class AuthController {

    @GetMapping({"/login"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void login(){

    }
}
