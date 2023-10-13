package com.sangvaleap.lab7.controller;

import com.sangvaleap.lab7.model.User;
import com.sangvaleap.lab7.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
