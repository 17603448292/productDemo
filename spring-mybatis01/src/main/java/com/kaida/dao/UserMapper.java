package com.kaida.dao;

import com.kaida.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询用户
     * @return
     */
    List<User> selectUser();

    int addUser(User user);

    int addUsers(List<User> users);
}
