package com.sangvaleap.lab7.service;

import com.sangvaleap.lab7.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getUsers();
}
