package com.kaida.service;

import com.kaida.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();

    int addUser(User user);

    int addUsers(List<User> users);
}
